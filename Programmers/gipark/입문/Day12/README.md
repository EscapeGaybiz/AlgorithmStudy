## Day12
### 노션에서 확인
▶️[**click**](https://gipark181.notion.site/Day12-2024-08-23-df7a37c1a3314ad68e55bb8a00111c2d?pvs=4)
<br/>
<hr/>

### [**모음 제거**](https://school.programmers.co.kr/learn/courses/30/lessons/120849)

```java
// Solution1
// 1. replacaAll의 정규식을 사용하여, "a, e, i, o, u" 문자를 "" 빈 문자로 변환
//    (""로 변환은 해당 문자를 제거한다와 같은 의미)

my_string.replaceAll("[aeiou]+", "");
```
<br/>

### [**문자열 정렬하기 (1)**](https://school.programmers.co.kr/learn/courses/30/lessons/120850)

```java
// Solution1
// 1. 숫자가 아닌 문자들을 제거하여 숫자만 남는 numStr 문자열 생성
// 2. numStr 문자열 길이만큼 반복하기
// 2-1. numStr 문자열의 각 인덱스에 있는 문자들을 숫자로 변환해서 int[] 배열에 하나씩 넣기
// 3. int[] 배열에 담긴 숫자들을 오름차순 정렬

String numStr = my_string.replaceAll("[^0-9]", "");
int[] answer = new int[numStr.length()];

for (int i = 0; i < answer.length; i++) {
    answer[i] = numStr.charAt(i) - '0';
}

Arrays.sort(answer);
return answer;
```
<br/>

### [**숨어있는 숫자의 덧셈 (1)**](https://school.programmers.co.kr/learn/courses/30/lessons/120851)

```java
// Solution1
// 1. 숫자가 아닌 문자들을 제거하여 숫자만 있는 numStr 문자열 생성
// 2. numStr 문자열을 문자 배열로 만들어 반복하기
// 2-1. 반복하며 각 문자들을 숫자로 변환하며 더해주기

String numStr = my_string.replaceAll("[^0-9]+", "");
int answer = 0;

for (char c : numStr.toCharArray()) {
    answer += (c - '0');
}
return answer;
```
<br/>

### [**소인수분해**](https://school.programmers.co.kr/learn/courses/30/lessons/120852)

```java
// Solution1
// 1. HashSet 변수 생성 (중복 값을 제거하기 위함)
// 2. 2부터 n까지의 자연수를 반복
//    (1은 소수가 아니므로 2부터 반복)
// 2-1. 반복하며 나온 수가 n의 약수인 경우 + 소수인 경우, set에 해당 숫자 추가
// 3. set에 담긴 요소를 int[] 배열에 저장
// 4. 저장된 int[] 배열을 오름차순으로 정렬

// 소수찾기
// 1. 2부터 n/2 만큼 반복
// 2. n % i가 0이라면 나눠지는 약수가 있다는 뜻이므로, false 반환

/**
 * n/2만큼 반복하는 이유
 *
 * 예시,
 * n = i * k
 * n / i = k
 *
 * n = 20, i = 11인 경우
 * k = 20 / 11 = 1.81818.. 이므로, k는 2보다 작고 실질적으로 약수라고 할 수 없음
 *
 * 즉, 계산해보면
 * k는 2보다 작거나 같게 되므로, n/2 초과된 값을 계산하는 것은 의미가 없음
 */

public int[] solution(int n) {
    int[] answer = {};
    Set<Integer> set = new HashSet<>();

    for (int i = 2; i <= n; i++) {
        if (n % i == 0) {
            if (isPrime(i))
                set.add(i);
        }
    }

    int idx = 0;
    answer = new int[set.size()];
    for (int num : set) {
        answer[idx++] = num;
    }
    Arrays.sort(answer);
    return answer;
}

private boolean isPrime(int n) {
    boolean b = true;

    for (int i = 2; i <= n / 2; i++) {
        if (n % i == 0)
            b = false;
    }
    return b;
}
```

```java
// Solution2
// 1. HashSet이 아닌 LinkedHashSet으로 변수 생성
// 2. Arrays.sort로 오름차순 정렬 코드 제거

/**
 * HashSet은 삽입순서를 고려하지 않기때문에 set의 요소를 찾을때, 어떤 수로 반환될지 예측 불가함
 * 따라서, 삽입순서를 유지해주는 LinkedHashSet을 사용
 */
 
...
Set<Integer> set = new LinkedHashSet<>();

...
```