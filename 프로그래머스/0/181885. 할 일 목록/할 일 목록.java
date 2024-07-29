import java.util.*;
class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < todo_list.length; i++) {
            boolean a = !finished[i] ? list.add(todo_list[i]) : false;
        }
        return list.toArray(new String[0]);
    }
}