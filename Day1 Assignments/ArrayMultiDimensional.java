/*Write a program to find whetehr the given string is present in diagonal of MXN array matrix. You can assume M and N
values. If the multiple values present, print the count of the occurences as well.*/
public class ArrayMultiDimensional {
    private static int stringOccurance(String [][] n, String a){
        int count = 0;
        for(int i= 0; i< n.length; i++){
            for(int j = i; j < n[i].length; j++){
                if (n[i][j].equals(a) && i == j){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String [][] n;
        n = new String[][]{{"aba", "", "", ""}, {"", "", "", ""}, {"", "", "aba", ""}, {"", "", "", "aba"}, {"", "", "", ""}};
        System.out.println(stringOccurance(n, "aba"));
    }
}

