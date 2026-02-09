class UpperToLower {
public static void main(String[] args) {
char a[] = {'A', 'B', 'C', 'd'};
for (int i = 0; i < a.length; i++) {
if (a[i] >= 'A' && a[i] <= 'Z') {
a[i] = (char)(a[i] + 32);
}
}
for (char c : a)
System.out.print(c + " ");
}
}