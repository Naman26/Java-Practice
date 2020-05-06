//-- Override equals and hashcode methods in a class and use them collection framework related classes

import java.util.Vector;

class Employee{
    int id;
    String name;

    Employee(int id, String name){
        this.id = id;
        this.name= name;
    }
    @Override
    public boolean equals(Object o){
        return ((Employee) o).name.equals(this.name);
    }

    @Override
    public int hashCode() {
        return this.id;
    }
}

public class Collections_4 {
    public static void main(String[] args) {
        Vector<Employee> n = new Vector<Employee>();
        n.add(new Employee(1,"Naman"));
        n.add(new Employee(2,"Nishant"));
        n.add(new Employee(3,"Harnoor"));
        n.add(new Employee(4,"Harnoor"));

        if(n.get(1).equals(n.get(2))){
            System.out.println("Name is teh same 1");
        }
        if(n.get(2).equals(n.get(3))){
            System.out.println("They are the same 2");
        }
        n.forEach((a)->{
            System.out.println(a.name + " " + a.hashCode());
        });
    }
}
