## 1721. Swapping Nodes in a Linked List
### 문제 설명
- 연결리스트의 head와 정수 k가 주어진다.
- 처음부터 k번째 노드의 값을, 끝부터 k번째 노드의 값을 스왑한 후 연결된 목록의 헤드를 반환한다(목록은 1-인덱스됨).
​
### 문제 해결 과정
- 연결리스트의 전체 크기를 알아낸 후에 k번째 노드와 뒤에서 k번째 노드를 스왑해주면 된다.
- 우선 길이를 찾는다.
- 바꿀 노드 2개를 leftNode, rightNode라고 하면 leftNode는 k만큼 head에서 이동, rightNode는 len - k + 1만큼 이동시킨다.
- 이후 각 노드의 val를 스왑해주고 head를 반환하면 된다.
​