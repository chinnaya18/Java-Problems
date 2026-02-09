class CompareArrays {
public static void main(String[] args) {
char a[] = {'j', 'a', 'v', 'a'};
char b[] = {'j', 'a', 'v', 'a'};
boolean equal = true;
if (a.length != b.length) {
equal = false;
} else {
for (int i = 0; i < a.length; i++) {
if (a[i] != b[i]) {
equal = false;
break;

}
}
}
if (equal)
System.out.println("Arrays are equal");
else
System.out.println("Arrays are not equal");
}
}