import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FuntionalInterfaces {   // functional descriptor --> a method inside the abstract method









    public static void main(String[] args) {

        List<Integer> integerList = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

        //integerList.stream().filter(x -> x % 2 == 0).map(x -> x * x).forEach(System.out::println);


        Predicate<Integer> integerPredicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        };

        Function<Integer, Integer> function = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer * integer;
            }
        };

        Consumer<Integer> integerConsumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };

        integerList.stream().filter(integerPredicate).map(function).forEach(integerConsumer);


    }


}
