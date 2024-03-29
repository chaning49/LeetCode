## 704. Binary Search
### 문제 설명
- 오름차순으로 정렬된 배열 nums와 정수 target이 주어지고, nums 내에 있는 target을 찾는 함수를 작성해라. 만약 target이 존재한다면 해당 인덱스를 반환한다. 없으면 -1을 반환해라.
- 해당 알고리즘의 시간 복잡도는 O(log n)이어야 한다.
​
### 문제 해결 과정
- 이진 탐색을 구현하면 되는 문제입니다.
- 제가 실수한 것이 있는데, while 문에서 left < right로 조건을 준 부분입니다. left < right로 하게 되면 배열에 원소가 하나만 있는 경우, start = 0, end = 0으로 while문이 돌지 않아 target 값과는 상관 없이 -1이 반환되기 때문입니다.
- 제 코드 상에서는 while문의 조건이 left <= right가 되어야 전체 경우를 탐색할 수 있습니다.