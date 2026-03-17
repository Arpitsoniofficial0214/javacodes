package streamapi;

import java.util.Arrays;
import java.util.List;

public class FilterFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			List<Integer> list=Arrays.asList(10,15,20,25,30,11,117,16);
			list.stream()
			.filter(num-> num % 2 == 0)
			.forEach(System.out::println);
		}
	}


