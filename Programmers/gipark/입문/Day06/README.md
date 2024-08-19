## Day06
### 노션에서 확인
▶️[**click**](https://gipark181.notion.site/Day06-2024-08-19-985b8257be00454d83f9315cf1f9d1c7?pvs=4)
<br/>
<hr/>

### [**문자열 뒤집기**](https://school.programmers.co.kr/learn/courses/30/lessons/120822)

```java
// Solution1 - StringBuilder reverse 함수 사용하기
StringBuilder sb = new StringBuilder(my_string);
return sb.reverse().toString();

// Solution2 - 앞과 뒤 인덱스를 swap하며 뒤집기
char[] chars = my_string.toCharArray();

// 초기 i 값은 문자 배열의 중간 위치를 찾아서 초기화
for (int i = (chars.length - 2) >> 1; i >= 0; i--) {
    int k = (chars.length - 1) - i;
    char temp = chars[i];
    chars[i] = chars[k];
    chars[k] = temp;
}
return new String(chars);

// Solution3 - 문자열의 뒤부터 하나씩 넣어서 새로운 문자열 생성하기
StringBuilder sb = new StringBuilder();

for (int i = my_string.length() - 1; i >= 0; i--) {
    sb.append(my_string.charAt(i));
}
return sb.toString();
```
<br/>

### [**직각삼각형 출력하기**](https://school.programmers.co.kr/learn/courses/30/lessons/120823)

```java
// Solution1 - 2중 반복문 사용
for (int i = 0; i < n; i++) {
    for (int j = 0; j <= i; j++) {
        System.out.print("*");
    }
    System.out.println();
}

// Solution2 - String 객체의 repeat 함수 사용
// 내부적으로 repeat은 System.arraycopy를 사용
for (int i = 1; i <= n; i++) {
    System.out.println("*".repeat(i));
}
```
<br/>

### [**짝수 홀수 개수**](https://school.programmers.co.kr/learn/courses/30/lessons/120824)

```java
// Solution1 - if문 분기처리 사용
for (int num : num_list) {
    if (num % 2 == 0) {
        answer[0]++;
    } else {
        answer[1]++;
    }
}

// Solution2 - 짝수는 0, 홀수는 1이므로 아래와 같이 인덱스로 사용가능.
for (int num : num_list) {
    answer[num % 2]++;
}
```
<br/>

### [**문자 반복하기**](https://school.programmers.co.kr/learn/courses/30/lessons/120825)

```java
// toCharArray로 문자 배열로 만들어 문자 하나하나 참조할 수 있게 하고,
// String.valueOf로 문자열로 만들어 String 객체의 함수인 repeat을 사용할 수 있게 함
for (char c : my_string.toCharArray()) {
    sb.append(String.valueOf(c).repeat(n));
}

// StringBuilder의 repeat 사용하기
// JDK 21 버전 이상부터 사용가능.
for (char ch : my_string.toCharArray()) {
    sb.repeat(ch, n);
}
```