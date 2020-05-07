import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Collections_5 {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(1,2,3,4));
        List cubes = num.stream().map(x->x*x*x).collect(Collectors.toList());

        num.forEach(System.out::println);
        System.out.println("After map");
        cubes.forEach(System.out::println);

        System.out.println("---------------------------------");

        ArrayList<String> str= new ArrayList<>(Arrays.asList("Naman", "Kanwar", "NBC"));
        List <String> result = str.stream().filter(n->n.startsWith("N")).collect(Collectors.toList());

        str.forEach(System.out::println);
        System.out.println("After Filter");
        result.forEach(System.out::println);

        System.out.println("---------------------------------");
        ArrayList<Integer> n = new ArrayList<>(Arrays.asList(1,0,5,4));
        List sort = n.stream().sorted().collect(Collectors.toList());

        n.forEach(System.out::println);
        System.out.println("After sorted");
        sort.forEach(System.out::println);

        System.out.println("---------------------------------");
    }


}
