## Day03
### 노션에서 확인
▶️[**click**](https://gipark181.notion.site/Day03-2024-08-18-e24196926af1445598b2985b078bda84?pvs=4)
<br/>
<hr/>

### [**나머지 구하기**](https://school.programmers.co.kr/learn/courses/30/lessons/120810)

```java
return num1 % num2;
```
<br/>

### [**중앙값 구하기**](https://school.programmers.co.kr/learn/courses/30/lessons/120811)

```java
Arrays.sort(array);
return array[array.length >> 1];
```
<br/>

### [**최빈값 구하기**](https://school.programmers.co.kr/learn/courses/30/lessons/120812)

```java
// array 배열이 한개인 경우를 위해 0번째를 처음 생성시 저장해 놓음
int answer = array[0];
int maxCnt = 0;
int cnt = 0;
boolean isDuplicate = false;

Arrays.sort(array);
for (int i = 1; i < array.length; i++) {
    if (array[i - 1] == array[i]) {
        cnt++;
        if (maxCnt < cnt) {
            maxCnt = cnt;
            answer = array[i];
            isDuplicate = false;
        } else if (maxCnt == cnt) {
            isDuplicate = true;
        }
    } else {
        cnt = 0;
    }
}

if (isDuplicate || (maxCnt == 0 && array.length != 1)) {
    answer = -1;
}
return answer;
```
<br/>

### [**짝수는 싫어요**](https://school.programmers.co.kr/learn/courses/30/lessons/120813)

```java
// ((짝수 + 1) / 2) 하거나 (짝수 / 2) 하거나 값이 같음.
// (홀수 + 1) / 2 할때 같음.
int[] answer = new int[(n + 1) / 2];

// 홀수 구하기
i % 2 == 1
```