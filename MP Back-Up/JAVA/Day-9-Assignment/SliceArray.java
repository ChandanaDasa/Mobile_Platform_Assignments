import java.util.Arrays;

public class SliceArray {
    public static int[] slicedArray(int[] arr, int start, int end){
        if(start<0|| end>=arr.length|| start>end){
            throw new IllegalArgumentException("Invalid start and end indices.");
        }
        int length=end-start+1;
        int[] slicedArray=new int[length];
    for(int i=0; i<length; i++){
        slicedArray[i]=arr[start+i];
    }
    return slicedArray;
}
public static void main(String args[]){
int[] arr={1,2,3,4,5};
int start=1;
int end=3;
int[] slicedArray= slicedArray(arr, start, end);
System.out.println("Original array: " + Arrays.toString(arr));
System.out.println("Sliced array: " + Arrays.toString(slicedArray));
}
    }        
