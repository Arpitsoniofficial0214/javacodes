//Numbers less than 30
package streamapi;

import java.util.Arrays;
import java.util.List;

public class FilterTwelve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer>list = Arrays.asList(10,25,30,40);
list.stream()
.filter(n -> n < 30)
.forEach(System.out::println);

	}

}
