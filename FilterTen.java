
// Strings ending with "a"
package streamapi;

import java.util.Arrays;
import java.util.List;

public class FilterTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> list = Arrays.asList("Java","Python","Scale","Kotlin");
list.stream()
.filter( s -> s.endsWith("a"))
.forEach(System.out::println);
	}

}
