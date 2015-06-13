
        
		import java.util.ArrayList;
		import java.math.BigInteger;
		
		  
		  public class codeb {
			  private static ArrayList primes = new ArrayList();
				public static void main(String[] args) {
		      BigInteger start = new BigInteger("6008514751433454354546546546565");
		      recurse(start);
		      for(int i = 0; i < primes.size(); i++)
		          System.out.print(primes.get(i).toString() + ", ");
		  }
		  public static void recurse(BigInteger num) {
		      BigInteger i = new BigInteger("2");
		      //we use these as "constants" later
		      final BigInteger zero = new BigInteger("0");
		      final BigInteger one = new BigInteger("1");
		      //base case, num = 2; reuse i on our way
		      if(num.equals(i)) {
		          primes.add(i);
		          return;
		      }
		      for(; !num.mod(i).equals(zero); i = i.add(one)) {
		          if(num.subtract(i).subtract(i).signum() == -1) { //this number is prime
		              primes.add(num);
		              return;
		          }
		      }
		      //we found two divisors, recurse them
		      recurse(i);
		      recurse(num.divide(i));
		  }
		  }
		  

	


