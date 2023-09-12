package PrimeNumberChecker;

public class primenucheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.out.println("Prime numbers up to 30:");
	        for (int i = 2; i <= 30; i++) {
	            if (isPrime(i)) {
	                System.out.print(i + " ");
	            }
	        }
	    }

	    private static boolean isPrime(int number) {
	        if (number <= 1) {
	            return false;	
	}
	        for (int i = 2; i <= Math.sqrt(number); i++) {
	            if (number % i == 0) {
	                return false;
	            }
	        }

	        return true;
	    }
	}	    

