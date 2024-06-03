public class Fibonacci {
    public static int fibonacci(int n){
        if(n<=1){
            return n;
        }
        else
    {
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
public static int[] generateFibonacciArray(int n){
    int[] fibonacciArray=new int[n];
    for(int i=0; i<n; i++){
        fibonacciArray[i]=fibonacci(i);
    }
    return fibonacciArray;
}
public static void main(String args[]){
    int n=10;
    int[] fibonacciArray=generateFibonacciArray(n);
    System.out.println("First" + n + " Fibonacci numbers:");
    for(int i=0; i<n; i++){
        System.out.print(fibonacciArray[i] + " ");
    }
    System.out.println();
    int nthFibonacci=fibonacci(n-1);
System.out.println(" The " + n + "th Fibonacci number is: " + nthFibonacci);
    }
}
    
