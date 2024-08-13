## Day23
### 노션에서 확인
▶️[**click**](https://gipark181.notion.site/Day23-2024-08-08-c5f65b4619e34c2f86ac3a6dee88997c?pvs=4)
<br/>
<hr/>

### [**부분 문자열**](https://school.programmers.co.kr/learn/courses/30/lessons/181842)

[**contains**](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#contains-java.lang.CharSequence-)

```java
// str2 문자열에 지정된 str1 문자열이 포함되어 있다면 true를 반환
str2.contains(str1) ? 1 : 0;
```
<br/>

### [**꼬리 문자열**](https://school.programmers.co.kr/learn/courses/30/lessons/181841)

[**StringBuilder**](https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html)

[**contains**](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#contains-java.lang.CharSequence-)

```java
StringBuilder sb = new StringBuilder();

// str_list의 문자열 배열을 반복하며,
// 각 문자열 요소에 ex 문자열이 포함되있지 않다면 StringBuilder에 추가
for (String str : str_list) {
    if (!str.contains(ex))
        sb.append(str);
}
```
<br/>

### [**정수 찾기**](https://school.programmers.co.kr/learn/courses/30/lessons/181840)

```java
// num_list 정수 배열을 반복하며,
// 각 정수 요소에 있는 값이 n과 같은 값이 있다면, answer을 1로 저장하고 반복문 끝내기
for (int num : num_list) {
    if (num == n) {
        answer = 1;
        break;
    }
}
```
<br/>

### [**주사위 게임 1**](https://school.programmers.co.kr/learn/courses/30/lessons/181839)

[**Math.abs**](https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#abs-int-)

[**Math.pow**](https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#pow-double-double-)

```java
// a가 짝수이면서, b가 짝수인 경우 Math.abs(a - b)
// a가 짝수이면서, b가 짝수가 아닌 경우 2 * (a + b)
// a가 짝수가 아니면서, b가 짝수인 경우 2 * (a + b)
// a가 짝수가 아니면서, b가 짝수가 아닌 경우 (int) (Math.pow(a, 2) + Math.pow(b, 2))
(a % 2 == 0) ?
(b % 2 == 0) ? Math.abs(a - b) : 2 * (a + b) :
(b % 2 == 0) ? 2 * (a + b) : (int) (Math.pow(a, 2) + Math.pow(b, 2))

// a에서 b를 뺀 값의 절댓값
// a - b가 int 형이므로 int형으로 반환됨
Math.abs(a - b)

// a의 2제곱
// pow는 반환 타입이 double이므로, int 형으로 캐스팅해주어야 함
Math.pow(a, 2);
```
<br/>

### [**날짜 비교하기**](https://school.programmers.co.kr/learn/courses/30/lessons/181838)

[**LocalDate**](https://docs.oracle.com/javase%2F8%2Fdocs%2Fapi%2F%2F/java/time/LocalDate.html)

[**of**](https://docs.oracle.com/javase%2F8%2Fdocs%2Fapi%2F%2F/java/time/LocalDate.html#of-int-int-int-)

[**compareTo**](https://docs.oracle.com/javase%2F8%2Fdocs%2Fapi%2F%2F/java/time/LocalDate.html#compareTo-java.time.chrono.ChronoLocalDate-)

```java
// [year, month, dayOfMonth]를 인자 값으로 주어 LocalDate 객체를 생성
LocalDate localDate1 = LocalDate.of(date1[0], date1[1], date1[2]);
LocalDate localDate2 = LocalDate.of(date2[0], date2[1], date2[2]);

// localDate1과 localDate2의 날짜 비교
// localDate1이 localDate2보다 과거의 날짜라면, 음수(negative) 값이 반환
// localDate1이 localDate2보다 미래의 날짜라면, 양수(positive) 값이 반환
// localDate1과 localDate2가 같은 날짜라면, 0을 반환
return localDate1.compareTo(localDate2) < 0 ? 1 : 0;
```