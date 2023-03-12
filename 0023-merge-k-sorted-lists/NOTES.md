## 23. Merge k Sorted Lists
### 문제 설명
- 연결리스트 형태의 k개의 리스트가 있는 배열이 주어지고, 각 연결리스트는 오름차순으로 정렬되어 있다.
- 모든 연결리스트들을 하나의 정렬된 연결리스트로 만들어서 반환해야 한다.
​
### 문제 해결 과정
- **아이디어가 떠오르지 않아서 정답을 보고 풀었습니다.**
- lists 내에 있는 원소들을 한 리스트에 모두 옮겨 담고, 해당 리스트에 있는 값들을 하나의 ListNode 형태로 합친다.
-
​
```java
// Heap을 사용하여 푸는 방법
// 초기 코드(미완성)
class Solution {
public ListNode mergeKLists(ListNode[] lists) {
if (lists.length == 0)
return null;
Queue<ListNode> minHeap = new PriorityQueue<>((a, b) -> a.val - b.val);
for (ListNode list : lists) {
if (list != null)
minHeap.offer(list);
}
ListNode ans = new ListNode();
ListNode curNode = ans;
while (!minHeap.isEmpty()) {
ListNode minNode = minHeap.poll();
curNode.next = minNode;
curNode = curNode.next;
if (minNode.next != null)
minHeap.offer(minNode.next);
}