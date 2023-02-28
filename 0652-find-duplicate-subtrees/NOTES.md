## 652. Find Duplicate Subtrees
### 문제 조건
- 중복인 subtree를 모두 찾는 문제이다.
### 문제 해결
- dfs로 풀 수 있는 문제이다.
- 맨 마지막 노드를 찾아가면 null 값이 나오게 돼있기 때문에 null이 나오면 재귀함수를 빠져나온다.
- key에는 만들 수 있는 subtree를 String 타입으로 저장하고, 그 개수를 체크하기 위해서 value에는 Integer 타입을 저장한다. Integer 타입은 null 값도 저장할 수 있기 때문에 처리가 더 쉬워졌다.
- value 값이 null이면 value에 1을 저장해주고, check 맵에 그대로 저장해준 후 key를 return한다.
- key를 return하는 이유는 재귀적으로 subtree를 만들기 때문이다.

![알고리즈무-6](https://user-images.githubusercontent.com/79316402/221876010-4aeb9841-5bd4-440d-98df-34b4ce912f1b.jpg)
