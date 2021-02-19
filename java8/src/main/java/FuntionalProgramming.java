import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class FuntionalProgramming {


    //private static int sum(int)


    public static void main(String[] args) {

        List<Integer> integerList = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        List<String> listOfStrings = List.of("API", "AWS", "Azure", "Dokcer", "Kubernates", "Microservices", "Spring", "Spring Boot");
        //Many times, we need to perform operations where a stream reduces to single resultant value,
        // for example, maximum, minimum, sum, product, etc. Reducing is the repeated process of combining all elements.
        //https://www.geeksforgeeks.org/stream-reduce-java-examples/
        // System.out.println("Sum " + integerList.stream().reduce(0,(a,b)-> a+b)); // one of aggregator
        //System.out.println("Sum "+ integerList.stream().reduce(0,Integer::sum)); // Smart way of handling
        // System.out.println("Max value -->" + integerList.stream().reduce(Integer.MIN_VALUE, (x, y) -> x > y ? x : y)); //MAX value
        //System.out.println("Min value -->" + integerList.stream().reduce(Integer.MAX_VALUE, (x, y) -> x < y ? x : y)); //MIN value
        //Square every number in a list and find the sum of squares;
        //System.out.println("Square -->" + integerList.stream().map(x -> x * x).reduce(0, (x, y) -> x + y));
        //integerList.stream().distinct().sorted().forEach(System.out::println);
        //System.out.println(integerList.stream().sorted(Comparator.naturalOrder()));
        // listOfStrings.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println); // Using comprator
        //listOfStrings.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println); //reverse order
        //listOfStrings.stream().sorted(Comparator.comparing(str ->str.length())).forEach(System.out::println); //custom comprator
        //listOfStrings.stream().sorted(Comparator.comparing(str ->str.length()).).forEach(System.out::println);//custom comprator with reverse order  TODO check this
        // System.out.println(listOfStrings.stream().map(x ->  x.length()).collect(Collectors.toList()).toString());
        //Print all the even numbers, squares
        integerList.stream().filter(x -> x % 2 == 0).map(x -> x * x).forEach(System.out::println);

    }


}

