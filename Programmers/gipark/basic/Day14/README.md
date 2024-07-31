## Day14
### 노션에서 확인
▶️[**click**]()
<br/>
<hr/>

### [**홀수 vs 짝수**](https://school.programmers.co.kr/learn/courses/30/lessons/181887)

[**Math.max**](https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#max-int-int-)

```java
// 첫 번째 원소가 1번 원소
if (i % 2 == 0)
    odd += num_list[i];
else
    even += num_list[i];
    
// 둘 중에 더 큰 값을 반환
Math.max(odd, even);
```
<br/>

### [**5명씩**](https://school.programmers.co.kr/learn/courses/30/lessons/181886)

[**Math.ceil**](https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#ceil-double-)

```java
// 0 번째부터 5 간격마다 배열을 만들기 위한 길이 값
(int) Math.ceil(names.length / (double) 5);

// 5 간격 -> i * 5
for (int i = 0; i < length; i++) {
    answer[i] = names[i * 5];
}
```
<br/>

### [**할 일 목록**](https://school.programmers.co.kr/learn/courses/30/lessons/181885)

```java
// boolean[] finished

// finished 배열의 요소 중 false인 경우에 list에 todo_list를 담기
if (!finished[i])
		list.add(todo_list[i]);
```
<br/>

### [**n보다 커질 때까지 더하기**](https://school.programmers.co.kr/learn/courses/30/lessons/181884)

```java
// answer에 num을 더하다가 n보다 크면 break해서 반복문 빠져나오기

// Solution1
// Enhanced for loop
for (int num : numbers) {
    answer += num;

    if (n < answer)
        break;
}

// Solution2
// basic for loop
for (int i = 0; answer <= n; i++) {
    answer += numbers[i];
}
```
<br/>

### [**수열과 구간 쿼리 1**](https://school.programmers.co.kr/learn/courses/30/lessons/181883)

```java
// int[][] queries

// 1. queries가 2차원 배열이므로 행만큼 반복하기
// 2. 열의 값을 조건으로 한 반복문을 통해 answer 배열에 +1 하기
for (int i = 0; i < queries.length; i++) {
    for (int j = queries[i][0]; j <= queries[i][1]; j++) {
        answer[j]++;
    }
}
```