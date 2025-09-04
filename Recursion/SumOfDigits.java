public class SumOfDigits {
    public static void main(String[] args) {
        int digit = 8222;
        int sum = Sum(digit);
        int Prod = Product(digit);
        System.out.println("Sum of the digits are: " +sum);
        System.out.println("Product of the digits are: " +Prod);

    }

    public static int Sum(int n){
        if(n==0){
            return 0;
        }
        return (n%10) + Sum(n/10);
    }

    public static int Product(int n){
        if(n<=1){
            return 1;
        }
        return (n%10) * Product(n/10);
    }
}
