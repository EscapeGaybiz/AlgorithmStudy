## Day20
### 노션에서 확인
▶️[**click**](https://gipark181.notion.site/Day20-2024-08-05-b173b3494bd144fa919b472c557932f0?pvs=4)
<br/>
<hr/>

### [**배열의 길이를 2의 거듭제곱으로 만들기**](https://school.programmers.co.kr/learn/courses/30/lessons/181857)

[**Collections.nCopies**](https://docs.oracle.com/javase/8/docs/api/java/util/Collections.html#nCopies-int-T-)

```java
// Solution1
// 2의 제곱수 보다 arr 배열의 길이가 작거나 같아질때까지 반복하며, 반환할 배열의 size 구하기
while (true) {
    if (arr.length <= Math.pow(2, i)) {
        size = (int) Math.pow(2, i);
        break;
    }
    i++;
}

// 위에서 구한 size로 배열을 생성하여, size만큼 반복하며 answer에 값을 넣어준다
// arr 배열의 길이가 반복하는 인덱스의 길이보다 클때 answer에 arr의 요소를 넣어주기
// (arr의 인덱스를 넘어서는 ArrayIndexOutOfBoundsException 방지)
// 나머지는 0으로 넣어주기
answer = new int[size];
for (int j = 0; j < answer.length; j++) {
    if (j < arr.length) {
        answer[j] = arr[j];
    } else {
        answer[j] = 0;
    }
}

// Solution2
// Solution1과 동일하게 반복하며 2의 거듭제곱 보다 작거나 같아질때까지 반복하여 size 구하기
while (true) {
    if (arr.length <= Math.pow(2, i)) {
        size = (int) Math.pow(2, i);
        break;
    }
    i++;
}
// result에는 arr를 담아뒀고, size보다 작다면 0을 넣어줘야 하기 떄문에
// Collection.nCopies로 size - arr.length만큼 0을 넣어서 result 리스트에 추가하기
if (result.size() < size) {
    List<Integer> repeatElements = Collections.nCopies(size - result.size(), 0);
    result.addAll(repeatElements);
}
```
<br/>

### [**배열 비교하기**](https://school.programmers.co.kr/learn/courses/30/lessons/181856)

[**Arrays.compare**](https://docs.oracle.com/en%2Fjava%2Fjavase%2F11%2Fdocs%2Fapi%2F%2F/java.base/java/util/Arrays.html#compare(int%5B%5D,int%5B%5D))

```java
// arr1 배열 길이가 arr2 배열 길이 보다 클때
if (arr1.length > arr2.length) {
    answer = 1;
    
// arr1 배열 길이가 arr2 배열 길이 보다 작을때
} else if (arr1.length < arr2.length) {
    answer = -1;
    
// arr1 배열 길이와 arr2 배열 길이가 같을때
} else {
    int sum1 = 0;
    int sum2 = 0;

		// arr1과 arr2의 요소들의 합을 구하기
    for (int i = 0; i < arr1.length; i++) {
        sum1 += arr1[i];
        sum2 += arr2[i];
    }

		// arr1의 요소와 arr2의 요소들의 합의 크기 비교
    if (sum1 > sum2)
        answer = 1;
    else if (sum1 < sum2)
        answer = -1;
}

/* ================================================ */
// arr1 배열과 arr2 배열을 사전적으로 비교
int[] arr1 = {1, 2, 3, 4, 5}
int[] arr2 = {1, 2, 3, 4, 6}

Arrays.compare(arr1, arr2);    // arr2가 요소 6이 있어 더 크므로, 음수(< 0)가 반환
```
<br/>

### [**문자열 묶기**](https://school.programmers.co.kr/learn/courses/30/lessons/181855)

[**Arrays.sort**](https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html#sort-int:A-)

[**getAsInt**](https://docs.oracle.com/javase/8/docs/api/java/util/OptionalInt.html#getAsInt--)

[**Math.max**](https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#max-int-int-)

```java
// 원소의 길이 만큼 int[] 배열을 생성
int[] result = new int[31];

// strArr 문자열 배열을 반복하며,
// 각 문자열들의 길이를 인덱스로 인덱스의 요소를 +1 하여 개수를 체크한다
for (String str : strArr) {
    result[str.length()] += 1;
}

// result 배열의 요소에서 가장 큰 수(가장 개수가 많은 그룹)를 반환하는 방법

// Solution1
// result 배열을 오름차순 정렬 후 마지막 인덱스 반환
Arrays.sort(result);
return result[30];

// Solution2
// result 배열을 stream을 사용하여 max값을 찾고, 값이 으면 값을 반환
// 값이 없다면 NoSuchElementException을 던진다
return Arrays.stream(result).max().getAsInt();

// Soultion3
// result 배열을 모두 반복하며, 각각 요소들을 비교하여 max 값을 찾아 answer에 담기
for (int n : result) {
    answer = Math.max(answer, n);
}
return answer;
```
<br/>

### [**배열의 길이에 따라 다른 연산하기**](https://school.programmers.co.kr/learn/courses/30/lessons/181854)

[**ternary operator**](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op2.html)

```java
// arr 길이가 홀수라면 짝수 인덱스에 n을 더하고
// arr 길이가 짝수라면 홀수 인덱스에 n을 더한다
answer[i] = (answer.length % 2 != 0) ?
          (i % 2 == 0) ? answer[i] + n : answer[i] :
          (i % 2 != 0) ? answer[i] + n : answer[i];
```
<br/>

### [**뒤에서 5등까지**](https://school.programmers.co.kr/learn/courses/30/lessons/181853)

```java
// Solution1
// stream으로 num_list 배열을 정렬하고, 5개 제한을 걸고, 배열로 변환
Arrays.stream(num_list).sorted().limit(5).toArray();

// Solution2
// 1. answer을 5의 크기의 배열로 생성
// 2. num_list를 오름차순으로 정렬
// 3. answer.length(5)만큼 반복하며, num_list의 앞 순서부터 answer에 담기
int[] answer = new int[5];
Arrays.sort(num_list);
for (int i = 0; i < answer.length; i++) {
    answer[i] = num_list[i];
}
```