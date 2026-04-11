
//Sorted namein reverse Alfabetical order

package StreamApiSort1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortedTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("Suresh" , "Amit" , "Gaurav" , "Nikhil" , "Shubham" , "Vikas" , "Priya");
		List<String> sorted = names.stream()
				.sorted(Collections.reverseOrder())
				.collect(Collectors.toList());
		System.out.println(sorted);

	}

}
