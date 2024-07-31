## Day10
### 노션에서 확인
▶️[**click**](https://gipark181.notion.site/Day10-2024-07-28-6907a16a2e9f443fa7d3c7015356f62f?pvs=4)
<br/>
<hr/>

### [**문자열의 앞의 n글자**](https://school.programmers.co.kr/learn/courses/30/lessons/181907)

[**substring**](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#substring-int-int-)

```java
// my_string 문자열의 0번째부터 n - 1번째 인덱스까지의 새 문자열을 반환
my_string.substring(0, n);
```
<br/>

### [**접두사인지 확인하기**](https://school.programmers.co.kr/learn/courses/30/lessons/181906)

[**startsWith**](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#startsWith-java.lang.String-)

```java
// str 문자열이 지정된 접두사로 시작하는지 확인
// boolean startsWith(String prefix)
str.startsWith(is_prefix);
```
<br/>

### [**문자열 뒤집기**](https://school.programmers.co.kr/learn/courses/30/lessons/181905)

[**insert**](https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html#insert-int-java.lang.String-)

```java
StringBuilder sb = new StringBuilder();

return sb.append(my_string.substring(s, e + 1)).reverse()   // s부터 e까지 뒤집기
        .insert(0, my_string.substring(0, s))   // 0번째 인덱스에 추가 (sb 앞에 추가)
        .append(my_string.substring(e + 1))     // sb 뒤에 추가
        .toString();
```
<br/>

### [**세로 읽기**](https://school.programmers.co.kr/learn/courses/30/lessons/181904)

```java
// m행 c열 찾기
// m만큼 더하면서 반복하고, i는 c - 1만큼 더하면 됨
for (int i = 0; i < my_string.length(); i += m) {
    sb.append(my_string.charAt(i + c - 1));
}
```
<br/>

### [**qr code**](https://school.programmers.co.kr/learn/courses/30/lessons/181903)

```java
// 1번
for (int i = 0; i < code.length(); i++) {
        if (i % q == r)
        sb.append(code.charAt(i));
        }

// 2번
        for (int i = r; i < code.length(); i += q) {
        sb.append(code.charAt(i));
        }

```