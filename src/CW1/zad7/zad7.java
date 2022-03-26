package CW1.zad7;

import java.util.Scanner;

public class zad7 {
    public static void main(String[] args) {
        System.out.println( "Wpisz liczbe n:" );
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int x = 0; x < n; x++) {
            for(int y = 0; y < n; y++) {
                if(x == 0 || x == n-1 || y == 0 || y == n-1 || x == y) {
                    System.out.print("x");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println("");
        }
    }
}
