package StreamAPI;

import java.util.*;
import java.util.stream.Collectors;


public class StreamAPIEG1 {

	public static void main(String[] args) {
		
		List<StreamAPIEG1A> list = new ArrayList<StreamAPIEG1A>();
		list.add(new StreamAPIEG1A(1, "HP Laptop", 25000f));
		list.add(new StreamAPIEG1A(2, "Dell Laptop", 30000f));
		list.add(new StreamAPIEG1A(3, "Lenevo Laptop", 28000f));
		list.add(new StreamAPIEG1A(4, "Sony Laptop", 28000f));
		list.add(new StreamAPIEG1A(5, "Apple Laptop", 90000f));

        //List<Integer> list = Arrays.asList(5, 13, 4, 21, 13, 27, 2, 59, 59, 34);


        //creating Stream
//		List.stream();										// using collection
//		Stream<String> stream  = Stream.of(1,2,3);			//using values // Stream.of(arr)
//		Stream<T> streamOfArray = Arrays.stream(arr);			// using array
//		Stream<String> streamOfArray = Stream.empty();			// empty stream
//		Stream.Builder<String> builder = Stream.builder();		// stream builder()
//		builder.add("abc").build();


        //iterate over stream with indices
//		IntStream.range(0, list.size()).mapToObj(index -> String.format("%d --> %s", index, list.get(index))).forEach(System.out::println);
//		list.stream().peek(System.out::println).count(); //The reason peek() didn't work in our first example is that it's an intermediate operation and we didn't apply a terminal operation to the pipeline. This method exists mainly to support debugging, where you want to see the elements as they flow past a certain point in a pipeline


        //remove element at given index
//		int index=2;
//		Arrays.stream(IntStream.range(0, list.size()) .filter(i -> i != index) .map(i -> list.get(i)) .toArray()).forEach(System.out::println);


        //Reverse the elements



        //manipulate the Stream
//		Stream<String> stream  = Stream.of("Geek_First", "Geek_2", "Geek_3", "Geek_4", "Geek_Last");
//		System.out.println("first element of stream is : "+stream.findFirst());
//		System.out.println("last element of stream is : "+stream.sorted(Collections.reverseOrder()).findFirst());	// can also use Comparator.reverseOrder()



        //print only duplicate elements
//		Stream<Integer> stream2 = Stream.of(5, 13, 4, 21, 13, 27, 2, 59, 59, 34);
//		System.out.println(stream2.filter(a -> !set.add(a)).collect(Collectors.toSet()));	//Set.add() returns false if element already presents, so in that case only we have to add it to set
//		List<Integer> list = Arrays.asList(5, 13, 4, 21, 13, 27, 2, 59, 59, 34);
//		list.stream().filter(a -> Collections.frequency(list, a)>1).collect(Collectors.toSet()).forEach(System.out::println);



        //count the occurrence of char in string
//		String string = "geeksforgeeks"; char ch = 'c';
//		System.out.println("the occurrence of char in string is : "+string.chars().filter(a -> a==ch).count());;


        //Third largest element
        //System.out.println(list.stream().distinct().sorted().skip(list.stream().distinct().toArray().length - 3).findFirst().orElseThrow(() -> new IllegalAccessError("Array has less than 3 distinct elements.")));

//...............................................3.  Creating Stream object from Arrays
        /*
		Stream<String> streamOfArray = Stream.of("a", "b", "c");
        streamOfArray.forEach(System.out::println);

        // creating from existing array or of a part of an array:
        String[] arr = new String[] { "a", "b", "c" };
        Stream<String> streamOfArrayFull = Arrays.stream(arr);
        streamOfArrayFull.forEach(System.out::println);

        Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 3);
        streamOfArrayPart.forEach(System.out::println);
		*/


        //stream to array list
//		Stream<Integer> stream = Stream.of(1, 3, 2, 3, 4, 5);
//		System.out.println(stream.collect(Collectors.toList()));							//way 1
//		List<Integer> list2 = stream.collect(Collectors.toCollection(ArrayList::new));		//way 2
//		list2.forEach(a -> System.out.println(a));


        //string to char array
        //		"geeksforgeeks".chars().mapToObj( a -> (char)a ).collect(Collectors.toList()).forEach(a -> System.out.println(a));



        // ............................................filtering and iterating on the basis of object's single parameter
//		list.stream().filter( i -> i.getPrice()>28000f ).forEach( i -> System.out.println(i.getName()));
//		List<StreamAPIEG1A> newList = list.stream().filter( p -> p.getPrice()>28000f ).collect(Collectors.toList());
//		newList.forEach( p -> System.out.println(p.getName()) );
		
		
		
		
		// ............................................7. Sum by using Collectors Methods
//		double sum = list.stream().collect(Collectors.summingDouble( p -> p.getPrice() ));
//		System.out.println("sum of all price using stream > collect > summingDouble : "+sum);
		
		
		
		
		// ............................................8. Java Stream Example: Find Max and Min Product Price
		/*
		 * The maximum value is returned as an Optional<T>, where T is the type of the elements in the stream. 
		 * If the stream is empty, the Optional will be empty as well.
		 * */
//		StreamAPIEG1A max = list.stream().max( (a,b) -> a.getPrice()>b.getPrice() ? 1 : -1 ).get();
//		System.out.println("max in list using stream > max > get "+max.getName());
//		
//		
//		StreamAPIEG1A min = list.stream().min( (a,b) -> a.getPrice()>b.getPrice() ? 1 : -1 ).get();		// way 1
//		System.out.println("min in list using stream > min > get "+min.getName());
//		Optional<StreamAPIEG1A> min = list.stream().sorted(Comparator.comparing(StreamAPIEG1A::getPrice)).findFirst();
//		System.out.println(min);
		
		
		
		// ............................................9. Java Stream Example: Convert List into Set
//		list.stream().collect(Collectors.toSet()).forEach(System.out::println);//map(a -> a.getPrice()).collect(Collectors.toSet()).forEach( System.out::println ); //make set of a parameter
//		list.stream().collect(Collectors.toSet()).forEach( a -> System.out.println(a.getName()) );		 //make set of elements based on parameter but we have to provide hashCode() and equals() in Class
		
		
		
		// ............................................10. Java Stream Example: Convert List into Map
//		list.stream().distinct().collect(Collectors.toMap( a -> a.getPrice() , a -> a)).entrySet().forEach(a -> System.out.println("key : "+a.getKey()+" value : "+a.getValue().getName()) );
		/*we used distinct() above otherwise it was giving error "java.util.stream.Collectors.duplicateKeyException(Collectors.java:133)" as there are multiple elements with same price*/
		
		
		
		
		
		
		

	}

}


class StreamAPIEG1A{
	
	private int id;
    private String name;
    private float price;
    public StreamAPIEG1A(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    
    
	@Override
	public int hashCode() {
		
		return (int)this.getPrice();
	}
	@Override
	public boolean equals(Object obj) {
		
		return true;
	}
    
    
	
}