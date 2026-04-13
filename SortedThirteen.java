
//Sort only the numbers divisible by 5 using Stream

package StreamApiSort1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedThirteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(25, 14, 50, 33, 45, 18, 60);
		List<Integer> result = list.stream()
				              .filter(n -> n % 5 == 0)
				              .sorted() 
				              .collect(Collectors.toList());
		System.out.println(result);

	}

}
