import java.util.ArrayList;

public class Patient
{
public Patient(String name, ArrayList<Headache> ha) {
		
		this.name = name;
		this.ha = ha;
	}
public String name;
ArrayList<Headache> ha;
public void addHeadAche(Headache headache)
{
	ha.add(headache);
}
}
