package Data_Structure;

public class BinarySearch {

	public static void main(String[] args) {
		// 이진탐색 기준 : 배열의 값이 정렬되어 있어야 한다.
		// 로그2의 n
		int[] arr = {1, 3, 5, 7, 9};
		int idx;
		
		idx = BSearch(arr, 7);
		if (idx == -1) {
			System.out.println("Search failed");
		} else {
			System.out.println("Target stored index : " + idx);
		}
		
		idx = BSearch(arr, 4);
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
			}
		}
		
		return -1;
	}

}
