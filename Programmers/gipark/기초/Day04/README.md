## Day04
### 노션에서 확인
▶️[**click**](https://gipark181.notion.site/Day04-2024-07-21-44c1f23bf1ff4a4a928e207826775a42?pvs=4)
<br/>
<hr/>

### [**n의 배수**](https://school.programmers.co.kr/learn/courses/30/lessons/181937)

[**ternary operator**](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op2.html)

```java
// **condition ? exprIfTrue : exprIfFalse;
// 조건문 ? 참인 경우 : 거짓인 경우
int a = 1;
int b = 2;

a < b ? b : a** 
```
<br/>

### [**공배수**](https://school.programmers.co.kr/learn/courses/30/lessons/181936)

[**Boolean Logical Operators**](https://docs.oracle.com/javase/specs/jls/se8/html/jls-15.html#jls-15.22.2)

```java
/**
 * 논리 연산자
 * 
 * a와 b 값이 모두 참이면 1(true), 아니라면 0(false)
 * a & b
 * a && b
 * 
 * a와 b 값 중 하나라도 참이면 1(true), 아니라면 0(false)
 * a | b
 * a || b
 * 
 * a와 b가 서로 같지 않다면 1(true), 같다면 0(false)
 * a ^ b
 * 
 * a의 값이 1(true)이면 0(false)으로, 0(false)라면 1(true)로 변환
 * !a
 */
 
int number = 60;
int n = 2;
int m = 3;

((number % n) & (number & m)) == 0 ? 1 : 0;  // 1
```
<br/>

### [**홀짝에 따라 다른 값 반환하기**](https://school.programmers.co.kr/learn/courses/30/lessons/181935)

[**Boolean Logical Operators**](https://docs.oracle.com/javase/specs/jls/se8/html/jls-15.html#jls-15.22.2)

```java
// n이 짝수이면서 i도 짝수인 경우
// 모두 0일 경우에만 true
((n % 2) | (i % 2)) == 0

// n이 홀수이면서 i도 홀수인 경우
// 모두 1일 경우에만 true
((n % 2) & (i % 2)) == 1
```
<br/>

### [**조건 문자열**](https://school.programmers.co.kr/learn/courses/30/lessons/181934)

[**swtich**](https://docs.oracle.com/en/java/javase/17/language/switch-expressions.html)

```java
// Ternary operator expressions in switch expressions
boolean result = switch (ineq) {
    case ">" -> "=".equals(eq) ? n >= m : n > m;
    case "<" -> "=".equals(eq) ? n <= m : n < m;
    default -> throw new IllegalStateException("Unexpected value: " + ineq);
};
return result ? 1: 0;
```
<br/>

### [**flag에 따라 다른 값 반환하기**](https://school.programmers.co.kr/learn/courses/30/lessons/181933)

[**ternary operator**](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op2.html)

```java
// flag가 true면 a + b를 false면 a -b를 반환
flag ? a + b : a - b;
```