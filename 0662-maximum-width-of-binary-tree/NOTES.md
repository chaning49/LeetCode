## 662. Maximum Width of Binary Tree
### 문제 설명
- 이진 트리의 root가 주어지고, 주어진 트리의 최대 너비를 반환해라.
- 트리의 최대 너비는 모든 깊이 사이에서 최대 너비여야 한다.
- 한 깊이의 너비는 마지막 노드(가장 왼쪽과 가장 오른쪽의 null이 아닌 노드) 사이의 길이로 정의되며, 여기서 해당 레벨까지 확장되는 전체 이진 트리에 존재할 엔드 노드 사이의 null 노드도 길이 계산에 포함된다. -> 왼쪽과 오른쪽에서 null이 아닌 최대 노드 사이에 몇 개의 노드가 존재할 수 있는지 개수를 세는 것!
- 32비트 부호 정수의 범위 안에 정답이 있음을 보장한다.
​
### 문제 해결 과정
- bfs로 탐색해야 각 깊이에서의 최대 개수를 반환할 수 있을 것 같다.
- 각 깊이별로 가능한 최대값을 구하고 전체 최대값을 저장하는 변수와 비교해주면 될듯!
- 노드와 인덱스 숫자를 저장해서 레벨별로 첫 값과 마지막 값을 빼면 개수를 구할 수 있다.
- 큐의 사이즈는 레벨별로 가능한 최대 개수이다. 그렇기 때문에 첫 번째 인덱스와 마지막 인덱스를 저장해놓으면 크기를 알 수 있다.