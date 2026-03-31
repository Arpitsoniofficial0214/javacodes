//ascending order sort

package StreamApiSort1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sortedone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list =Arrays.asList(12,5,33,9,21,1);
		List<Integer> sortedList = list.stream()
		.sorted()
		.collect(Collectors.toList());
		System.out.println(sortedList);
		  }
		}


