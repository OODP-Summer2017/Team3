
public class StandardPainDescriptor extends AbstractPainDescription{
	private PainDescription description;

	public PainDescription getDescription() {
		return description;
	}

	public void setDescription(PainDescription description) {
		this.description = description;
	}

	@Override
	public String getPainDescription() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public StandardPainDescriptor(){
		
	}
	
	public StandardPainDescriptor(PainDescription description){
		this.description = description;
	}
}
