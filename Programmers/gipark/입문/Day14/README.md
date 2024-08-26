## Day114
### 노션에서 확인
▶️[**click**](https://gipark181.notion.site/Day14-2024-08-26-42e78c363461452083027b22c332f902?pvs=4)
<br/>
<hr/>

### [**가까운 수**](https://school.programmers.co.kr/learn/courses/30/lessons/120890)

```java
// Solution1
// 1. array 배열길이만큼 반복
// 1-1. array 배열의 요소와 n과의 차이를 절댓값으로 담아두기
// 1-2. 전 diff보다 더 작다면, min 값을 현재 diff로 변경하고, 해당 숫자 answer에 저장
// 1-2. diff와 최소 diff(min)가 같고, answer보다 해당 숫자가 작다면, answer에 해당 숫자 저장

int answer = 0;
int diff = 0;
int min = Integer.MAX_VALUE;

for (int i = 0; i < array.length; i++) {
    diff = Math.abs(n - array[i]);
    if (diff < min) {
        min = diff;
        answer = array[i];
    } else if (diff == min && array[i] < answer) {
        answer = array[i];
    }
}
return answer;
```
<br/>

### [**369게임**](https://school.programmers.co.kr/learn/courses/30/lessons/120891)

```java
// Solution1
// share는 몫, remiander는 나머지를 위한 변수
// 1. Math.log10을 사용하여, order의 자릿수만큼 반복
// 1-1. remainder에 share를 10으로 나눈 나머지를 담기
// 1-2. 나머지가 3 or 6 or 9이라면, answer증가
// 1-3. share를 10으로 나눈 값을 다시 넣으므로써 한자리씩 없애기

int answer = 0;
int share = order;
int remainder = 0;

for (int i = 0; i < (int) Math.log10(order) + 1; i++) {
    remainder = share % 10;
    
    if (remainder == 3 || remainder == 6 || remainder == 9) {
        answer++;
    }
    share /= 10;
}
return answer;
```
<br/>

### [**암호 해독**](https://school.programmers.co.kr/learn/courses/30/lessons/120892)

```java
// Solution1
// 1. cipher 배열 길이만큼 반복
//    (첫 시작은 code - 1 번째 부터 사용하니 초기화를 
//    (code 배수 번째 글자만 사용하니, 반복할때마다 code만큼 증가)
// 1-1. 해당 인덱스의 문자를 StringBuilder에 추가
// 2. StringBuilder에 담긴 시퀀스를 문자열로 변환하여 반환

StringBuilder sb = new StringBuilder();

for (int i = code - 1; i < cipher.length(); i += code) {
    sb.append(cipher.charAt(i));
}
return sb.toString();
```
<br/>

### [**대문자와 소문자**](https://school.programmers.co.kr/learn/courses/30/lessons/120893)

```java
// Solution1
// 1. my_string 문자열을 char[] 배열로 변환하여 해당 요소(c)를 반복
// 1-1. c가 대문자라면, 소문자로 변환하여 StringBuilder에 추가
// 1-2. c가 소문자라면, 대문자로 변환하여 StringBuilder에 추가
// 2. StringBuilder에 담긴 시퀀스를 문자열로 변환하여 반환

StringBuilder sb = new StringBuilder();

for (char c : my_string.toCharArray()) {
    if (Character.isUpperCase(c))
        sb.append(Character.toLowerCase(c));
    else if (Character.isLowerCase(c))
        sb.append(Character.toUpperCase(c));
}
return sb.toString();
```