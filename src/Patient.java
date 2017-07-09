import java.util.ArrayList;

public class Patient {
	
	private String name;
	private ArrayList<Headache> headacheList;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void addHeadache(Headache headache){
		headacheList.add(headache);
	}
	
	public String paitentData(){
		String sum=null;
		for(int i=0;i<headacheList.size();i++){
			sum="\nDate = "+headacheList.get(i).date.toString()+
					"\nDuration = "+headacheList.get(i).duration+
					"\nType = "+headacheList.get(i).type+
					"\nSymptoms = "+headacheList.get(i).prodromeSymptoms+" "+headacheList.get(i).concurrentSymptoms+" "+headacheList.get(i).postdromeSymptoms+
					"\nSeverity = "+headacheList.get(i).painDescriptor.getSeverity()+
					"\nLocation = "+headacheList.get(i).painDescriptor.getLocation()+
					"\nMedication = "+headacheList.get(i).medication.getName()+
					"\nMedication Taken = "+headacheList.get(i).medication.getTimeTaken().toString()+
					"\nMedication Effective = "+headacheList.get(i).medication.getTimeEffective().toString()+
					"\nSelf Help = "+headacheList.get(i).selfHelp.getSelfHelp()+
					"\nTrigger = "+headacheList.get(i).trigger.getTrigger();
		}
		return sum;
	}
	
	public String Summary(){
		String sum = null;
		float s=0;
		float d=0;
		for(int index=0;index<headacheList.size();index++){
			s=s+headacheList.get(index).painDescriptor.getSeverity();
			d=d+headacheList.get(index).duration;
		}
		sum="\nReport Start Date : "+headacheList.get(0).date.toString()+
				"\n Report End Date : "+headacheList.get(headacheList.size()-1).date.toString()+
				"\n Headache Count : "+headacheList.get(headacheList.size())+
				"\nAverage Severity : "+s/headacheList.size()+
				"\nAverage Duration : "+d/headacheList.size();		
		return sum;
	}
	
	public String detailedMedicationReport(){
		String d=null;
		for(Headache h:headacheList){
			d=h.detailedMedication()+"\n";
			}

		return d;
	}
	
}
