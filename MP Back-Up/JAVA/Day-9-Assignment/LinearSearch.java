public class LinearSearch {
    public static int performLinearSearch(int[] arr, int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int[] arr={2,5,8,12,16,23,38,56,72,91};
        int target = 16;
        int index=performLinearSearch(arr, target);
        if(index != -1){
            System.out.println("Element" + target + "found at index: " + index);
        }
        else{
            System.out.println("Element" + target + "not found in the array.");
        }
        }

    }
            
