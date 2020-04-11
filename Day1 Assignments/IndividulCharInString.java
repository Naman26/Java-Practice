/*For a given String, count the individual characters in the string without using string inbuilt functions?
Eg: Java Programming - J-1, a-3, v-1, p-1, r-2, o-1, g-1, m-2, i-1, n-1,g-1.*/

import java.util.HashMap;
public class IndividulCharInString {

    private static void count(String string){
        //Creating Hashmap of Char and Integer
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < string.length(); i++){
            char c = string.charAt(i);
            Integer j = map.get(c);
            if (map.containsKey(c)){
                map.put(c, j + 1);
            }
            else{
                map.put(c,1);
            }
        }
        System.out.println(map);
    }

    public static void main(String[] args) {
        count("Java Programming");
    }
}
