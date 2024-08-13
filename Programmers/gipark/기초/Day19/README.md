## Day19
### 노션에서 확인
▶️[**click**](https://gipark181.notion.site/Day19-2024-08-04-f90ea4ba65f14a34b729a97e63f461ba?pvs=4)
<br/>
<hr/>

### [**세 개의 구분자**](https://school.programmers.co.kr/learn/courses/30/lessons/181862)

[**split**](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#split-java.lang.String-)

```java
// a|b|c의 연속된 문자로 분할한 새 문자열을 반복하며, 빈 문자열이 아닌 경우 list에 담기
for (String str : myStr.split("[abc]+")) {
    if (!"".equals(str))
        list.add(str);
}

// list가 빈 값인지 체크 후
// 빈 값이면 "EMPTY" 문자열 배열을, 빈 값이 아니라면 list를 문자열 배열로 변환하여 반
list.isEmpty() ? new String[]{"EMPTY"} : list.toArray(new String[0]);

/* 기타 유용한 정규 표현식 */
// '[]': [] 안의 문자중 하나와 일치 (예, [abc]는 'a', 'b', 'c' 중 하나와 일치)

/* 반복을 나타내는 정규 표현식 */ 
// '+': 1번 이상 반복 (a+는 a가 1번 이상 반복)
```
<br/>

### [**배열의 원소만큼 추가하기**](https://school.programmers.co.kr/learn/courses/30/lessons/181861)

[**Arrays.fill**](https://docs.oracle.com/en%2Fjava%2Fjavase%2F11%2Fdocs%2Fapi%2F%2F/java.base/java/util/Arrays.html#fill(int%5B%5D,int,int,int))

```java
// Solution1
// 2중 for loop 사용
// arr 배열을 반복하여 요소를 찾고 해당 요소만큼 반복하여 list에 추가
for (int n : arr) {
    for (int i = 0; i < n; i++) {
        list.add(n);
    }
}

// Solution2
// arr 배열을 반복하여 새롭게 만들 배열의 크기를 정함
for (int i = 0; i < arr.length; i++) {
    totalCount += arr[i];
}

// 정한 크기만큼 answer 배열을 초기화
answer = new int[totalCount];
// arr 배열을 반복하여 요소를 찾고 Arrays.fill 함수를 사용하여 지정된 범위만큼 값을 추가
for (int n : arr) {
    Arrays.fill(answer, idx, idx + n, n);
    idx += n;
}

// Arrays.fill
// 지정된 배열의 지정된 범위(from[포함]부터 to[제외])의 각 요소에 지정된 값(val)을 할당
// 만약 from == to 라면, 빈 값이 채워짐
void fill(int[] a, int fromIndex, int toIndex, int val)
```
<br/>

### [**빈 배열에 추가, 삭제하기**](https://school.programmers.co.kr/learn/courses/30/lessons/181860)

[**Stack**](https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html)

[**ArrayList**](https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html)

```java
/**
 * switch는 boolean 타입을 사용할 수 없음.
 * 정수형, 문자열, 열거형, 문자형 등의 타입 지원
 */

// Solution1
// Stack 사용
for (int i = 0; i < arr.length; i++) {
    if (flag[i]) {
        for (int j = 0; j < arr[i] * 2; j++) {
            stk.push(arr[i]);
        }
    } else {
        for (int j = 0; j < arr[i]; j++) {
            stk.pop();
        }
    }
}

// Solution2
// ArrayList 사용
for (int i = 0; i < arr.length; i++) {
    switch (String.valueOf(flag[i])) {
        case "true" -> {
            for (int j = 0; j < arr[i] * 2; j++) {
                result.add(arr[i]);
            }
        }
        case "false" -> {
            for (int j = 0; j < arr[i]; j++) {
                result.remove(result.size() - 1);
            }
        }
    }
}
```
<br/>

### [**배열 만들기 6**](https://school.programmers.co.kr/learn/courses/30/lessons/181859)

[**Stack**](https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html)

```java
// Stack 사용
for (int i = 0; i < arr.length; i++) {
		// stk가 비어있지 않고 stk의 맨 위의 값이 arr[i]과 같다면 맨 위의 값을 제거
    if (!stk.isEmpty() && stk.peek() == arr[i])
        stk.pop();
    // 아니라면, stk 맨 위에 arr[i] 추가
    else
        stk.push(arr[i]);
}

// stk.peek() 사용시 stk.size()가 0이라면 EmptyStackException 발생
// 따라서 stk.isEmpty()를 사용하여 elementCount가 0인지 확인 후 사용해야함
```
<br/>

### [**무작위로 K개의 수 뽑기**](https://school.programmers.co.kr/learn/courses/30/lessons/181858)

[**contains**](https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html#contains-java.lang.Object-)

[**Set**](https://docs.oracle.com/javase/8/docs/api/java/util/Set.html)

```java
for (int n : arr) {
		// answer의 length는 넘기면 안되기때문에 반복문 종료
    if (list.size() == k)
        break;

	  // list 요소 중 n이 포함되있지 않다면, list에 n추가
    if (!list.contains(n)) {
        list.add(n);
    }
}

// list.size()가 k보다 작다면, answer의 나머지 요소에 -1 추가하기 위함
for (int i = list.size(); i < k; i++) {
    list.add(-1);
}

/* ======================================================== */
// Set을 사용하여 중복체크를 할 수 있음
Set<Integer> set = new HashSet<>();

// Set의 요소 중 n이 아직 없는 경우 Set에 추가
set.add(n);    // returns: add가 되었다면 true를 반환
```