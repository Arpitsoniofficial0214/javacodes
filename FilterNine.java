
//Numbers between 20 and 50

package streamapi;

import java.util.Arrays;
import java.util.List;

public class FilterNine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> list = Arrays.asList(10,25,40,55,70);
list.stream()
.filter(n -> n >= 20 && n<= 50)
.forEach(System.out::println);
	}

}
