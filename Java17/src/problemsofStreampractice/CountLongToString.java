package problemsofStreampractice;

import java.util.Arrays;
import java.util.List;

public class CountLongToString {
public static void main(String[] args) {
	List<String> ch=Arrays.asList("kartik","twinkle","prince","kundan","mohan","aman");
	long count=ch.stream().filter(s->s.length()>5).count();
	System.out.println(count);
}
}
