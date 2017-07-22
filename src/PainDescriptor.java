import java.util.ArrayList;

/**
 * @author Harsha
 *
 */
public class PainDescriptor {
	private int severity;
	private AbstractPainDescription description; 
	private ArrayList<PainDescriptorContainer> locationList;
	
	/**
	 * @return the locationList
	 */
	public ArrayList<PainDescriptorContainer> getLocationList() {
		return locationList;
	}
	/**
	 * @param locationList the locationList to set
	 */
	public void setLocationList(ArrayList<PainDescriptorContainer> locationList) {
		this.locationList = locationList;
	}
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
	
}
