
public class TallyCounterMain {

	public static void main(String[] args) 
	{
		TallyCounter counter1 = new TallyCounter ();
		TallyCounter counter2 = new TallyCounter (100);
		System.out.println(counter1.getCount());
		System.out.println(counter2.getCount());
		counter1.click();
		counter1.click();
		counter1.click();
		System.out.println(counter1.getCount());
		counter1.reset();
		System.out.print(counter1.getCount());
	}

}
