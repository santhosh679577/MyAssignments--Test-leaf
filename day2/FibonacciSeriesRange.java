package week1.day2;

public class FibonacciSeriesRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int range = 13;
           int a = 0;
           int b = 1;
           System.out.print("Fibonacci Series up to 8:");
           System.out.print(a + " ");
           for (int c = a + b; c <= range; c = a + b) {
               System.out.print(c + " ");
               a=b;
               b=c;
           }
           
	}

}
