## Day16
### 노션에서 확인
▶️[**click**](https://gipark181.notion.site/Day16-2024-08-01-2d1891b33ab4472f87fd6454f9a7209f?pvs=4)
<br/>
<hr/>

### [**대문자로 바꾸기**](https://school.programmers.co.kr/learn/courses/30/lessons/181877)

[**toUpperCase**](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#toUpperCase--)

```java
// myString 문자열의 모든 문자를 대문자로 변환
myString.toUpperCase();
```
<br/>

### [**소문자로 바꾸기**](https://school.programmers.co.kr/learn/courses/30/lessons/181876)

[**toLowerCase**](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#toLowerCase--)

```java
// myString 문자열의 모든 문자를 소문자로 변환
myString.toLowerCase();
```
<br/>

### [**배열에서 문자열 대소문자 변환하기**](https://school.programmers.co.kr/learn/courses/30/lessons/181875)

[**toUpperCase**](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#toUpperCase--)

[**toLowerCase**](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#toLowerCase--)

```java
// strArr 배열의 인덱스가 짝수라면 소문자로, 홀수라면 대문자로 변환
for (int i = 0; i < strArr.length; i++) {
    answer[i] = (i % 2 == 0) ?
            strArr[i].toLowerCase() : strArr[i].toUpperCase();
}
```
<br/>

### [**A 강조하기**](https://school.programmers.co.kr/learn/courses/30/lessons/181874)

[**Character.toUpperCase**](https://docs.oracle.com/javase/8/docs/api/java/lang/Character.html#toUpperCase-char-)

[**Character.toLowerCase**](https://docs.oracle.com/javase/8/docs/api/java/lang/Character.html#toLowerCase-char-)

```java
StringBuilder sb = new StringBuilder();

// myString을 char배열로 변환 후 문자 하나하나 반복하면서 변환
for (char c : myString.toCharArray()) {
		// a 또는 A라면 대문자로 변환, 아니라면 모두 소문자로 변
    sb.append((c == 'a' || c == 'A') ?
            Character.toUpperCase(c) : Character.toLowerCase(c));
}
```
<br/>

### [**특정한 문자를 대문자로 바꾸기**](https://school.programmers.co.kr/learn/courses/30/lessons/181873)

[**replace**](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#replace-java.lang.CharSequence-java.lang.CharSequence-)

[**replaceAll**](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#replaceAll-java.lang.String-java.lang.String-)

[**replaceFirst**](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#replaceFirst-java.lang.String-java.lang.String-)

```java
String str = "apple banana apple orange";
// replace
// 단순한 문자열을 대체
str.replace("apple", "iphone");    // "iphone banana iphone orange"

// replaceAll
// 정규 표현식을 사용하여 문자열을 대체
str.replaceAll("apple", "iphone");    // "iphone banana iphone orange"

// replaceFirst
// 정규 표현식을 사용하여 첫 번째 일치 항목을 새로운 문자열로 대체
str.replaceFirst("apple", "ihpone");    // "iphone banana apple orange"
```