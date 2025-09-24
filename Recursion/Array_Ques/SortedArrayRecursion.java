package Recursion.Array_Ques;

public class SortedArrayRecursion{
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};

        boolean ans=IsSorted(arr,0);
        System.out.println(ans);

    }

    static boolean IsSorted(int [] arr, int index){
        if (index==arr.length-1){
            return true;
        }
            return arr[index]<arr[index+1] && IsSorted(arr, index+1);
    }
}
