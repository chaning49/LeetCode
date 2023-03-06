## 912. Sort an Array
### 문제 설명
- 내장 함수를 사용하지 않고 O(nlog(n))의 시간복잡도, 최소한의 공간복잡도를 가질 수 있는 배열 정렬 알고리즘을 작성하는 문제이다.
### 문제 해결
- 일반적으로 O(nlog(n))의 시간복잡도를 갖는 정렬 알고리즘은 **병합 정렬, 퀵 정렬, 힙 정렬**이 있다.
- 이번에는 힙 정렬로 구현해볼 생각이다.
- 배열에 있는 요소를 최소 힙에 모두 삽입한 후, 하나씩 꺼내서 배열에 삽입한다.

![알고리즈무-7](https://user-images.githubusercontent.com/79316402/222459417-3631c276-0de3-4f7a-8bcb-1a3b8b2123e5.jpg)