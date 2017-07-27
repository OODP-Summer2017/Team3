import java.util.ArrayList;

public abstract class AbstractSelfHelp {
	private SelfHelpDescription selfHelpDescription;

	public abstract String getSelfHelp();
	
	public abstract String getSelfHelpAsString();

	public int getSeverityDecrease(SelfHelpDescription x) {
		return 1;
	}

	public SelfHelpDescription getSelfHelpDescription() {
		return selfHelpDescription;
	}

	public void setSelfHelpDescription(SelfHelpDescription selfHelpDescription) {
		this.selfHelpDescription = selfHelpDescription;
	}
	
	public static SelfHelpDescription getAverageEffectivity(ArrayList<AbstractSelfHelp> selfHelpList){
		if(selfHelpList.size() == 0){
			return SelfHelpDescription.DIDNT_HELP;
		}
		double numUses = selfHelpList.size();
		double effectivitySum = 0;
		for(AbstractSelfHelp selfHelp : selfHelpList){
			if(selfHelp.getSelfHelpDescription() == SelfHelpDescription.HELPED_A_LOT){
				effectivitySum += 4;
			}
			else if(selfHelp.getSelfHelpDescription() == SelfHelpDescription.HELPED_A_LITTLE){
				effectivitySum += 3;
			}
			else if(selfHelp.getSelfHelpDescription() == SelfHelpDescription.DIDNT_HELP){
				effectivitySum += 2;
			}
			else {// made it worse
				effectivitySum += 1;
			}
		}
		
		int average = (int) Math.round(effectivitySum / numUses);
		if(average == 4){
			return SelfHelpDescription.HELPED_A_LOT;
		}
		else if(average == 3){
			return SelfHelpDescription.HELPED_A_LITTLE;
		}
		else if(average == 2){
			return SelfHelpDescription.DIDNT_HELP;
		}
		else{
			return SelfHelpDescription.MADE_IT_WORSE;
		}
	}
}
