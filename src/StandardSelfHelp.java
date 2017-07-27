
public class StandardSelfHelp extends AbstractSelfHelp {

	private SelfHelpDescription selfHelpDescription;
	private SelfHelpTreatment selfHelpTreatment;

	public StandardSelfHelp() {

	}

	public StandardSelfHelp(SelfHelpDescription description, SelfHelpTreatment treatment ){
		this.selfHelpDescription = description;
		this.selfHelpTreatment = treatment;
	}

	@Override
	public String getSelfHelp() {
		// TODO Auto-generated method stub
		return selfHelpTreatment.toString();
	}

	@Override
	public SelfHelpDescription getSelfHelpDescription() {
		// TODO Auto-generated method stub
		return selfHelpDescription;
	}

	public void setSelfHelpDescription(SelfHelpDescription selfHelpDescription ) {
		this.selfHelpDescription = selfHelpDescription;
	}

	/**
	 * @return the selfHelpTreatment
	 */
	public SelfHelpTreatment getSelfHelpTreatment() {
		return selfHelpTreatment;
	}

	/**
	 * @param selfHelpTreatment
	 *            the selfHelpTreatment to set
	 */
	public void setSelfHelpTreatment(SelfHelpTreatment selfHelpTreatment) {
		this.selfHelpTreatment = selfHelpTreatment;
	}
	
	public String getSelfHelpAsString(){
		return this.getSelfHelp();
	}

}
