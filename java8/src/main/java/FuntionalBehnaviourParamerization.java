import java.util.List;
import java.util.function.Predicate;

public class FuntionalBehnaviourParamerization {


    public static void main(String[] args) {

        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        Predicate<Integer> evenPredicate = x -> x % 2 == 0;
        Predicate<Integer> oddPredicate = x -> x % 2 != 0;


        //numbers.stream().filter(x -> x % 2 == 0).forEach(System.out::println);
        //numbers.stream().filter(x -> x % 2 != 0).forEach(System.out::println);

        FuntionalBehnaviourParamerization.filterAndPrint(numbers, evenPredicate);
        FuntionalBehnaviourParamerization.filterAndPrint(numbers, oddPredicate);


    }

    private static void filterAndPrint(List<Integer> integers, Predicate<? super Integer> predicate) {
        integers.stream().filter(predicate).forEach(System.out::println);
    }


}
