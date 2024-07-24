## Day07
### 노션에서 확인
▶️[**click**](https://gipark181.notion.site/Day07-2024-07-24-a02af919ddd840e588af434871f36917?pvs=4)
<br/>
<hr/>

### [**수열과 구간 쿼리 4**](https://school.programmers.co.kr/learn/courses/30/lessons/181922)

**Multidimensional Array**

```java
// 2차원 배열 선언과 초기화
// 1번
int[][] arr = new int[2][3];  // 2행 3열
arr[0][0] = 1;
arr[0][1] = 2;
arr[0][2] = 3;
arr[1][0] = 4;
arr[1][1] = 5;
arr[1][2] = 6;

// 2번
int[][] arr = {
	{1, 2, 3},
	{4, 5, 6}
}

// 3번
int[][] arr = new int[2][];
arr[0] = new int[]{1, 2, 3};
arr[1] = new int[]{4, 5, 6};

// 4번 - 가변 배열(jagged array) 
// 각 행이 서로 다른 길이를 가질 수 있는 배열
int[][] arr = new int[3][];
arr[0] = new int[]{1, 2};
arr[1] = new int[]{3, 4, 5};
arr[2] = new int[]{6, 7, 8, 9};

// 5번 - 배열초기화 방법
int[][] arr = new int[3][];
arr[0] = new int[2]{1, 2};  // JAVA에서는 크기를 지정하고 동시에 초기화 하는 것은 불가능

// 5-1번
arr[0] = new int[]{1, 2};
// 5-2번
arr[0] = new int[2];
arr[0][0] = 1;
arr[0][1] = 2;

/* =========================================================== */
// 정수 i가 k의 배수인지
i % k == 0
```
<br/>

### [**배열 만들기 2**](https://school.programmers.co.kr/learn/courses/30/lessons/181921)

[**ArrayList**](https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html)

[**stream.mapToInt**](https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html#mapToInt-java.util.function.ToIntFunction-)

```java
// 크기를 조정할 수 있는 List 인터페이스를 구현한 클래스
ArrayList<Integer> list = new ArrayList<>();

// 요소를 추가
list.add(E e);

// 특정 요소 제거
list.remove(Object o);

// 특정 인덱스의 요소를 반환
list.get(int index);

// 특정 인덱스의 요소를 변경
list.set(int index, E element);

// 리스트의 크기를 반환
list.size();

// 모든 요소를 제거
list.clear();

/* =========================================================== */
// ArrayList<Integer> list를 int[]로 변환 방법
list.stream().mapToInt(Integer::intValue).toArray();

// 1 - ArrayList에서 stream을 생성
list.stream()

// 2 - stream의 각 요소를 매핑하여 IntStream으로 변환
// ★Integer::intValue는 Integer 객체의 기본형 int로 변환하는 메서드 참조★
// 메서드 참조란? 메서드를 실행하거나 호출하는 것이 아닌 메서드를 가리키는 참조를 제공하는 것
list.stream().mapToInt(Integer::intValue)

// 3 - IntStream의 요소들을 int 배열로 수집하여 반환
// 앞서 mapToInt(Integer::intValue)에서 참조되었던, Integer객체의 intValue 함수가 실행되어 int 배열로 반환되는 것
list.stream().mapToInt(Integer::intValue).toArray()

/* =========================================================== */
// 숫자를 문자로 변환 후, 5와 0이 아닌 숫자가 왔을 경우 체크
// flag로 list에 추가해 줄지 안할지 검사
if (c != '5' && c != '0')
	flag = false;
```
<br/>

### [**카운트 업**](https://school.programmers.co.kr/learn/courses/30/lessons/181920)

**for**

[**IntStream.rangeClosed**](https://docs.oracle.com/javase/8/docs/api/java/util/stream/IntStream.html#rangeClosed-int-int-)

```java
// 각 숫자 포함 사이 값 3 ~ 10 (8개)
int start_num = 3;
int end_num = 10;

// 10 - 3 = 7 -> 7 + 1 = 8
int[] answer = new int[end_num - start_num + 1];

/**
 * for문을 안쓰고 아래와 같이 stream으로 쓸 경우
 * 속도 차이가 10배 ~ 20배 가량 차이 남
 * for문 >>>> stream
 */
// start이상에서 end이하까지 1단계씩 순차적으로 정렬된 IntStream을 반환
IntStream.rangeClosed(start, end).toArray();
```

### [**콜라츠 수열 만들기**](https://school.programmers.co.kr/learn/courses/30/lessons/181919)

[**ternary operator**](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op2.html)

[**do-while**](https://docs.oracle.com/cd/F26413_51/books/eScript/c-Do-While-Statement-ag1078808.html)

```java
// while 조건을 검사하기 전 한번이상 루프 실행됨
// n이 처음에 1이여도 무조건 한번은 실행시키기 위해 do-while 반복사용

// 조건: n != 1
do {
    n = (n % 2 == 0) ? n / 2 : 3 * n + 1;
    result.add(n);
} while (n != 1);
```
<br/>

### [**배열 만들기 4**](https://school.programmers.co.kr/learn/courses/30/lessons/181918)

[**ArrayList**](https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html)

[**Stack**](https://docs.oracle.com/javase/8/docs/api/index.html?java/util/Stack.html)

```java
// ArrayList
ArrayList<Integer> stk = new ArrayList<>();

// ArrayList에서 특정 위치에 있는 요소를 반환
stk.get(i);

// ArrayList에서 마지막 요소를 가져올때
stk.get(stk.size() - 1);
stk.getLast();  // JDK 21이상

// ArrayList에서 마지막 요소를 제거할때
stk.remove(stk.size() - 1);
stk.removeLast();  // JDK 21이상

// ArrayList가 비어있는지 확인할때
stk.isEmpty();

/* =========================================================== */
// Stack (LIFO 자료구조)
Stack<Integer> stk = new Stack<>();

// Stack의 맨 위에 밀어 넣기
stk.push(item);

// Stack의 맨 위에 있는 객체를 제거하기
stk.pop();

// Stack의 맨 위에 있는 객체 확인하기
stk.peek();

// Stack이 비어있는지 확인할때
stk.empty();
```