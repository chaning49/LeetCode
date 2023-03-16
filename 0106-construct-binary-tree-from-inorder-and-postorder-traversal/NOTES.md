## 106. Construct Binary Tree from Inorder and Postorder Traversal
### 문제 설명
- inorder 배열은 이진 트리의 중위 순회 결과를, postorder 배열은 이진 트리의 후위 순회 결과를 나타내는 두 개의 정수 배열이 주어진다. 이 두 배열을 기반으로 이진 트리를 만들고 반환하는 함수를 작성하라.
- inorder와 postorder의 길이가 같다. 길이는 1~3000 사이이다.
- inorder와 postorder의 값은 -3000~3000 사이이다.
- 트리 내에 모든 값들은 unique하다. 즉 중복이 없다.
- inorder, postorder는 트리에서 중위 순회, 후위 순회의 순서를 담고 있는 배열이다.
​
### 문제 해결 과정
- 원소가 없으면 null, 하나인 경우에는 inorder나 postorder에 있는 값을 TreeNode 타입으로 return하면 된다.
- postorder의 마지막 원소는 항상 트리의 root가 되고, 트리의 root를 inorder에서 찾은 후 root를 기준으로 좌, 우로 나누면 해당 트리의 왼쪽 서브트리와 오른쪽 서브트리를 구할 수 있다.
- 재귀적 방법으로 왼쪽과 오른쪽의 서브트리에서 inorder와 postorder 방식으로 root를 찾고 서브트리를 찾아나가다보면 문제에서 제시하는 트리 형태를 찾을 수 있다.