package Data_Structure;

public class RecursiveFactorial {

	public static void main(String[] args) {
		// 팩토리얼 코드로 나타내기 
		System.out.println("1! = " + Factorial(1));
		System.out.println("2! = " + Factorial(2));
		System.out.println("3! = " + Factorial(3));
		System.out.println("4! = " + Factorial(4));
		System.out.println("9! = " + Factorial(9));
	}
	
	public static int Factorial(int num) {
		if (num == 0) {
			return 1;
		} else {
			return num * Factorial(num - 1); // return을 통해서 값 반환됨.
		}
	}

}
