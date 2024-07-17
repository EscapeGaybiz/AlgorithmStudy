### Day01
### 노션에서 확인  
[**click**](https://gipark181.notion.site/Day1-2024-07-18-18c52365cd134a1cb7c52b9658dc9a56)
<br/>
<br/>

### [문자열 출력하기](https://school.programmers.co.kr/learn/courses/30/lessons/181952)

[**Scanner**](https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html)

```java
import java.util.Scanner

Scanner sc = new Scanner(System.in);

// 공백을 기준으로 한 문자씩 입력받음 (String)
sc.next();

// 개행(엔터)전까지의 문자열 전체를 입력받음 (String)
sc.nextLine();

// 읽을 문자가 남아있는지 확인 (boolean)
sc.hasNext();

// Scanner 자원 해제
sc.close();
```
<br/>

### [a와 b 출력하기](https://school.programmers.co.kr/learn/courses/30/lessons/181951)

[**Scanner**](https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html)

```java
import java.util.Scanner

Scanner sc = new Scanner(System.in);
int a = sc.nextInt();

// 공백을 기준으로 한 숫자를 입력받음 (int)
sc.nextInt();

// String + Int => String
"a = " + a

// a가 13이면, "a = 13"
System.out.println("a = " + a);
```
<br/>

### [문자열 반복해서 출력하기](https://school.programmers.co.kr/learn/courses/30/lessons/181950#)

[**repeat**](https://docs.oracle.com/en%2Fjava%2Fjavase%2F11%2Fdocs%2Fapi%2F%2F/java.base/java/lang/String.html#repeat(int))

```java
String str = "str";

// 문자열을 반복 횟수만큼 연결한 문자열을 반환 (String)
str.repeat(3)

// strstrstr
System.out.println(str.repeat(3));
```
<br/>

### [대소문자 바꿔서 출력하기](https://school.programmers.co.kr/learn/courses/30/lessons/181949)

[**toCharArray**](https://docs.oracle.com/javase%2F7%2Fdocs%2Fapi%2F/java/lang/String.html#toCharArray())

[**isUpperCase**](https://docs.oracle.com/javase/8/docs/api/java/lang/Character.html#isUpperCase-char-)

[**isLowerCase**](https://docs.oracle.com/javase/8/docs/api/java/lang/Character.html#isLowerCase-char-)

```java
// 문자열 str을 새 문자(char) 배열로 변환. (char[])
str.toCharArray();

// 문자 c가 대문자인지 여부 (boolean)
Character.isUpperCase(c)

// 문자 c가 소문자인지 여부 (boolean)
Character.isLowerCase(c)
```
<br/>

### [특수문자 출력하기](https://school.programmers.co.kr/learn/courses/30/lessons/181948)

```java
// ', ", \ 출력시에는 앞에 \', \", \\ 붙이기
// !@#$%^&*(\'"<>?:; 출력
System.out.println("!@#$%^&*(\\'\"<>?:;");
```
<br/>
