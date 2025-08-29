import java.util.ArrayList;
import java.util.List;
// PROBLEM -> https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
public class DisappearingNumber {
    public static void main(String[] args) {
        DisappearingNumber obj = new DisappearingNumber();
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(obj.findDisappearedNumbers(arr));
    }
    public List<Integer> findDisappearedNumbers(int[] arr) {
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
        List<Integer> ans = new ArrayList<>();
        for(int index=0;index< arr.length;index++){
            if(arr[index] != index+1){
                ans.add(index+1);
            }
        }
        return ans;
    }
    void Swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

