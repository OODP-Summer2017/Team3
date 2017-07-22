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
		ArrayList<PainDescriptorContainer> h1locationList = new ArrayList<PainDescriptorContainer>();
		PainDescriptorContainer h1location = new PainDescriptorContainer(PainLocation.ocular, Sidedness.left);
		h1locationList.add(h1location);
		descriptor.setLocationList(h1locationList);
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
		
		patient1.addHeadache(headache1);
		
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
		ArrayList<PainDescriptorContainer> h2locationList = new ArrayList<PainDescriptorContainer>();
		PainDescriptorContainer h2location = new PainDescriptorContainer(PainLocation.sub_occipital, Sidedness.bilateral);
		h2locationList.add(h2location);
		h2Descriptor.setLocationList(h2locationList);
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
		
		patient1.addHeadache(headache2);
		
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
		ArrayList<PainDescriptorContainer> h3locationList = new ArrayList<PainDescriptorContainer>();
		PainDescriptorContainer h3location = new PainDescriptorContainer(PainLocation.frontal, Sidedness.bilateral);
		PainDescriptorContainer h3location2 = new PainDescriptorContainer(PainLocation.temporal, Sidedness.right);
		h3locationList.add(h3location);
		h3locationList.add(h3location2);
		headache3.setPainDescriptor(h3Descriptor);
		ArrayList<AbstractSymptom> h3Prodrome = new ArrayList<AbstractSymptom>();
		headache3.setProdromeSymptoms(h3Prodrome);
		ArrayList<AbstractSymptom> h3Concurrent = new ArrayList<AbstractSymptom>();
		h3Concurrent.add(new StandardSymptom(Symptom.NECK_PAIN));
		h3Concurrent.add(new StandardSymptom(Symptom.SINUS_CONGESTION));
		headache3.setConcurrentSymptoms(h3Concurrent);
		ArrayList<AbstractSymptom> h3Postdrome = new ArrayList<AbstractSymptom>();
		headache3.setPostdromeSymptoms(h3Postdrome);
		try {
			headache3.setMedication(new Medication("Anaprox", "NSAID", 550, format.parse("5/6/2017 5:00:00 PM"), format.parse("5/6/2017 7:00:00 PM"), 2));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		ArrayList<AbstractTrigger> h3Triggers = new ArrayList<AbstractTrigger>();
		h1Triggers.add(new StandardTrigger(Trigger.STRESS));
		headache3.setTrigger(h3Triggers);
		
		ArrayList<AbstractSelfHelp> h3SelfHelp = new ArrayList<AbstractSelfHelp>();
		h3SelfHelp.add(new StandardSelfHelp(SelfHelpDescription.DIDNT_HELP, SelfHelpTreatment.BIOFEEDBACK));
		h3SelfHelp.add(new StandardSelfHelp(SelfHelpDescription.HELPED_A_LOT, SelfHelpTreatment.PHYSICAL_THERAPY));
		headache3.setSelfHelp(h3SelfHelp);
		patient1.addHeadache(headache3);
		
		// BEGIN HEADACE 4
		Headache headache4 = new Headache();
		try {
			headache4.setDate(format.parse("5/17/2017 9:00:00 AM"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		headache4.setDuration(180); //duration in minutes
		headache4.setType(new StandardHeadacheType(HeadacheType.MIGRAINE));
		PainDescriptor h4Descriptor = new PainDescriptor();
		h4Descriptor.setSeverity(7);
		h4Descriptor.setDescription(new StandardPainDescriptor(PainDescription.pulsating));
		ArrayList<PainDescriptorContainer> h4locationList = new ArrayList<PainDescriptorContainer>();
		PainDescriptorContainer h4location = new PainDescriptorContainer(PainLocation.ocular, Sidedness.left);
		h4locationList.add(h4location);
		headache4.setPainDescriptor(h4Descriptor);
		ArrayList<AbstractSymptom> h4Prodrome = new ArrayList<AbstractSymptom>();
		h4Prodrome.add(new StandardSymptom(Symptom.NAUSEA_VOMITING));
		h4Prodrome.add(new StandardSymptom(Symptom.TEARING_REDNESS_OF_EYES));
		headache4.setProdromeSymptoms(h4Prodrome);
		ArrayList<AbstractSymptom> h4Concurrent = new ArrayList<AbstractSymptom>();
		h4Concurrent.add(new StandardSymptom(Symptom.VISION_DISTURBANCES));
		headache4.setConcurrentSymptoms(h4Concurrent);
		ArrayList<AbstractSymptom> h4Postdrome = new ArrayList<AbstractSymptom>();
		headache4.setPostdromeSymptoms(h4Postdrome);
		try {
			headache4.setMedication(new Medication("MaxAlt", "triptan", 5, format.parse("5/17/2017 6:15:00 AM"), format.parse("5/17/2017 7:30:00 AM"), 2));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		ArrayList<AbstractTrigger> h4Triggers = new ArrayList<AbstractTrigger>();
		h1Triggers.add(new StandardTrigger(Trigger.SLEEP_CYCLE_CHANGE));
		headache4.setTrigger(h4Triggers);
		
		ArrayList<AbstractSelfHelp> h4SelfHelp = new ArrayList<AbstractSelfHelp>();
		h4SelfHelp.add(new StandardSelfHelp(SelfHelpDescription.HELPED_A_LITTLE, SelfHelpTreatment.REST_SLEEP));
		headache4.setSelfHelp(h4SelfHelp);
		patient1.addHeadache(headache4);
		
		//System.out.println("SUMMARY FOR PATIENT 1");
		System.out.println(patient1.Summary());
		
		//System.out.println("\n\n\nMEDICATION REPORT FOR PATIENT 1");
		System.out.println("\n\n" + patient1.detailedMedicationReport());
		
		System.out.println("\n\n" + patient1.detailedSelfHelpReport());
	}

}
