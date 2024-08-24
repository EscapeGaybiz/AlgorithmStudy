## Day10
### 노션에서 확인
▶️[**click**](https://gipark181.notion.site/Day10-24-08-23-729cc1fa287d4207b15da8a0665cf223?pvs=4)
<br/>
<hr/>

### [**점의 위치 구하기**](https://school.programmers.co.kr/learn/courses/30/lessons/120841)

```java
// Solution1
// 1. x 값과 y 값을 지정.
// 2. x,y 모두 양수일 경우, 1절편
//	  x 만 클 경우, 4절편
//    y 만 클 경우, 2절편
//    모두 음수일 경우, 3절편

int x = dot[0];
int y = dot[1];

if (x > 0 && y > 0) {
    answer = 1;
} else if (x > 0) {
    answer = 4;
} else if (y > 0) {
    answer = 2;
} else {
    answer = 3;
}
```
<br/>

### [**2차원으로 만들기**](https://school.programmers.co.kr/learn/courses/30/lessons/120842)

```java
// Solution1
// [n은 열의 개수]
// 1. 2차원 배열 중 행의 크기를 지정
//    (홀수를 생각해서, n -1을 해줌)
// 2. 행의 크기만큼 반복
// 2-1. 마지막 인덱스이거나, 행의 크기와 n을 나눴을때 0이 아닌 경우의 크기를 지정하고
//      (나머지가 0인 경우에는 똑같이 n으로 크기를 지정해줘야 함)
// 2-2. 아닌 경우에는 모두 열의 크기를 n으로 지정함
// 3. 각 열의 크기를 반복하며 num_list의 요소들을 순서대로 넣음
//    (행마다 열의 크기는 n이기때문에 j + (i * n)으로 지정)

        

int[][] answer = new int[(num_list.length + (n - 1)) / n][];

for (int i = 0; i < answer.length; i++) {
    if (i == answer.length - 1 && num_list.length % n != 0)
        answer[i] = new int[num_list.length % n];
    else
        answer[i] = new int[n];

    for (int j = 0; j < answer[i].length; j++) {
        answer[i][j] = num_list[j + (i * n)];
    }
}
return answer;
```
<br/>

### [**공 던지기**](https://school.programmers.co.kr/learn/courses/30/lessons/120843)

```java
// Solution1
// 1. k번 반복하기
// 1-1. numbers 배열의 길이보다 j가 크거나 같으면,
//    j를 numbers 배열 길이로 나눈 나머지를 다시 넣어줌.
//    (j는 인덱스로써, 2씩 증가하기때문에 나눈 나머지는 0 또는 1)
// 1-2. j 번째 인덱스에 있는 numbers의 요소를 넣어줌.
// 1-3. j는 2씩 증가 (다음 다음 사람에게 던져야하기때문)
// 1-4. i++는 k번 돌리기위한 변수

int answer = 0;
int i = 0;
int j = 0;

while (i < k) {
    if (j >= numbers.length) {
        j %= numbers.length;
    }

    answer = numbers[j];
    j += 2;
    i++;
}
return answer;
```
<br/>

### [**배열 회전시키기**](https://school.programmers.co.kr/learn/courses/30/lessons/120844)

```java
// Solution1
// 1. numbers 요소들을 이동시킬 것이기떄문에 numbers 배열길이만큼 반복하기
// 2-1. direction이 right인지, left인지 switch로 분기처리
// 2-1-1. right인 경우,
//        마지막 인덱스가 0번째 인덱스로 들어가야하기때문에 (i == 0) 체크
//        아니면 i - 1 인덱스 요소를 i에 넣기 (인덱스 증가)
// 2-1-2. left인 경우,
//        0번째 인덱스가 마지막 인덱스로 들어가야하기때문에 (마지막 인덱스인지) 체크
//        아니면 i + 1 인덱스 요소를 i에 넣기 (인덱스 감소)

for (int i = 0; i < numbers.length; i++) {
    switch (direction) {
        case "right" -> {
            if (i == 0)
                answer[i] = numbers[numbers.length - 1];
            else
                answer[i] = numbers[i - 1];
        }
        case "left" -> {
            if (i == numbers.length - 1)
                answer[i] = numbers[0];
            else
                answer[i] = numbers[i + 1];
        }
    }
}
```