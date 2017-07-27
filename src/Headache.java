import java.util.ArrayList;
import java.util.Date;

public class Headache {
	
	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * @return the painDescriptor
	 */
	public PainDescriptor getPainDescriptor() {
		return painDescriptor;
	}

	/**
	 * @param painDescriptor the painDescriptor to set
	 */
	public void setPainDescriptor(PainDescriptor painDescriptor) {
		this.painDescriptor = painDescriptor;
	}

	/**
	 * @return the duration
	 */
	public int getDuration() {
		return duration;
	}

	/**
	 * @param duration the duration to set
	 */
	public void setDuration(int duration) {
		this.duration = duration;
	}

	/**
	 * @return the type
	 */
	public AbstractHeadacheType getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(AbstractHeadacheType type) {
		this.type = type;
	}

	/**
	 * @return the prodromeSymptoms
	 */
	public ArrayList<AbstractSymptom> getProdromeSymptoms() {
		return prodromeSymptoms;
	}

	/**
	 * @param prodromeSymptoms the prodromeSymptoms to set
	 */
	public void setProdromeSymptoms(ArrayList<AbstractSymptom> prodromeSymptoms) {
		this.prodromeSymptoms = prodromeSymptoms;
	}
	
	public String getSymptomList(){
		String s = "PRODROME SYMPTOMS:\n";
		for(AbstractSymptom symptom : this.prodromeSymptoms){
			s += symptom.getSymptomAsString() + "\n";
		}
		s += "\nCONCURRENT SYMPTOMS:\n";
		for(AbstractSymptom symptom : this.concurrentSymptoms){
			s += symptom.getSymptomAsString() + "\n";
		}
		s+= "\nPOSTDROME SYMPTOMS:\n";
		for(AbstractSymptom symptom : this.postdromeSymptoms){
			s += symptom.getSymptomAsString() + "\n";
		}
		return s;
	}
	
	public String getSelfHelpList(){
		String s = "SELF HELP LIST:\n";
		
		for(AbstractSelfHelp selfHelp : this.selfHelp){
			s += selfHelp.getSelfHelpAsString();
		}
		return s;
	}

	/**
	 * @return the concurrentSymptoms
	 */
	public ArrayList<AbstractSymptom> getConcurrentSymptoms() {
		return concurrentSymptoms;
	}

	/**
	 * @param concurrentSymptoms the concurrentSymptoms to set
	 */
	public void setConcurrentSymptoms(ArrayList<AbstractSymptom> concurrentSymptoms) {
		this.concurrentSymptoms = concurrentSymptoms;
	}

	/**
	 * @return the postdromeSymptoms
	 */
	public ArrayList<AbstractSymptom> getPostdromeSymptoms() {
		return postdromeSymptoms;
	}

	/**
	 * @param postdromeSymptoms the postdromeSymptoms to set
	 */
	public void setPostdromeSymptoms(ArrayList<AbstractSymptom> postdromeSymptoms) {
		this.postdromeSymptoms = postdromeSymptoms;
	}

	/**
	 * @return the medication
	 */
	public Medication getMedication() {
		return medication;
	}

	/**
	 * @param medication the medication to set
	 */
	public void setMedication(Medication medication) {
		this.medication = medication;
	}

	/**
	 * @return the trigger
	 */
	public ArrayList<AbstractTrigger> getTrigger() {
		return trigger;
	}

	/**
	 * @param trigger the trigger to set
	 */
	public void setTrigger(ArrayList<AbstractTrigger> trigger) {
		this.trigger = trigger;
	}

	/**
	 * @return the selfHelp
	 */
	public ArrayList<AbstractSelfHelp> getSelfHelp() {
		return selfHelp;
	}

	/**
	 * @param selfHelp the selfHelp to set
	 */
	public void setSelfHelp(ArrayList<AbstractSelfHelp> selfHelp) {
		this.selfHelp = selfHelp;
	}

	private Date date;
	private PainDescriptor painDescriptor;
	private int duration; //minutes
	private AbstractHeadacheType type;
	private ArrayList<AbstractSymptom> prodromeSymptoms;
	private ArrayList<AbstractSymptom> concurrentSymptoms;
	private ArrayList<AbstractSymptom> postdromeSymptoms;
	private Medication medication;
	private ArrayList<AbstractTrigger> trigger;
	private ArrayList<AbstractSelfHelp> selfHelp;


	public String detailedMedication(){
		return "\nMedication Name : "+medication.getName()+
				"\nMedication Class : "+medication.getClassVar()+
				"\nDosage : "+medication.getDoseInMilligrams()
				;
	}

	
	public Headache() {
		
	}
	
	public Headache(Date inDate, PainDescriptor inPainDescriptor, int inDuration,
					ArrayList<AbstractSymptom> inProdromeSymptoms, ArrayList<AbstractSymptom> inConcurrentSymptom,
					ArrayList<AbstractSymptom> inPostdromeSymptoms, Medication inMedication,
					AbstractTrigger inTrigger, AbstractSelfHelp inSelfHelp)
	{
		
	}

}
