
//Decesding order sort
package StreamApiSort1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortedTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(45,11,78,2,90,34);
		List<Integer> sortedList = list.stream()
				.sorted(Collections.reverseOrder())
				.collect(Collectors.toList());
		System.out.println(sortedList);

	}

}
