class VowelsConsonants {
public static void main(String[] args) {
char a[] = {'a', 'b', 'e', 'i', 'o', 'c'};
int vowels = 0, consonants = 0;
for (char ch : a) {
if (ch == 'a' || ch == 'e' || ch == 'i' ||
ch == 'o' || ch == 'u')
vowels++;
else

consonants++;
}
System.out.println("Vowels: " + vowels);
System.out.println("Consonants: " + consonants);
}
}