### 502. IPO
- 모든 프로젝트의 비용을 min-heap으로 추출해내고, 작거나 같은 경우에 max-heap에 넣은 다음 가장 높은 값을 꺼내서 w에 더한다.
- 못 풀어서 코드 다시 해석해야댐...
- 그냥 솔루션 코드임...
- 아래 코드는 구글에서 줍줍한 코드! 보면서 공부할 예정!

```java
class Solution {
  public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
    PriorityQueue<Integer[]> pq = new PriorityQueue<>((a, b)-> a[0] - b[0]);
    PriorityQueue<Integer> pq2 = new PriorityQueue<>(Comparator.reverseOrder());

    for(int i = 0; i < profits.length; i++) {
      pq.add(new Integer[]{capital[i], profits[i]});
    }

    while(k-- != 0) {
      while(!pq.isEmpty() && pq.peek()[0] <= w) {
        pq2.add(pq.poll()[1]);
      }
      if(!pq2.isEmpty()) {
        w += pq2.poll();
      }
    }

    return w;
    }
}
```
