
//Remove empty string

package streamapi;

import java.util.Arrays;
import java.util.List;

public class FilterEight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> list=Arrays.asList("Java","", "String", "","AI");
list.stream()
.filter(s -> !s.isEmpty())
.forEach(System.out::println);
	}

}
