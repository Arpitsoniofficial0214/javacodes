package streamapi;

import java.util.Arrays;
import java.util.List;

public class FilterFourteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List <String> list = Arrays.asList("java","Python","Go","Ruby");
list.stream()
.filter(s -> s.contains("o"))
.forEach(System.out::println);
	}
}
