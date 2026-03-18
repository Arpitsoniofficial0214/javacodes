//Print all number greater than 50

package streamapi;

import java.util.Arrays;
import java.util.List;

public class FilterThird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(45,90,23,60,75);
		list.stream()
		.filter(num-> num > 50)
		.forEach(System.out::println);
	}
	}


