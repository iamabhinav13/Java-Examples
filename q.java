interface p
{
	final int a=10;
	public void display();
}
interface p1 extends p
{
	final int a=20;
}
interface p2 extends p
{
	final int a=30;
}
interface p12 extends p1,p2
{
	final int a=40;
}
class q implements p12
{
	public void display()
	{
		System.out.println("Its done:"+a);
	}
	public static void main(String args[])
	{
		q o=new q();
		o.display();
	}
}