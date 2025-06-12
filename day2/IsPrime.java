package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 13; 
        boolean isPrime = true; 

        //  Check divisibility from 2 to number - 1
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false; 
                break;
            }
        }

        
        if (isPrime) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is NOT a Prime Number.");
        }
	}

}
