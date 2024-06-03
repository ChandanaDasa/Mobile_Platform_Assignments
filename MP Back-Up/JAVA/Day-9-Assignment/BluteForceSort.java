import java.util.Arrays;

public class BluteForceSort {
    public static void bruteForceSort(int[] arr){
           for(int i=0; i<arr.length-i; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    int temp= arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }           
    }
}
public static int[] initializeArray(int size, int minValue, int maxValue){
    int[] arr = new int[size];
    for(int i=0; i<size; i++){
        arr[i]=(int)(Math.random()*(maxValue-minValue+1))+minValue;
    }
    return arr;
}
public static void main(String args[]){
    int[] arr=initializeArray(10,1,100);
    System.out.println("Original array:"+Arrays.toString(arr));
    bruteForceSort(arr);
    System.out.println("Sorted array:"+Arrays.toString(arr));
}
    }


