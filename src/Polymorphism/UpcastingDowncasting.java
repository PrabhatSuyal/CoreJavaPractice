package Polymorphism;


class UpcastingDowncasting1 {
	  public void makeSound() {
	    System.out.println("Animal is making a sound");
	  }
	  
	  public void fetch() {
	    System.out.println("Animal is fetching a ball");
	  }
	}

	class UpcastingDowncasting2 extends UpcastingDowncasting1 {
	  public void makeSound() {
	    System.out.println("Dog is barking");
	  }
	  
	  public void fetch() {
	    System.out.println("Dog is fetching a ball");
	  }
	}

	public class UpcastingDowncasting {
	  public static void main(String[] args) {
	    UpcastingDowncasting1 animal = new UpcastingDowncasting1(); // Creating an Animal object and assigning it to an Animal reference variable
	    animal.makeSound(); // Calling the makeSound() method of the Animal class
	    
	    // Downcasting - casting the Animal reference variable to a Dog reference variable
	    UpcastingDowncasting2 dog = (UpcastingDowncasting2) animal;
	    dog.fetch(); // Calling the fetch() method of the Dog class
	  }
	}
