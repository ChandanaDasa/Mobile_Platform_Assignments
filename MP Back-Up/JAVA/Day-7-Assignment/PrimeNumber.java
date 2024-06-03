import java.util.Scanner;

public class PrimeNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an integer:");
        int number=sc.nextInt();
        sc.close();
        boolean isPrime=true;
        if(number<2){
            isPrime=false;
        }
        else{
            for( int i=2; i<=number/2;i++){
                if(number%i==0){
                    isPrime=false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println(number+ " is prime number.");
                }
            else{
                System.out.println(number + " is not a prime number.");
            }        }
                }
            