import java.util.*;
class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer;
        if (arr1.length != arr2.length) 
            answer = arr1.length > arr2.length ? 1 : -1;
        else 
            answer = Arrays.stream(arr1).sum() > Arrays.stream(arr2).sum() ? 1
                    : Arrays.stream(arr1).sum() == Arrays.stream(arr2).sum() ? 0
                    : -1;
        return answer;
    }
}