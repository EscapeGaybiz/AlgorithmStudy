## Day09
### 노션에서 확인
▶️[**click**](https://gipark181.notion.site/Day09-2024-07-28-0579a75585724c7da077b50d16221816?pvs=4)
<br/>
<hr/>

### [**배열 만들기 5**](https://school.programmers.co.kr/learn/courses/30/lessons/181912)

```java
ArrayList<Integer> list = new ArrayList<>();

// str 문자열의 s부터 s + l까지의 새 문자열을 반환하여 Integer 객체로 변환
int tmp = Integer.parseInt(str.substring(s, s + l));

// tmp가 k보다 크면 list에 추가
if (k < tmp)
	list.add(tmp);
```
<br/>

### [**부분 문자열 이어 붙여 문자열 만들기**](https://school.programmers.co.kr/learn/courses/30/lessons/181911)

```java
// my_strings의 i번째 인덱스의 str문자열의 s부터 e + 1까지의 새 문자열을 반환
my_strings[i].substring(s, e + 1);
```
<br/>

### [**문자열의 뒤의 n글자**](https://school.programmers.co.kr/learn/courses/30/lessons/181910)

```java
// str 문자열의 마지막 부분에서 n개의 새 문자열을 반환
str.substring(str.length() - n);
```
<br/>

### [**접미사 배열**](https://school.programmers.co.kr/learn/courses/30/lessons/181909)

[**Arrays.sort**](https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html#sort-int:A-)

[**Collection.sort**](https://docs.oracle.com/javase/8/docs/api/java/util/Collections.html#sort-java.util.List-)

```java
// 사용 대상: 배열 (primitive types와 objects 배열 모두 사용 가능)
// 정렬 방식: QuickSort 알고리즘 사용 (Dual-Pivot Quicksort)
int[] arr = {5, 3, 1, 4, 2};
Arrays.sort(arr);

// 사용 대상: List 인터페이스를 구현한 컬렉션 (ex, ArrayList, LinkedList)
// 정렬 방식: MergeSort 알고리즘 사용 (Timesort)
List<Integer> list = new ArrayList<>(Arrays.asList(5, 3, 1, 4, 2));
Collections.sort(list);

// stream으로 정렬하는건 추가적인 오버헤드가 발생할 가능성이 있
list.stream().sorted().toArray(String[]::new);

/**
 * 배열이라면 Arrays.sort()
 * List라면 Collections.sort()
 */
 

/**
 *  Primitive 타입 종류
 *
 *  정수형 (integer types):
 *  byte: 8비트 정수. 범위: -128 ~ 127
 *  short: 16비트 정수. 범위: -32,768 ~ 32,767
 *  int: 32비트 정수. 범위: -2^31 ~ 2^31-1
 *  long: 64비트 정수. 범위: -2^63 ~ 2^63-1
 *
 *  부동 소수점형 (floating-point types):
 *  float: 32비트 IEEE 754 부동 소수점 숫자
 *  double: 64비트 IEEE 754 부동 소수점 숫자
 *
 *  문자형 (character type):
 *  char: 16비트 유니코드 문자. 범위: '\u0000' ~ '\uffff'
 *
 *  논리형 (boolean type):
 *  boolean: true 또는 false
 */
```
<br/>

### [**접미사인지 확인하기**](https://school.programmers.co.kr/learn/courses/30/lessons/181908)

[**endsWith**](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#endsWith-java.lang.String-)

```java
// str 문자열이 지정된 접미사로 끝나는지 확인
// boolean endsWith(String suffix) 
str.endsWith(is_suffix);

// str 문자열이 지정된 접두사로 시작하는지 확인
// boolean startsWith(String prefix)
str.startsWith(is_prefix);
```