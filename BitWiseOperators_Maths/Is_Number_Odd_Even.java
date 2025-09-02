import java.util.*;
public class Is_Number_Odd_Even {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter a number: ");
            int num = sc.nextInt();
        
        if((num & 1)==1){
            System.out.println(num + " is an odd number.");
        }
        else{
            System.out.println(num + " is an even number.");
        }
    }
}