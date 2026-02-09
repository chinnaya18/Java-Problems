class EX1_5 {
public static void main(String[] args) {
long max = Long.MAX_VALUE;
long min = Long.MIN_VALUE;
System.out.println("Long max value: " + max);
System.out.println("After overflow: " + (max + 1));
System.out.println("Long min value: " + min);
System.out.println("After underflow: " + (min - 1));
}
}