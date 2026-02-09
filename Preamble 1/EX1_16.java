class EX1_16 {
public static void main(String[] args) {
int n = 8;
System.out.println("Left shift: " + (n << 1));
System.out.println("Right shift: " + (n >> 1));
int x = -10;
if ((x >> 31) == 0)
System.out.println("Positive number");
else
System.out.println("Negative number");
}
}