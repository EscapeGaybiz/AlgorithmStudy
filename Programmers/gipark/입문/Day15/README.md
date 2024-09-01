## Day15
### 노션에서 확인
▶️[**click**](https://gipark181.notion.site/Day15-2024-08-27-0ab20c64095b42a399f2a9553615662c?pvs=4)
<br/>
<hr/>

### [**영어가 싫어요**](https://school.programmers.co.kr/learn/courses/30/lessons/120894)

```java
// Solution1
// 1. str 길이가 0이 아닐때까지 반복
// 2. 숫자 문자열을 넣어둔 numList 문자열 배열 반복
// 3. startsWith 함수를 사용하여 앞에 문자부터 찾아서 ston 함수를 사용하여 숫자로 변환후,
//    indexOf를 사용하여 해당 숫자를 자른 뒤 문자열부터 다시 startsWith으로 찾기
// 4. 그러면서 계속 변환된 숫자는 StringBuilder에 하나씩 추가
// 5. StringBuilder에 담긴 숫자 문자열로 변환 후, Long 타입으로 변환하며 반환

String[] numList = new String[]{"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "zero"};

while (str.length() != 0) {
    for (String num : numList) {
        if (str.startsWith(num)) {
            sb.append(ston(num));
            str = str.substring(str.indexOf(num) + num.length());
        }
    }
}

private int ston(String num) {
        return switch (num) {
            case "one" -> {
                yield 1;
            }
            case "two" -> {
                yield 2;
            }
            case "three" -> {
                yield 3;
            }
            case "four" -> {
                yield 4;
            }
            case "five" -> {
                yield 5;
            }
            case "six" -> {
                yield 6;
            }
            case "seven" -> {
                yield 7;
            }
            case "eight" -> {
                yield 8;
            }
            case "nine" -> {
                yield 9;
            }
            case "zero" -> {
                yield 0;
            }
            default ->
                    throw new IllegalStateException("Unexpected value: " + num);
        };
    }
```

```java
// Solution2
// 1. 숫자 문자들을 numList에 담아두기
// 2. numList 길이만큼 반복 (인덱스 번호가 즉, 자신의 영어문자)
// 2-1. replace로 해당 문자를 찾아서 해당 인덱스를 문자로 바꿔서 answer에 저장

String[] numList = new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

for (int i = 0; i < numList.length; i++) {
    answer = answer.replace(numList[i], String.valueOf(i));
}
return Long.parseLong(answer);
```
<br/>

### [**인덱스 바꾸기**](https://school.programmers.co.kr/learn/courses/30/lessons/120895)

```java
// Solution1
// 1. ""로 split하여 문자열 배열로 만들기
// 2. num1 번째 인덱스 문자와 num2 번째 인덱스 문자를 swap
// 3. String[]을 String.join을 사용하여 하나의 문자열로 조합

String[] tempList = my_string.split("");
String temp = tempList[num1];

tempList[num1] = tempList[num2];
tempList[num2] = temp;

return String.join("", tempList);
```
<br/>

### [**한 번만 등장한 문자**](https://school.programmers.co.kr/learn/courses/30/lessons/120896)

```java
// Solution1
// 1. answer 문자열을 char[]로 변환하여 문자 반복하기
// 2. indexOf를 사용하여 c가 나온 뒤에 인덱스에 c가 또 나온다면, -1이 아니므로
//    해당 c문자를 ""로 변환 (제거하기)
// 3. 제거되어 만들어진 answer를 charArr에 넣기
// 4. chArr 문자 배열을 사전순으로 정렬
//    (String[]보다 char[]이 성능상 더 좋음)

char[] chArr;

for (char c : answer.toCharArray()) {
    if (answer.indexOf(c, answer.indexOf(c) + 1) != -1) {
        answer = answer.replace(String.valueOf(c), "");
    }
}

chArr = answer.toCharArray();
Arrays.sort(chArr);
```
<br/>

### [**약수 구하기**](https://school.programmers.co.kr/learn/courses/30/lessons/120897)

```java
// Solution1
// 1. 1부터 n까지의 자연수를 반복하기
// 1-1. n을 반복하는 수로 나눴을때 나머지가 0이면 list에 담기
// 2. list에 담긴 숫자들을 int[] 배열에 옮겨서 반환

List<Integer> list = new ArrayList<>();

for (int i = 1; i <= n; i++) {
    if (n % i == 0)
        list.add(i);
}

answer = new int[list.size()];
for (int i = 0; i < answer.length; i++) {
    answer[i] = list.get(i);
}
```