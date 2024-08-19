## Day04
### 노션에서 확인
▶️[**click**](https://gipark181.notion.site/Day04-2024-08-19-aae0303148804ee497c831d6ac79dc41?pvs=4)
<br/>
<hr/>

### [**피자 나눠 먹기 (1)**](https://school.programmers.co.kr/learn/courses/30/lessons/120814)

```java
// 어떤 수를 7로 나눴을때 나머지가 최대 6이므로,
// 7로 나눴을 때 나머지가 생기는 경우, 몫에 +1하기 위해 6을 더해준다.
// (나머지 사람들도 피자를 먹어야하기때문에 1개 더 만들어야함)
(n + 6) / 7;
```
<br/>

### [**피자 나눠 먹기 (2)**](https://school.programmers.co.kr/learn/courses/30/lessons/120815)

```java
while (i % n != 0) {
    i += 6;
    answer++;
}
```
<br/>

### [**피자 나눠 먹기 (3)**](https://school.programmers.co.kr/learn/courses/30/lessons/120816)

```java
// Solution1
// 피자 나눠 먹기(2) 방식
for (int i = slice; i < n; i += slice) {
    answer++;
}

// Solution2
// 피자 나눠 먹기(1) 방식
(n + slice - 1) / slice;
```
<br/>

### [**배열의 평균값**](https://school.programmers.co.kr/learn/courses/30/lessons/120817)

[**Double.NaN**](https://docs.oracle.com/javase/8/docs/api/java/lang/Double.html#NaN)

```java
// Solution1
double answer = 0;

for (int num : numbers) {
    answer += num;
}
return answer / numbers.length;

// Solution2
return Arrays.stream(numbers).average().orElse(Double.NaN);
```