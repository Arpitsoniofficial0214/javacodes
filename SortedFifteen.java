//Sort and print the smallest number

package StreamApiSort1;

import java.util.Arrays;
import java.util.List;

public class SortedFifteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(39, 7, 22, 15,3 ,41);
		Integer smallest = list.stream()
				             .sorted()
				             .findFirst()
				             .get();
		System.out.println(smallest);
	}

}
