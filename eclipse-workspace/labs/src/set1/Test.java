package set1;
import java.util.Scanner;
class Test
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a String ");
String s=sc.next();
int arr[]=new int[26];
for(int i=0;i<s.length();i++)
{
	arr[(int)s.charAt(i)-97]++;
}
int max=0;
char c='x';
for(int i=0;i<26;i++)
{
if(arr[i]>max)
{
max=arr[i];
c=(char)(i+97);
}
}
System.out.println(c);
}
}