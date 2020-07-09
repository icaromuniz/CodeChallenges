package arrays;

import java.util.HashSet;

/**
 * Find value that occurs in odd number of elements.
 * 
 * <p>
 * A non-empty array A consisting of N integers is given. The array contains an
 * odd number of elements, and each element of the array can be paired with
 * another element that has the same value, except for one element that is left
 * unpaired.
 * </p>
 * <p>
 * For example, in array A such that:
 * </p>
 * <tt style="white-space:pre-wrap">  A[0] = 9  A[1] = 3  A[2] = 9
  A[3] = 3  A[4] = 9  A[5] = 7
  A[6] = 9</tt> <blockquote>
 * <ul style="margin: 10px;padding: 0px;">
 * <li>the elements at indexes 0 and 2 have value 9,</li>
 * <li>the elements at indexes 1 and 3 have value 3,</li>
 * <li>the elements at indexes 4 and 6 have value 9,</li>
 * <li>the element at index 5 has value 7 and is unpaired.</li>
 * </ul>
 * </blockquote>
 * <p>
 * Write a function:
 * </p>
 * <blockquote>
 * <p style="font-family: monospace; font-size: 9pt; display: block;
 * white-space: pre-wrap">
 * <tt>int solution(int A[], int N);</tt>
 * </p>
 * </blockquote>
 * <p>
 * that, given an array A consisting of N integers fulfilling the above
 * conditions, returns the value of the unpaired element.
 * </p>
 * <p>
 * For example, given array A such that:
 * </p>
 * <tt style="white-space:pre-wrap">  A[0] = 9  A[1] = 3  A[2] = 9
  A[3] = 3  A[4] = 9  A[5] = 7
  A[6] = 9</tt>
 * <p>
 * the function should return 7, as explained in the example above.
 * </p>
 * <p>
 * Write an <b><b>efficient</b></b> algorithm for the following assumptions:
 * </p>
 * <blockquote>
 * <ul style="margin: 10px;padding: 0px;">
 * <li>N is an odd integer within the range [1..1,000,000];</li>
 * <li>each element of array A is an integer within the range
 * [<span class="number">1</span>..<span class=
 * "number">1,000,000,000</span>];</li>
 * <li>all but one of the values in A occur an even number of times.</li>
 * </ul>
 * </blockquote>
 */
public class OddOccurrencesInArray {

	public static void main(String[] args) {
		System.out.println(solution(new int[] { 9, 3, 9, 3, 9, 7, 9 }));
	}

	public static int solution(int[] A) {
		
		HashSet<Integer> hashSet = new HashSet<Integer>();
		
		for (int element : A) {
			
			if (hashSet.contains(element)) {
				hashSet.remove(element);
			} else {
				hashSet.add(element);
			}
		}
		
		return hashSet.iterator().next();
	}
}
