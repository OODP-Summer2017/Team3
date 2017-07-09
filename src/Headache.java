import java.util.ArrayList;
import java.util.Date;

public class Headache {
	
	Date date;
	PainDescriptor painDescriptor;
	int duration; //seconds
	AbstractHeadacheType type;
	ArrayList<AbstractSymptom> prodromeSymptoms;
	ArrayList<AbstractSymptom> concurrentSymptoms;
	ArrayList<AbstractSymptom> postdromeSymptoms;
	Medication medication;
	AbstractTrigger trigger;
	AbstractSelfHelp selfHelp;
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
