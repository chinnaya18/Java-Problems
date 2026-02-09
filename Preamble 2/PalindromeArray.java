class PalindromeArray {
public static void main(String[] args) {
char a[] = {'m', 'a', 'd', 'a', 'm'};
boolean flag = true;
int i = 0, j = a.length - 1;
while (i < j) {


if (a[i] != a[j]) {
flag = false;
break;
}
i++;
j--;
}
if (flag)
System.out.println("Palindrome");
else
System.out.println("Not Palindrome");
}
}