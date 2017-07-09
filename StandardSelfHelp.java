
public class StandardSelfHelp extends SelfHelp
{
	private String des;
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	public  Map<SelfHelpDescription,String> getSelfHelp()
	{
		 EnumMap<SelfHelpDescription, String> map = new EnumMap<SelfHelpDescription, String>(SelfHelpDescription.class);  
		   map.put(SelfHelpDescription.HELPED_A_LOT, "4");  
		   map.put(SelfHelpDescription.HELPED_A_LITTLE, "2");  
		   map.put(SelfHelpDescription.DIDNT_HELP, "0");  
		   map.put(SelfHelpDescription.MADE_IT_WORSE,"-2");
		return map;
	}

}
