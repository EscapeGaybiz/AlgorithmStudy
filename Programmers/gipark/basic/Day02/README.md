## Day02
### 노션에서 확인
<a href="https://gipark181.notion.site/Day2-2024-07-21-192ac9f263fa46ab8bb14b27e27341d5?pvs=4" target="_blank">▶️<b>click</b></a>
<br/>
<hr/>

### [덧셈식 출력하기](https://school.programmers.co.kr/learn/courses/30/lessons/181947)

**System.out.printf**

```java
// 서식문자를 사용하여 여러 형식으로 출력할 수 있음
System.out.printf("%d + %d = %d", a, b, a + b);

/**
 * 서식 Type
 *
 * %d: decimal
 * %o: octal
 * %x: hexadecimal
 * %f: float
 * %c: char
 * %s: string
 */
 
 /* =================================================== */
 // println에서는 +를 사용하여 문자열로 만들어 연결 시킬 수 있음
 // 숫자끼리 + 하면 연산이 되어 출력됨
 System.out.println(a + " + " + b + " = " + (a + b));
```
<br/>

### [문자열 붙여서 출력하기](https://school.programmers.co.kr/learn/courses/30/lessons/181946)

**System.out.println**

```java
// +를 사용하여 문자열 끼리 연결
System.out.println(a + b);

/**
 * JDK1.5 이상에서는 컴파일시에 자동으로 StringBuilder로 변환되어 동작
 *
 * a + b;
 * new StringBuilder().append(a).append(b).toString();
 */
```
<br/>

### [문자열 돌리기](https://school.programmers.co.kr/learn/courses/30/lessons/181945)

[toCharArray](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#toCharArray--)

[charAt](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#charAt-int-)

```java
// String 문자열을 새 Character 문자배열로 변환
str.toCharArray();

for (char c : str.toCharArray()) {
    System.out.println(c);
}

// 위 코드를 아래와 같이 String 문자열의 지정된 Index를 가지고 사용할 수도 있음
// String 문자열에서 지정된 인덱스에 있은 문자 값을 반환
for (int i = 0; i < str.Length(); i++) {
    System.out.println(str.charAt(i));
}
```
<br/>

### [홀짝 구분하기](https://school.programmers.co.kr/learn/courses/30/lessons/181944)

[swtich](https://docs.oracle.com/en/java/javase/17/language/switch-expressions.html)

```java
// 기존 Swtich Expressions
switch (day) {
    case MONDAY:
    case FRIDAY:
    case SUNDAY:
        numLetters = 6;
        break;
    case TUESDAY:
        numLetters = 7;
        break;
    case THURSDAY:
    case SATURDAY:
        numLetters = 8;
        break;
    case WEDNESDAY:
        numLetters = 9;
        break;
    default:
        throw new IllegalStateException("Invalid day: " + day);
}

// JAVA 12 이상에서 사용가능
// Enhanced Swith Expressions
switch (day) {
    case MONDAY, FRIDAY, SUNDAY -> 6;
    case TUESDAY                -> 7;
    case THURSDAY, SATURDAY     -> 8;
    case WEDNESDAY              -> 9;
    default -> throw new IllegalStateException("Invalid day: " + day);
}

// JAVA 13에서는 Switch에 yield 키워드가 추가됨
// Switch 내에서만 사용 가능.
// 
// yield는 switch 문 내의 return 과 같은 의미
// ※ yield는 {} block 내에서만 사용 가능
switch (n % 2) {
    case 0 -> {
        String temp = "even";
        yield temp + " and odd";
    }
    case 1 -> "odd";
    //case 1 -> yield "odd"; //error
    default -> throw new IllegalStateException("Unexpected value: " + (n % 2));
};

/**
 * Enhnaced Switch Expression의 장점
 * 1. 코드의 간결함 (가독성 up)
 * 2. break를 사용하지 않아도 되어서, 논리적 오류를 예방할 수 있음
 */
```
<br/>

### [문자열 겹쳐쓰기](https://school.programmers.co.kr/learn/courses/30/lessons/181943)

[**substring**](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#substring-int-)

```java
String str = "HelloWorld!";

// substring(int beginIndex, int endIndex)
// String 문자열의 시작 인덱스에서 부터 끝 인덱스 -1 문자까지의 부분 문자열을 반환
str.substring(2, 4); // -> "ll"

// substring(int beginIndex)
// String 문자열의 시작 인덱스에서 부터 문자열의 끝까지의 부분 문자열을 반환
str.substring(2); // -> "lloWorld!"

// 응용하여 아래와 같이 특정 패턴을 추출할 수도 있음
String url = "https://example.com/index.html";
int start = url.indexOf("//") + 2;
int end = url.indexOf('/', start);
String domain = url.substring(start, end); // "example.com"

/**
 * JAVA 7이전과 이후의 substring
 *
 * JAVA 7 이전
 * 원본 문자열의 char 배열을 공유하여 부분 문자열을 생성하였음
 * 원본 문자열을 계속 참조하여 부분 문자열을 생성하므로 메모리 해제가 불가능하고,
 * 메모리 누수가 발생할 가능성이 있음
 *
 * JAVA 7 이후
 * 새로운 char 배열을 생성하여 부분 문자열을 생성하였음
 * 원본 문자열을 사용하지 않으므로 가비지 컬렉터에 의해 안전하게 회수될 수 있고,
 * 메모리 효율성을 높이고, 원본 문자열과 부분 문자열의 독립성을 보장함
 */
```