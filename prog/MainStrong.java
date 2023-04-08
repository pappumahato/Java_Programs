import java.lang.String;
import java.util.Scanner;
class MainStrong
{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Strong st = new Strong();
		System.out.println("Enter the number :");
		int n=scn.nextInt();
		boolean rs = st.isStrong(n);
		if(rs==true)
			System.out.println(n+" is strong number");
		else
			System.out.println(n+" is not strong number");
	}
}