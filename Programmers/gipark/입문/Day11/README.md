## Day11
### 노션에서 확인
▶️[**click**](https://gipark181.notion.site/Day11-2024-08-23-90af6da5f5d94c40b6080b7c002c391c?pvs=4)
<br/>
<hr/>

### [**주사위의 개수**](https://school.programmers.co.kr/learn/courses/30/lessons/120845)

```java
// Solution1
// 부피 = 가로 * 세로 * 높이
// 1. box의 길이만큼 반복 (0: 가로, 1: 세로, 2: 높이)
// 1-1. 가로에 넣을 수 있는 개수 곱하기
// 1-2. 세로에 넣을 수 있는 개수 곱하기
// 1-3. 위로 넣을 수 있는 개수 곱하기

int answer = 1;

for (int i = 0; i < box.length; i++) {
    answer *= (box[i] / n);
}
return answer;
```

```java
// Solution2
// 1. 가로에 넣을 수 있는 개수 * 세로에 넣을 수 있는 개수 * 위로 넣을 수 있는 개수

(box[0] / n) * (box[1] / n) * (box[2] / n);
```
<br/>

### [**합성수 찾기**](https://school.programmers.co.kr/learn/courses/30/lessons/120846)

```java
// Solution1
// 1. n이하의 자연수를 찾기위해 n이하 번 반복
// 1-1. 반복하며 나온 수 이하만큼 또 반복하며, 
//      나온 수보다 작은 자연수들로 나눴을때 나머지가 0인 것들 개수 세기(약수 찾기)
// 1-2. 약수가 3개 이상인경우, 합성수 이므로 합성수 개수 증가

for (int i = 1; i <= n; i++) {
    int cnt = 0;
    for (int j = 1; j <= i; j++) {
        if (i % j == 0)
            cnt++;
    }
    if (cnt >= 3)
        answer++;
}
```
<br/>

### [**최댓값 만들기(1)**](https://school.programmers.co.kr/learn/courses/30/lessons/120847)

```java
// Solution1
// 1. numbers 배열을 오름차순 정렬
// 2. 마지막 수와 마지막 이전의 수를 곱한 값 반환

Arrays.sort(numbers);
return numbers[numbers.length - 1] * numbers[numbers.length - 2];
```

```java
// Solution2
// 1. numbers 배열길이만큼 반복
// 1-1. 반복하며 나온 수와 그 수의 뒤의 모든 인덱스들을 반복하면서 곱해주기
// 1-2. 곱해주면서, 현재 곱한 값이 가장 큰지 체크해서 max 값 지정하기

int max = 0;
int cur = 0;

for (int i = 0; i < numbers.length; i++) {
    for (int j = i + 1; j < numbers.length; j++) {
        cur = numbers[i] * numbers[j];
        if (max < cur) {
            max = cur;
        }
    }
}
return max;
```
<br/>

### [**팩토리얼**](https://school.programmers.co.kr/learn/courses/30/lessons/120848)

```java
// Solution1
// n은 factorial로 계산한 결과 값
// 1. factorial 함수를 만들기
// 1-1. 재귀를 사용하여, n == 1인 경우 1을 반환하도록 재귀탈출조건을 지정
// 2. 팩토리얼 한 값을 넣어줄 sum 변수를 만들고, n보다 작은 경우 반복하도록 함
// 2-1. 1부터 1씩 증가하며, 팩토리얼 함수를 호출하고, 그 값이 n보다 작은지 체크하여 answer 찾기
// 3. sum이 n과 같다면, 해당 answer을 반환
//    아니라면, 더 크다는 뜻이므로 answer - 1을 반환

public int solution(int n) {
    int answer = 0;
    int sum = 0;

    for (int i = 1; sum < n; i++) {
        answer = i;
        sum = factorial(i);
    }
    return sum == n ? answer : answer - 1;
}

private int factorial(int n) {
    return n == 1 ? 1 : factorial(n - 1) * n;
}
```

```java
// Solution2
// 1. 무한 반복
// 1-1. 1부터 1씩 증가하며, factorial에 곱해주기
// 1-2. factorial이 n보다 큰 경우, 무한 반복문 break 하는 조건 추가
// 2. n보다 큰경우 break했기때문에, answer - 1을 반환

int answer = 0;
int factorial = 1;

while (true) {
    factorial *= ++answer;
    if (factorial > n)
        break;
}
return answer - 1;
```