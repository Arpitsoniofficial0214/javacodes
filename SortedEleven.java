//Sort the names based on their length using Stream sorted().

package StreamApiSort1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedEleven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("Java", "SpringBoot", "API", "Microservices", "SQL");
		List<String> sorted = names.stream()
		.sorted(Comparator.comparing(String::length))
		.collect(Collectors.toList());
		System.out.println(sorted);

	}

}
