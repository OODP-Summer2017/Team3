
public class CustomSymptom extends AbstractSymptom {
	String symptomDescription;

	public CustomSymptom(){
		
	}
	
	public CustomSymptom(String description){
		this.symptomDescription = description;
	}
	
	/**
	 * @return the symptomDescription
	 */
	public String getSymptomDescription() {
		return symptomDescription;
	}

	/**
	 * @param symptomDescription the symptomDescription to set
	 */
	public void setSymptomDescription(String symptomDescription) {
		this.symptomDescription = symptomDescription;
	}
	
}
