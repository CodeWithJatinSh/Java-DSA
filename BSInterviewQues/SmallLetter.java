import java.util.Arrays;

public class SmallLetter {

    // Sorts the character array using Arrays.sort()
    public void Sort(char[] arr){
        Arrays.sort(arr);
    }

    // Finds the smallest character greater than the target
    public char SmallestLetter(char[] letters, char target){
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start+(end - start) / 2;

            if (letters[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        // Wrap around using modulo
        return letters[start % letters.length];
    }

    public static void main(String[] args){
        char[] letter = {'j','f','d','c'};
        char find = 'c';

        SmallLetter Alphabet = new SmallLetter();
        Alphabet.Sort(letter); // Make sure it's sorted before binary search
        System.out.println("The sorted letters are: " + Arrays.toString(letter));

        char character = Alphabet.SmallestLetter(letter, find);
        System.out.println("The smallest letter greater than '" + find + "' is: '" + character + "'");
    }
}
