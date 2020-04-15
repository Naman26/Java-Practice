package Interface;


import java.util.ArrayList;

class Book{
 String title ="";
}

class Comic extends Book{
    String images = "";
    int characterCount = 0;
}


public class InstanceOf {
    public static void main(String[] args) {
        ArrayList<Object> arr= new ArrayList<>();
        arr.add(new Book());
        arr.add(new Comic());
        arr.add(new Comic());
        Book b = new Comic();
        arr.add(b);

        arr.forEach((a) -> {if(a instanceof Book) System.out.println("book");} );


    }
}
