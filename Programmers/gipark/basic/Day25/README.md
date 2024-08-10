## Day25
### 노션에서 확인
▶️[**click**](https://gipark181.notion.site/Day25-2024-08-11-e35cf0a91d15429fac2f10c0bae34d22?pvs=4)
<br/>
<hr/>

### [**정수를 나선형으로 배치하기**](https://school.programmers.co.kr/learn/courses/30/lessons/181832)

```java
int[][] answer = new int[n][n];
// x,y축을 기준으로 어떤 방향으로 가는지 정해주기
// dx: 정지, 아래, 정지, 위
// dy: 오른쪽, 정지, 왼쪽, 정지
int[] dx = {0, 1, 0, -1};
int[] dy = {1, 0, -1, 0};
int x = 0, y = 0;
int cur = 0;

// 1부터 16까지 반복
for (int i = 1; i <= n * n; i++) {
    answer[x][y] = i;
    // 
    int nx = x + dx[cur];
    int ny = y + dy[cur];
    if (nx < 0 || nx >= n || ny < 0 || ny >= n || answer[nx][ny] != 0) {
        cur = (cur + 1) % 4;
        nx = x + dx[cur];
        ny = y + dy[cur];
    }
    x = nx;
    y = ny;
}
```
<br/>

### [**특별한 이차원 배열 2**](https://school.programmers.co.kr/learn/courses/30/lessons/181831)

```java
int answer = 1;

// arr 이차원 배열을 반복
for (int i = 0; i < arr.length; i++) {
    for (int j = 0; j < arr[i].length; j++) {
		    // arr(i,j)와 arr(j,i)가 다른게 하나라도 있다면 대칭이 아니므로 0을 넣기
        if (arr[i][j] != arr[j][i]) {
            answer = 0;
            break;
        }
    }
}
```
<br/>

### [**정사각형으로 만들기**](https://school.programmers.co.kr/learn/courses/30/lessons/181830)

```java
// arr.length(행의 길이)랑 arr[0].length(열의 길이) 중 큰 값
int length = Math.max(arr.length, arr[0].length);
// length 길이의 이차원 배열을 생성
int[][] answer = new int[length][length];

// answer 배열의 행의 길이만큼 반복
for (int i = 0; i < answer.length; i++) {
		// IndexOutOfBoundsException 방지를 위해서
		// arr 배열의 길이보다 인덱스 i가 작을 때
    if (i < arr.length)
		    // arr의 i 번째 배열을 answer의 i번째 배열의 길이만큼 넣기
		    // arr길이 보다 answer의 길이가 더 크다면, 나머지는 0으로 채워짐
        answer[i] = Arrays.copyOf(arr[i], answer[i].length);
    else
		    // arr 배열의 길이보다 크다면 나머지 행들의 배열은 모두 0으로 채우기
        Arrays.fill(answer[i], 0);
}
```
<br/>

### [**이차원 배열 대각선 순회하기**](https://school.programmers.co.kr/learn/courses/30/lessons/181829)

```java
// board 이차원 배열의 행의 길이만큼 반복
for (int i = 0; i < board.length; i++) {
		// board 이차원 배열의 i번째 행 배열의 길이만큼 반복
    for (int j = 0; j < board[i].length; j++) {
		    // i번째 인덱스와 j번째 인덱스의 인덱스끼리 더한 값이 k보다 작거나 같다면
        if (i + j <= k) {
		        // board 이차원 배열의 해당 인덱스 [i][j]의 값을 더하기
            answer += board[i][j];
        }
    }
}
```