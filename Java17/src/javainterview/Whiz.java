package javainterview;

import java.util.ArrayList;
import java.util.List;

public class Whiz {
public static void main(String[] args) {
//	List<String> ints = new ArrayList<String>();
//	ints.add("a");
//	ints.add("b");
//	ints.add("c");
//	while(!ints.isEmpty()) {
//		System.out.println(ints.remove(0));
//	}
//	int x = 10;
//	while(x>0) {
//		do {
//			x-=2;
//		}while(x>3);
//		x--;
//		System.out.print(x);
//	}
	
//	byte i = 1,j =1;
//	while(i==3 && j <5) {
//		System.out.print(i+" "+j+" ");
//		i++;
//		j+=2;
//	}
	
//	int i = 10;
//	while(false) {
//		i= 20;
//		System.out.println(i);
//	}
	
//	int x = 0;
//	while((x=0)<=1) {
//		System.out.print(x);
//		x++;
//	}
	
//	int x=0;
//	for(;x<5; x+=3) {
//		System.out.print(x);
//	}
//	int ar[][] = {{1,11},{1},{1,11}};
//	for(int x =0; x <ar.length;x++) {
////		for(x:ar[x])System.out.println();
////		System.out.println(ar[x]);
//		for(int y:ar[x])System.out.println(y);
//	}
	
//	int x= 0;
//	do {
//		System.out.print(x);
//		
//	}while(x++<2);
//	for(x=0; x++<2;)System.out.print(x);
	
	for(int x = 1; x<10; x++) {
if(x%2==1)continue;
//		if(x%2!=0)break;
		System.out.println(x);
	}
}


}
