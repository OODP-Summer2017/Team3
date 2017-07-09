import java.util.*;
public class AbstractSelfHelp 
{
public enum SelfHelpDescription{HELPED_A_LOT,HELPED_A_LITTLE,DIDNT_HELP,MADE_IT_WORSE};


public abstract Map<SelfHelpDescription,String> getSelfHelp();


}
