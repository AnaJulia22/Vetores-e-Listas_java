package application;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Ana");
		list.add("Galego");
		list.add("Bia");
		list.add(2, "Bobby");
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("---------------------------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'B').collect(Collectors.toList());		
		System.out.println("Filtered list by letter B: " + result);
		System.out.println("---------------------------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'B').findFirst().orElse(null);
		System.out.println("First name starts with B: " + name);
		System.out.println("---------------------------------------");
		System.out.println("Index of Ana: " + list.indexOf("Ana"));
		System.out.println("List size: " + list.size());
		System.out.println("List: " + list);
		list.remove("Ana");
		System.out.println("---------------------------------------");
		System.out.println("Removal by element name");
		System.out.println("Updated list: ");
		System.out.println("List size: " + list.size());
		System.out.println("List: " + list);
		list.remove(1);
		System.out.println("---------------------------------------");
		System.out.println("Removal by index");
		System.out.println("Updated list: ");
		System.out.println("List size: " + list.size());
		System.out.println("List: " + list);
		list.removeIf(x -> x.charAt(1) == 'a');
		System.out.println("---------------------------------------");
		System.out.println("Removal by predicate");
		System.out.println("Updated list: ");
		System.out.println("List size: " + list.size());
		System.out.println("List: " + list);		

	}

}
