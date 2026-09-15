package multiThreading;

import java.util.concurrent.Callable;

public class AdderThread implements Callable<Integer> {

@Override
public Integer call() throws Exception {
	int sum=0;
		for(int i=1;i<=10;i++) {
			sum+=i;
					}
		return sum;
	}

}
