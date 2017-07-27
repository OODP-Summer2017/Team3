import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Patient {
	
	private String name;
	private ArrayList<Headache> headacheList;
	
	public Patient(){
		headacheList = new ArrayList<Headache>();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void addHeadache(Headache headache){
		headacheList.add(headache);
	}
	
	public String patientData(){
		String sum=null;


		for(int i=0;i<headacheList.size();i++){
			sum="\nDate = "+headacheList.get(i).getDate().toString()+
					"\nDuration = "+headacheList.get(i).getDuration()+
					"\nType = "+headacheList.get(i).getType().getTypeAsString()+ "\n" +
					headacheList.get(i).getSymptomList() +
					"\nSeverity = "+headacheList.get(i).getPainDescriptor().getSeverity();
			
					for(PainDescriptorContainer container : headacheList.get(i).getPainDescriptor().getLocationList())
					{
						sum+="\nLocation and Sidedness = " + container.getPainLocation().toString() + 
								"/" + container.getSidedness().toString()+ "  ";
					}
					
					sum +="\nMedication = "+headacheList.get(i).getMedication().getName()+
					"\nMedication Taken = "+headacheList.get(i).getMedication().getTimeTaken().toString()+
					"\nMedication Effective = "+headacheList.get(i).getMedication().getTimeEffective().toString()+
					"\n" + headacheList.get(i).getSelfHelpList() +
					"\nTrigger = "+headacheList.get(i).getTrigger();
		}
		return sum;
	}
	
	public String Summary(){
		String sum = "SUMMARY REPORT\n=======================\n";
		float s=0;
		float d=0;
		for(int index=0;index<headacheList.size();index++){
			s=s+headacheList.get(index).getPainDescriptor().getSeverity();
			d=d+headacheList.get(index).getDuration();
		}
		sum+="Report Start Date : "+headacheList.get(0).getDate().toString()+
				"\n Report End Date : "+headacheList.get(headacheList.size()-1).getDate().toString()+
				"\n Headache Count : "+headacheList.size()+
				"\nAverage Severity : "+s/headacheList.size()+
				"\nAverage Duration : "+d/headacheList.size();		
		return sum;
	}
	
	public String detailedMedicationReport(){
		HashMap<String, ArrayList<Medication>> medList = new HashMap<String, ArrayList<Medication>>();
		NumberFormat outputFormat = new DecimalFormat("#0.00");
		String stringToReturn = "DETAILED MEDICATION REPORT\n=======================\n";
		for(Headache h:headacheList){
			if(!medList.containsKey(h.getMedication().getName())){
				medList.put(h.getMedication().getName(), new ArrayList<Medication>());
			}
			medList.get(h.getMedication().getName()).add(h.getMedication());
		}
		
		Iterator<Map.Entry<String, ArrayList<Medication>>> mapIterator = medList.entrySet().iterator();
		while(mapIterator.hasNext()){
			Map.Entry<String, ArrayList<Medication>> keyValuePair = (Map.Entry<String, ArrayList<Medication>>)mapIterator.next();
			double numberOfDoses = keyValuePair.getValue().size();
			double effectivitySum = 0;
			String name = "";
			String classVar = "";
			int dosage = 0;
			for(Medication med : keyValuePair.getValue()){
				name = med.getName();
				classVar = med.getClassVar();
				dosage = med.getDoseInMilligrams();
				effectivitySum += med.getTimeEffective().getTime() - med.getTimeTaken().getTime(); // Returns Milliseconds
			}
			stringToReturn += "Medication Name : " + name + "\n";
			stringToReturn += "Medication Class : " + classVar + "\n";
			stringToReturn += "Dose : " + dosage + " mg\n";
			// Convert effectivitySum from milliseconds to hours
			stringToReturn += "Average Time To Effectivity (hours) : " + outputFormat.format((effectivitySum * 2.77778E-7) / numberOfDoses) + "\n";
			stringToReturn += "Total Doses Taken : " + numberOfDoses + "\n\n";
		}
		
		return stringToReturn;
	}
	
	public String detailedSelfHelpReport(){
		HashMap<String, ArrayList<AbstractSelfHelp>> selfHelpList = new HashMap<String, ArrayList<AbstractSelfHelp>>();
		String stringToReturn = "DETAILED SELF HELP REPORT\n=======================\n";
		for(Headache h:headacheList){
			for(AbstractSelfHelp selfHelp:h.getSelfHelp()){
				if(!selfHelpList.containsKey(selfHelp.getSelfHelp())){
					selfHelpList.put(selfHelp.getSelfHelp(), new ArrayList<AbstractSelfHelp>());
				}
				selfHelpList.get(selfHelp.getSelfHelp()).add(selfHelp);
			}
		}
		
		Iterator<Map.Entry<String, ArrayList<AbstractSelfHelp>>> mapIterator = selfHelpList.entrySet().iterator();
		while(mapIterator.hasNext()){
			Map.Entry<String, ArrayList<AbstractSelfHelp>> keyValuePair = (Map.Entry<String, ArrayList<AbstractSelfHelp>>)mapIterator.next();
			double timesUsed = keyValuePair.getValue().size();
			
			stringToReturn += "Self-help Name : " + keyValuePair.getKey() + "\n";
			stringToReturn += "Times Used : " + timesUsed + "\n";
			stringToReturn += "Average Effectivity : " +  AbstractSelfHelp.getAverageEffectivity(keyValuePair.getValue()) + "\n";
		}
		
		return stringToReturn;
	}
	
}
