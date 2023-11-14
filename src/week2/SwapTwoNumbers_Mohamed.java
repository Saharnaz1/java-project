package week2;

public class SwapTwoNumbers_Mohamed {

    public static void main(String[] args) {
        int a = 400;
        int b = 6000;


        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a + ", b = " + b);
    }
}
