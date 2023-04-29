## 1697. Checking Existence of Edge Length Limited Paths
### 문제 설명
- n개의 노드들로 이루어진 무방향 그래프는 edgeList에 의해 정의되고, edgeList[i] = [ui, vi, disi]는 거리 disi를 갖는 노드 ui와 vi 사이의 에지를 나타낸다. 두 노드 사이에 여러 개의 에지가 있을 수 있다.
- queries라는 배열이 주어지는데, queries[j] = [pj, qj, limitj]에서 각 queries[j]가 pj와 qj 사이에ㅔ 각각의 에지상의 경로가 완전하게 limitj보다 작은지 아닌지를 결정해야 한다.
- boolean 타입의 배열 answer를 반환하는데, answer.length == queries.length이고 query[j]에 대한 경로가 있으면 answer의 j번째 값이 true이고 그렇지 않으면 false이다.
​
### 문제 해결 과정
- 우선 그래프에 서로의 연결 성분을 표시해주어야 한다. 양방향이지만 edgeList에 있는 값 중에서 거리가 최소인 값을 넣어주면 된다.
- queries를 한 번 실행할 때마다 시작점으로부터 목표지점까지 갈 수 있는 경로의 값을 찾아서 경로의 값이 queries[2]보다 작다면 true, 아닌 경우에는 false를 정답 배열에 넣어준다.
- 방법으로는 해당 경로에 해당하는 경우의 수를 모두 찾아서 가능한 경우가 하나라도 있다면 true가 되도록 만들어야 한다.
- 구현 실패 ...
- **정답 코드 설명**
- union-find 알고리즘 문제라고 한다. 어제 나왔던 문제가 union-find 문제라서 연달아 출제한 것으로 보인다.
- 아직 이해하지 못해서 코드를 남겨둘 생각! 이해하고 나서 이어서 작성하겠다.