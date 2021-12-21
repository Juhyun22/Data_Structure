package Data_Structure;

public class Fibonacci {

	public static void main(String[] args) {
		// 피보나치: 앞의 두 수를 더한 것이 다음 수 
		// tree로 함수가 호출됨 
//		for (int i = 1; i < 15; i++) {
//			System.out.print(Fibo(i) + " ");
//		}
		Fibo(7);
	}
	
	public static int Fibo(int num) {
		System.out.println("fibo called: " + num);
		
		if (num == 1) {
			return 0;
		} else if (num == 2) {
			return 1;
		} else {
			return Fibo(num - 1) + Fibo(num - 2);
		} 
	}

}
