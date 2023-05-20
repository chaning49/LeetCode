## 1. Two Sum
### 문제 설명
- 정수형 배열 nums와 정수 target이 주어지고, 두 수의 합이 target이 되는 배열의 인덱스를 반환해라.
- 각 입력이 정확하게 하나의 정답을 가지고 같은 요소를 두 번 사용하지 않을 것이라고 가정한다.
- 정답의 순서는 고려하지 않는다.
​
### 문제 해결 과정
- 이분 탐색으로 두 수의 합을 target과 비교한 이후 정답을 반환한다.
- 이를 위해서는 우선 오름차순 정렬이 필요하다.
- 근데 인덱스를 반환해야 하므로 제낀다.
- 일단 완전 탐색부터 사용해보자. 이 방법은 정답이지만 O(N^2)이므로 최적화된 답 또한 생각해보아야 한다.
- Map에 해당 인덱스와 매칭되는 값을 저장한다. 이 때, 값을 key, 인덱스를 value로 두어서 target - nums[i]에 해당하는 key가 존재하는지 여부를 찾으면 정답을 알 수 있다.
- 기존 코드
```java
class Solution {
public int[] twoSum(int[] nums, int target) {
for (int i = 0; i < nums.length; i++) {
for (int j = i + 1; j < nums.length; j++) {
if (nums[i] + nums[j] == target)
return new int[] {i, j};
}
}
return new int[] {};
}
}
```
​
- 최적화 코드
​