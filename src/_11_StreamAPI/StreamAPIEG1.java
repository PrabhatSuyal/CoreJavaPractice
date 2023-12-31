package _11_StreamAPI;

import java.util.*;


public class StreamAPIEG1 {

	public static void main(String[] args) {
		
		List<Item> list = new ArrayList<Item>();
		list.add(new Item(1, "item1", 25000f,"catA"));
		list.add(new Item(2, "item2", 30000f,"catB"));
		list.add(new Item(3, "item3", 68000f,"catD"));
		list.add(new Item(4, "item4", 28000f,"catB"));
		list.add(new Item(5, "item5", 90000f,"catC"));
        list.add(new Item(3, "item6", 47000f,"catB"));
        list.add(new Item(4, "item7", 38000f,"catA"));
        list.add(new Item(5, "item8", 67000f,"catD"));


        //List<Integer> list = Arrays.asList(5, 13, 4, 21, 13, 27, 2, 59, 59, 34);


        //creating Stream
//		List.stream();										// using collection
//		Stream<String> stream  = Stream.of(1,2,3);			//using values // Stream.of(arr)
//		Stream<T> streamOfArray = Arrays.stream(arr);			// using array
//		Stream<String> streamOfArray = Stream.empty();			// empty stream
//		Stream.Builder<String> builder = Stream.builder();		// stream builder()
//		builder.add("abc").build();


        //iterate over stream with indices/index
//		IntStream.range(0, list.size()).mapToObj(index -> String.format("%d --> %s", index, list.get(index))).forEach(System.out::println);
//		list.stream().peek(System.out::println).count(); //The reason peek() didn't work in our first example is that it's an intermediate operation, and we didn't apply a terminal operation to the pipeline. This method exists mainly to support debugging, where you want to see the elements as they flow past a certain point in a pipeline


        //remove element at given index
//		int index=2;
//		Arrays.stream(IntStream.range(0, list.size()) .filter(i -> i != index) .map(i -> list.get(i)) .toArray()).forEach(System.out::println);


        //Reverse the elements



        //Find first or last element of Stream
//		Stream<String> stream  = Stream.of("Geek_First", "Geek_2", "Geek_3", "Geek_4", "Geek_Last");
//		System.out.println("first element of stream is : "+stream.findFirst());                                     // way 1
//		System.out.println("last element of stream is : "+stream.sorted(Collections.reverseOrder()).findFirst());	// way 2 can also use Comparator.reverseOrder()
//      System.out.println("First element of list : "+list.stream().reduce((a,b) -> a).get().getName());            // way 3
//      System.out.println("Last element of list : "+list.stream().reduce((a,b) -> b).get().getName());             // way 1


        //manipulate the stream


        //print only duplicate elements
//		Stream<Integer> stream2 = Stream.of(5, 13, 4, 21, 13, 27, 2, 59, 59, 34);
//		System.out.println(stream2.filter(a -> !set.add(a)).collect(Collectors.toSet()));	//Set.add() returns false if element already presents, so in that case only we have to add it to set
//		List<Integer> list = Arrays.asList(5, 13, 4, 21, 13, 27, 2, 59, 59, 34);
//		list.stream().filter(a -> Collections.frequency(list, a)>1).collect(Collectors.toSet()).forEach(System.out::println);
/*        System.out.println("duplicate elements using Collectors.groupingBy() : "+list.stream()
                .collect(Collectors
                        .groupingBy(StreamAPIEG1A::getPrice,Collectors.toList()))           // group the elements to list by their common price
                .entrySet().stream()
                .filter(a -> a.getValue().size()>1)                                         // filtering that list having multiple obj with common price
                .map(a -> a.getValue().size())                                              // mapping their count
                .collect(Collectors.toList()));                                             // printing their count
*/


        //count the occurrence of char in string
//		String string = "geeksforgeeks"; char ch = 'c';
//		System.out.println("the occurrence of char in string is : "+string.chars().filter(a -> a==ch).count());;


        // ............................................8. Java Stream Example: Find Max and Min Product Price
        /*
         * The maximum value is returned as an Optional<T>, where T is the type of the elements in the stream.
         * If the stream is empty, the Optional will be empty as well.
         * */
//		StreamAPIEG1A max = list.stream().max( (a,b) -> a.getPrice()>b.getPrice() ? 1 : -1 ).get();     //get() is the fun() inside Optional<T> which returns T
//		System.out.println("max in list using stream > max > get "+max.getName());
//
//
//		StreamAPIEG1A min = list.stream().min( (a,b) -> a.getPrice()>b.getPrice() ? 1 : -1 ).get();		// way 1
//		System.out.println("min in list using stream > min > get "+min.getName());
        //Optional<StreamAPIEG1A> min = list.stream().sorted(new Comparator<StreamAPIEG1A>() { public int compare(StreamAPIEG1A a, StreamAPIEG1A b) { return a.getPrice() > b.getPrice() ? 1 : -1;    }}).findFirst();
        //Optional<StreamAPIEG1A> min = list.stream().sorted((a,b)->a.getPrice()>b.getPrice() ? 1:-1).findFirst();
        //Optional<StreamAPIEG1A> min = list.stream().sorted(Comparator.comparing(StreamAPIEG1A::getPrice)).findFirst();  //Comparator.comparing() will return obj of Comparator
        //System.out.println(min.get().getName());


        //Third largest element
        //System.out.println(list.stream().distinct().sorted().skip(list.stream().distinct().toArray().length - 3).findFirst().orElseThrow(() -> new IllegalAccessError("Array has less than 3 distinct elements.")));



        // merge arrays
//        Stream a = Stream.of(3,2,5,23,4,6);
//        Stream b = Stream.of(3,2,5,23,4,6);
//        Stream.concat(a,b).toArray();

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
//      IntStream.of(2,4,3,1).sum();


		
		// ............................................9. Java Stream Example: Convert List into Set
//		list.stream().collect(Collectors.toSet()).forEach(System.out::println);//map(a -> a.getPrice()).collect(Collectors.toSet()).forEach( System.out::println ); //make set of a parameter
//		list.stream().collect(Collectors.toSet()).forEach( a -> System.out.println(a.getName()) );		 //make set of elements based on parameter but we have to provide hashCode() and equals() in Class
		
		
		
		// ............................................10. Java Stream Example: Convert List into Map
//		list.stream().distinct().collect(Collectors.toMap( a -> a.getPrice() , a -> a)).entrySet().forEach(a -> System.out.println("key : "+a.getKey()+" value : "+a.getValue().getName()) );
		/*we used distinct() above otherwise it was giving error "java.util.stream.Collectors.duplicateKeyException(Collectors.java:133)" as there are multiple elements with same price*/

        //............................................11. group by function

        //filter the object whose price more than 30000 to a list
        //Map<Float,List<Item>> tempMap1 = list.stream().filter(a->a.getPrice()>30000).collect(Collectors.groupingBy(Item::getPrice));
        //tempMap1.entrySet().stream().flatMap(a->a.getValue().stream()).forEach(b->System.out.println(b.getName()));

        //find item with maximum amount
        //list.stream().sorted((a,b)->a.getPrice()<b.getPrice()?1:-1).limit(1).forEach(a->System.out.println(a.getName()));
        //list.stream().collect(Collectors.maxBy((a,b)->a.getPrice()>b.getPrice()?1:-1)).stream().forEach(c->System.out.println(c.getName()));

        //find the top 5 most expensive items
        //list.stream().sorted((a,b)->a.getPrice()>b.getPrice()?-1:1).limit(5).forEach(c->System.out.println(c.getName()));

        //average price in each category
        //list.stream().collect(Collectors.groupingBy(Item::getCat,Collectors.averagingDouble(Item::getPrice)))  .entrySet().stream().forEach(a->System.out.println("Cat : "+a.getKey()+" avg : "+a.getValue()));

        //total price in each category
        //list.stream().collect(Collectors.groupingBy(Item::getCat,Collectors.summingDouble(Item::getPrice)))  .entrySet().stream().forEach(a->System.out.println("Cat : "+a.getKey()+" avg : "+a.getValue()));

        //max price in each cat
        //list.stream().collect(Collectors.groupingBy(Item::getCat,Collectors.maxBy((a,b)->a.getPrice()>b.getPrice()?1:-1)))   .entrySet().stream().forEach(c->System.out.println(c.getKey()+" max item : "+c.getValue().get().getName()));

        //top 2 items in each category
        /*list.stream().collect(Collectors.groupingBy(Item::getCat,Collectors.toList()))  .entrySet().stream().forEach(
                a-> {System.out.println(a.getKey()); a.getValue().stream().sorted((b,c)->b.getPrice()>c.getPrice()?-1:1).limit(2).forEach(d->System.out.println(d.getPrice()));}
        );*/

        //Exception handling
        /*Arrays.asList("234","56","et5").stream()
                .map(str -> {
                    try {
                        return Optional.of(Integer.parseInt(str));
                    } catch (NumberFormatException e) {
                        // Handle the exception by returning an empty Optional
                        return Optional.empty();
                    }
                })
                .map(optional -> optional.orElseGet(() -> {return 0;}))
                .collect(Collectors.toList());
            */





	}

}


class Item {
	
	private int id;
    private String name;
    private float price;
    private String cat;
    public Item(int id, String name, float price, String cat) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.cat = cat;
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

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
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