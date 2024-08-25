## Day13
### 노션에서 확인
▶️[**click**](https://gipark181.notion.site/Day13-2024-08-25-423babe00bca40d8bb48320fddcd4193?pvs=4)
<br/>
<hr/>

### [**컨트롤 제트**](https://school.programmers.co.kr/learn/courses/30/lessons/120853)

```java
// Solution1
// 1. s 문자열을 공백으로 나눈 strArr 문자열 배열 생성
// 2. strArr 문자열 배열 반복
// 2-1. 문자열 요소가 "Z"이면, Z 앞 인덱스 문자열을 숫자로 변환하여 빼기
// 2-2. 아니라면, 해당 문자열 요소를 숫자로 변환하여 더하기

String[] strArr = s.split(" ");

for (int i = 0; i < strArr.length; i++) {
    if ("Z".equals(strArr[i])) {
        answer -= Integer.parseInt(strArr[i - 1]);
    } else {
        answer += Integer.parseInt(strArr[i]);
    }
}
```

```java
// Solution2 - Stack 사용
// 1. s 문자열을 공백으로 나눈 strArr 문자열 배열 생성
// 2. Stack 생성
// 3. strArr 문자열 배열 반복
// 3-1. 문자열 요소가 "Z"이면, Stack에 마지막에 담긴 요소 제거(pop)
// 3-2. 아니라면, Stack에 문자열 요소를 숫자로 변환하여 넣기
// 4. stack 반복하며 모든 요소 더하기

String[] strArr = s.split(" ");
Stack<Integer> stk = new Stack<>();

for (String str : strArr) {
    if ("Z".equals(str)) {
        stk.pop();
        continue;
    }
    stk.push(Integer.parseInt(str));
}

for (int n : stk) {
    answer += n;
}
```
<br/>

### [**배열 원소의 길이**](https://school.programmers.co.kr/learn/courses/30/lessons/120854)

```java
// Solution1
// 1. strlist 문자열을 반복하며, 문자열 길이를 넣어주기

int[] answer = new int[strlist.length];

for (int i = 0; i < answer.length; i++) {
    answer[i] = strlist[i].length();
}
return answer;
```
<br/>

### [**중복된 문자 제거**](https://school.programmers.co.kr/learn/courses/30/lessons/120888)

```java
// Solution1
// 1. LinkedHashSet 변수 생성 (삽입순서 고려하는 중복 제거 위해)
// 2. my_string 문자열을 반복하며, set에 문자 넣기
// 3. set에 넣은 문자를 StringBuilder에 넣어 문자열로 만들기

StringBuilder sb = new StringBuilder();
Set<String> set = new LinkedHashSet<>();

for (char c : my_string.toCharArray()) {
    set.add(String.valueOf(c));
}

for (String s : set) {
    sb.append(s);
}
return sb.toString();
```

```java
// Solution2
// 1. my_string 문자열 반복하기
// 1-1. StringBuilder에 포함하지 않는 문자라면, 반복해서 나온 문자 넣기

StringBuilder sb = new StringBuilder();

for (char c : my_string.toCharArray()) {
    if (!sb.toString().contains(String.valueOf(c)))
        sb.append(c);
}
return sb.toString();
```
<br/>

### [**삼각형의 완성조건 (1)**](https://school.programmers.co.kr/learn/courses/30/lessons/120889)

```java
// Solution1
// 1. int[] 배열 오름차순 정렬
// 2. 0, 1 번째 인덱스 요소 더한 값과 2 번째 인덱스가 작다면 1, 아니라면 2

Arrays.sort(sides);
return sides[0] + sides[1] > sides[2] ? 1 : 2;
```