package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPIEG2 {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(5, 13, 4, 21, 13, 27, 2, 59, 59, 34);
		
		//creating Stream
//		List.stream();										// using collection
//		Stream<String> stream  = Stream.of(1,2,3);			//using values // Stream.of(arr)
//		Stream<T> streamOfArray = Arrays.stream(arr);			// using array
//		Stream<String> streamOfArray = Stream.empty();			// empty stream
//		Stream.Builder<String> builder = Stream.builder();		// stream builder()
//		builder.add("abc").build();
		
		
		
		//Reverse the elements
		
		
		
		//stream to array list
//		Stream<Integer> stream = Stream.of(1, 3, 2, 3, 4, 5);
//		System.out.println(stream.collect(Collectors.toList()));							//way 1
//		List<Integer> list2 = stream.collect(Collectors.toCollection(ArrayList::new));		//way 2
//		list2.forEach(a -> System.out.println(a));
		
		
		//iterate over stream with indices
//		IntStream.range(0, list.size()).mapToObj(index -> String.format("%d --> %s", index, list.get(index))).forEach(System.out::println);
//		list.stream().peek(System.out::println).count(); //The reason peek() didn't work in our first example is that it's an intermediate operation and we didn't apply a terminal operation to the pipeline. This method exists mainly to support debugging, where you want to see the elements as they flow past a certain point in a pipeline
		
		
		//string to char array
//		"geeksforgeeks".chars().mapToObj( a -> (char)a ).collect(Collectors.toList()).forEach(a -> System.out.println(a));
		
		
		//remove element at given index
//		int index=2;
//		Arrays.stream(IntStream.range(0, list.size()) .filter(i -> i != index) .map(i -> list.get(i)) .toArray()).forEach(System.out::println);
		
		
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
		
	}

}
