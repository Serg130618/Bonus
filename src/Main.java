public class Main {
    public static void main(String[] args) {
        int a = 100; // account = a
        int r = 1100; // refill = r
        int c = 1000; // condition = c
        int b = 0; // bonus = b
        if (r > c)
            b = r / 100;

        System.out.println(a + r + b);
        System.out.println(b);


    }
}