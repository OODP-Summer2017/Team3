
public class StandardHeadacheType extends AbstractHeadacheType {

	private HeadacheType type;
	
	/**
	 * @return the type
	 */
	public HeadacheType getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(HeadacheType type) {
		this.type = type;
	}

	public StandardHeadacheType() {
		
	}
	
	public StandardHeadacheType(HeadacheType type){
		this.type = type;
	}
	
	public String getTypeAsString(){
		return type.toString();
	}
}
