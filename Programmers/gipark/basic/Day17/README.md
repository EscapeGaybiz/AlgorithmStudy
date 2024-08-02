## Day17
### 노션에서 확인
▶️[**click**](https://gipark181.notion.site/Day17-2024-08-02-52f08756575d4582a26bfc64b894e856?pvs=4)
<br/>
<hr/>

### [**특정 문자열로 끝나는 가장 긴 부분 문자열 찾기**](https://school.programmers.co.kr/learn/courses/30/lessons/181872)

[**substring**](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#substring-int-int-)

[**lastIndexOf**](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#lastIndexOf-java.lang.String-)

```java
// myString 문자열 내에서 지정된 pat 문자열이 마지막에 발생한 인덱스를 반환
myString.lastIndexOf(pat);

// myString 문자열의 0 번째부터 pat이 있는 마지막인덱스 + pat 길이까지를 자른 새 문자열을 반환
// pat 포함이라 pat길이까지 더해줌
myString.substring(0, myString.lastIndexOf(pat) + pat.length());
```
<br/>

### [**문자열이 몇 번 등장하는지 세기**](https://school.programmers.co.kr/learn/courses/30/lessons/181871)

[**indexOf**](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#indexOf-java.lang.String-int-)

```java
// idx 인덱스에서 시작하여 이 myString 문자열 내에서 지정된 부분 문자열 pat이 처음 발생한 인덱스를 반환
idx = myString.indexOf(pat, idx);

// idx를 +1씩 증가시키면서 idx가 -1이면 더 이상 pat이 없다는 뜻이므로 반복문 빠져나오기
while (idx != -1) {
    idx = myString.indexOf(pat, idx);
    if (idx != -1) {
        answer++;
        idx++;
    }
}
```
<br/>

### [**ad 제거하기**](https://school.programmers.co.kr/learn/courses/30/lessons/181870)

[**contains**](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#contains-java.lang.CharSequence-)

```java
// str 문자열에 ad가 포함되었는지
str.contains("ad")

/* List를 String[] 배열로 변환하는 방법 */
// 1번 - 일반적인 방법
list.toArray(new String[0]);

// 2번 - list의 크기를 알고 있을때
list.toArray(new String[list.size()]);

// 3번 - Stream API
list.stream().toArray(String[]::new);

// 4번 - for loop
String[] array = new String[list.size()];
for (int i = 0; i < list.size(); i++) {
    array[i] = list.get(i);
}

// 5번 - Arrays.copyOf
Arrays.copyOf(list.toArray(), list.size(), String[].class);
```
<br/>

### [**공백으로 구분하기 1**](https://school.programmers.co.kr/learn/courses/30/lessons/181869)

[**split**](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#split-java.lang.String-)

```java
// 지정된 정규식과 일치하는 문자열을 중심으로 my_string 문자열을 분할
my_string.split(" ");
```
<br/>

### [**공백으로 구분하기 2**](https://school.programmers.co.kr/learn/courses/30/lessons/181868)

[**trim**](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#trim--)

[**split**](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#split-java.lang.String-)

```java
// my_string 문자열의 앞, 뒤 공백 제거
my_string.trim()

// 공백문자를 의미하는 '\\s+' 표현으로 my_string 문자열을 분할
// '\\s'는 공백 문자를 의미
// '+'는 앞에 있는 '\\s' 패턴이 하나 이상 연속된 경우 일치시킨다는 의미
my_string.split("\\s+");

/* 공백 문자와 관련된 정규 표현식 */
// '\\s': 모든 공백 문자(스페이스, 탭, 줄 바꿈 등)
// '\\S': 공백 문자가 아닌 모든 문자
// '\\n': 줄 바꿈
// '\\t': 탭 문자

/* 반복을 나타내는 정규 표현식 */ 
// '*': 0번 이상 반복 (a*는 a가 0번 이상 반복)
// '+': 1번 이상 반복 (a+는 a가 1번 이상 반복)
// '?': 0번 또는 1번 (a?는 a가 0번 또는 1번)
// '{n}': 정확히 n번 반복 (a{3}는 aaa)
// '{n,}': 최소 n번 반복 (a{3,}는 aaa, aaaa, aaaaa, ... 등)
// '{n,m}': 최소 n번에서 최대 m번 반복 (a{2,4}는 aa, aaa, aaaa)

/* 기타 유용한 정규 표현식 */
// '.': 줄 바꿈 문자를 제외한 모든 문자
// '^': 문자열의 시작
// '$': 문자열의 끝
// '[]': [] 안의 문자중 하나와 일치 (예, [abc]는 'a', 'b', 'c' 중 하나와 일치)
// '[^]': [] 안의 문자를 제외한 모든 문자
```