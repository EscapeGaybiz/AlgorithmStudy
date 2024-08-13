## Day22
### 노션에서 확인
▶️[**click**](https://gipark181.notion.site/Day22-2024-08-07-6f7ce1ffad6241dcb5f1987ab3c2ee33?pvs=4)
<br/>
<hr/>

### [**0 떼기**](https://school.programmers.co.kr/learn/courses/30/lessons/181847)

[**String.valueOf**](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#valueOf-int-)

[**Integer.parseInt**](https://docs.oracle.com/javase/8/docs/api/java/lang/Integer.html#parseInt-java.lang.String-)

```java
// 1. n_str 문자열을 부호있는 10진수로 변환
// 2. 10진수로 변환한 int형을 문자열 표현으로 반환
String.valueOf(Integer.parseInt(n_str));
```
<br/>

### [**두 수의 합**](https://school.programmers.co.kr/learn/courses/30/lessons/181846)

[**BigInteger.add**](https://docs.oracle.com/javase/8/docs/api/java/math/BigInteger.html#add-java.math.BigInteger-)

```java
BigInteger n1 = new BigInteger(a);
BigInteger n2 = new BigInteger(b);

// BigInteger 타입의 n1에 n2를 더한 값을 반환
n1.add(n2);
```
<br/>

### [**문자열로 변환**](https://school.programmers.co.kr/learn/courses/30/lessons/181845)

[**String.valueOf**](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#valueOf-int-)

```java
// int 타입의 정수 n을 문자열 타입으로 변환
String.valueOf(n);

// toString()
// JAVA의 모든 객체는 toString 함수를 사용가능.
// int는 primitive type이므로 toString을 사용할 수는 없음.

// (String)
// Object를 String 타입으로 캐스팅할 때 사용.
// 단, Object가 String인 경우에만 사용가능.
// String이 아닌 경우, ClassCastException가 발생.

// Integer.toString()
// int 타입의 값을 문자열로 변환
// primitive type인 int를 문자열로 변환하기 위해 특화된 메서
```
<br/>

### [**배열의 원소 삭제하기**](https://school.programmers.co.kr/learn/courses/30/lessons/181844)

```java
// arr 배열의 요소를 반복
for (int i = 0; i < arr.length; i++) {
		// arr에 있는 요소와 delete_list 요소가 같은게 있는지 체크하기 위한 변수
    boolean flag = false;

		// delete_list 배열의 요소를 반복
    for (int j = 0; j < delete_list.length; j++) {
		    // delete_list 배열을 반복하며, i 번째 arr 요소와 같은게 있는지 체크하여 flag 값 변경
        if (arr[i] == delete_list[j])
            flag = true;
    }
    // flag가 false, 같은게 없다면 list에 추
    if (!flag)
        list.add(arr[i]);
}
```
<br/>

### [**부분 문자열인지 확인하기**](https://school.programmers.co.kr/learn/courses/30/lessons/181843)

[**contains**](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#contains-java.lang.CharSequence-)

```java
// my_string 문자열에 target 문자열이 포함되어있으면 true, 아니면 false 반환
// 반환된 값이 true면 1, false면 0
my_string.contains(target) ? 1 : 0;
```