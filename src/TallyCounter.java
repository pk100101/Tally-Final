
public class TallyCounter 
{
	//instance variables or fields
	private int count;
	
	
	//constructors
	public TallyCounter() 
	{
		count = 0;
	}
	
	public TallyCounter (int startNum)
	{
		count = startNum;
	}
	//methods
	public void click ()
	{
		count = count + 1;
		//count++; (does the same thing)
		//count+=1;
	}
	
}
