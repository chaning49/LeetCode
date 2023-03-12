## 23. Merge k Sorted Lists
### 문제 설명
- 연결리스트 형태의 k개의 리스트가 있는 배열이 주어지고, 각 연결리스트는 오름차순으로 정렬되어 있다.
- 모든 연결리스트들을 하나의 정렬된 연결리스트로 만들어서 반환해야 한다.
​
### 문제 해결 과정
- lists 내에 있는 원소들을 한 리스트에 모두 옮겨 담고, 해당 리스트에 있는 값들을 하나의 ListNode 형태로 합친다.
- 내가 놓친 것은 mergeList에 ListNode 값을 저장해야 하는데, ListNode의 val 값을 넣어서 합칠 방법을 몰랐다는 것이다.
- 클래스에 있는 값을 기준으로 정렬할 때는 람다 함수를 사용하는 것이 편하다.
- 오름차순: Collections.sort(정렬이 필요한 클래스, (a, b) -> a.value - b.value);
- 내림차순: Collections.sort(정렬이 필요한 클래스, (a, b) -> b.value - a.value);
​
```java
// Heap을 사용하여 푸는 방법
class Solution {
public ListNode mergeKLists(ListNode[] lists) {
if (lists.length == 0)
return null;
Queue<ListNode> minHeap = new PriorityQueue<>((a, b) -> a.val - b.val);
for (ListNode list : lists) {
if (list != null)
minHeap.offer(list);
}