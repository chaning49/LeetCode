## 2336. Smallest Number in Infinite Set
### 문제 설명
- 양의 정수 [1, 2, 3, 4, 5,...]을 포함하는 집합을 가지고 있다.
- SmallestInfiniteSet 클래스는 다음과 같이 구현된다.
- SmallestInfiniteSet()은 SmallestInfiniteSet 객체가 모든 양의 정수를 포함하는 것으로 초기화된다.
- int popSmallest()는 무한 집합에 포함된 가장 작은 정수를 제거하고 반환한다.
- void addBack(int num)은 무한 집합의 맨 뒤에 양의 정수를 하나 추가하고, 만약 무한 집합에 이미 포함되어 있다면 아무 동작도 하지 않는다.
​
### 문제 해결 과정
- SmallestInfiniteSet()은 SmallestInfiniteSet의 인스턴스를 생성해주는 용도로 사용한다. 1부터 1000까지의 값을 모두 넣어준다.
- int popSmallest()에서는 가장 작은 값을 제거하고 반환한다.
- addBack(int num)은 num이 포함되어 있는 경우에만 값을 추가하고, 오름차순으로 정렬해준다.
- 훨씬 더 효율적인 코드!
​