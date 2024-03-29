## 879. Profitable Schemes
### 문제 설명
- n 멤버들의 그룹과 그들이 착수할 수 있는 다양한 범죄 리스트가 있다. i 번째 범죄는 profit[i] 만큼의 이익을 얻고 그 범죄에 참여하기 위해서는 group[i] 만큼의 멤버가 요구된다. 만약 한 멤버가 하나의 범죄에 참여하면, 그 멤버는 다른 범죄에 참여할 수 없다.
- 수익성 있는 계획을 최소 minProfit 만큼의 이익을 창출하는 범죄의 하위 집합이라고 하고, 범죄들의 하위 집합에 참여하는 전체 멤버의 수는 최대 n이다.
- 선택될 수 있는 계획의 수를 반환해라. 정답이 매우 크기 때문에 10^9 + 7의 modulo 연산을 반환하면 된다.
​
### 문제 해결 과정
- 우선 시간복잡도에 대해 고려해보자. 100개의 원소가 최대이지만 조합을 구하는 것이기 때문에 최대 100개를 조합했을 때, 가능한 모든 경우의 수는 2^100 - 1개이다. 그 이유는 혼자서도 minProfit을 채울 수 있는 경우부터 100개의 원소를 모두 사용하는 경우를 구해야 하기 때문에 아무도 참여하지 않는 경우를 하나 빼주어야 한다. 하지만 10^9 + 7로 모듈러 연산을 수행하기 때문에 표현 가능한 범위까지 줄어들 것이다.
- 재귀로 조합을 구현해보려 했지만 시간초과 이슈로 중단.
- dp로 하는 방법이 있다는 것을 들었지만 구현을 못하겠음. **정답 봤음**
- dp는 group과 profit을 가지고 minProfit 이상인 경우의 수를 개수별로 저장하고, minProfit 미만의 경우는 저장만해주는 방식을 사용한다.
​
Input: n = 5, minProfit = 3, group = [2,2], profit = [2,3]
Output: 2
​
g = 2, 2
p = 2,
k = 0,
i = 3 -> 2
j = 5 - 2 = 3 -> 2
i + p = 5,
​
newProfit = min(5, 3) = 3 -> min(4, 3) = 3
dp[newProfit][j + g] = dp[3][5]
​