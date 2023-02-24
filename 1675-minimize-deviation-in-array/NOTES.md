### 1675. Minimize Deviation in Array
- 배열 내 요소가 짝수이면 2로 나눠주기
- 배열 내 요소가 홀수이면 2를 곱해주기
- 최대값이면서 짝수이면 홀수가 될 때까지 나누기
- 최소값이면서 홀수이면 짝수가 될 때까지 곱하기
- 아래는 시간초과 코드입니다.
```java
class Solution {
public int minimumDeviation(int[] nums) {
int maxNum = Arrays.stream(nums).max().getAsInt();
int minNum = Arrays.stream(nums).min().getAsInt();
int maxIdx = Arrays.asList(nums).indexOf(maxNum);
int minIdx = Arrays.asList(nums).indexOf(minNum);
while (maxNum % 2 == 0 || minNum % 2 == 1) {
if (maxNum % 2 == 0) {
while (maxNum % 2 != 0) {
maxNum /= 2;
nums[maxIdx] = maxNum;
}
maxNum = Arrays.stream(nums).max().getAsInt();
maxIdx = Arrays.asList(nums).indexOf(maxNum);
}
if (minNum % 2 == 1) {
while (minNum % 2 != 1) {
minNum *= 2;
nums[minIdx] = minNum;
}
minNum = Arrays.stream(nums).min().getAsInt();
minIdx = Arrays.asList(nums).indexOf(minNum);
}
}
return maxNum - minNum;
}
}
```