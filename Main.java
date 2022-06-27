package chapter3;

public class Main {
	public static int addNum(int num1, int num2) {
		
		int result;
		result = num1 + num2;
		return result;
		
	}
	
	public static void sayHello(String name) {
		System.out.println(name);
	}
	
	public static int calSum() {
		int sum = 0;
		int i;
		for (i = 0; i <=100; i++) {
			sum+=i;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1 = 10;
		int n2 = 20;
		
		int total = addNum(n1,n2);
		System.out.println(total);
		sayHello("안녕하세요.");
		
		total = calSum();
		System.out.println(total);
		

	}

}
