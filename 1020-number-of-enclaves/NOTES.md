## 1020. Number of Enclaves
### 문제 설명
- m x n 이진 배열 grid가 주어지고, 0은 바다, 1은 땅이다.
- 이동은 한 땅에서 인접한 다른 땅(네 방향 - 상하좌우)로 이동하거나 grid의 경계를 벗어나는 것으로 구성된다.
- 이동 횟수에 관계없이 grid의 경계를 벗어날 수 없는 grid의 땅 수를 반환해라
​
### 문제 해결 과정
- 어제 풀었던 문제와 거의 같다고 봐도 무방한 문제인듯! dfs로 전처리 및 정답을 구해줄 수 있을 것이라는 생각이 든다.
- 테두리에 위치한 땅의 경우는 네 방향이 모두 바다일 수 없기 때문에 그냥 바다로 바꿔줘도 된다.
- 그 후에 남은 땅의 개수를 세서 반환한다.
- **2차원 배열의 합을 구할 때는 행의 합을 stream으로 구하면 간단하다! 하지만 이중 for문을 사용했을 때보다는 시간 복잡도가 다소 증가한다.**
​
```java
// stream을 사용하지 않았던 방법 (Runtime: 8ms)
int ans = 0;
​
for (int i = 0; i < n; i++)
for (int j = 0; j < m; j++)
if (grid[i][j] == 1)
ans++;
​
return ans;
```
​