package CW1.zad2;

public class zad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt(),
        b = scanner.nextInt(),
        c = scanner.nextInt();
        System.out.println( a + " " + b + " " + c);

        if(a > b && a > c)
        {
        int tmp = c;
        c = a;
        a = tmp;
        }
    }
}
