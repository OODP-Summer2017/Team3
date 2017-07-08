import java.util.Date;

public class Medication {
	private String Name;
	private String ClassVar;//check
	private int DoseInMilligrams;
	private Date TimeTaken;
	private Date TimeEffective;
	private int PainReduction;
	
	public Medication(){
		
	}
	
	public Medication(String name, String ClassVar, int dosageInMilligrams, Date TimeTaken, Date TimeEffective, int painReduction){
		this.Name = name;
		this.ClassVar = ClassVar;
		this.DoseInMilligrams = dosageInMilligrams;
		this.TimeTaken = TimeTaken;
		this.TimeEffective = TimeEffective;
		this.PainReduction = painReduction;
	}
	
	public String getMedciation(){
		return "Medication";
		
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getClassVar() {
		return ClassVar;
	}
	public void setClassVar(String classVar) {
		ClassVar = classVar;
	}
	public int getDoseInMilligrams() {
		return DoseInMilligrams;
	}
	public void setDoseInMilligrams(int doseInMilligrams) {
		DoseInMilligrams = doseInMilligrams;
	}
	public Date getTimeTaken() {
		return TimeTaken;
	}
	public void setTimeTaken(Date timeTaken) {
		TimeTaken = timeTaken;
	}
	public Date getTimeEffective() {
		return TimeEffective;
	}
	public void setTimeEffective(Date timeEffective) {
		TimeEffective = timeEffective;
	}
	public int getPainReduction() {
		return PainReduction;
	}
	public void setPainReduction(int painReduction) {
		PainReduction = painReduction;
	}
	
	
}
