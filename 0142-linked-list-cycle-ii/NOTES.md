## 142. Linked List Cycle II
### 문제 설명
- 연결리스트의 헤드가 주어지면 사이클이 시작되는 지점의 노드를 반환해야 한다. 만약 사이클이 없다면 null을 반환한다.
- 목록에 다음 포인터를 계속 따라가다보면 다시 연결할 수 있는 노드가 있고 연결된 목록에 주기가 있다. 내부적으로 pos는 테일의 다음 포인터가 연결된 노드의 인덱스(0 인덱스)를 나타내는 데 사용된다. 주기가 없으면 -1이다. pos는 매개 변수로 전달되지 않는다.
### 문제 해결 과정
- 첫 번째 방법은 리스트를 사용하기 때문에 시간복잡도나 공간 복잡도가 썩 좋은 편은 아니다.
- head에 있는 node들을 하나씩 리스트에 집어넣으면서 순회할 때, node가 존재한다면 cycle이 존재하는 것이므로 while문을 빠져나와서 해당 노드가 존재하는 인덱스에 있는 node를 리턴한다.
- 만약 node가 null이거나 다음 node가 null이면 null을 리턴한다.
- node를 ListNode 형태로 리스트에 추가하면 각 노드의 주소값이 저장되기 때문에 val가 같다고 하더라도 주소값으로 노드의 위치를 찾을 수 있기 때문에 정상 동작한다.

![알고리즈무-22](https://user-images.githubusercontent.com/79316402/224492373-f647843e-a887-49b9-8390-23ef16c58c99.jpg)

```java
// 2번째 방법
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
- 한 칸씩 움직이는 turtle과 두 칸씩 움직이는 rabbit을 두어 cycle이 존재하는지 찾아본다. cycle이 존재한다면 turtle과 rabbit이 만나는 순간이 생기고, cycle이 존재하지 않는다면 node나 node.next 값이 null인 경우가 생긴다.
- cycle이 존재함을 확인하면 turtle을 다시 시작점으로 옮기고 이번에는 turtle과 rabbit을 한 칸씩 이동시켜 만나게 되는 지점이 사이클의 시작점이다. 그 이유는 cycle 내에 특정 위치에 있는 rabbit으로부터 cycle 방향대로 이동한 거리와 head에서부터 cycle의 시작점에 도달하는 거리가 같기 때문이다.

![알고리즈무-23](https://user-images.githubusercontent.com/79316402/224492379-83b18b59-c0e7-4f94-ad04-06368038b2d8.jpg)

