
//Remove all null values
package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class FilterFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("Java","null","Spring","null","React");
		list.stream()
		.filter(Objects::nonNull)
		.forEach(System.out::println);
	}

}
