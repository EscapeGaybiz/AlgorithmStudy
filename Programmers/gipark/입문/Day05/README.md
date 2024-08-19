## Day05
### 노션에서 확인
▶️[**click**](https://gipark181.notion.site/Day5-2024-08-19-225539f623da4d4590ae87eeb8812d57?pvs=4)
<br/>
<hr/>

### [**옷가게 할인 받기**](https://school.programmers.co.kr/learn/courses/30/lessons/120818)

```java
// 큰 값부터 할인율을 지정해 주면 if - else if 사용 가능
if (price >= 500000) {
    sale = 0.8;
} else if (price >= 300000) {
    sale = 0.9;
} else if (price >= 100000) {
    sale = 0.95;
}
```
<br/>

### [**아이스 아메리카노**](https://school.programmers.co.kr/learn/courses/30/lessons/120819)

```java
// 1 번째 인덱스: 마실 수 있는 최대 아메리카노의 잔 수
// 2 번째 인덱스: 아메리카노를 최대로 사고 난 나머지 금액
new int[]{money / 5500, money % 5500};
```
<br/>

### [**나이 출력**](https://school.programmers.co.kr/learn/courses/30/lessons/120820)

```java
// 1번
2022 - (age - 1);

// 2번
2022 - age + 1;
```
<br/>

### [**배열 뒤집기**](https://school.programmers.co.kr/learn/courses/30/lessons/120821)

```java
// Solution1
int j = 0;
for (int i = num_list.length - 1; i >= 0; i--) {
    answer[j++] = num_list[i];
}

// Solution2
for (int num : num_list) {
    list.add(num);
}
Collections.reverse(list);

for (int i = 0; i < answer.length; i++) {
    answer[i] = list.get(i);
}
```