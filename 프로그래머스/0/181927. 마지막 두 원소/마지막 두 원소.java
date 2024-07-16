class Solution {
    public int[] solution(int[] num_list) {
        int[] new_list = new int[num_list.length + 1];
        for (int i = 0; i < num_list.length; i++) {
            new_list[i] = num_list[i];
        }
        int lastIndex = num_list.length -1;
        new_list[lastIndex + 1] = (num_list[lastIndex] > num_list[lastIndex - 1] ? num_list[lastIndex] - num_list[lastIndex - 1] : (2 * num_list[lastIndex]));

        return new_list;
    }
}