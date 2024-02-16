package _02_nested_loops._3_for_loop_gauntlet;

public class ForTheForLoops {
public static void main(String[] args) {
	int count = 0;
	int year = 2010;
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
count =0;
for (int i = 0; i < 501; i+=2) {
System.out.println(i + " is even");
}
System.out.println("------------------------------------");
for (int i = 0; i < 778; i+=7) {
	System.out.println(i);
}
System.out.println("------------------------------------");
for (int i = 0; i < 14; i++) {
	System.out.println("In " + year + " I was " + count + " years old");
	year+=1;
	count+=1;
}
System.out.println("------------------------------------");
for (int i = 0; i <4 ; i++) {
	for (int d = 0; d < 3; d++) {
		System.out.println(i+"  " +d);
	}
}
System.out.println("------------------------------------");
for (int i = 0; i < 3; i++) {
	for (int d = 1; d < 4; d++) {
		System.out.print(3*i+d + " ");
	}
	System.out.println();
}
System.out.println("------------------------------------");
for (int i = 0; i < 10; i++) {
	for (int d = 1; d < 11; d++) {
		System.out.print(10*i+d + " ");
	}
	System.out.println();
}
System.out.println("------------------------------------");
for (int i = 0; i < 6; i++) {
	for (int d = 0; d < 6; d++) {
		System.out.print("*");
	}
	System.out.println();
}
}
}
