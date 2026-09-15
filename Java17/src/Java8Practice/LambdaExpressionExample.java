package Java8Practice;

import java.util.Arrays;
import java.util.List;

public class LambdaExpressionExample {
	public static void main(String[] args) {
List<String>names=Arrays.asList("kartik","Ankit","aman","ishita");
names.forEach(name->System.out.println(name));
}
}