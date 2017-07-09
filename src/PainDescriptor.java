import java.util.ArrayList;

/**
 * 
 */

/**
 * @author Harsha
 *
 */
public class PainDescriptor {
	private int severity;
	private AbstractPainDescription description; 
	private PainLocation location;
	private Sidedness sidedness;
	public int getSeverity() {
		return severity;
	}
	public String getPainDescription(){
		String desc;
		desc=description.getPainDescription();
		return desc;
		
	}
	public void setSeverity(int severity) {
		this.severity = severity;
	}
	public AbstractPainDescription getDescription() {
		return description;
	}
	public void setDescription(AbstractPainDescription description) {
		this.description = description;
	}
	public PainLocation getLocation() {
		return location;
	}
	public void setLocation(PainLocation location) {
		this.location = location;
	}
	public Sidedness getSidedness() {
		return sidedness;
	}
	public void setSidedness(Sidedness sidedness) {
		this.sidedness = sidedness;
	}
	
}
