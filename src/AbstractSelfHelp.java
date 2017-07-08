
public abstract class AbstractSelfHelp {
	private SelfHelpDescription qualitativeAssistance;

	public abstract String getSelfHelp();

	public abstract SelfHelpDescription getSelfHelpDescription();

	public int getSeverityDecrease(SelfHelpDescription x) {
		return 1;
	}

	public SelfHelpDescription getQualitativeAssistance() {
		return qualitativeAssistance;
	}

	public void setQualitativeAssistance(SelfHelpDescription qualitativeAssistance) {
		this.qualitativeAssistance = qualitativeAssistance;
	}
}
