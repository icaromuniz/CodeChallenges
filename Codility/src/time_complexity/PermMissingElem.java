package time_complexity;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * <p>
 * Find the missing element in a given permutation.<br/>
 * </p>
 * <p>
 * An array A consisting of N different integers is given. The array contains
 * integers in the range [1..(N + 1)], which means that exactly one element is
 * missing.<br/>
 * </p>
 * <p>
 * Your goal is to find that missing element.<br/>
 * </p>
 * <p>
 * Write a function:<br/>
 * </p>
 * <p>
 * class Solution { public int solution(int[] A); }
 * </p>
 * <p>
 * that, given an array A, returns the value of the missing element.
 * </p>
 * <p>
 * For example, given array A such that:
 * </p>
 * <p>
 * A[0] = 2 A[1] = 3 A[2] = 1 A[3] = 5 the function should return 4, as it is
 * the missing element.
 * </p>
 * <p>
 * Write an efficient algorithm for the following assumptions:
 * </p>
 * <p>
 * N is an integer within the range [0..100,000]; the elements of A are all
 * distinct; each element of array A is an integer within the range [1..(N +
 * 1)].
 * </p>
 */
public class PermMissingElem {

	public static void main(String[] args) {
		System.out.println(solution(new int[] { 2, 3, 1, 5 }));
	}

	public static int solution(int[] A) {
		
		Set<Integer> set = Arrays.stream(A).boxed().collect(Collectors.toSet());

		for (int i = 1; i <= A.length; i++) {

			if (!set.contains(i)) {
				return i;
			}
		}

		return 0;
	}
}
