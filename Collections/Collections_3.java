//-- Implement custom sorting using Comparator and Comparable interfaces.
import java.lang.Comparable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//
class Movement implements Comparator {
    private int speed;

    Movement(){}
    Movement(int speed) {
        this.speed = speed;
    }

    double getSpeed() {
        return speed;
    }
    @Override
    public int compare(Object a, Object b){
        a = (Movement)a;
        b = (Movement)b;
        return ((Movement) a).speed - ((Movement) b).speed;

    }
}


public class Collections_3 {



    public static void main(String[] args) {
        Movement car1 = new Movement(50);
        Movement car2 = new Movement(40);
        List<Movement> m = new ArrayList<Movement>();
        m.add(car1);
        m.add(car2);
        for (Movement movement : m) {
            System.out.println(movement.getSpeed());
        }
        Collections.sort(m, new Movement());
        System.out.println("\nAfter using Compare()\n");
        for (Movement movement : m) {
            System.out.println(movement.getSpeed());
        }
        System.out.println();
        ArrayList<String > a = new ArrayList<String>();
        a.add("Naman");
        a.add("Kanwar");
        a.add("Tek and CO");
        a.forEach((b)->{
            System.out.println(b);
        });
        System.out.println("\nAfter using compareTo()\n");
        Collections.sort(a);
        a.forEach((b)->{
            System.out.println(b);
        });
        }

    }

