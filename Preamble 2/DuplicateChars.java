class DuplicateChars {
public static void main(String[] args) {
char a[] = {'a', 'b', 'c', 'a', 'b', 'a'};
int freq[] = new int[a.length];
for (int i = 0; i < a.length; i++) {
freq[i] = 1;
for (int j = i + 1; j < a.length; j++) {
if (a[i] == a[j]) {
freq[i]++;
a[j] = '0';
}
}
}
for (int i = 0; i < freq.length; i++) {
if (a[i] != '0' && freq[i] > 1) {
System.out.println(a[i] + " -> " + freq[i]);
}
}


}
}