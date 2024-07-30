## Day12
### 노션에서 확인
▶️[**click**](https://gipark181.notion.site/Day12-2024-07-30-4c0e60c8b0aa48a3a87dd348f42d8328?pvs=4)
<br/>
<hr/>

### [**리스트 자르기**](https://school.programmers.co.kr/learn/courses/30/lessons/181897)

```java
// 1. n에 따라 start, end를 지정해 주기

// 2. 배열의 크기는 end - start에서 간격(interval)를 나눈 값.
// But, end와 start가 같은 경우는 배열의 크기는 1이므로 (interval / interval)
answer = new int[(endIdx - startIdx + interval) / interval];
```
<br/>

### [**첫 번째로 나오는 음수**](https://school.programmers.co.kr/learn/courses/30/lessons/181896)

```java
// 1. num_list의 요소를 0번째 인덱스부터 마지막까지 반복
for (int i = 0; i < num_list.length; i++) {
		// 2. num_list의 i번째의 값이 0보다 작으면 반복문 빠져나오기
    if (num_list[i] < 0) {
        answer = i;
        break;
    }
}
```
<br/>

### [**배열 만들기 3**](https://school.programmers.co.kr/learn/courses/30/lessons/181895)

```java
// 1. intervals의 길이만큼 반복해주기
for (int i = 0; i < intervals.length; i++) {
		// intervarls[i][0]은 시작인덱스, intervals[i][1]은 마지막인덱스 (포함)
    for (int j = intervals[i][0]; j <= intervals[i][1]; j++) {
        result.add(arr[j]);
    }
}

// ArrayList<Integer>를 int[]로 바꾸는 방법
int[] answer = new int[result.size()];
for (int i = 0; i < result.size(); i++) {
    answer[i] = result.get(i);
}
```
<br/>

### [**2의 영역**](https://school.programmers.co.kr/learn/courses/30/lessons/181894)

```java
int min = arr.length - 1;
int max = 0;

// 1. arr 배열의 길이만큼 반복해주기
for (int i = 0; i < arr.length; i++) {
		// arr의 i번째 값이 2일 경우
    if (arr[i] == 2) {
		    // 처음 2의 값을 접했을 경우, min에 i값 담기
        if (i < min)
            min = i;
        max = i;    // 마지막 2의 인덱스를 담아주기 위해 값이 2일때마다 i를 넣어주기
    }
}

// 2. min부터 max까지 반복하면서 result에 해당 인덱스의 arr값 담아주기
for (int j = min; j <= max; j++) {
    result.add(arr[j]);
}

// 3. result가 빈 List가 아니라면 int[] 배열에 넣어주기
if (!result.isEmpty()) {
    answer = new int[result.size()];
    for (int i = 0; i < result.size(); i++) {
        answer[i] = result.get(i);
    }
    
// result가 빈 List라면, int[] 배열에 -1 넣어주기
} else {
    answer = new int[]{-1};
}
```
<br/>

### [**배열 조각하기**](https://school.programmers.co.kr/learn/courses/30/lessons/181893)

[**subList**](https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html#subList-int-int-)

[**clear**](https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html#clear--)

[**Arrays.copyOf**](https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html#copyOf-int:A-int-)

[**Arrays.copyOfRange**](https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html#copyOfRange-int:A-int-int-)

```java
// Solution1
ArrayList<Integer> list = new ArrayList<>();

// stream을 사용한 int[] arr을 ArrayList에 선언과 동시에 초기화 하기
ArrayList<Integer> result = Arrays.stream(arr)
        .boxed()
        .collect(Collectors.toCollection(ArrayList::new));

// ArrayList의 from(포함)부터 to(제외) 사이에 있는 부분의 view를 반환
// 값을 복사해서 반환이 아닌, list의 일부 부분을 참조하는 것
// 따라서, subList해서 보여진 값들을 삭제, 변경 등을 한다면 원래 List에도 적용됨
list.subList(fromIndex, toIndex)

// list의 모든 요소를 제거
// (subList해서 보여진 부분을 모두 제거)
list.subList(fromIndex, toIndex).clear();

/* ====================================================================== */
// Solution2
// arr 배열을 arr.length 길이 만큼의 새 배열로 복사하여 반환
int[] result = Arrays.copyOf(arr, arr.length);

// result 배열의 from부터 to 인덱스 까지 지정된 범위를 새 배열로 복사하여 반환
// 길이는 (to - from)
Arrays.copyOfRange(result, from, to);
```