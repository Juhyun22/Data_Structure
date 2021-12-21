package Data_Structure;

public class BinarySearch {

	public static void main(String[] args) {
		// 순차 탐색과 이진 탐색의 연산횟수 비교 -> 이진 탐색의 경우, 탐색의 수가 매우 줄어듬.
		// 이진탐색 기준 : 배열의 값이 정렬되어 있어야 한다.
		// 이진 탐색의 빅-오는 log(n)
		int[] arr1 = new int[500];
		int[] arr2 = new int[5000];
		int idx;
		
		idx = BSearch(arr1, 7);
		if (idx == -1) {
			System.out.println("Search failed");
		} else {
			System.out.println("Target stored index : " + idx);
		}
		
		idx = BSearch(arr2, 4);
		if (idx == -1) {
			System.out.println("Search failed");
		} else {
			System.out.println("Target stored index : " + idx);
		}
	}
	
	public static int BSearch (int arr[], int target) {
		int first = 0;
		int last = arr.length - 1; // 배열의 index값 -> 길이 -1
		int mid;
		int opCount = 0; // 연산 횟수
		
		while (first <= last) {
			mid = (first + last) / 2;
			
			if (arr[mid] == target) {
				return mid;
			} else {
				if (target < arr[mid]) {
					last = mid - 1; // 중복 제거 -1. target가 index에 없을 때, 무한루프 돔 
				} else {
					first = mid + 1; // 중복 제거 +1
				}
				opCount += 1;
			}
		}
		
		System.out.println("비교 연산 횟수 : " + opCount);
		return -1;
	}

}
