package streamapi;

public class FilterAPI {
	import java.util.ArrayList;
	import java.util.List;
	import java.util.stream.Stream;
	import java.util.Padding;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(23);
		list.add(45);
		list.addAll(List.of(23,56,78,23,45,65));
		System.out.println(list);
		//Stream listStream=list.stream();  
		list.stream().forEach((element)-> System.out.print(element+" "));
		//list.stream().forEach(System.out::println);
		//System.out.println("Count="+list.Stream().count());
		System.out.println("Count="+list.stream().filter((item)->item>60).count());
	}     
}
