import java.util.*;  // Import Scanner class for input

public class FindBitOfNumber {
    public static void main(String[] args) {
        // Define the number in binary using 0b prefix
        // This is 10010011 (binary) = 147 (decimal)
        int num = 0b10010011;  

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Ask user for the bit position they want to check
        // We will use 1-based indexing (rightmost bit = position 1)
        System.out.print("Enter the position of bit you want to check: ");
        int pos = input.nextInt();

        // Step 1: Create a mask by shifting 1 to (pos - 1) places
        int mask = 1 << (pos - 1);

        // Step 2: Perform bitwise AND between num and mask
        int bit = (num & mask) != 0 ? 1 : 0;

        // ✅ Correct print statement
        System.out.println("Bit at position " + pos + " is: " + bit);

        // Close scanner
        input.close();
    }
}

