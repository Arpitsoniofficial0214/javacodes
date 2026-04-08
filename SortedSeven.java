
//Sort the list print second highest number

package StreamApiSort1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortedSeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> list = Arrays.asList(55,12,88,34,99,21);
Integer secondHighest = list.stream()
                  .sorted(Collections.reverseOrder())
                  .skip(1)
                  .findFirst()
                  .get();
System.out.println(secondHighest)
	}

}
