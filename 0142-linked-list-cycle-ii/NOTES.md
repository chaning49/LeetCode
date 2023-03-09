## 142. Linked List Cycle II
### 문제 설명
- 연결리스트의 헤드가 주어지면 사이클이 시작되는 지점의 노드를 반환해야 한다. 만약 사이클이 없다면 null을 반환한다.
- 목록에 다음 포인터를 계속 따라가다보면 다시 연결할 수 있는 노드가 있고 연결된 목록에 주기가 있다. 내부적으로 pos는 테일의 다음 포인터가 연결된 노드의 인덱스(0 인덱스)를 나타내는 데 사용된다. 주기가 없으면 -1이다. pos는 매개 변수로 전달되지 않는다.
### 문제 해결 과정
- 첫 번째 방법은 리스트를 사용하기 때문에 시간복잡도나 공간 복잡도가 썩 좋은 편은 아니다.
- head에 있는 node들을 하나씩 리스트에 집어넣으면서 순회할 때, node가 존재한다면 cycle이 존재하는 것이므로 while문을 빠져나와서 해당 노드가 존재하는 인덱스에 있는 node를 리턴한다.
- 만약 node가 null이거나 다음 node가 null이면 null을 리턴한다.
- node를 ListNode 형태로 리스트에 추가하면 각 노드의 주소값이 저장되기 때문에 val가 같다고 하더라도 주소값으로 노드의 위치를 찾을 수 있기 때문에 정상 동작한다.
```java
public class Solution {
public ListNode detectCycle(ListNode head) {
List<ListNode> nodes = new ArrayList<>();
ListNode node = head;
do {
if (node == null || node.next == null)
return null;
nodes.add(node);
node = node.next;
} while (!nodes.contains(node));
return nodes.get(nodes.indexOf(node));
}
}
```
- 두 번째 방법으로는 Floyd's Cycle Detection Algorithm(또는 토끼와 거북이 알고리즘)을 이용하기 때문에 O(n)의 시간복잡도를 가지는 알고리즘이다.
-
- 두 번째 방법으로는 Floyd's Cycle Detection Algorithm(또는 토끼와 거북이 알고리즘)을 이용하기 때문에 O(n)의 시간복잡도를 가지는 알고리즘이다.