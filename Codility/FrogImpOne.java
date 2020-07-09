package com.it4mgr.iTutor.controller;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class FrogImpOne {

	public static void main(String[] args) {

		System.out.println("solution: " + solution(5, new int[] { 1, 3, 1, 4, 2, 3, 5, 4 }));
		System.out.println("solution: " + solution(4, new int[] { 5 }));
		System.out.println("solution: " + solution(5, new int[] { 4 }));
		System.out.println("solution: " + solution(2, new int[] { 1, 1, 1, 1 }));
	}

	public static int solution(int X, int[] A) {

		Set<Integer> set = new HashSet<Integer>();

		for (int k = 0; k < A.length; k++) { // iterating over time

			if (set.contains(A[k])) {
				
				continue;
				
			} else {
				
				set.add(A[k]);
				
				if (X == set.size()) {
					return k;
				}
			}
		}

		return -1;
	}

	public static int solutionOk(int X, int[] A) {

		Set<Integer> set = new TreeSet<Integer>();

		for (int k = 0; k < A.length; k++) { // iterating over time

			set.add(A[k]);

			if (X == set.size()) {
				return k;
			}
		}

		return -1;
	}

	public static int solutionOld(int X, int[] A) {

		boolean isStuck;
		int furthestTime = -1;
		int counter = 0;

		do {

			counter++;
			isStuck = true;
//			System.out.println("counter: " + counter);

			for (int k = 0; k < A.length; k++) {

//				System.out.println("\tk: " + k + "; A[" + k + "]: " + A[k]);

				if (counter == A[k]) {

					isStuck = false;

					if (A[k] > furthestTime) {
						furthestTime = k;
					}

//					System.out.println("\tfurthestLeaf: " + furthestLeaf);

					break;
				}
			}

			if (isStuck) {
				return -1;
			}

		} while (counter < X);

		return furthestTime;
	}
}
