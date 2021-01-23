/**
 * 이진 탐색 알고리즘
 * parameter    : 배열, 목표 값
 * return       : 결과 값
 * 원리          : 주어진 배열에서 목표 값과 중간 값을 비교하며 배열의 인덱스를 반으로 나누며 탐색하는 알고리즘
 * 조건          : 정렬된 배열
 */
public class BinarySearch {
    int search(int[] arr, int target){

        int arrLength = arr.length; // 배열의 크기를 계산
        int first = 0;              // 계산시 첫 인덱스
        int last = arrLength-1;     // 계산시 끝 인덱스
        int mid;                    // 계산시 중간 인덱스

        while(first <= last){
            mid = (first + last) / 2; // 중간 인덱스 계산

            if(target == arr[mid]){ return mid; }     // 계산된 중간 값과 비교
            if(target < arr[mid]){ last = mid - 1; }  // 중간 인덱스보다 적을 경우 last-1
            if(target > arr[mid]){ first = mid + 1; } // 중간 인덱스봗 클 경우 first+1
        }

        return -1; // 찾지 못할 경우 -1 반환
    }
}
