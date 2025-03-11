package Java8Practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class InterviewQuestion {
//1.you have given a list of names ,print  the name with frequency
// String [] names ={"kartik","kartik","twinkle","twinkle","twinkle","prince"} ;
 // kartik 2 ,twinkle 3 ,prince 1

public static void main(String[] args) {
	// String [] names ={"kartik","kartik","twinkle","twinkle","twinkle","prince"} ;
	List<String> names=Arrays.asList("kartik","kartik","twinkle","twinkle","twinkle","prince");
	 
	Map<String, Long> map = names.stream().collect(Collectors.groupingBy(name->name,Collectors.counting()));
	map.forEach((name,count)->System.out.println(name+""+count));
}
}
