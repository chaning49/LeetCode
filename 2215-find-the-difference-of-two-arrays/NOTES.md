## 2215. Find the Difference of Two Arrays
### 문제 설명
- 인덱스가 0부터 시작하는 정수형 배열 nums1과 nums2가 주어지고, 크기가 2인 리스트 answer을 다음과 같은 조건을 기반으로 반환해라.
- answer[0]는 num2에 없는 num1의 모든 고유한 정수 목록이다.
- answer[1]는 num1에 없는 num2의 모든 고유한 정수 목록이다.
- 목록의 정수는 임의의 순서로 반환될 수 있다.
​
### 문제 해결 과정
- 시간복잡도 상으로는 nums1과 nums2의 개수가 최대 1000개이므로 O(N^2)까지 문제 없을 것이다.
- 순차적으로 만들어보면 nums1과 nums2에도 중복값이 존재하는 경우가 있으므로 배열 내에 있는 중복을 제거한 뒤에 리스트에서 서로 존재하는 값을 빼고 정답 배열에 추가한다.
- 단순하게 Set을 사용하는 방법도 사용해보았다.
- Set에 배열에 있는 값을 모두 추가하고, 이전 방식과 동일한 로직을 수행한다.
- 기존 정답
```java
class Solution {
public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
List<List<Integer>> answer = new ArrayList<>(2);
answer.add(new ArrayList<>());
answer.add(new ArrayList<>());
// 배열에 포함된 중복 제거하면서 List 생성
List<Integer> list1 = addList(nums1);
List<Integer> list2 = addList(nums2);
// 리스트에서 서로 존재하는 값을 제거
for (Integer l1 : list1) {
if (!list2.contains(l1))
answer.get(0).add(l1);
}
for (Integer l2 : list2) {
if (!list1.contains(l2))
answer.get(1).add(l2);
}
return answer;
}
private List<Integer> addList(int[] arr) {
List<Integer> list = new ArrayList<>(arr.length);
for (int i = 0; i < arr.length; i++) {
if (!list.contains(arr[i]))
list.add(arr[i]);
}
return list;
}
}
```