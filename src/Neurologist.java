import java.util.ArrayList;

public class Neurologist {
	private ArrayList<Patient> patientList;
	
	public Neurologist(){
		patientList = new ArrayList<Patient>();
	}
	
	public void AddPatient(Patient patient){
		patientList.add(patient);
	}
}
