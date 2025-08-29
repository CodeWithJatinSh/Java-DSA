import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
      int[] num = {5,4,1,2,3};
      Sort(num);
        System.out.println(Arrays.toString(num));
    }

    static void Sort(int[] arr){
        int pointer = 0;
        int n = arr.length;
        while (pointer < n){
            int correct_index = arr[pointer] - 1;
            if(arr[pointer] != arr[correct_index]){
                Swap(arr,pointer, correct_index);
            }else {
                pointer++; // Ignoring
            }
        }
    }

    private static void Swap(int[] arr, int First, int Second) {
        int temp = arr[First];
        arr[First] = arr[Second];
        arr[Second] = temp;
    }
}