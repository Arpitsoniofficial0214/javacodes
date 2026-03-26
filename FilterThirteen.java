//Unique numbers greater than 15
package streamapi;

import java.util.Arrays;
import java.util.List;

public class FilterThirteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> list = Arrays.asList(10,20,30,40,50);
list.stream()
.distinct()
.filter(n -> n> 15)
.forEach(System.out::println);
	}
}
