import java.util.*;
public class AbstractSelfHelp 
{
public enum SelfHelpDescription{HELPED_A_LOT,HELPED_A_LITTLE,DIDNT_HELP,MADE_IT_WORSE};


public Map<SelfHelpDescription,String> getSelfHelp()
{
	 EnumMap<SelfHelpDescription, String> map = new EnumMap<SelfHelpDescription, String>(SelfHelpDescription.class);  
	   map.put(SelfHelpDescription.HELPED_A_LOT, "4");  
	   map.put(SelfHelpDescription.HELPED_A_LITTLE, "2");  
	   map.put(SelfHelpDescription.DIDNT_HELP, "0");  
	   map.put(SelfHelpDescription.MADE_IT_WORSE,"-2");
	return map;
}

}
