public class PermutationsOfGivenString {
    /*Write a Java program to print all permutations of a given String. For example, if given String is "GOD" then your
    program should print all 6 permutations of this string, e.g. "GOD," "OGD," "DOG," "GDO," "ODG," and "DGO."
    * */
    public static void permutation(String str, String ans){
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            String ros = str.substring(0, i) +
                    str.substring(i + 1);
            permutation(ros, ans + ch);
        }
    }

    public static void main(String[] args) {
        String s = "abc";
        permutation(s,"");
    }
}
