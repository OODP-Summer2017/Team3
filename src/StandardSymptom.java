
public class StandardSymptom extends AbstractSymptom {
	private Symptom symptom;
	
	public StandardSymptom() {
		
	}
	
	public StandardSymptom(Symptom symptom){
		this.symptom = symptom;
	}

	/**
	 * @return the symptom
	 */
	public Symptom getSymptom() {
		return symptom;
	}

	/**
	 * @param symptom the symptom to set
	 */
	public void setSymptom(Symptom symptom) {
		this.symptom = symptom;
	}
}
