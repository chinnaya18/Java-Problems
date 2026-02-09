class EX1_15 {
public static void main(String[] args) {
int a = 12, b = 5;
System.out.println("AND: " + (a & b));
System.out.println("OR: " + (a | b));
System.out.println("XOR: " + (a ^ b));

int num = 0x12345678;
System.out.println("Mask first byte: " + (num & 0xFFFFFF00));
System.out.println("Mask 16 bits: " + (num & 0xFFFF0000));
}
}