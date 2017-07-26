import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ConcreteHeadacheBuilder extends AbstractHeadacheBuilder {
	ArrayList<PainDescriptorContainer> locationList = null;
	
	public ConcreteHeadacheBuilder() {
		
	}

	@Override
	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public void setPainDescriptor(PainDescriptor painDescriptor) {
		this.painDescriptor = painDescriptor;
	}

	@Override
	public void setSeverity(int severity) {
		if(painDescriptor == null){
			painDescriptor = new PainDescriptor();
		}
		this.painDescriptor.setSeverity(severity);
	}

	@Override
	public void setPainDescription(AbstractPainDescription painDescription) {
		if(painDescriptor == null){
			painDescriptor = new PainDescriptor();
		}
		painDescriptor.setDescription(painDescription);
	}

	@Override
	public void setLocationList(ArrayList<PainDescriptorContainer> locationList) {
		this.locationList = locationList;
	}

	@Override
	public void addLocation(PainDescriptorContainer location) {
		if(this.locationList == null){
			locationList = new ArrayList<PainDescriptorContainer>();
		}
		this.locationList.add(location);
	}

	@Override
	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public void setHeadacheType(AbstractHeadacheType type) {
		this.type = type;
	}

	@Override
	public void setProdromeSymptoms(ArrayList<AbstractSymptom> prodromeSymptoms) {
		this.prodromeSymptoms = prodromeSymptoms;
	}

	@Override
	public void setConcurrentSymptoms(ArrayList<AbstractSymptom> concurrentSymptoms) {
		this.concurrentSymptoms = concurrentSymptoms;
	}

	@Override
	public void setPostdromeSymptoms(ArrayList<AbstractSymptom> postdromeSymptoms) {
		this.postdromeSymptoms = postdromeSymptoms;
	}

	@Override
	public void addProdromeSymptom(AbstractSymptom symptom) {
		this.prodromeSymptoms.add(symptom);
	}

	@Override
	public void addConcurrentSymptom(AbstractSymptom symptom) {
		this.concurrentSymptoms.add(symptom);
	}

	@Override
	public void addPostdromeSymptom(AbstractSymptom symptom) {
		this.postdromeSymptoms.add(symptom);
	}

	@Override
	public void setMedication(Medication medication) {
		this.medication = medication;
	}
	
	@Override
	public void setTriggers(ArrayList<AbstractTrigger> triggers){
		this.triggers = triggers;
	}
	
	@Override
	public void setSelfHelps(ArrayList<AbstractSelfHelp> selfHelps){
		this.selfHelps = selfHelps;
	}
	
	@Override
	public void addTrigger(AbstractTrigger trigger){
		if(this.triggers == null){
			this.triggers = new ArrayList<AbstractTrigger>();
		}
		this.triggers.add(trigger);
	}
	
	@Override
	public void addSelfHelp(AbstractSelfHelp selfHelp){
		if(this.selfHelps == null){
			this.selfHelps = new ArrayList<AbstractSelfHelp>();
		}
		this.selfHelps.add(selfHelp);
	}
	
	public Headache getResult(){
		Headache returnVal = new Headache();
		if(this.concurrentSymptoms == null || this.date == null || this.medication == null || this.painDescriptor == null || 
		   this.prodromeSymptoms == null|| this.concurrentSymptoms == null || this.postdromeSymptoms == null || 
		   this.selfHelps == null || this.triggers == null || this.type == null){
			return null;
		}
		returnVal.setConcurrentSymptoms(this.concurrentSymptoms);
		returnVal.setDate(this.date);
		returnVal.setDuration(this.duration);
		returnVal.setMedication(this.medication);
		returnVal.setPainDescriptor(this.painDescriptor);
		returnVal.setProdromeSymptoms(this.prodromeSymptoms);
		returnVal.setConcurrentSymptoms(this.concurrentSymptoms);
		returnVal.setPostdromeSymptoms(this.postdromeSymptoms);
		returnVal.setSelfHelp(this.selfHelps);
		returnVal.setTrigger(this.triggers);
		returnVal.setType(this.type);

		return returnVal;
	}
}
