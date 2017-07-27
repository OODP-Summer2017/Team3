
public class CombinedHeadacheType extends AbstractHeadacheType {

	private HeadacheType[] types;
	
	/**
	 * @return the types
	 */
	public HeadacheType[] getTypes() {
		return types;
	}

	/**
	 * @param types the types to set
	 */
	public void setTypes(HeadacheType[] types) {
		this.types = types;
	}

	public CombinedHeadacheType() {
		// TODO Auto-generated constructor stub
	}
	
	public String getTypeAsString(){
		if(types.length > 0){
			String sToReturn = "";
			for(HeadacheType t : types){
				sToReturn += t.toString();
			}
			
			return sToReturn;
		}
		else
		{
			return "";
		}
	}

}
