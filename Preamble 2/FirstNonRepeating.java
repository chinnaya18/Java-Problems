class FirstNonRepeating {
public static void main(String[] args) {
char a[] = {'a', 'b', 'a', 'c', 'b', 'd'};
for (int i = 0; i < a.length; i++) {
boolean repeat = false;
for (int j = 0; j < a.length; j++) {
if (i != j && a[i] == a[j]) {
repeat = true;
break;
}
}
if (!repeat) {
System.out.println("Character: " + a[i]);
System.out.println("Index: " + i);
break;
}


}
} }