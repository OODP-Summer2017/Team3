import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class AbstractHeadacheBuilder {

	protected Date date = null;
	protected PainDescriptor painDescriptor = null;
	protected int duration; //minutes
	protected AbstractHeadacheType type = null;
	protected ArrayList<AbstractSymptom> prodromeSymptoms = null;
	protected ArrayList<AbstractSymptom> concurrentSymptoms = null;
	protected ArrayList<AbstractSymptom> postdromeSymptoms = null;
	protected Medication medication = null;
	protected ArrayList<AbstractTrigger> triggers = null;
	protected ArrayList<AbstractSelfHelp> selfHelps = null;
 
	
	public AbstractHeadacheBuilder() {
		// TODO Auto-generated constructor stub
		
	}
	
	public abstract void setDate(Date date);
	public abstract void setPainDescriptor(PainDescriptor painDescriptor);
	public abstract void setSeverity(int severity);
	public abstract void setPainDescription(AbstractPainDescription painDescription);
	public abstract void setLocationList(ArrayList<PainDescriptorContainer> locationList);
	public abstract void addLocation(PainDescriptorContainer location);
	public abstract void setDuration(int duration);
	public abstract void setHeadacheType(AbstractHeadacheType type);
	public abstract void setProdromeSymptoms(ArrayList<AbstractSymptom> prodromeSymptoms);
	public abstract void setConcurrentSymptoms(ArrayList<AbstractSymptom> concurrentSymptoms);
	public abstract void setPostdromeSymptoms(ArrayList<AbstractSymptom> postdromeSymptoms);
	public abstract void addProdromeSymptom(AbstractSymptom symptom);
	public abstract void addConcurrentSymptom(AbstractSymptom symptom);
	public abstract void addPostdromeSymptom(AbstractSymptom symptom);
	public abstract void setMedication(Medication medication);
	public abstract void setTriggers(ArrayList<AbstractTrigger> triggers);
	public abstract void setSelfHelps(ArrayList<AbstractSelfHelp> selfHelps);
	public abstract void addTrigger(AbstractTrigger trigger);
	public abstract void addSelfHelp(AbstractSelfHelp selfHelp);
}
