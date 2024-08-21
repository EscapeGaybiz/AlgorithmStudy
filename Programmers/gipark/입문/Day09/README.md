## Day09
### 노션에서 확인
▶️[**click**](https://gipark181.notion.site/Day09-2024-08-22-27367382fce34328b6e5c041fd1647b1?pvs=4)
<br/>
<hr/>

### [**개미 군단**](https://school.programmers.co.kr/learn/courses/30/lessons/120837)

```java
// Solution1
// 1. atk 배열에 각 공격력들을 순서대로 저장하여 생성
// 2. hp가 0이 될때까지 무한반복
// 2-1. atk에서 사용할 인덱스 변수가 atk 배열의 크기보다 크거나 같으면 반복문 나오기
//			(IndexOutOfBounds 방지, 공격력이 1인 원소가 있어서 절대 넘을 리는 없음)
// 2-2. hp에서 해당 공격력을 빼주기.
// 2-3. 만약 빼다가 hp가 0보다 작아졌다면 다시 한 단계 전으로 돌려서, 다음 순의 공격력 투입
// 3. hp가 0이면 반복문을 빠져나와서 hp가 0이 될때까지 공격한 수를 반환

int answer = 0;
int[] atk = new int[]{5, 3, 1};
int i = 0;

while (hp != 0) {
    if (i >= atk.length)
        break;

    hp -= atk[i];

    if (hp < 0) {
        hp += atk[i];
        i++;
    } else {
        answer++;
    }
}
return answer;
```

```java
// Solution2
// 제일 공격력이 높은 애부터 투입하고 남은 공격력에 맞춰 점점 낮은 순으로 투입
// 1. (5로 나눈 몫) + (5로 나눈 나머지를 3으로 나눈 몫) + (나머지)

(hp / 5) + (hp % 5 / 3) + (hp % 5 % 3);
```
<br/>

### [**모스부호 (1)**](https://school.programmers.co.kr/learn/courses/30/lessons/120838)

[**Arrays.asList**](https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html#asList-T...-)

```java
// Solution1
// 1. 주어진 morse 배열을 초기화하여 생성
// 2. letter 문자열은 공백을 기준으로 쓰여져있으므로, 공백(" ")으로 나눈 문자열 배열을 생성
// 3. 각 문자 모스부호로 된 문자열 배열을 반복하여 각 문자 요소들을 사용하기
// 3-1. 모스 문자열 배열을 ArrayList로 변환 후,
//		  해당 모스부호에 맞는 인덱스 번호를 찾아 'a'를 더해 영문자로 변환하여 StringBuilder에 추가
// 4. 문자로 만들어져 추가된 StringBuilder를 문자열로 반환

String[] morse = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
StringBuilder sb = new StringBuilder();
String[] strArr = letter.split(" ");

for (String str : strArr) {
    sb.append((char)(Arrays.asList(morse).indexOf(str) + 'a'));
}
return sb.toString();
```
<br/>

### [**가위 바위 보**](https://school.programmers.co.kr/learn/courses/30/lessons/120839)

```java
// Solution1
// 1. rsp 문자열을 문자 배열로 만들어서 문자 하나씩 반복
// 1-1. 가위(2)면 바위(0)를
//			바위(0)면 보(5)를
//      보(5)면 가위(2)를 StringBuilder에 추가
//      (향상된 switch이므로, default를 추가해 주어야함)
// 2. sb에 추가된 승리 족보를 문자열로 반환

StringBuilder sb = new StringBuilder();

for (char c : rsp.toCharArray()) {
    sb.append(
            switch (c) {
                case '2' -> '0';
                case '0' -> '5';
                case '5' -> '2';
                default -> "";
            }
    );
}
return sb.toString();
```
<br/>

### [**구슬을 나누는 경우수**](https://school.programmers.co.kr/learn/courses/30/lessons/120840)

```java
// Solution1
// 순서를 고려하지 않은 조합 문제

public int solution(int balls, int share) {
    return combination(balls, share);
}

public int combination(int n, int r) {
    if (n == r || r == 0) {
        return 1;
    }
    return combination(n - 1, r - 1) + combination(n - 1, r);
}
```