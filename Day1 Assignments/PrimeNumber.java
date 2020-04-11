/*Write a Java program to check if a given number is prime or not. Remember, a prime number is a number which is
not divisible by any other number, e.g. 3, 5, 7, 11, 13, 17, etc. Be prepared for cross, e.g. checking till the square
root of a number, etc.*/

public class PrimeNumber {

    private static boolean isPrime(int n){
        for(int i = 2; i < n; i++ ){
            if( n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        for(int i = 2; i <= 10; i++){
            System.out.println(i + ":" + isPrime(i));
        }
    }
}
