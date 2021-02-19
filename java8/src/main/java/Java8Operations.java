import java.util.List;

public class Java8Operations {

    public static void main(String[] args) {

        List<Course> courses = List.of(
                new Course("Spring", "Framework", 98, 20000),
                new Course("AWS", "Cloud", 95, 18000),
                new Course("SpringBoot", "Framework", 96, 22000),
                new Course("FullStack", "Fullstack", 91, 25000),
                new Course("API", "Framework", 98, 21000),
                new Course("AWS", "Cloud", 88, 21000),
                new Course("Azure", "Cloud", 99, 22000),
                new Course("Docker", "Cloud", 98, 20000),
                new Course("Kubernetes", "Cloud", 90, 20000)
        );

        // allMatch, noneMatch, anyMatch
        //Comparator
        //Limit
        //Skip - skip to 3 results
        // Print the course which is not having 91 --> takeWhile and dropWhile
        //MAX - which course is most
        //MIN - which course is min subscibers
        //Optional.Empty -- Instead of Null, we are returning empty value
        //groupingBy
        //joining
        //flatMap --> Each Element of Stream replaced with content of mapped Stream
        //HighOrderFunction  -> Returns a another function has the return value






    }


}
