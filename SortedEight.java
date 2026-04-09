//Sort the number greater than 20

package StreamApiSort1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedEight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(8,26,13,41,19,32,5);
 List<Integer> result = list.stream()
		 .filter(n -> n > 20)
		 .sorted()
		 .collect(Collectors.toList());
		 System.out.println(result);;
	}

}
