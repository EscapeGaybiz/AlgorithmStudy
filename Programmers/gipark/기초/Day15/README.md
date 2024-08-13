## Day15
### 노션에서 확인
▶️[**click**](https://gipark181.notion.site/Day15-2024-08-01-dbe25fcb17c3429393a66cca8952a15e?pvs=4)
<br/>
<hr/>

### [**조건에 맞게 수열 변환하기 1**](https://school.programmers.co.kr/learn/courses/30/lessons/181882)

```java
// answer에 Arrays.copyOf로 arr 복사해서 담아두기
int[] answer = Arrays.copyOf(arr, arr.length);

// 조건에 맞게 arr 검사 후, answer에 연산하기
if (arr[i] >= 50 && arr[i] % 2 == 0)
    answer[i] /= 2;
else if (arr[i] < 50 && arr[i] % 2 == 1)
    answer[i] *= 2;
```
<br/>

### [**조건에 맞게 수열 변환하기 2**](https://school.programmers.co.kr/learn/courses/30/lessons/181881)

[**Arrays.equals**](https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html#equals-int:A-int:A-)

[**Arrays.deepEquals**](https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html#deepEquals-java.lang.Object:A-java.lang.Object:A-)

```java
// Arrays.equals
int[] array1 = {1, 2, 3};
int[] array2 = {1, 2, 3};
int[] array3 = {4, 5, 6};

// temp 배열과 arr 배열이 같은지 체크
// 두 배열에 동일한 요소가 같은 순서로 포함되어 있으면 두 배열은 동일하다고 판단
Arrays.equals(array1, array2); // true
Arrays.equals(array1, array3); // false

/* ==================================================================== */
// Arrays.deepEquals
int[][] array1 = {
    {1, 2, 3},
    {4, 5, 6}
};

int[][] array2 = {
    {1, 2, 3},
    {4, 5, 6}
};

int[][] array3 = {
    {1, 2, 3},
    {7, 8, 9}
};

// temp2 배열과 arr2 배열이 같은지 체크
// 다차원 배열의 깊숙한 요소까지 비교하므로, 다차원 배열일때 사용
Arrays.deepEquals(array1, array2); // true
Arrays.deepEquals(array1, array3); // false
```
<br/>

### [**1로 만들기**](https://school.programmers.co.kr/learn/courses/30/lessons/181880)

```java
// 1. num_list의 요소들을 반복
// 2. num이 1이 아닐 경우 1이 될때까지 무한 반복
// 2 - 1. 반복한번 할때마다 answer++
// 3. num이 짝수인 경우, 홀수인 경우에 따라 num 연산
for (int num : num_list) {
    while (num != 1) {
        if (num % 2 == 0)
            num /= 2;
        else
            num = (num - 1) / 2;

        answer++;
    }
}

// 홀수 일경우 연산부분인데, int는 소수점이 버려지기 때문에 num - 1 하지 않아도 값은 동일
(num - 1) / 2 == num / 2

// 따라서 위 while문을 아래처럼 변경할 수 있음
while (num != 1) {
		num /= 2;
		answer++;
}
```
<br/>

### [**길이에 따른 연산**](https://school.programmers.co.kr/learn/courses/30/lessons/181879)

```java
int length = num_list.length;

// num_list의 길이가 11이상이라면 각 요소를 더하기
if (length > 10) {
    answer += num;
// num_list의 길이가 10이하라면 각 요소를 곱하기
// 처음 초기화시 answer = 0이므로 0일 경우 1로 변경해주어야 
} else {
    if (answer == 0)
        answer++;
    answer *= num;
}
```
<br/>

### [**원하는 문자열 찾기**](https://school.programmers.co.kr/learn/courses/30/lessons/181878)

[**toUpperCase**](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#toUpperCase--)

[**toLowerCase**](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#toLowerCase--)

[**contains**](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#contains-java.lang.CharSequence-)

```java
// toUpperCase: 문자열의 모든 문자를 대문자로 변환
// toLowerCase: 문자열의 모든 문자를 소문자로 변환
// contains: 문자열에 지정된 문자 값의 시퀀스가 포함된 경우에 true 반환
myString.toUpperCase().contains(pat.toUpperCase()) ? 1 : 0;
```