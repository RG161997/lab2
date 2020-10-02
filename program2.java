import java.util.*;
import java.util.Random;
public class Main
{
String encryption(String str, Integer value) {
String encryptedString = "";
for(int i=0;i<str.length();i++) {
char c = (char) (str.charAt(i) + value%26);
encryptedString = encryptedString + c;
}
return encryptedString;
}
String decryption(String str, Integer value) {
String decryptedString = "";
for(int i=0;i<str.length();i++) {
char c = (char) (str.charAt(i) - value%26);
decryptedString = decryptedString + c;
}
return decryptedString;
}
int sumArray(Integer arr[]) {
int sum = 0;
for(int i=0;i<5;i++) {
sum = sum + arr[i];
}
return sum;
}
boolean checkNumber(Integer arr[], int n) {
boolean test = Arrays.asList(arr).contains(n);
return test;
}
   public static void main(String[] args) {
   Main lab2= new Main();
   Scanner sc= new Scanner(System.in);

   System.out.print("Enter the value by which you want to encrypt or decrypt the string: ");
Integer value = sc.nextInt();
sc.nextLine();

   System.out.print("Enter a string to encrypt: ");
String str1= sc.nextLine();
System.out.println("Encrypted String: " + lab2.encryption(str1,value));

System.out.print("Enter a string to decrypt: ");
String str2= sc.nextLine();
System.out.println("Decryted String: " + lab2.decryption(str2,value));

Random rd = new Random();
Integer arr[] = new Integer[5];
for(int i=0;i<5;i++) {
arr[i] = rd.nextInt(100);
System.out.println(arr[i]);
}
System.out.print("Elements of array are: ");
for(int i=0;i<5;i++) {
arr[i] = rd.nextInt(100);
System.out.print(arr[i]+" ");
}
System.out.println();
System.out.println("Sum of array elements: "+lab2.sumArray(arr));

System.out.println("Enter the element you want to find: ");
Integer n = sc.nextInt();
sc.nextLine();
if(lab2.checkNumber(arr,n)) {
System.out.println("element found");
} else {
System.out.println("element not found");
}
   }
}
