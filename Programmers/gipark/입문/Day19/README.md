## Day19
### 노션에서 확인
▶️[**click**](https://gipark181.notion.site/Day19-2024-09-03-0f21cc1d603841789609d71783b41c30?pvs=4)
<br/>
<hr/>

### [**7의 개수**](https://school.programmers.co.kr/learn/courses/30/lessons/120912)

```java
// Solution1
// 1. 숫자를 문자열로 바꾸기
// 2. 바꾼 문자열에서 '7'이라는 문자가 있는지 체크하여 answer++

int answer = 0;

for (int i : array) {
    String n = String.valueOf(i);

    for (char c : n.toCharArray()) {
        if (c == '7')
            answer++;
    }
}
return answer;
```

```java
// Solution2
// 1. n > 0 이면 반복하기.
// 1-1. 일의 자리가 7인지 체크하여 answer++
// 1-2. 일의 자리를 체크했으니 10으로 나눈 값을 n에 다시 저장

int answer = 0;

for (int n : array) {
    while (n > 0) {
        if (n % 10 == 7)
            answer++;
        n /= 10;
    }
}
return answer;
```
<br/>

### [**잘라서 배열로 저장하기**](https://school.programmers.co.kr/learn/courses/30/lessons/120913)

```java
// Solution1
// 1. my_str 문자열을 앞에서 n개수씩 자른 문자열 개수를 크기로 새 String 배열 생성
// 2. my_str 문자열을 문자 하나씩 반복하기
// 2-1. 반복하며, StringBuilder에 각 문자열 추가.
// 2-2. 처음이 아니고, i가 n의 배수라면
//      StringBuilder에 담긴 문자열을 answer에 저장 후 StringBuilder 초기화
// 3. 마지막으로 StringBuilder에 담긴 문자열을 answer에 담기

String[] answer = new String[(my_str.length() + n - 1) / n];

int j = 0;
StringBuilder sb = new StringBuilder();
for (int i = 0; i < my_str.length(); i++) {
    if (i != 0 && i % n == 0) {
        answer[j++] = sb.toString();
        sb = new StringBuilder();
    }
    sb.append(my_str.charAt(i));
}
answer[j] = sb.toString();

return answer;
```
<br/>

### [**중복된 숫자 개수**](https://school.programmers.co.kr/learn/courses/30/lessons/120583)

```java
// Solution1
// Arrays.stream 사용
// 1. array 배열에서 i == n 이면 배열로 담고, 개수 카운트

return (int) Arrays.stream(array).filter(i -> i == n).count();
```

```java
// Solution2
// 1. array 배열 반복하며, i == n이면 개수 카운트

int answer = 0;

for (int i : array) {
    if (i == n)
        answer++;
}
return answer;
```
<br/>

### [**머쓱이보다 키 큰 사람**](https://school.programmers.co.kr/learn/courses/30/lessons/120585)

```java
// Solution1
// Arrays.stream 사용
// 1. array 배열에서 i가 height 보다 크면 배열로 담고, 개수 카운트

return (int) Arrays.stream(array).filter(i -> height < i).count();
```

```java
// Solution2
// 1. array 배열 반복하며, height < i이면 개수 카운트

int answer = 0;

for (int i : array) {
    if (height < i)
        answer++;
}
return answer;
```