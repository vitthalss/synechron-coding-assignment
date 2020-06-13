package com.synechron;

/**
 * @author vitthal.shirke
 * @description 3. In a OS which uses paging for memory management , 
 * 					write a page replacement algorithm to
					replace new page. Whenever new page comes in and not present in memory , the page fault
					occurs and OS replace one of existing page with new one.
 */
import java.util.ArrayList;

public class PageReplacementAlgorithms {

	public static void main(String[] args) {
		int capacity = 4;
		int arr[] = { 7, 0, 1, 2, 0, 3, 0, 4, 2, 3, 0, 3, 2 };

		// To represent set of current pages used  an ArrayList
		ArrayList<Integer> s = new ArrayList<>(capacity);
		int count = 0;
		int page_faults = 0;
		for (int i : arr) {
			// Insert it into set if not present
			// already which represents page fault
			if (!s.contains(i)) {

				// Check if the set can hold equal pages
				if (s.size() == capacity) {
					s.remove(0);
					s.add(capacity - 1, i);
				} else {
					s.add(count, i);
					// Increment page faults
					page_faults++;
					++count;
				}
				System.out.println("Page count:" + count);
			} else {
				// Remove the indexes page
				s.remove((Object) i);
				// insert the current page
				s.add(s.size(), i);
			}
		}
		System.out.println("Expected page fault:" + page_faults);
	}
}
