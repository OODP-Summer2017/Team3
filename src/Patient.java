import java.util.ArrayList;

public class Patient {
	
	private String name;
	private ArrayList<Headache> headacheList;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void addHeadache(Headache headache){
		headacheList.add(headache);
	}
	
	
	
	
	
}
