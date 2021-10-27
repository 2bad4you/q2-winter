package homework;

import org.junit.jupiter.api.Test;

public class HomeWorkOne {
    // Iztereju 28 litrus a uz 300 km, kas ir b. Aprekins a/b*100 = paterins

    public double division(double a, double b) {
        double c = a / b * 100;
        return c;
    }

    public int multiply(double a, double b) {
        double d = a * b;
        return (int) d;
    }

    @Test
    public void test() {

        double a = division(28, 300);
        int b = multiply(a, 50);

        System.out.println(a + " liters per 100 km");
        System.out.println(b + " distance to drive");
    }
}