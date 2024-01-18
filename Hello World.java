//Write  a program to print n times hello world
public class HelloWorld {
	public static void printer(int n) {
		if (n==0) {
			return;
		}
		System.out.println("Hello World");
		printer(n-1);
	}
	public static void main(String args[]) {
		printer(5);
	}

}
