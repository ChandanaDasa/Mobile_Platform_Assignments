public class SumArray {
    public static int sumArray(int[] arr, int index){
        if(index == arr.length){
            return 0;
        }
        return arr[index]+ sumArray(arr, index+1);
    }
    public static void main(String args[]){
        int[] arr={1,2,3,4,5};
        int sum=sumArray(arr,0);
        System.out.println(" Sum of the array:"+sum);
    }
        }

    
