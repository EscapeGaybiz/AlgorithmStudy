## Day16
### 노션에서 확인
▶️[**click**](https://gipark181.notion.site/Day16-2024-09-01-ae6fd1bc0a084ab68356608be1a4cf2b?pvs=4)
<br/>
<hr/>

### [**편지**](https://school.programmers.co.kr/learn/courses/30/lessons/120898)

```java
// Solution1
// 1. 문자열 길이 * 2cm

message.length() * 2;
```
<br/>

### [**가장 큰 수 찾기**](https://school.programmers.co.kr/learn/courses/30/lessons/120899)

```java
// Solution1
// 1. array 배열 copy한 intArr 배열 만들기
// 2. intArr 오름차순 정렬하여, 제일 큰 수 answer 0번째에 담기
// 3. array 배열 돌리면서 answer 0번째에 담긴 수의 원래 인덱스를 찾아서 answer 1번째에 담기

int[] answer = new int[2];
int[] intArr = Arrays.copyOf(array, array.length);

Arrays.sort(intArr);
answer[0] = intArr[intArr.length - 1];

for (int i = 0; i < array.length; i++) {
    if (array[i] == answer[0]) {
        answer[1] = i;
        break;
    }
}
return answer;
```
<br/>

### [**문자열 계산하기**](https://school.programmers.co.kr/learn/courses/30/lessons/120902)

```java
// Solution1
// 1. split을 사용하여, 숫자와 연산자를 나눈 문자열 배열 만들기
// 2. 숫자를 담은 문자열 배열을 반복
// 2-1. 앞 순서부터 연산자가 "+"이면 해당 인덱스의 숫자 더하기
//      "-"이면 해당 인덱스의 숫자 빼기
// 
// 첫 부분에는 숫자만 골라야하기때문에 replace를 사용해 중간에 있는 공백들 제거
// (op[i]부터하는 이유는 0번째 인덱스에 빈문자열이 들어감) - 없애주는게 최선이지만 i로 해도 가능

String[] strArr = my_string.replace(" ", "").split("[+-]");
String[] op = my_string.split("[0-9 ]+");

answer = Integer.parseInt(strArr[0]);
for (int i = 1; i < strArr.length; i++) {
    switch (op[i]) {
        case "+" -> {
            answer += Integer.parseInt(strArr[i]);
        }
        case "-" -> {
            answer -= Integer.parseInt(strArr[i]);
        }
    }
}
```

```java
// Solution2
// 1. split을 사용하여, 공백을 기준으로 문자 나누기
// 2. strArr 문자열 배열을 반복
//    (짝수 번째 인덱스에는 숫자가 들어있고, 홀수번째 인덱스에는 연산자가 들어있음.)
// 2-1. 1번 인덱스부터 해당 문자가 "+"이면 sign 을 1로, "-"이면 sign 을 -1로 저장
//      (숫자가 1 ~ 20000 사이의 정수이기때문에 sign으로 가능)
// 2-2. 짝수 인덱스라면 기존 answer에 숫자 * sign 한 값을 더해주기

int answer = 0;
String[] strArr = my_string.split(" ");
int sign = 1;

answer = Integer.parseInt(strArr[0]);
for (int i = 1; i < strArr.length; i++) {
    if (i % 2 == 0) {
        answer = answer + (Integer.parseInt(strArr[i]) * sign);
    } else {
        switch (strArr[i]) {
            case "+" -> sign = 1;
            case "-" -> sign = -1;
        }
    }
}
return answer;
```
<br/>

### [**배열의 유사도**](https://school.programmers.co.kr/learn/courses/30/lessons/120903)

```java
// Solution1
// 이중 for loop 사용
// 1. s1 배열 반복
// 1-1. s2 배열 반복
// 1-1-1. s1요소가 s2요소와 같다면, answer 1 증가하고 s2 반복 빠져나오기
//        (중복된 요소는 없기때문에, 더 이상 뒤 요소가 같은지 확인할 필요가 없음)

int answer = 0;

for (String str1 : s1) {
    for (String str2 : s2) {
        if (str1.equals(str2)) {
            answer++;
            break;
        }
    }
}
return answer;
```