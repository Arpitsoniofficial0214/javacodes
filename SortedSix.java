
//remove duplicate and sort the list

package StreamApiSort1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedSix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(10,5,10,7,5,3,8,3);
		List<Integer> result = list.stream()
				.distinct()
				.sorted()
		        .collect(Collectors.toList());
				System.out.println(result);
	}

}
