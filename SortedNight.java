
//Sort aname alfabetically

package StreamApiSort1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedNight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> names = Arrays.asList("Ravi", "Ankit" , "Meena" , "Kunal" , "Zoya");
List<String> sorted = names.stream()
                        .sorted()
                        .collect(Collectors.toList());
System.out.println(sorted);
	}

}
