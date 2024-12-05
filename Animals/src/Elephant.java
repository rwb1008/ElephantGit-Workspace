
public class Elephant {
	
	
	//attributes
	private String trunk;
	private int legs;
	private String ears;
	private int tusks;
	private String color;
	private boolean fly;
	
	//methods
	void setTrunk (String trunkLength)
	{
		trunk = trunkLength;
	}
	String getTrunk()
	{
		return trunk;
	}
	
	void setLegs (int noLegs)
	{
		legs = noLegs;
	}
	int getLegs()
	{
		return legs;
	}
	
	void setEars (String earSize)
	{
		ears = earSize;
	}
	String getEars()
	{
		return ears;
	}
	
	void setTusks(int noTusks)
	{
		tusks = noTusks;
	}
	int getTusks()
	{
		return tusks;
	}
	
	void setColor (String bodyColor)
	{
		color = bodyColor;
	}
	String getColor()
	{
		return color;
	}
	
	void setFly (boolean canFly)
	{
		fly = canFly;
	}
	boolean getFly()
	{
		return fly;
	}

	public static void main (String [] args)
	{
		//Clyde is an instance of an Elephant
		Elephant clyde = new Elephant();		
		clyde.setLegs(4);
		System.out.print("Clyde has " +clyde.getLegs()+" legs" );
		
		Elephant brewster = new Elephant();		
		brewster.setLegs(6);
		System.out.print("\nBrewster has " +brewster.getLegs()+" legs" );
		
		for(int i=0; i<10; i++)
		{
			System.out.print(i + " ");
		}
	}

}
