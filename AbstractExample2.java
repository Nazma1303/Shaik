abstract class A1
{
	public abstract void show();
	
}
abstract class B1 extends  A1
{
	public abstract void show();
	
}
 class c1 extends B1{
	public void show()
	{
		System.out.println("Show Method");
	}
}

public  class AbstractExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		c1 v = new c1();
		v.show();

	}

}
