
public class StandardSymptom extends AbstractSymptom
{
	public enum Symptom{AURA,NAUSEA_OR_VOMITING,LIGHT_SENSITIVITY,SOUND_SENSITIVITY,SMELL_SENSITIVITY,VISION_DISTURBANCES,TEARING_OR_REDNESS_OF_EYES,SINUS_CONGESTION,NECK_PAIN };
    public Symptom symptom;
	
	public StandardSymptom(Symptom symptom)
	{
		this.symptom=symptom;
	}
	public String getSymptom()
	{
		return String.valueOf(symptom);
	}
}
