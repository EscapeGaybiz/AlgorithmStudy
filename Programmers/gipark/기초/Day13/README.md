## Day13
### 노션에서 확인
▶️[**click**](https://hits.seeyoufarm.com/api/count/incr/badge.svg?pvs=4&url=https%3A%2F%2Fgipark181.notion.site%2FDay13-2024-07-31-3bd419b5af2641359e1d518b8d284182&count_bg=%2379C83D&title_bg=%23555555&icon=&icon_color=%23E7E7E7&title=hits&edge_flat=false)
<br/>
<hr/>

### [**n 번째 원소부터**](https://school.programmers.co.kr/learn/courses/30/lessons/181892)

[**Arrays.copyOfRange**](https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html#copyOfRange-int:A-int-int-)

```java
// num_list 배열의 (n - 1) 번 인덱스부터 num_list의 끝 인덱스까지 의 새 배열을 반환
Arrays.copyOfRange(num_list, n - 1, num_list.length);
```
<br/>

### [**순서 바꾸기**](https://school.programmers.co.kr/learn/courses/30/lessons/181891)

```java
// Solution1
for (int i = 0; i < num_list.length - n; i++) {
    result.add(num_list[n + i]);
}
for (int i = 0; i < n; i++) {
    result.add(num_list[i]);
}

// Solution2
int j = 0;
for (int i = 0; i < num_list.length; i++) {
    answer[i] = (i < num_list.length - n) ?
            num_list[i + n] : num_list[j++];
}

/**
 * for loop를 두 번 사용하여 넣던 부분을 반복문 한번으로 변경
 * 
 * Solution1
 * n번째 뒤부터 넣고, 앞에서 부터 다시 n번째까지 넣기
 * 
 * Solution2
 * 한번의 for loop에서 i의 길이를 체크하며,
 * i가 num_list.length - n 보다 작다면 앞에서부터 넣고
 * i가 num_list.length - n 보다 크거나 같다면 num_list의 0번째 부터 n번째까지 넣기
 * 
 */
```
<br/>

### [**왼쪽 오른쪽**](https://school.programmers.co.kr/learn/courses/30/lessons/181890)

```java
/**
 * 1. str_list에서 처음 오는 'l' 또는 'r'의 인덱스를 찾기
 * 1 - 1. 인덱스를 찾지 못했다면('l' 또는 'r'이 없다면) 인덱스는 -1
 * 2. 인덱스가 -1이 아니라면
 * 2 - 1. 'l'인 경우, str_list의 0 번째부터 idx까지의 새 배열을 answer에 담기
 * 2 - 2. 'r'인 경우, str_list의 idx + 1 번째부터 str_list의 마지막 까지의 새 배열을 answer에 담기
 */
 
int idx = -1;
for (int i = 0; i < str_list.length; i++) {
    if ("l".equals(str_list[i]) || "r".equals(str_list[i])) {
        idx = i;
        break;
    }
}

if (idx != -1) {
    if ("l".equals(str_list[idx])) {
        answer = Arrays.copyOfRange(str_list, 0, idx);
    } else if ("r".equals(str_list[idx])) {
        answer = Arrays.copyOfRange(str_list, idx + 1, str_list.length);
    }
}
```
<br/>

### [**n 번째 원소까지**](https://school.programmers.co.kr/learn/courses/30/lessons/181889)

```java
// num_list의 0 번째부터 순서대로 n개를 담은 새 배열 반환

// Solution1
for (int i = 0; i < n; i++) {
    answer[i] = num_list[i];
}

// Solution2
Arrays.copyOfRange(num_list, 0, n);
```
<br/>

### [**n개 간격의 원소들**](https://school.programmers.co.kr/learn/courses/30/lessons/181888)

[**Math.ceil**](https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#ceil-double-)

```java
// public static double ceil(double a)
// ceil 안의 인자값이 double 형이어야 정상으로 동작
(int) Math.ceil(num_list.length / (double) n);

// 이렇게 int와 int로 나누게 되면 소수점이 버려지면서 올림 처리가 정상 동작하지 않음
(int) Math.ceil(num_list.length / n);

/**
 * 1번
 * 5 / 3 = 1.66667 -> Math.ceil(1.66667) == 2
 * 
 * 2번
 * 5 / 3 = 1 -> Math.ceil(1) == 1
 */

// num_list 배열의 0번째부터 n개의 간격으로 저장되는 새 배열을 반환
// (ex, n = 4) -> 0, 4, 8, 12, 16 ...
for (int i = 0; i < length; i++) {
    answer[i] = num_list[i * n];
}
```