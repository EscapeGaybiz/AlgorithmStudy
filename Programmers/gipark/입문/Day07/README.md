## Day07
### 노션에서 확인
▶️[**click**](https://gipark181.notion.site/Day07-2024-08-21-5d2ecef0f26f471a80dc3ee183dc9818?pvs=4)
<br/>
<hr/>

### [**특정 문자 제거하기**](https://school.programmers.co.kr/learn/courses/30/lessons/120826)

[**replace**](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#replace-java.lang.CharSequence-java.lang.CharSequence-)

```java
my_string.replace(letter, "");
```
<br/>

### [**각도기**](https://school.programmers.co.kr/learn/courses/30/lessons/120829)

```java
return (0 < angle) && (angle < 90) ? 1 :
                angle == 90 ? 2 :
                        (90 < angle) && (angle < 180) ? 3 :
                                4;
                                
// 문제에 0 <= angle <= 180 이라고 조건이 되어있어서
// 0 < angle과 90 < angle 조건은 제거해도 무방.
// (그래도 체크해주고 싶어서 넣어줌)
```
<br/>

### [**양꼬치**](https://school.programmers.co.kr/learn/courses/30/lessons/120830)

```java
// 10인분 먹으면 음료 하나 공짜 -> k - n / 10
(12000 * n) + (2000 * (k - n/10));
```
<br/>

### [**짝수의 합**](https://school.programmers.co.kr/learn/courses/30/lessons/120831)

```java
for (int i = 1; i <= n; i++) {
    if (i % 2 == 0)
        answer += i;
}

// if 안하고 int i = 0;으로 초기화하고, for문의 증감식 부분에 i += 2를 해도 됨.
```