## 258. Add Digits
### 문제 설명
- num이 주어지고, 결과가 오직 한 숫자로 주어질때까지 모든 자릿수의 수를 반복적으로 더한다. 아니면 그것을 반환한다.
​
### 문제 해결 과정
- 자리별로 값을 구하고 정답을 구한다.
- while문을 2개 사용했는데, 뭔가 불편하지만 어쩔 수 없었다. 바깥쪽 while문은 정답이 나올때까지 순환하기 위해서 있는 것이고, 안쪽 while문은 num의 자릿수를 하나씩 더해주기 위해서 사용하는 용도이다.
- O(1) 시간 내에 풀 수 있는 방법은 9로 나눠주는 것이다. 9로 나눈 나머지 값이 자릿수의 최종 합산한 값이다.
- 기존 정답
``` java
class Solution {
public int addDigits(int num) {
int ans = 0;
while (num > 9) {
while (num > 0) {
ans += num % 10;
num /= 10;
}
num = ans;
ans = 0;
}
return num;
}
}
```
​
- O(1)
``` java
class Solution {
public int addDigits(int num) {
if (num == 0)
return 0;
else if (num % 9 == 0)
return 9;
else
return num % 9;
}
}
```