//Sort the list and print the last 2 highest numbers using Stream.

package StreamApiSort1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortedSixteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(5, 28, 16, 42, 11, 63, 9);
		list.stream()
		.sorted(Collections.reverseOrder())
		.limit(2)
		.forEach(System.out::println);

	}

}
