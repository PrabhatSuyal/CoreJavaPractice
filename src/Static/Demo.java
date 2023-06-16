package Static;

class Test
{
	{
		System.out.println("instance initializer block > Test");
	}
static
{
System.out.println("Why I am not executing ");
}
public static final int param=20;
}

public class Demo
{
public static void main(String[] args) throws InterruptedException
{
	System.out.println("Program starts");
	Test test1 = new Test();
	Thread.sleep(2000);
	Test test2 = new Test();
System.out.println(Test.param);
}
}
