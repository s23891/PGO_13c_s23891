package CW1.zad5;

public class zad5 {
    public static void main(String[] args) {

        int a = 1;

        while (a <= 10)
        {
            int b = 1;
            while (b <= 9)
            {
                System.out.print(a * b + " ");
                b++;
            }

            System.out.println(a * b);
            a++;
        }
    }
}
