## Day21
### 노션에서 확인
▶️[**click**](https://gipark181.notion.site/Day21-2024-08-06-11549b7992fc4580b8087ebc3d8a65b3?pvs=4)
<br/>
<hr/>

### [**뒤에서 5등 위로**](https://school.programmers.co.kr/learn/courses/30/lessons/181852)

[**Arrays.sort**](https://docs.oracle.com/en%2Fjava%2Fjavase%2F11%2Fdocs%2Fapi%2F%2F/java.base/java/util/Arrays.html#sort(int%5B%5D))

[**Arrays.copyOfRange**](https://docs.oracle.com/en%2Fjava%2Fjavase%2F11%2Fdocs%2Fapi%2F%2F/java.base/java/util/Arrays.html#copyOfRange(int%5B%5D,int,int))

```java
// num_list 배열을 오름차순으로 정렬
Arrays.sort(num_list);

// num_list 배열을 5 번째 인덱스부터 num_list의 마지막 까지의 범위를 새 배열로 복사하여 반환
// 만약 num_list 길이보다 더 큰 범위를 지정했다면, 0으로 초기화되어 반환됨
Arrays.copyOfRange(num_list, 5, num_list.length);
```
<br/>

### [**전국 대회 선발 고사**](https://school.programmers.co.kr/learn/courses/30/lessons/181851)

[**Arrays.copyOf**](https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html#copyOf-int:A-int-)

[**Arrays.sort**](https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html#sort-int:A-)

```java
// tempRank 배열에 rank 배열을 복사
int[] tempRank = Arrays.copyOf(rank, rank.length);
int[] abc = new int[]{0, 0, 0};
int answer = 0;

// tempRank 길이만큼 반복하며, 참석 못하는 학생(false)을 0으로 넣기
for (int i = 0; i < tempRank.length; i++) {
    if (!attendance[i])
        tempRank[i] = 0;
}
// tempRank를 오름차순 정렬
Arrays.sort(tempRank);
// 배열 Stream을 사용하여 tempRank 배열에서 요소가 0이 아닌 값을 찾아 새 배열로 반환
tempRank = Arrays.stream(tempRank)
        .filter(x -> x != 0)
        .toArray();

// 기존 rank 배열을 반복하며, 1, 2, 3 순위의 인덱스를 a, b, c에 넣어주기
// a, b, c를 따로 변수로 선언하지 않고, 크기가 3인 abc 배열로 사용
for (int i = 0; i < rank.length; i++) {
    if (tempRank[0] == rank[i])
        abc[0] =  i;
    else if (tempRank[1] == rank[i])
        abc[1] = i;
    else if (tempRank[2] == rank[i])
        abc[2] = i;
}
```
<br/>

### [**정수 부분**](https://school.programmers.co.kr/learn/courses/30/lessons/181850)

[**Conversions**](https://docs.oracle.com/javase/specs/jls/se8/html/jls-5.html)

[**Math.floor**](https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#floor-double-)

```java
double flo;

// double 형을 int 형으로 캐스팅
// 소수점 아래의 값을 버리고, 소수점 위의 정수 값만을 취함 (단순 자르기)
(int) flo;

// double 형을 int 형으로 캐스팅
// flo 보다 작거나 같은 정수로 변환 후, int 형으로 변환
(int) Math.floor(flo);

// Math.floor는 음수 값을 처리할 때 유용
// Math.floor(-3.9)는 -4.0이고 (int)를 취하면, -4가 된다
```
<br/>

### [**문자열 정수의 합**](https://school.programmers.co.kr/learn/courses/30/lessons/181849)

[**Primitive Data Types**](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html)

```java
// char 문자를 int 숫자로 변경
// 1번
c - 48

// 2번
c - '0'

/* ======================== */

// String + int는 String이 나오는데, 왜 char - int는 int 형이 되는가??

// 1. char가 내부적으로 정수형으로 취급되기 때문
// 2. 산술 연산을 할때, char는 자동으로 int 형으로 승격되어 적용
// 3. int가 char보다 더 높은 우선순위를 가지기 때문

/**
 * 타입별 우선순위
 * 작은 타입 -> 큰 타입
 *
 * byte: 8비트 정수
 * short: 16비트 정수
 * char: 16비트 무부호 정수(Unicode)
 * int: 32비트 정수
 * long: 64비트 정수
 * float: 32비트 부동소수점
 * double: 64비트 부동소수점
 *
 * ==========================================
 * 
 * byte는 short, int, long, float, double로 변환될 수 있음
 * short는 int, long, float, double로 변환될 수 있음
 * char는 int, long, float, double로 변환될 수 있음
 * int는 long, float, double로 변환될 수 있음
 * long은 float, double로 변환될 수 있음
 * float는 double로 변환될 수 있음
 *
 */

```
<br/>

### [**문자열을 정수로 변환하기**](https://school.programmers.co.kr/learn/courses/30/lessons/181848)

[**Integer.parseInt**](https://docs.oracle.com/javase/8/docs/api/java/lang/Integer.html#parseInt-java.lang.String-)

[**BigInteger**](https://docs.oracle.com/javase/8/docs/api/java/math/BigInteger.html)

[**Math.pow**](https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#pow-double-double-)

```java
// String을 Integer로 캐스팅 방법
// 1번
Integer.parseInt(n_str);

// 2번
new BigInteger(n_str).intValue();

// 3번
// n_str 문자열의 길이 - 1을 변수로 선언
// (10의 n승 자리 수를 구하기 위함) -> 1의 자리는 10을 곱할 필요가 없으므로 -1
int length = n_str.length() - 1;

// n_str 문자열을 반복하며, 문자 c를 int로 캐스팅 후, 길이 만큼 10의 length 제곱을 곱해주기
for (char c : n_str.toCharArray()) {
    answer += (c - 48) * (int) Math.pow(10, length);
    length--;
}

// 예를 들어,
// n_str = "1234"
// n_str.toCharArray()는 ["1", "2", "3", "4"]이고
// 반복하면서 ("1" * 10의 3승) + ("2" * 10의 2승) + ("3" * 10의 1승) + ("4" * 10의 0승)
```