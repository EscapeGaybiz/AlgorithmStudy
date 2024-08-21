## Day08
### 노션에서 확인
▶️[**click**](https://gipark181.notion.site/Day08-2024-08-21-a09a11622114428cad755c1071ed6c9c?pvs=4)
<br/>
<hr/>

### [**배열 자르기**](https://school.programmers.co.kr/learn/courses/30/lessons/120833)

[**Arrays.copyOfRange**](https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html#copyOfRange-int:A-int-int-)

```java
// Solution1
// 1. numbers 배열을 복사할건데,
//    num1 인덱스(포함)부터, num2 + 1 인덱스(제외)까지 복사하여 새 배열을 반환

Arrays.copyOfRange(numbers, num1, num2 + 1);
```
<br/>

### [**외계행성의 나이**](https://school.programmers.co.kr/learn/courses/30/lessons/120834)

```java
// Solution1
// temp가 123인 경우,
// 1. temp는 3 자르고 12 -> 3 + 'a'는 'd'
// 2. temp는 2 자르고 1 -> 2 + 'a'는 'c'
// 3. temp는 1 -> 1 + 'a'는 'b'

// 'dcb' 인데 123 순서대로 넣어야하기때문에
// 마지막에 reverse해줘서, 'bcd' 반환

while (temp > 0) {
    sb.append((char)((temp % 10) + 'a'));
    temp /= 10;
}
return sb.reverse().toString();
```
<br/>

### [**진료순서 정하기**](https://school.programmers.co.kr/learn/courses/30/lessons/120835)

[**Arrays.sort**](https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html#sort-T:A-java.util.Comparator-)

[**Collections.reverseOrder**](https://docs.oracle.com/javase/8/docs/api/java/util/Collections.html#reverseOrder--)

```java
// Solution1
// 1. 주어진 인수인 emergency를 직접 변조하긴 싫기때문에 temp에 복사하여 사용
// 2. temp를 내림차순으로 정렬 (큰 수 -> 작은 수)
// 3. 순서대로 앞에서부터 번호를 매김 (순위)
// 4. 정렬하기전 emergency 배열 순서대로 해당 값에 맞는 순위를 get하여 새 배열로 반환

int[] temp = Arrays.copyOf(emergency, emergency.length);
Map<Integer, Integer> map = new HashMap<>();
int[] answer = new int[emergency.length];

Arrays.sort(temp);
for(int i = 0; i < temp.length / 2; i++) {
    int tempValue = temp[i];
    temp[i] = temp[temp.length - 1 - i];
    temp[temp.length - 1 - i] = tempValue;
}

for (int i = 0; i < temp.length; i++) {
    map.put(temp[i], i + 1);
}

for (int i = 0; i < answer.length; i++) {
    answer[i] = map.get(emergency[i]);
}
return answer;
```

```java
// Solution2
// 1. rank 배열을 emergeny 크기의 배열로 생성
// 2. Arrays.sort에서 내림차순으로 정렬하기위해 emergency 배열 원소들을 Integer 배열로 생성
// 3. 만들어진 Integer 배열을 내림차순 정렬
//    (Arrays.sort의 파라미터는 T[], 원시타입이 아닌 객체 클래스임) -> 그래서 Integer[]
// 4. 내림차순 정렬된 Integer 배열을 ArrayList로 만들고,
//    원래 emergency 배열에 있는 원소들을 찾아 해당 인덱스에 + 1 하여 rank 배열에 순위를 매김
//    (0순위는 없고, 1순위부터 있으므로 +1)

int[] rank = new int[emergency.length];

Integer[] sortedArr = Arrays.stream(emergency).boxed().toArray(Integer[]::new);
Arrays.sort(sortedArr, Collections.reverseOrder());

for (int i = 0; i < rank.length; i++) {
    rank[i] = Arrays.asList(sortedArr).indexOf(emergency[i]) + 1;
}
return rank;
```
<br/>

### [**순서쌍의 개수**](https://school.programmers.co.kr/learn/courses/30/lessons/120836)

```java
// Solution1
// 1. n이하의 자연수를 모두 반복하면서, 
//    n으로 나눈 자연수의 나머지가 0인 경우, n의 약수이므로 개수 카운트 증가

for (int i = 1; i <= n; i++) {
    if (n % i == 0) {
        answer++;
    }
}
```