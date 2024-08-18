## Day02
### 노션에서 확인
▶️[**click**](https://gipark181.notion.site/Day02-2024-08-18-562181d5d31341aea537e24a7f076f8b?pvs=4)
<br/>
<hr/>

### [**두 수의 나눗셈**](https://school.programmers.co.kr/learn/courses/30/lessons/120806)

```java
// Solution1
(int) ((num1 / (double) num2) * 1000);

// Solution2
1000 * num1 / num2;
```
<br/>

### [**숫자 비교하기**](https://school.programmers.co.kr/learn/courses/30/lessons/120807)

```java
num1 == num2 ? 1 : -1;
```
<br/>

### [**분수의 덧셈**](https://school.programmers.co.kr/learn/courses/30/lessons/120808)

```java
// 최대공약수를 구하는 함수
// GCD(Greatest Common Divisor)

// Solution1
// while을 이용한 반복
private int gcd(int a, int b) {
    int temp;
    int r;

    if (a < b) {
        temp = a;
        a = b;
        b = temp;
    }

    while (b != 0) {
        r = a % b;
        a = b;
        b = r;
    }

    return a;
}

// Solution2
// 재귀함수를 이용한 반복
private int gcd(int a, int b) {
    return b == 0 ? a : gcd(b, a % b);
}
```
<br/>

### [**배열 두 배 만들기**](https://school.programmers.co.kr/learn/courses/30/lessons/120809)

```java
// numbers[i] * 2 보다 << 비트연산이 더 빠름
for (int i = 0; i < answer.length; i++) {
    answer[i] = numbers[i] << 1;
}

// << 1 은 값을 2배하는 것
// >> 1 은 값을 반으로 나누는 것
```