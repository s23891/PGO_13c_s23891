package CW1.zad2;

import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {
        System.out.println( "Wpisz 3 liczby po spacji" );
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int temp = 0;

        if ( a > b)
        {
            temp = a;
            a = b;
            b = temp;
        }

        if (c < a)
        {
            temp = c;
            c = b;
            b = a;
            a = temp;
        }
        else if (c < b)
        {
            temp = b;
            b = c;
            c = temp;
        }

        System.out.println( a + " " + b + " " + c);
    }
}
