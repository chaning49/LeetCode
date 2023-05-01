## 1491. Average Salary Excluding the Minimum and Maximum Salary
### 문제 설명
- 유일한 정수로만 이루어진 salary 배열이 주어지고, salary[i]는 i번째 직원의 월급이다.
- 최대와 최소 월급을 제외한 직원들의 월급 평균을 반환해라. 실제 답변은 소수점 아래 5번째까지만 표시한다.
​
### 문제 해결 과정
- 배열 salary의 최대와 최소 월급을 찾아서 저장한 후에 salary 배열을 순회하면서 최대, 최소인 경우에는 continue로 넘어가고 나머지 숫자는 모두 더한다.
- 그 후 더한 숫자를 salary - 2로 나누어주면 최대와 최소를 제외한 합의 평균을 구할 수 있다.
- 기존 정답
```java
class Solution {
public double average(int[] salary) {
double ans = 0.0;
int maxNum = Arrays.stream(salary).max().getAsInt();
int minNum = Arrays.stream(salary).min().getAsInt();
for (int sal : salary) {
if (maxNum == sal || minNum == sal)
continue;
ans += (double) sal;
}
ans /= (double) (salary.length - 2);
return ans;
}
}
```
​
-