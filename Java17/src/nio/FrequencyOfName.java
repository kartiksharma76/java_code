package nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyOfName {
	public static void main(String[] args) {
		Path path = Paths.get("Mytest.txt");
		try {
			List<String> list = Files.readAllLines(path);
			list.forEach(System.out::println);
			Map<String, Long> frequency = list.stream()
					.collect(Collectors.groupingBy(name -> name, Collectors.counting()));
			frequency.forEach((name, count) -> System.out.println());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
