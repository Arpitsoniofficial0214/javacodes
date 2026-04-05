package StreamApiSort1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortedFourth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(14,9,20,7,6,11,32,3);
		List<Integer> evenSorted = list.stream()
				.filter(n -> n % 2 == 0)
				.sorted()
				.collect(Collectors.toList());
		System.out.println(evenSorted);
	}

}
