## Day24
### 노션에서 확인
▶️[**click**](https://gipark181.notion.site/Day24-2024-08-09-317322920c314eeda25d21cd27af1a18?pvs=4)
<br/>
<hr/>

### [**커피 심부름**](https://school.programmers.co.kr/learn/courses/30/lessons/181837)

[**HashMap**](https://docs.oracle.com/en%2Fjava%2Fjavase%2F11%2Fdocs%2Fapi%2F%2F/java.base/java/util/HashMap.html)

[**keySet**](https://docs.oracle.com/en%2Fjava%2Fjavase%2F11%2Fdocs%2Fapi%2F%2F/java.base/java/util/HashMap.html#keySet())

[**of**](https://docs.oracle.com/javase/9/docs/api/java/util/Map.html#of-K-V-K-V-)

[**ofEntries**](https://docs.oracle.com/javase/9/docs/api/java/util/Map.html#ofEntries-java.util.Map.Entry...-)

```java
// HashMap을 이용하여, 메뉴판을 생성
Map<String, Integer> menuList = new HashMap<>(Map.of(
        "americano", 4500,
        "cafelatte", 5000
));
int answer = 0;

// 주문내역(order)을 반복하여, 주문한 상품들을 하나씩 찾는다
for (String item : order) {
		// 메뉴판(menuList)에 있는 menu들을 하나씩 찾는다
    for (String menu : menuList.keySet()) {
		    // 아무거나라면, 주문상품은 iceamericano로 저장
        if ("anything".equals(item))
            item = "iceamericano";
        // 주문한 상품(item)이 menu에 있다면, 계산서(answer)에 가격을 추가
        if (item.contains(menu))
            answer += menuList.get(menu);
    }
}

/**
 * Map.of 사용시 주의할 점
 * of 함수는 한번에 최대 10개 까지만 초기화 할 수 있음
 * 이유는... 그냥 그렇게 만들어져 있음. (10개의 인자까지 받도록..)
 *
 * 10개 이상일 시에는, Map.ofEntries 함수를 사용.
 */
 // Map.ofEntries
 Map<Integer, String> map = Map.ofEntries(
				 entry(1, "a"),
				 entry(2, "b"),
				 entry(3, "c"),
				 ...
				 entry(13, "m"),
				 entry(14, "n"),
				 ...
				 entry(26, "z"));
```
<br/>

### [**그림 확대**](https://school.programmers.co.kr/learn/courses/30/lessons/181836)

[**setLength**](https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html#setLength-int-)

```java
// picture 문자열 배열을 반복하여 각 문자열 요소들을 찾기
for (String pic : picture) {
		// StringBuilder를 새로운 객체를 생성하지않고, 초기화 시키는 방법
		// StringBuilder의 길이를 0으로 하여, StringBuilder의 내용을 비우기
    sb.setLength(0);
    // 문자열을 문자 배열로 만들고 그 문자 배열을 반복하여 문자 하나씩 찾기
    for (char c : pic.toCharArray()) {
		    // k만큼 반복하여 해당 문자를 추가하기
        for (int i = 0; i < k; i++) {
            sb.append(c);
        }
    }
    // k만큼 반복하여 만들어진 문자열을 list에 추가하기
    for (int i = 0; i < k; i++) {
        list.add(sb.toString());
    }
}

// 만들어진 list를 String[] 문자열 배열 타입으로 변환
// list의 각 요소를 배열에 복사하여 새로운 배열로 반환
return list.toArray(new String[0]);
```
<br/>

### [**조건에 맞게 수열 변환하기 3**](https://school.programmers.co.kr/learn/courses/30/lessons/181835)

```java
// answer 배열의 길이만큼 반복
for (int i = 0; i < answer.length; i++) {
		// k가 홀수라면, arr의 i 번째 인덱스의 요소에 k를 곱하기
    if (k % 2 != 0)
        answer[i] = arr[i] * k;
    // k가 홀수가 아니라면, arr의 i 번째 인덱스의 요소에 k를 더하기
    else
        answer[i] = arr[i] + k;
}
```
<br/>

### [**l로 만들기**](https://school.programmers.co.kr/learn/courses/30/lessons/181834)

```java
// Solution1
// myString 문자열 배열을 반복하며, 각 요소의 문자가 'l'보다 작다면 "l"로 변환하여 sb에 넣기
// ascii code -> "a": 97, "l": 108
for (char c : myString.toCharArray()) {
    sb.append(c < 'l' ? "l" : c);
}

// Solution2
// 'l'부터 'z'까지의 문자를 제외한 모든 값을 l로 바꾸기
myString.replaceAll("[^l-z]", "l");
```
<br/>

### [**특별한 이차원 배열 1**](https://school.programmers.co.kr/learn/courses/30/lessons/181833)

```java
// 주어진 n크기만큼 2차원 행렬을 생성 및 초기화
// 이렇게 크기만 지정해서 생성하면, 모든 요소에 0이 들어가게 됨
int[][] answer = new int[n][n];

// int 형의 이차원 배열(answer)의 길이만큼 반복하며 i,i 행렬에 1을 넣기.
for (int i = 0; i < answer.length; i++) {
    answer[i][i] = 1;
}
```