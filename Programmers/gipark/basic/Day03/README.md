## Day03
### 노션에서 확인
▶️[**click**](https://gipark181.notion.site/Day03-2024-07-21-f9b41f56314249debd311894fc18315f?pvs=4)
<br/>
<hr/>

### [**문자열 섞기**](https://school.programmers.co.kr/learn/courses/30/lessons/181942)

[**min**](https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#min-int-int-)

[charAt](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#charAt-int-)

```java
// int min(int a, int b)
// 두 개의 int 값 중 작은 값을 반환 

// long min(long a, long b)
// 두 개의 long 값 중 작은 값을 반환

// float min(float a, float b)
// 두 개의 float 값 중 작은 값을 반환

// double min(double a, double b)
// 두 개의 double 값 중 작은 값을 반환

Math.min(str1.length(), str2.length());

/* =================================================== */
// String 문자열안의 지정된 인덱스(i)의 문자를 반환
str.charAt(i);
```
<br/>

### [문자 리스트를 문자열로 변환하기](https://school.programmers.co.kr/learn/courses/30/lessons/181941)

[**join**](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#join-java.lang.CharSequence-java.lang.CharSequence...-)

[**StringJoiner**](https://docs.oracle.com/javase/8/docs/api/java/util/StringJoiner.html)

```java
// 지정된 구분자로 String[]의 요소들을 결합하여 새로운 String 문자열로 반환
String[] arr = new String[]{"a", "b", "c"};
String.join("", arr);
// abc

/* =================================================== */
// 생성시 지정한 구분자, 접두사, 접미사로 문자열을 결합
StringJoiner sj = new StringJoiner(",");
sj.add("a");
sj.add("b");
sj.add("c");
// a,b,c

StringJoiner sj = new StringJoiner(",", "[", "]");
sj.add("a");
sj.add("b");
sj.add("c");
// [a,b,c]
```
<br/>

### [**문자열 곱하기**](https://school.programmers.co.kr/learn/courses/30/lessons/181940)

[**repeat**](https://docs.oracle.com/en%2Fjava%2Fjavase%2F11%2Fdocs%2Fapi%2F%2F/java.base/java/lang/String.html#repeat(int))

```java
// 해당 문자열을 반복 횟수만큼 연결한 String 문자열을 반환
String str = "abc";
str.repeat(5);
// abcabcabcabcabc
```
<br/>

### [**더 크게 합치기**](https://school.programmers.co.kr/learn/courses/30/lessons/181939)

[Math.log10](https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#log10-double-)

[Math.pow](https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#pow-double-double-)

[Math.max](https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#max-int-int-)

```java
int a = 10;
int b = 2;

// a의 밑이 10인 log 값을 반환 (상용로그  값)
Math.log10(x)  // 0.xxx

// a의 b제곱을 반환
Math.pow(a, b)  // 100

// a와 b 중 더 큰 값을 반환
// 내부적으로 (a >= b) ? a : b;
Math.max(a, b)  // 10
```
<br/>

### [**두 수의 연산값 비교하기**](https://school.programmers.co.kr/learn/courses/30/lessons/181938)

[Math.log10](https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#log10-double-)

[Math.pow](https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#pow-double-double-)

[Math.max](https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#max-int-int-)

```java
// Math 함수들은 여러 데이터 타입을 지원
// int
// long
// float
// double
```