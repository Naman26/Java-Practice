/*
-- Write/Read elements on List,Set and Map implementations.
* */
import java.util.*;
public class Collections_2 {

    public static void listInterface(){
        System.out.println("Super Heros\n");
        //ArrayList
        ArrayList<String> marvel= new ArrayList<String>();
        //Vector
        Vector<String> dc = new Vector<String>();

        marvel.add("Iron man");
        marvel.add("Captain America");
        marvel.add("Thor");
        marvel.add("Black Widow");

        dc.add("Superman");
        dc.add("Batman");
        dc.add("Wonder Woman");
        dc.add("Flash");

        marvel.forEach((a) ->{
            System.out.println(a);
        });

        dc.forEach((a)-> System.out.println(a));
    }

    public static void mapInterface() {
        System.out.println("Languages\n");
        //ArrayList
        HashMap<String, Integer> languages = new HashMap<String, Integer>();
//        //Vector
        LinkedHashMap<String, Integer> languages2 = new LinkedHashMap<String, Integer>();
//
        languages.put("Java", 1);
        languages.put("C++", 1);
        languages.put("Python", 2);
        languages.put("Kotlin", 1);
//
        languages2.put("English", 1);
        languages2.put("Hindi", 2);
        languages2.put("Spanish", 3);
        languages2.put("French", 4);
//
        languages.forEach((a, b) -> {
            System.out.println(a + " : " + b);
        });

        languages2.forEach((a, b) -> {
            System.out.println(a + " : " + b);
        });

    }
        public static void setInterface(){
            System.out.println("Songs\n");
            //ArrayList
            HashSet<String> postMalone = new HashSet<String>();
//        //Vector
            TreeSet<String> lonelyIsland = new TreeSet<String>();
//
            postMalone.add("Goodbye");
            postMalone.add("Wow");
            postMalone.add("Rockstar");
            postMalone.add("Congratulations");
//
            lonelyIsland.add("Jack Sparrow");
            lonelyIsland.add("Throw it on the ground");
            lonelyIsland.add("I'm on a boat");
            lonelyIsland.add("Lazy Sunday");
//
            postMalone.forEach((a) ->{
                System.out.println(a);
            });

            lonelyIsland.forEach((b) ->{
                System.out.println(b);
            });
//
//        lonelyIsland.forEach((a)-> System.out.println(a));
    }
    public static void main(String[] args) {
        listInterface();
        setInterface();
        mapInterface();

        TreeSet<String> ts = new TreeSet<String>();



    }
}
