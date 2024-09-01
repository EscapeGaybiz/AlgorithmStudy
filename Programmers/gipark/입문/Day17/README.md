## Day17
### 노션에서 확인
▶️[**click**](https://gipark181.notion.site/Day17-2024-09-01-62893ef8f92647d1b6f3fd1991b709c8?pvs=4)
<br/>
<hr/>

### [**숫자 찾기**](https://school.programmers.co.kr/learn/courses/30/lessons/120904)

```java
// Solution1
// String.valueOf 사용
// 1. num을 String 객체로 변환
// 2. String 문자열을 문자 하나하나 반복하기
// 2-1. 해당 인덱스의 문자와 k가 같다면 answer에 인덱스 + 1 저장
// 3. answer가 0이면 -1, 아니면 저장된 answer 값 반환

int answer = 0;
String str = String.valueOf(num);

for (int i = 0; i < str.length(); i++) {
    if ((str.charAt(i) - '0') == k) {
        answer = i + 1;
        break;
    }
}
return answer == 0 ? -1 : answer;
```

```java
// Solution2
// String.valueOf 사용

return ("+" + num).indexOf(String.valueOf(k));
```

```java
// Solution3
// 1. Math.log10을 사용하여, 자릿수를 넣어두기
// 2. 자릿수 만큼 반복 
// 2-1. 앞에서 부터 숫자 하나씩 찾아서 n에 저장
// 2-2. 찾은 숫자 뺀 나머지 숫자를 다시 num에 저장
// 2-3. n과 k가 같으면, 반복문 나가기
// 2-4. 같지 않다면, answer 1씩 증가 (몇 번째 자리인지)
// 3. answer가 자릿수보다 큰 값이라면, -1을 아니라면, answer을 반환
//    (자릿수보다 크다면 n == k가 없었다는 뜻이므로 answer은 digitCount + 1 일 것)

int answer = 1;
int digitCount = (int) Math.log10(num) + 1;

for (int i = digitCount; i > 0; i--) {
    int n = num / (int) Math.pow(10, i - 1);
    num -= n * (int) Math.pow(10, i - 1);
    if (n == k)
        break;
    answer++;
}
return answer > digitCount ? -1 : answer;
```
<br/>

### [**n의 배수 고르기**](https://school.programmers.co.kr/learn/courses/30/lessons/120905)

```java
// Solution1
// 1. n의 배수를 담을 list 생성
// 2. numlist를 반복하기
// 2-1. 반복한 요소 num이 n의 배수이면 list에 추가
// 3. list를 int[]로 복사하기

int[] answer = {};
List<Integer> list = new ArrayList<>();

for (int num : numlist) {
    if (num % n == 0)
        list.add(num);
}

answer = new int[list.size()];
for (int i = 0; i < answer.length; i++) {
    answer[i] = list.get(i);
}
return answer;
```
<br/>

### [**자릿수 더하기**](https://school.programmers.co.kr/learn/courses/30/lessons/120906)

```java
// Solution1
// 1. Math.log10을 사용하여, 자릿수를 넣어두기
// 2. 자리수 만큼 반복
// 2-1. 앞에서 부터 숫자 하나씩 answer에 더하기
// 2-2. 맨 앞 숫자를 제외한 나머지를 다시 n에 저장

int answer = 0;
int digitCount = (int) Math.log10(n);

for (int i = digitCount; i >= 0; i--) {
    answer += n / (int) Math.pow(10, i);
    n = n % (int) Math.pow(10, i);
}
return answer;
```

```java
// Solution2
// 1. n이 0보다 크다면 반복 (0보다 작아질때까지)
// 1-1. n을 10으로 나눈 나머지를 answer에 더하기 (일의 자리 숫자)
// 1-2. n을 10으로 나눈 값을 다시 n에 저장 (일의 자리 숫자 제외하기)

int answer = 0;

while (n > 0) {
    answer += n % 10;
    n /= 10;
}
return answer;
```
<br/>

### [**OX퀴즈**](https://school.programmers.co.kr/learn/courses/30/lessons/120907)

```java
// Solution1
// 1. quiz 길이만큼 반복하기
// 1-1. 공백(" ")을 기준으로 split한 문자열 생성
// 1-2. 0, 2, 4번째 인덱스를 x, y, z 변수에 숫자로 변환하여 저장
// 1-3. 1번째 인덱스가 "+"인지, "-"인지 확인하기
// 1-3-1. "+"인 경우, x + y가 z와 같다면 "O" 아니라면 "X"
// 1-3-2. "-"인 경우, x - y가 z와 같다면 "O" 아니라면 "X"

String[] answer = new String[quiz.length];

for (int i = 0; i < quiz.length; i++) {
    String[] strArr = quiz[i].split(" ");

    int x = Integer.parseInt(strArr[0]);
    int y = Integer.parseInt(strArr[2]);
    int z = Integer.parseInt(strArr[4]);
    switch (strArr[1]) {
        case "+" -> {
            answer[i] = (x + y == z) ? "O" : "X";
        }
        case "-" -> {
            answer[i] = (x - y == z) ? "O" : "X";
        }
    }
}
return answer;
```