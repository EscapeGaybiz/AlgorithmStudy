import java.util.Arrays;
class Solution {
    public int[] solution(int[] num_list) {
        int[] new_list = Arrays.copyOf(num_list,num_list.length + 1);
        int lastIndex = num_list.length -1;
        
        new_list[lastIndex + 1] = 
            (num_list[lastIndex] > num_list[lastIndex - 1] ? 
             num_list[lastIndex] - num_list[lastIndex - 1] : 
             (2 * num_list[lastIndex]));

        return new_list;
    }
}