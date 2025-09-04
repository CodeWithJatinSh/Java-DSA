import java.util.Scanner;

public class NTo1{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n = in.nextInt();
        int ans = Nto1(n);
        System.out.println(ans);
    }

    public static int Nto1(int n){
        if (n<=1) return 1;

        return n + Nto1(n-1);
    }
}