## Day18
### 노션에서 확인
▶️[**click**](https://gipark181.notion.site/Day18-2024-09-03-10b2289ab9b080efadfecf10125f592e?pvs=4)
<br/>
<hr/>

### [**문자열안에 문자열**](https://school.programmers.co.kr/learn/courses/30/lessons/120908)

```java
// Solution1
// 1. str1에 str2 문자열이 포함되어 있는지 찾기

str1.contains(str2)
```
<br/>

### [**제곱수 판별하기**](https://school.programmers.co.kr/learn/courses/30/lessons/120909)

```java
// Solution1
// 1. 1부터 n/2 만큼 반복하며, 제곱수인지 체크
//    (n/2인 이유는 n/2 이후의 숫자들은 제곱시 n보다 크기때문)

int answer = 2;

for (int i = 1; i <= n / 2; i++) {
    if (n == (int) Math.pow(i, 2)) {
        answer = 1;
        break;
    }
}
return answer;
```

```java
// Solution2
// 1. n을 n의 제곱근으로 나눴을때 나머지가 0이면 제곱수

(n % Math.sqrt(n) == 0) ? 1 : 2;
```
<br/>

### [**세균 증식**](https://school.programmers.co.kr/learn/courses/30/lessons/120910)

```java
// Solution1
// 1. t만큼 반복하면서, 2를 곱해주기

int answer = n;

for (int i = 0; i < t; i++) {
    answer *= 2;
}
return answer;
```

```java
// Solution2
// << (비트연산자) 사용
// 1. <<을 사용하여 2를 t만큼 곱해주기

return n << t;
```
<br/>

### [**문자열 정렬하기 (2)**](https://school.programmers.co.kr/learn/courses/30/lessons/120911)

```java
// Solution1
// 1. 소문자를 담을 chars 문자 배열 생성
// 2. my_string 문자열에서 대문자를 소문자로 변경하여 chars에 담기
// 3. 소문자가 담긴 chars 배열을 사전순으로 정렬

char[] chars = new char[my_string.length()];

for (int i = 0; i < chars.length; i++) {
    if (Character.isUpperCase(my_string.charAt(i)))
        chars[i] = Character.toLowerCase(my_string.charAt(i));
    else
        chars[i] = my_string.charAt(i);
}

Arrays.sort(chars);
return new String(chars);
```