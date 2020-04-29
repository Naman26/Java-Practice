/*
* Demonstrate below:
-- Create an array to store different type of Objects including primitives and get them in the same way inserted.
* */

import Abstract.MyBook;



public class Collections_1 {

    public static void main(String[] args) {
        Object[] arr = new Object[10];
        arr[0] = 9;
        arr[1] = "All Might";
        arr[2] = 12.5;
        arr[3] = new MyBook();
        arr[4] = true;
        arr[5] = 'D';
        arr[6] = (short)4;
        arr[7] = 60L;
        arr[8] = (byte) 55;
        arr[9] = 25f;

        for (Object val : arr) {
            if(val instanceof MyBook){
                System.out.println("book title is " + ((MyBook)val).getTitle());
            }
            else{
                System.out.println(val.getClass() + " " + val);
            }

        }
    }
}
