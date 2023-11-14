abstract class Electricity
{
	int units=100;
	public void show()
	{
		System.out.println("Units = "+units);
	}
	public abstract void bill_generation();
	
}
class Domestic extends Electricity
{
	public void bill_generation()
	{
		double v=units*3.5;
		System.out.println("The bill is:"+v);
	}
}
public class AbstractExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Domestic b=new Domestic();
		b.show();
		b.bill_generation();

	}

}
