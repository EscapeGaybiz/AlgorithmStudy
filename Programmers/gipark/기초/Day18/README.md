## Day18
### 노션에서 확인
▶️[**click**](https://gipark181.notion.site/Day18-2024-08-02-5745631505ef4c5da5b6baf14fc01670?pvs=4)
<br/>
<hr/>

### [**x 사이의 개수**](https://school.programmers.co.kr/learn/courses/30/lessons/181867)

[**split**](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#split-java.lang.String-int-)

```java
// Solution1
// toCharArray로 문자 하나하나 반복하며, 'x'가 아닌 개수 카운트
for (char c : myString.toCharArray()) {
    if (c != 'x') {
        cnt++;
        continue;
    }
    list.add(cnt);
    cnt = 0;
}
list.add(cnt);

// Solution2
// myString 문자열을 split하여 분할한 문자들을 list에 담기
for (String str : myString.split("x", -1)) {
    list.add(str.length());
}

// split 함수
String[] split(String regex, int limit)

// limit > 0
// 패턴이 최대 limit - 1회 적용되고,
// 배열의 길이는 limit 보다 크지 않으며,
// 배열의 마지막 항목에는 일치하는 마지막 구분 기호 너머의 모든 입력이 포함되어 반환

// limit == 0
// 가능한 한 여러 번 적용되고,
// 배열의 길이는 임이의 길이를 가질 수 있으며,
// 뒤에 오는 빈 문자열은 버려져서 반환

// limit < 0
// 가능한 한 많은 횟수만큼 적용되며,
// 배열의 길이는 임의의 길이를 가질 수 있음
```
<br/>

### [**문자열 잘라서 정렬하기**](https://school.programmers.co.kr/learn/courses/30/lessons/181866)

[**split**](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#split-java.lang.String-)

```java
// myString 문자열을 'x'로 자른 문자열 배열을 반환하여 반복
for (String str : myString.split("x")) {
		// str 문자열이 ""(공백)이 아니면 list에 추
    if (!"".equals(str))
        list.add(str);
}

// list를 사전 순으로 정렬 후 String[] 배열로 변환하여 반환
list.stream().sorted().toArray(String[]::new);
```
<br/>

### [**간단한 식 계산하기**](https://school.programmers.co.kr/learn/courses/30/lessons/181865)

[**split**](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#split-java.lang.String-)

[**Integer.parseInt**](https://docs.oracle.com/javase/8/docs/api/java/lang/Integer.html#parseInt-java.lang.String-)

```java
// '\\s+': 1개 이상의 공백문자를 기준으로 분할하여 문자열 배열을 반
binomial.split("\\s+");

// 문자를 숫자로 변환
int a = Integer.parseInt(strArr[0]);
int b = Integer.parseInt(strArr[2]);

// switch로 해당 연산자 문자를 찾아 그에 맞게 연산한 값을 반환
return
      switch (strArr[1]) {
          case "+" -> a + b;
          case "-" -> a - b;
          case "*" -> a * b;
          default -> throw new IllegalArgumentException("Unexpected value: " + strArr[1]);
      };
```
<br/>

### [**문자열 바꿔서 찾기**](https://school.programmers.co.kr/learn/courses/30/lessons/181864)

[**contains**](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#contains-java.lang.CharSequence-)

```java
// 'A'를 'B'로 바꾸는 방법
char c = 'A';
(char) (c + 1);    // 'A' + 1 == 66 == 'B'

// 'B'를 'A'로 바꾸는 방법
char c = 'B';
(char) (c - 1);    // 'B' - 1 == 65 == 'A'

// 이 str 문자열에 pat 문자열이 포함한다면 true, 포함하지 않는다면 false를 반환
str.contains(pat)
```
<br/>

### [**rny_string**](https://school.programmers.co.kr/learn/courses/30/lessons/181863)

[**replace**](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#replace-java.lang.CharSequence-java.lang.CharSequence-)

```java
// rny_string 문자열 안의 "m" 문자열을 "rn" 문자열로 변환한 문자열을 반환
rny_string.replace("m", "rn");
```