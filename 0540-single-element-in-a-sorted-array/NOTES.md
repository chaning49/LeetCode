### 540. Single Element in a Sorted Array
- 이진 탐색
- 배열의 가운데 값인 mid가 홀수인지 짝수인지에 따라 mid를 기준으로 정답이 왼쪽일지 오른쪽일지 유추할 수 있다.
- mid가 홀수인 경우(mid - 1)
  1. mid - 1과 mid가 같은 경우, mid 기준 오른쪽에 위치한 부분 배열에 정답이 있는 것으로 유추할 수 있다. -> start = mid + 2
  2. mid - 1과 mid가 다른 경우, mid 기준 왼쪽에 위치한 부분 배열에 정답이 있는 것으로 유추할 수 있다. -> end = mid
- mid가 짝수인 경우(mid)
  1. mid와 mid + 1이 같은 경우, mid 기준 오른쪽에 위치한 부분 배열에 정답이 있는 것으로 유추할 수 있다. -> start = mid + 2
  2. mid와 mid + 1이 다른 경우, mid 기준 왼쪽에 위치한 부분 배열에 정답이 있는 것으로 유추할 수 있다. -> end = mid
- 즉, mid 값을 기준으로 다음 값과 비교하면 어느 위치에 정답이 있는지 알 수 있다.
​
### 이전 정답 코드
Runtime: 1 ms 
<br>
Memory Usage: 48.3 MB
```java
class Solution {
  public int singleNonDuplicate(int[] nums) {
    int ans = 0;
    if (nums.length == 1) return nums[0];
    for (int i = 0; i < nums.length / 2; i++) {
      if (nums[2 * i] != nums[2 * i + 1]) {
        ans = nums[2 * i];
        return ans;
      }
    }
    if (nums.length % 2 == 1) ans = nums[nums.length - 1];
    return ans;
  }
}
```
