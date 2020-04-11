/*Write a code to find the factorial of a given number? Given n is the input integer?
Write a program to print the fibonacci series to the given number? For Eg: If given value n=15, output should
be : 1,2,3,5,8,13*/
public class FactorialAndFibonacci {

    private static int factorial(int n){
        if(n == 1){
            return 1;
        }
        else{
            return n*(factorial(n-1));
        }
    }

    private static int fibonacci(int n){
        if(n == 1){
            return (0);
        }
        else if (n == 2){
            return (1);
        }
        else{
//            System.out.println((n-2)+ ""+ (n-1));
            return (fibonacci(n-1) +fibonacci(n-2));
        }
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
        int fib = 13;
        int i = 1;
        int val = 0;
        while(val < fib){
            val = fibonacci(i);
            System.out.println(val);
            i++;
        }
//        System.out.println(fibonacci(13));
    }
}
