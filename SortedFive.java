package StreamApiSort1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(27,4,19,11,35,2);
		List<Integer> newlist = list.stream()
				.sorted()
		        .collect(Collectors.toList());
				System.out.println(newlist);
		
	}

}
