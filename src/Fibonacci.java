
public class Fibonacci {
public static void main(String[] args) {
	int fib=0;
	int bif=1;
	for(int i = 0;i<13;i++) {
		int temp=fib+bif;
		fib=bif;
		bif=temp;
		System.out.println( temp);
		
	}
}
}
