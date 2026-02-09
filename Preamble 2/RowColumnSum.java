import java.util.Scanner;
class RowColumnSum {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int r = sc.nextInt();
int c = sc.nextInt();
int a[][] = new int[r + 1][c + 1];
for (int i = 0; i < r; i++) {
for (int j = 0; j < c; j++) {
a[i][j] = sc.nextInt();
a[i][c] += a[i][j];
a[r][j] += a[i][j];
}
}
for (int i = 0; i <= r; i++) {
for (int j = 0; j <= c; j++) {
System.out.print(a[i][j] + " ");
}
System.out.println();
}
}
}