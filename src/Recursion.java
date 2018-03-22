import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Recursion {

	/**
	 * Remove duplicate consecutive items from a list, changing the list parameter.
	 * For example, if list = { a, b, b, b, c, b, c, c} then after calling unique the list
	 * will contain {a, b, c, b, c}. Only consecutive duplicates are removed.
	 * Objects are compared using their own equals method.
	 * @param list of any kind of object. The elements are not null.
	 * @return reference to the list parameter with consecutive duplicates removed.
	 */
	public static List<?> unique(List<?> list) {
		List<?> sub = list.subList(0, list.size());
		
		if (sub.size() <= 1) return sub;
		if (sub.get(0).equals(sub.get(1))) {
			sub.remove(1);
			return unique(sub);
		}
		return unique(sub.subList(1, sub.size()));
	}
	
	public static long oldFibonacci(int n) {
		// the base case
		if (n < 2) return 1;
		// the recursive step
		return oldFibonacci(n-1) + oldFibonacci(n-2);
	}
	
	/**
	 * Compute the value of fibonacci at the nth term.
	 * @param n is the number of fibonacci term that want to find value.
	 * @return value of fibonacci number at nth term
	 */
	public static long fibonacci(int n) {
		if(n == 0) return 1;
		return fiboHelper(1, n, 1, 1);
	}
	
	/**
	 * Help method that perform recursion to compute the value of fibonacci.
	 * @param start is a term that start to compute. 
	 * @param input is the nth term that want to compute the value.
	 * @param first is the previous value that use to compute.
	 * @param curr is the current value that use to compute.
	 * @return value of fibonacci number at the nth term after 
	 * 			number of the start term equal to the input term.
	 */
	public static long fiboHelper(int start, int input, long first, long curr) {
		if(start == input) return curr;
		return fiboHelper(start+1, input, curr, curr + first);
	}
	
	public static void main(String[] args) {
		//Unique problem
		List<String> s = new ArrayList<String>();
		
		s.add("a");
		s.add("b");
		s.add("b");
		s.add("b");
		s.add("c");
		s.add("b");
		s.add("c");
		s.add("c");
		System.out.println(Arrays.toString(s.toArray()));
		unique(s);
		System.out.println(Arrays.toString(s.toArray()));
		
		// Fibonacci problem
		System.out.println(fibonacci(48));
		System.out.println(oldFibonacci(48));
	}

}
