import java.util.Arrays;
public class InfiniteArray{
    public static void main(String[] args){
      int[] arr = {12,34,23,45,54,56,65,67,76,78,87,89,98,100};
      int find= 78;
      InfiniteArray infiniteArray = new InfiniteArray();
      infiniteArray.Sort(arr);
     System.out.println(FindRange(arr,find));
   }

    public static int FindRange(int[] arr, int target){
        int start=0;
        int end=1;
        while(target>arr[end]){
           int NewStart = end+1;
           
           end=end+(end-start+1)*2;
           start=NewStart;
           }
        return Search(arr,target,start,end);
    }

    public void Sort(int[] arr) {
        Arrays.sort(arr);
    }

    // Binary Search Method
    public static int Search(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}