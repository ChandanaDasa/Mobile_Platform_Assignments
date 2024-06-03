public class DivideByZero {
    public static void main(String args[]){
        try{
            int result=divideByZero();
            System.out.println("Result:" + result);
        }catch(ArithmeticException e){
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
    public static int divideByZero(){
        int numerator=10;
        int denomenator=0;
        return numerator/denomenator;
    }
        }       
