package ExceptionHandling;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaWrapperEG1 {

	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(3, 9, 7, 0, 10, 20);
		integers.forEach(lambdaWrapper(i -> System.out.println(i+"__"+50 / i)));

	}

	private static Consumer<? super Integer> lambdaWrapper(Consumer<Integer> consumer) {
		
		try {
			return a -> System.out.println(a+"__"+50/a);
		} catch (Exception e) {			
			e.printStackTrace();
		}
		return null;
	}

}
