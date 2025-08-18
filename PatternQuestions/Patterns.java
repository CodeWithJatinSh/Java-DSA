public class Patterns {
    public static void main(String[] args) {
        int n = 5; // You can change this value to generate different patterns
        Pattern1(n);
        Pattern2(n);
        Pattern3(n);
        Pattern4(n);
        Pattern5(n);
        Pattern6(n);
        Pattern7(n);
        System.out.println("Inverted Pyramid:");
        Pattern8(n);
        Pattern4(n);
        Pattern5(n);
    }
    // Pattern 1: Square Pattern with '$'
    /*
        $ $ $ $ $ 
        $ $ $ $ $ 
        $ $ $ $ $ 
        $ $ $ $ $ 
        $ $ $ $ $ 
    */
    public static void Pattern1(int n) {
        for(int row=1; row<=n;row++){
            for(int col=1; col<=n;col++){
                System.out.print("$ ");
            }
            System.out.println();
        }
        }
    // Pattern 2: Right-Angled Triangle Pattern with '$'
    /*
        $ 
        $ $ 
        $ $ $
        $ $ $ $
        $ $ $ $ $
    */
    public static void Pattern2(int n) {
        for(int row=1; row<=n;row++){
            for(int col=1; col<=row;col++){
                System.out.print("$ ");
            }
            System.out.println();
        }
        }
    
    // Pattern 3: Right-Angled Triangle Pattern with numbers
    /*
        1
        1 2 
        1 2 3
        1 2 3 4
        1 2 3 4 5
    */
    public static void Pattern3(int n) {
        for(int row=1; row<=n;row++){
            for(int col=1; col<=row;col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
        }
    
    // Pattern 4: Right-Angled Triangle Pattern with row numbers
    /*
        1
        2 2 
        3 3 3
        4 4 4 4
        5 5 5 5 5
    */
    public static void Pattern4(int n) {
        for(int row=1; row<=n;row++){
            for(int col=1; col<=row;col++){
                System.out.print(row + " ");
            }
            System.out.println();
        }
        }
    // Pattern 5: Inverted Right-Angled Triangle Pattern with '$'
    /*
        $ $ $ $ $
        $ $ $ $
        $ $ $
        $ $
        $ 
    */
    public static void Pattern5(int n) {
        for(int row=0; row<=n;row++){
            for(int col=1; col<=n-row;col++){
                System.out.print("$ ");
            }
            System.out.println();
        }
        }
    // Pattern 6: Inverted Right-Angled Triangle Pattern with numbers
    /*
        5 4 3 2 1
        4 3 2 1
        3 2 1
        2 1
        1
    */
    public static void Pattern6(int n) {
        for(int row=0; row<=n;row++){
            for(int col=1; col<=n-row;col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
        }
    // Pattern 7: Pyramid with '$'
    /*
        $
       $$$
      $$$$$
     $$$$$$$
    $$$$$$$$$
    */
    public static void Pattern7(int n) {
        for(int row=0; row<=n;row++){
            for(int space=0; space<=n-row-1; space++){
                System.out.print(" ");
            }
            for(int col=1; col<=2*row-1;col++){
                System.out.print("$");
            }
            for(int space=0; space<=n-row-1; space++){
                System.out.print(" ");
            }
            System.out.println();
        }
        }
    
    public static void Pattern8(int n) {
        for(int row=0; row<=n;row++){
            for(int space=0; space<=row; space++){
                System.out.print(" ");
            }
            for(int col=1; col<=2*n-(2*row+1);col++){
                System.out.print("$");
            }
            for(int space=0; space<=row; space++){
                System.out.print(" ");
            }
            System.out.println();
        }
        }

}