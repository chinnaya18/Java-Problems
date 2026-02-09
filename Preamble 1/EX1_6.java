class EX1_6 {
public static void main(String[] args) {
float f = Float.MAX_VALUE;
System.out.println("Float max value: " + f);
System.out.println("Overflow value: " + (f * 2));
float u = Float.MIN_VALUE;
System.out.println("Underflow value: " + (u / 2));
}
}