## Day06
### 노션에서 확인
▶️[**click**](https://gipark181.notion.site/Day06-2024-07-24-1ec16c4899e545e5821768094075a53e?pvs=4)
<br/>
<hr/>

### [**마지막 두 원소**](https://school.programmers.co.kr/learn/courses/30/lessons/181927)

[**Arrays.copyOf**](https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html#copyOf-int:A-int-)

[**length**](https://docs.oracle.com/javase/specs/jls/se7/html/jls-10.html#jls-10.7)

```java
// int[] num_list

// length는 Array에 정의된 member(field)
// contains the number of components of the array.
int length = num_list.length;

// num_list를 복사하여 길이가 length + 1인 배열 생성하여 반환
int[] answer = Arrays.copyOf(num_list, length + 1);

/* Arrays.copyOf를 안쓴다면 for문으로 직접 넣어주기
int[] answer = new int[num_list.length + 1];
        
for (int i = 0; i < num_list.length; i++) {
    answer[i] = num_list[i];
}*/

num_list[length - 1]  // num_list의 마지막 원소
num_list[length - 2]  // num_list의 마지막 바로 전 원소

```
<br/>

### [**수 조작하기 1**](https://school.programmers.co.kr/learn/courses/30/lessons/181926)

[**toCharArray**](https://docs.oracle.com/javase%2F7%2Fdocs%2Fapi%2F/java/lang/String.html#toCharArray())

[**swtich**](https://docs.oracle.com/en/java/javase/17/language/switch-expressions.html)

```java
// str 문자열을 새로운 char 배열로 변환
str.toCharArray()

// Enhanced Swith Expressions
for (char ch : control.toCharArray()) {
    switch (ch) {
        case 'w' -> n += 1;
        case 's' -> n -= 1;
        case 'd' -> n += 10;
        case 'a' -> n -= 10;
    }
}
```
<br/>

### [**수 조작하기 2**](https://school.programmers.co.kr/learn/courses/30/lessons/181925)

[**StringBuilder**](https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html)

[**swtich**](https://docs.oracle.com/en/java/javase/17/language/switch-expressions.html)

```java
// numLog.length - 1 만큼 반복
// i번째와 i + 1번째의 요소의 차이를 비교하기 위해서, ArrayIndexOutOfBoundsException 에러 방지
for (int i = 0; i < numLog.length - 1; i++) {
    sb.append(
				    // 조작된 차이 값
            switch (numLog[i + 1] - numLog[i]) {
                case 1 -> 'w';
                case -1 -> 's';
                case 10 -> 'd';
                case -10 -> 'a';
                default -> "";
            });
}
```
<br/>

### [**수열과 구간 쿼리 3**](https://school.programmers.co.kr/learn/courses/30/lessons/181924)

[**swap**](https://en.wikipedia.org/wiki/Swap_(computer_programming))

```java
// swap 알고리즘
swap(int x, int y) {
	int temp = x;
	x = y;
	y = temp;
}
```
<br/>

### [**수열과 구간 쿼리 2**](https://school.programmers.co.kr/learn/courses/30/lessons/181923)

[**Math.min**](https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#min-int-int-)

```java
// 두 개의 값 중 더 작은 값을 반환
Math.min(a, b)

int[] answer = new int[queries.length];
int s, e, k = -1;

for (int i = 0; i < queries.length; i++) {
    s = queries[i][0];
    e = queries[i][1];
    k = queries[i][2];

    answer[i] = -1;
    for (int j = s; j <= e; j++) {
        if (k < arr[j]) {
		        // 처음 k보다 큰 arr[j]이 존재할경우에는 바로 저장
            if (answer[i] == -1)
                answer[i] = arr[j];
            // 처음이 아니라면, 저장된 answer[i]와 arr[j]를 더 작은 값 비교
            else 
                answer[i] = Math.min(answer[i], arr[j]);
        }
    }
}
return answer;
```