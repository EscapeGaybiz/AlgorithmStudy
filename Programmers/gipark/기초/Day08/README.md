## Day08
### 노션에서 확인
▶️[**click**](https://gipark181.notion.site/Day08-2024-07-28-9c5ec62229f54b3cb7d112d5afddda36?pvs=4)
<br/>
<hr/>

### [**간단한 논리 연산**](https://school.programmers.co.kr/learn/courses/30/lessons/181917)

[**logical operators**](https://docs.oracle.com/cd/E19253-01/817-6223/chp-typeopexpr-6/index.html)

[**bitwise operators**](https://docs.oracle.com/cd/E19253-01/817-6223/chp-typeopexpr-7/index.html)

```java
// 비트연산자: |, &
// 논리연산자 ||, &&

// a | b 와 a & b
// a의 true,false 결과와 상관없이 b의 true, false인지 연산o
 
// a || b :: a가 true이면 b는 연산x
// a && b :: a가 false이면 b는 연산x
 
// -> a | b 와 a || b 결과 값은 같음
// -> a & b 와 a && b 결과 값은 같음
 
// 차이점은
// |, &는 비트단위로 연산을 하고,
// ||, &&는 boolean 값에 대해 논리 연산을 수행
```
<br/>

### [**주사위 게임 3**](https://school.programmers.co.kr/learn/courses/30/lessons/181916)

[**Arrays.sort**](https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html#sort-int:A-)

```java
// a, b, c, d를 int[] 배열로 담고, 정렬하는게 핵심!!
// 정렬해서 경우의 수를 단순화 시킴
int[] arr = new int[]{a, b, c, d};
Arrays.sort(arr);

/**
 * 경우의 수
 *
 * abcd
 * ====
 * ===-
 * -===
 * ==--
 * ==--
 * -==-
 * --==
 * ----
 */
```
<br/>

### [**글자 이어 붙여 문자열 만들기**](https://school.programmers.co.kr/learn/courses/30/lessons/181915)

[**charAt**](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#charAt-int-)

```java
// String 문자열 안에서 i번째 인덱스의 char 문자를 반환
str.charAt(i);
```
<br/>

### [**9로 나눈 나머지**](https://school.programmers.co.kr/learn/courses/30/lessons/181914)

[**BigInteger**](https://docs.oracle.com/javase/8/docs/api/java/math/BigInteger.html)

```java
// solution1
// 무한대 정수 BigInter
BigIntger bNum = new BigInteger("192481958");

// 나누기
bNum.mod(BigInteger.valueOf(9));

// solution2
// 원래 수를 9로 나눈 나머지 == 모든 자리수를 더한 후 9로 나눈 나머지
123456 % 9 == (1 + 2 + 3 + 4 + 5 + 6) % 9
```
<br/>

### [**문자열 여러 번 뒤집기**](https://school.programmers.co.kr/learn/courses/30/lessons/181913)

[**StringBuilder**](https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html)

```java
StringBuilder sb = new StringBuilder(my_string);

// String substring(int start, int end)
// 이 시퀀스에 있는 s부터 e까지의 새 문자열을 반환
sb.substring(s, e + 1);

// 이 문자 시퀀스를 역순으로 바꿈
sb.reverse();

// s부터 e + 1까지의 문자열에 있는 문자를 x 문자열의 문자로 바꿈
sb.replace(s, e + 1, x);
```