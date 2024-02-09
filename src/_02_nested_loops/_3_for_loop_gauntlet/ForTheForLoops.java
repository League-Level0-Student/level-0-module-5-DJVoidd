package _02_nested_loops._3_for_loop_gauntlet;

public class ForTheForLoops {
public static void main(String[] args) {
	int count = 0;
	for (int i = 0; i < 101; i++) {
		System.out.println(count);
		count = count+1;
	}
System.out.println("------------------------------------");
count = 100;	
for (int i = 0; i < 101; i++) {
		System.out.println(count);
		count = count-1;
	}
count = 0;
System.out.println("------------------------------------");
for (int i = 0; i < 101; i+=2) {
	System.out.println(count);
	count+=2;
}
System.out.println("------------------------------------");
count = 1;
for (int i = 0; i < 100; i+=2) {
	System.out.println(count);
	count+=2;
}
System.out.println("------------------------------------");
for (int i = 0; i < 501; i++) {
	count = 0;
	if(i%2==0) {
		System.out.println(count + " is even");
	}
}
}
}
