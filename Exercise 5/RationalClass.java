class Rational {

    private int numerator;
    private int denominator;

    Rational() {
        numerator = 0;
        denominator = 1;
    }

    Rational(int n, int d) {
        numerator = n;
        denominator = d;
        reduce();
    }

    private void reduce() {
        int gcd = gcd(Math.abs(numerator), Math.abs(denominator));
        numerator /= gcd;
        denominator /= gcd;

        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    public Rational add(Rational r) {
        int num = numerator * r.denominator + r.numerator * denominator;
        int den = denominator * r.denominator;
        return new Rational(num, den);
    }

    public Rational divide(Rational r) {
        int num = numerator * r.denominator;
        int den = denominator * r.numerator;
        return new Rational(num, den);
    }

    public String toString() {
        return numerator + "/" + denominator;
    }

    public String toString(int precisionDigits) {
        double value = (double) numerator / denominator;
        return String.format("%." + precisionDigits + "f", value);
    }
}

class Main {
    public static void main(String[] args) {

        Rational r1 = new Rational(2, 3);
        Rational r2 = new Rational(4, 5);

        Rational sum = r1.add(r2);
        Rational div = r1.divide(r2);

        System.out.println("First Rational: " + r1);
        System.out.println("Second Rational: " + r2);

        System.out.println("Sum: " + sum);
        System.out.println("Division: " + div);

        System.out.println("Division (floating, 3 precision): " + div.toString(3));
    }
}