package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Vowels {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("rajeshi","suraj","Tom");
		for(String str:names)
		{
			str.chars().filter(x -> "AEIOUaeiou".indexOf(x) != -1).forEach(y -> System.out.println((char) y));
			}


		}
}