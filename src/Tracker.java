import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/*********************************
* Notes 
*** Summary Report columns in order
* Report Start Date	
* Report End Date	
* Headache Count	
* Average Severity	
* Average Duration (hours)
*** Detailed Report (medication) columns in order
* Medication Name	
* Medication Class	
* Dose	
* Average Time to Effectivity (hours)	
* Total Doses Taken
* As well as a Report date range 3 rows after final data row
*** Detailed Report (self help) column in order
* Self-Help Name	
* Times Used	
* Average Effectivity
* As well as a Report date range 3 rows after final data row
*/

public class Tracker {

	public Tracker() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/* Patient data entry 
		 * Date	
		 * Start Time	
		 * End Time	Type	
		 * Severity	
		 * Pain Description	
		 * Location	
		 * Symptoms 	
		 * Medication	
		 * Med Start	
		 * Med Effective	
		 * Triggers	
		 * Self-Help
		 */
		
		// Row 1
		//5/1/17	7:30 AM	11:00 AM	migraine	7	stabbing	left-side/ocular	Prodrome – nausea, Concurrent – light sensitivity and sound sensitivity, 
		//Postdrome - fatigue	MaxAlt, triptan class, 5 mg	9:00 AM	11:00 AM	scent-fumes from construction, lighting-sun glare	none
		Neurologist neurologist = new Neurologist();
		DateFormat format = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss a");
		Patient patient1 = new Patient();
		
		// BEGIN HEADACHE 1
		Headache headache1 = new Headache();
		try {
			headache1.setDate(format.parse("5/1/2017 7:30:00 AM"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		headache1.setDuration(210); //duration in minutes
		headache1.setType(new StandardHeadacheType(HeadacheType.MIGRAINE));
		PainDescriptor descriptor = new PainDescriptor();
		descriptor.setSeverity(7);
		descriptor.setDescription(new StandardPainDescriptor(PainDescription.stabbing));
		descriptor.setSidedness(Sidedness.left);
		descriptor.setLocation(PainLocation.ocular);
		headache1.setPainDescriptor(descriptor);
		ArrayList<AbstractSymptom> headache1Prodrome = new ArrayList<AbstractSymptom>();
		headache1Prodrome.add(new StandardSymptom(Symptom.NAUSEA_VOMITING));
		headache1.setProdromeSymptoms(headache1Prodrome);
		ArrayList<AbstractSymptom> headache1Concurrent = new ArrayList<AbstractSymptom>();
		headache1Concurrent.add(new StandardSymptom(Symptom.LIGHT_SENSITIVITY));
		headache1Concurrent.add(new StandardSymptom(Symptom.SOUND_SENSITIVITY));
		headache1.setConcurrentSymptoms(headache1Concurrent);
		ArrayList<AbstractSymptom> headache1Postdrome = new ArrayList<AbstractSymptom>();
		headache1Postdrome.add(new CustomSymptom("Fatigue"));
		headache1.setPostdromeSymptoms(headache1Postdrome);
		try {
			headache1.setMedication(new Medication("MaxAlt", "triptan", 5, format.parse("5/1/2017 9:00:00 AM"), format.parse("5/1/2017 11:00:00 AM"), 2));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		ArrayList<AbstractTrigger> h1Triggers = new ArrayList<AbstractTrigger>();
		h1Triggers.add(new StandardTrigger(Trigger.SCENT));
		h1Triggers.add(new StandardTrigger(Trigger.LIGHTING));
		headache1.setTrigger(h1Triggers);
		
		ArrayList<AbstractSelfHelp> h1SelfHelp = new ArrayList<AbstractSelfHelp>();
		headache1.setSelfHelp(h1SelfHelp);
		
		
		// BEGIN HEADACE 2
		Headache headache2 = new Headache();
		try {
			headache2.setDate(format.parse("5/6/2017 6:00:00 PM"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		headache2.setDuration(195); //duration in minutes
		headache2.setType(new StandardHeadacheType(HeadacheType.TENSION));
		PainDescriptor h2Descriptor = new PainDescriptor();
		h2Descriptor.setSeverity(5);
		h2Descriptor.setDescription(new CustomPainDescriptor("dull"));
		h2Descriptor.setSidedness(Sidedness.bilateral);
		h2Descriptor.setLocation(PainLocation.sub_occipital);
		headache2.setPainDescriptor(h2Descriptor);
		ArrayList<AbstractSymptom> h2Prodrome = new ArrayList<AbstractSymptom>();
		headache2.setProdromeSymptoms(h2Prodrome);
		ArrayList<AbstractSymptom> h2Concurrent = new ArrayList<AbstractSymptom>();
		h2Concurrent.add(new StandardSymptom(Symptom.NECK_PAIN));
		headache2.setConcurrentSymptoms(h2Concurrent);
		ArrayList<AbstractSymptom> h2Postdrome = new ArrayList<AbstractSymptom>();
		headache2.setPostdromeSymptoms(h2Postdrome);
		try {
			headache2.setMedication(new Medication("Anaprox", "NSAID", 550, format.parse("5/6/2017 7:00:00 PM"), format.parse("5/6/2017 9:15:00 PM"), 2));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		ArrayList<AbstractTrigger> h2Triggers = new ArrayList<AbstractTrigger>();
		h2Triggers.add(new StandardTrigger(Trigger.MISSED_MEALS));
		headache2.setTrigger(h2Triggers);
		
		ArrayList<AbstractSelfHelp> h2SelfHelp = new ArrayList<AbstractSelfHelp>();
		h2SelfHelp.add(new StandardSelfHelp(SelfHelpDescription.HELPED_A_LOT, SelfHelpTreatment.PHYSICAL_THERAPY));
		headache2.setSelfHelp(h2SelfHelp);
		
		// BEGIN HEADACE 3
		Headache headache3 = new Headache();
		try {
			headache3.setDate(format.parse("5/10/2017 4:00:00 PM"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		headache3.setDuration(300); //duration in minutes
		headache3.setType(new StandardHeadacheType(HeadacheType.TENSION));
		PainDescriptor h3Descriptor = new PainDescriptor();
		h3Descriptor.setSeverity(6);
		h3Descriptor.setDescription(new CustomPainDescriptor("dull"));
		h3Descriptor.setSidedness(Sidedness.bilateral);
		h3Descriptor.setLocation(PainLocation.sub_occipital);
		headache3.setPainDescriptor(h3Descriptor);
		ArrayList<AbstractSymptom> h3Prodrome = new ArrayList<AbstractSymptom>();
		headache3.setProdromeSymptoms(h3Prodrome);
		ArrayList<AbstractSymptom> h3Concurrent = new ArrayList<AbstractSymptom>();
		h3Concurrent.add(new StandardSymptom(Symptom.NECK_PAIN));
		headache3.setConcurrentSymptoms(h3Concurrent);
		ArrayList<AbstractSymptom> h3Postdrome = new ArrayList<AbstractSymptom>();
		headache3.setPostdromeSymptoms(h3Postdrome);
		try {
			headache3.setMedication(new Medication("Anaprox", "NSAID", 550, format.parse("5/6/2017 7:00:00 PM"), format.parse("5/6/2017 9:15:00 PM"), 2));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		ArrayList<AbstractTrigger> h3Triggers = new ArrayList<AbstractTrigger>();
		h1Triggers.add(new StandardTrigger(Trigger.MISSED_MEALS));
		headache3.setTrigger(h3Triggers);
		
		ArrayList<AbstractSelfHelp> h3SelfHelp = new ArrayList<AbstractSelfHelp>();
		h3SelfHelp.add(new StandardSelfHelp(SelfHelpDescription.HELPED_A_LOT, SelfHelpTreatment.PHYSICAL_THERAPY));
		headache3.setSelfHelp(h3SelfHelp);
	}

}
