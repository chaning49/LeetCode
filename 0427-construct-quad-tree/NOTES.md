## 427. Construct Quad Tree
### 문제 조건
- Quad Tree를 Divide And Conquer 방식으로 풀어내는 문제이다.
- 4분할이 가능한 2차원 배열에서 값이 모두 일치하지 않으면 4개로 나눠 sub grid를 만들고, 다시 값을 비교해본다.
- val가 true이면 1, false이면 0이고 isLeaf는 해당 노드가 맨 끝 노드인 경우 true, 아닌 경우 false이다.
### 문제 해결
- 배열을 나눠서 leaf 노드가 나올때까지 반복하는 메소드와 해당 배열의 값이 모두 같은지 판별하는 메소드를 작성해준다.
- 재귀 호출 방식으로 알고리즘이 돌아가는데, 초기 값부터 하나씩 확인해서 각 사분면마다 검사하여 leaf 노드가 나올 때까지 반복한다.