
public class CustomPainDescriptor extends AbstractPainDescription{
	private String description;
	
	public CustomPainDescriptor(){
		
	}
	
	public CustomPainDescriptor(String description){
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String getPainDescription() {
		// TODO Auto-generated method stub
		return null;
	}
}
