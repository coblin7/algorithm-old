/**
 * 이진 탐색 (재귀활용)
 * parameter        : 배열, 첫 인덱스, 끝 인덱스, 목표 값
 * return           : 목표 인덱스
 * 목표              : 재귀적 호출을 활용하여 이진 탐색 구현
 * 조건              : 정렬된 배열
 */
public class BinarySearchRecursive {
    int search(int[] arr, int first, int last, int target){
        if(first <= last) {
            int mid = (first + last) / 2;                // 중간 인덱스 계산
            if (target == arr[mid]) { return mid; }      // 계산된 중간 값과 비교
            if (target < arr[mid]) { last = mid - 1; }   // 중간 인덱스보다 적을 경우 last-1
            if (target > arr[mid]) { first = mid + 1; }  // 중간 인덱스보다 클 경우 first+1
            mid = search(arr, first, last, target);      // 재귀함수 호출
        }
        return -1;  // 찾지 못할 경우 -1 반환
    }
}
