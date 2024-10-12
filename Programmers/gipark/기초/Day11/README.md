## Day11
### 노션에서 확인
▶️[**click**](https://gipark181.notion.site/Day11-2024-07-29-34659ed6c0764aafbccf3bb761265154?pvs=4)
<br/>
<hr/>

### [**문자 개수 세기**](https://school.programmers.co.kr/learn/courses/30/lessons/181902)

[**Character.isUpperCase**](https://docs.oracle.com/javase/8/docs/api/java/lang/Character.html#isUpperCase-char-)

[**Character.isLowerCase**](https://docs.oracle.com/javase/8/docs/api/java/lang/Character.html#isLowerCase-char-)

```java
// 문자 c가 대문자인지 확인
Character.isUpperCase(c)

// 문자 c가 소문자인지 확인
Character.isLowerCase(c)

// 알파벳 A ~ Z는 26개

// ascii
// A:65 ~ Z:90
// a:97 ~ z:122
```
<br/>

### [**배열 만들기 1**](https://school.programmers.co.kr/learn/courses/30/lessons/181901)

**division operator**

```java
int n = 10;
int k = 3;

// '/' operator는 앞의 수를 뒤의 수로 나눈 몫을 반환
(n / k) == 3    // true

// n보다 작은 k의 배수를 찾으려면 k에 k를 반복해서 더해주면 된다. (곱셈의 원리)
```
<br/>

### [**글자 지우기**](https://school.programmers.co.kr/learn/courses/30/lessons/181900)

[**setCharAt**](https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html#setCharAt-int-char-)

[**replaceAll**](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#replaceAll-java.lang.String-java.lang.String-)

```java
StringBuilder sb = new StringBuilder(my_string);

// 이 시퀀스의 i번째 인덱스의 문자 시퀀스를 '0'으로 바꿈
sb.setCharAt(i, '0');

// 0으로 바꾼 이 시퀀스를 문자열로 변환 후 0을 모두 ""로 변환 (제거)
sb.toString().replaceAll("0", "");
```
<br/>

### [**카운트 다운**](https://school.programmers.co.kr/learn/courses/30/lessons/181899)

[**Comparator.reverseOrder**](https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html#reverseOrder--)

```java
// 입문.jeoniee.Section02. 1. 큰 수 출력하기.Solution
// 0부터 start_num - end_num 만큼 반복하면서 int[] answer에 넣기

// answer 배열을 내림차순으로 정렬
Arrays.sort(answer, Comparator.reverseOrder());

/* ==================================================== */
// Solution2
// 0부터 start_num - end_num 만큼 반복하면서 start_num - i를 int[] answer에 넣기

// 입문.jeoniee.Section02. 1. 큰 수 출력하기.Solution < Solution2
// 1번은 Dual-Pivot Quicksort를 쓰는 정렬 알고리즘이 동작하고,
// 2번은 for문 한번 돌며 바로 넣어주기때문에 Solution2가 훨씬 빠르다.
```
<br/>

### [**가까운 1 찾기**](https://school.programmers.co.kr/learn/courses/30/lessons/181898)

[**for**](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/for.html)

```java
// 주어진 idx가 int[] arr 보다 작을때만 반복문 실행
// if문 유효성 검사를 안해도 동일한 결과 값을 같지만, 코드의 안정성을 위해 유지
if (idx < arr.length) {
    for (int i = idx; i < arr.length; i++) {
        if (arr[i] == 1) {
            answer = i;
            break;
        }
    }
}

/**
 * for문 동작방식
 * 
 * 1. int i = idx 선언과 초기화
 * 2. i < arr.length 조건식이 참/거짓인지 체크
 * 3. for문 안의 로직 실행
 * 4. i++ 증감식 실행
 * 5. 2번(조건식)으로 돌아가서 체크 후 2 ~ 4 반복
 *
 */
```