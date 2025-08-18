public class PeakIndex {
 public static void main(String[] args){
    int[] arr = {0,1,3, 2, 1, 0};
    PeakIndex obj = new PeakIndex();
    int index = obj.findPeakIndex(arr);
    System.out.println("Peak Element: "+arr[index] + " at index: " + index);
 }

 public int findPeakIndex(int[] arr){
    int start = 0;
    int end = arr.length-1;
    while(start<end){
        int mid =start+(end-start)/2;

        if(arr[mid] > arr[mid+1]){
            end = mid;
        }else{
            start = mid+1;
        }
    }
    return start; // or end, both are the same at this point
 }
}