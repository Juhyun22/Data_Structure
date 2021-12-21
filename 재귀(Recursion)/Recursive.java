package Data_Structure;

public class Recursive {

	public static void main(String[] args) {
		Recursive(3);
	}
	
	public static void Recursive(int num) {
		if (num <= 0) { // 재귀의 탈출 조건!!
			return;     // 재귀 탈출! 
		}
		System.out.println("Recursive call! " + num);
		Recursive(num-1);
	}

}
