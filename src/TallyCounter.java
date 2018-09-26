
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
	
	public void unclick ()
	{
		count--;
	}
	
	public void reset ()
	{
		count = 0;
	}
	
	public int getCount ()
	{
		return count;
	}
}
