import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;




public class OrdenaStrings {

	public static void main(String[] args) {
		
		List<String> palavras = new ArrayList<String>();
		palavras.add("Alura online");
		palavras.add("Caelum");
		palavras.add("Editora Casa do Código");
		

		//palavras.sort((o1, o2) -> Integer.compare(o1.length(), o2.length()));
		//palavras.sort(Comparator.comparing(s -> s.length()));
		palavras.sort(Comparator.comparing(String::length));
		
		
		
		System.out.println(palavras);

		//palavras.forEach(s -> System.out.println(s));
		palavras.forEach(System.out::println);
	}

}

