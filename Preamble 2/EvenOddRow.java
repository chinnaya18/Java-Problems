class EvenOddRow {
public static void main(String[] args) {
int a[][] = {
{1, 2, 3},
{4, 5, 6}
};
for (int[] row : a) {
int even = 0, odd = 0;
for (int val : row) {
if (val % 2 == 0)
even++;
else
odd++;
}
System.out.println("Even: " + even + " Odd: " + odd);
}
}
}