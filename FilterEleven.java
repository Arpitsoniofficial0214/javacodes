
//Print positive numbers

package streamapi;

import java.util.Arrays;
import java.util.List;

public class FilterEleven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> list = Arrays.asList(-5,10,-3,20,15);
list.stream()
.filter(n -> n > 0)
.forEach(System.out::println);
	}

}
