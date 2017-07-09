
public class PainDescriptorContainer {
	private PainLocation painLocation;
	private Sidedness sidedness;
	
	public PainDescriptorContainer() {
		// TODO Auto-generated constructor stub
	}
	
	public PainDescriptorContainer(PainLocation location, Sidedness side){
		this.painLocation = location;
		this.sidedness = side;
	}
	/**
	 * @return the painLocation
	 */
	public PainLocation getPainLocation() {
		return painLocation;
	}

	/**
	 * @param painLocation the painLocation to set
	 */
	public void setPainLocation(PainLocation painLocation) {
		this.painLocation = painLocation;
	}

	/**
	 * @return the sidedness
	 */
	public Sidedness getSidedness() {
		return sidedness;
	}

	/**
	 * @param sidedness the sidedness to set
	 */
	public void setSidedness(Sidedness sidedness) {
		this.sidedness = sidedness;
	}


	


}
