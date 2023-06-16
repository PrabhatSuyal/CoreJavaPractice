package InitializerBlock;

class B
{

//Constructor of B
B()
{
System.out.println("Constructor of B class is called "+this.toString());
}


//Static initialization block of B
static 
{
System.out.println("B class is loaded");
}

//Instance initialization block of B
{ //
//Compiler makes an automatic call to superclass constructor, by calling super() here.
System.out.println("An object of B is being created"); 
}
public String toString(){
	return "classB";
}
}


class A extends B
{

//Constructor of A
A()
{
System.out.println("Constructor of class A is called "+this.toString());
}
static void fun1() {System.out.println("static fun1() of A");}
//Static initialization block of A
static
{
System.out.println("A class is loaded");
}


//Instance initialization block of A
{
//Compiler makes an automatic call to superclass constructor, by calling super() here.
System.out.println("An object of A is being created"); 
}
public String toString(){
	return "classA";
}

public static void main(String... ar)
{
A ob= new A();
}

}
