## Day05
### 노션에서 확인
▶️[**click**](https://gipark181.notion.site/Day05-2024-07-23-0ea27ca95c724d4fbe405f8fbdce2036?pvs=4)
<br/>
<hr/>

### [**코드 처리하기**](https://school.programmers.co.kr/learn/courses/30/lessons/181932)

[**StringBuilder**](https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html)

```java
// A mutable sequence of characters
StringBuilder sb = new StringBuilder();

// sb의 길이(문자 수)를 반환
sb.length();

// 이 시퀀스의 데이터를 나타내는 문자열을 반
sb.toString();

// JDK 15 이상
// sb의 길이가 0이면 true, 아니라면 false를 반환
sb.isEmpty();  // return this.length() == 0

// 모두 0인 경우
(mode | (i % 2)) == 0
// 모두 1인 경우
(mode & (i % 2)) == 1
```
<br/>

### [**등차수열의 특정한 항만 더하기**](https://school.programmers.co.kr/learn/courses/30/lessons/181931)

[**등차수열**](https://namu.wiki/w/%EB%93%B1%EC%B0%A8%EC%88%98%EC%97%B4)

```java
// 연속한 두 항의 차가 일정한 수열

// 등차수열 공식
a + (n - 1)d

/* ========================== */
// flag를 사용하여 실행시키거나 실행시키지 않거나의 제어역할을 할 수 있음
boolean flag = true;
if (flag) {
}

/* ========================== */
// 두 표현식 모두 컴파일러가 동일하게 처리
sum = sum + i;  // 초보자용
sum += i;  // 간결하고 가독성이 더 좋음
```
<br/>

### [**주사위 게임 2**](https://school.programmers.co.kr/learn/courses/30/lessons/181930)

[**if**](https://docs.oracle.com/en/database/other-databases/essbase/21/esscq/if.html?source=%3Aow%3Ams%3Apt%3A%3A)

[**Math.pow**](https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#pow-double-double-)

```java
if (a == b && b == c) {  // a,b,c 모두 같은 경우
    
} else if (a == b || a == c || b == c) {  // a,b,c 중 2개가 같은 경우
   
} else {  // 모두 다른 경우

}

// a를 b제곱한 값 반환
Math.pow(a, b)
```
<br/>

### [**원소들의 곱과 합**](https://school.programmers.co.kr/learn/courses/30/lessons/181929)

[**enhanced for**](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/for.html)

```java
// 기본 for문
for (int i = 0; i < num_list.size(); i++) {}

// 향상된 for문 (foreach)
// int[] num_list;
for (int i : num_list) {}

/**
 * Enhanced for loop
 * 장점
 * 1. 가독성이 좋고, 간편함
 * 2. ArrayIndexOutOfBoundsException를 예방할 수 있음
 *
 * 단점
 * 1. 인덱스를 사용하여 접근 불가
 * 2. 읽기 전용이므로, 컬렉션의 경우 변경 불가
 */
 
// 단점2 예제
List<Integer> numList = new ArrayList<>();
numList.add(1);
numList.add(2);
numList.add(3);

for (int num : numList) {
    if (num == 2) {
        numList.remove(Integer.valueOf(num)); // 요소를 제거하려고 하면 예외 발생
    }
}

```
<br/>

### [**이어 붙인 수**](https://school.programmers.co.kr/learn/courses/30/lessons/181928)

[**StringBuilder**](https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html)

[**Integer**](https://docs.oracle.com/javase/8/docs/api/java/lang/Integer.html)

```java
StringBuilder sb = new StringBuilder();

// 이 시퀀스에 해당 문자열 표현을 추가
sb.append(n);

/* =================================== */
StringBuilder even = new StringBuilder();
StringBuilder odd = new StringBuilder();

// 삼항연산자를 이용해 객체를 선택하고 해당 객체의 메서드를 호출 할 수 있음
(num % 2 == 0 ? even : odd).append(num);

/* =================================== */
// 문자열 argument를 부호가 있는 10진수로 만
Integer.parseInt(str)
```