
//Sort the List and Print top 3 hightest number

package StreamApiSort1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortedThird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(18,42,7,91,33,25,60);
		 list.stream()
				.sorted(Collections.reverseOrder())
				.limit(3)
				.forEach(System.out::println);
	}

}
