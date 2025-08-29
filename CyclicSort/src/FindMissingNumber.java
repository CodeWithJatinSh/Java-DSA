public class FindMissingNumber {
    public static void main(String[] args) {
       int[] num = {4,0,2,1};
        int MissingNumber = MissingNumbers(num);
        System.out.println(MissingNumber);
    }
    static int MissingNumbers(int[] arr){
        int i = 0;
        int n = arr.length;
        // we iterate the loop till size of the array - 1.
        while (i < n){
            int correct_index = arr[i];
            if( arr[i] < arr.length && arr[i] != arr[correct_index]){
                Swap(arr,i,correct_index);
            }else{
                i++;
            }
        }

        for(int j=0; j < arr.length; j++){
            if(arr[j] != j){
                return j;
            }
        }
        return arr.length;
    }
    private static void Swap(int[] arr, int First, int Second) {
        int temp = arr[First];
        arr[First] = arr[Second];
        arr[Second] = temp;
    }
}
