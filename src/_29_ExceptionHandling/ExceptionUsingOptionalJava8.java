package _29_ExceptionHandling;

import java.util.Optional;
public class ExceptionUsingOptionalJava8 {

    public static int parseInt(String str) {
        return Integer.parseInt(str);
    }

    public static int computeDefaultValue() {
        return 0;
    }
    public static void givenNonNull_whenCreatesNullable_thenCorrect() {
        String name = null;// "not null";
        Optional<String> opt = Optional.ofNullable(name);
        System.out.println(opt);


    }

    public static void main(String[] args) {
        Optional<Integer> result = Optional.ofNullable(parseInt("76"));

        result.ifPresent(value -> {
            System.out.println("Result: " + value);
        });

        int defaultValue = 0;
        int finalResult = result.orElse(defaultValue);

        // Or using orElseGet for a more complex default value computation:
        int anotherResult = result.orElseGet(() -> computeDefaultValue());

        System.out.println("Final Result: " + finalResult);
        System.out.println("Another Result: " + anotherResult);

        givenNonNull_whenCreatesNullable_thenCorrect();
    }

}
