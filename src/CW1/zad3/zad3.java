package CW1.zad3;

import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {
        System.out.println( "Wpisz 3 liczby po spacji" );
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int[] numbers = {a, b, c};

        int temp = 0;

        if (numbers[0] > b)
        {
            temp = numbers[0];
            numbers[0] = numbers[1];
            numbers[1] = temp;
        }

        if (c < a)
        {
            temp = numbers[2];
            numbers[2] = numbers[1];
            numbers[1] = numbers[0];
            numbers[0] = temp;
        }
        else if (numbers[2] < numbers[1])
        {
            temp = numbers[1];
            numbers[1] = numbers[2];
            numbers[2] = temp;
        }

        System.out.println( numbers[0] + " " + numbers[1] + " " + numbers[2]);
    }
}
