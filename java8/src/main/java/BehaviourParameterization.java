import java.util.List;
import java.util.Random;
import java.util.function.*;

public class BehaviourParameterization {


    public static void main(String[] args) {

        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

        Predicate<Integer> isEvenPredicate = x -> x % 2 == 0;
        Function<Integer, Integer> squareFunction = x -> x * x;
        Function<Integer, String> stringOutputFunction = x -> x + "";
        Consumer<Integer> sysConsumer = x -> System.out.println(x);
        BinaryOperator<Integer> sumBinaryFunction = (a, b) -> a + b;

        //No input -> Return Something  -- something like factory Pattern
        Supplier<Integer> randomInteger = () -> 2;
        Supplier<Integer> randomNumber = () -> {
            Random random = new Random();
            return random.nextInt(100);
        };
        System.out.println(randomInteger.get());


        //UnaryOperator --> Exactly opposite to the Binary Operator.. It takes one inout and comupute
        UnaryOperator<Integer> integerUnaryOperator = (x) -> 3 * x;
        System.out.println(integerUnaryOperator.apply(10));

        //BiPredicate  -> accept two inputs and return one output
        BiPredicate<Integer, String> integerStringBiPredicate = (number, str) -> true;

        //BiFunction   similar to Function, where here we are accepting two inputs
        //BiConsumer   similar to Consumer, where here we are accepting two inputs


        //--- Primitaive functional interfaces
        //IntBinaryOperator
        //IntConsumer
        //IntPredicate
        //IntSupplier
        //IntToDoubleFunction


    }

}
