

public class StandardTrigger extends AbstractTrigger
{

	public enum Trigger{SLEEP_CYCLE_CHANGES,SCENTS ,LIGHTING,SOUND ,CERTAIN_FOODS  ,FOOD_ADDITIVES ,MISSED_MEALS ,ALCOHOL ,CAFFEINE ,WEATHER ,STRESS };
	public Trigger trigger;

	public StandardTrigger(Trigger trigger)
	{
		this.trigger=trigger;
	}
	public String getTrigger()
	{
		
		return String.valueOf(trigger);
	}
}

