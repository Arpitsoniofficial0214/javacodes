//Sort only the numbers between 10 and 50 using Stream sorted

package StreamApiSort1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedSeventeen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(3, 18, 55, 42, 27, 9, 61, 14);
		List<Integer> result = list.stream()
				               .filter(n -> n > 10 &&  n < 50)
				               .sorted()
				               .collect(Collectors.toList());
		System.out.println(result);

	}

}
