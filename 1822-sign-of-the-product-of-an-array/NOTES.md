## 1822. Sign of the Product of an Array
### 문제 설명
- signFunc(x)라는 함수가 있고, 다음을 반환한다.
- x가 양수이면 1 반환
- x가 음수이면 -1 반환
- x가 0이면 0 반환
- 정수형 배열 nums가 주어진다. product는 배열 nums에 있는 모든 값의 곱으로 둔다.
- signFunc(product)를 반환해라.
​
### 문제 해결 과정
- 배열에 있는 값을 전부 곱한다.
- 그 다음 signFunc(product)를 구한다.
- 그런데, 배열을 정렬하고 0보다 작아지는 지점을 찾아서 음수의 개수를 세면 1인지 -1인지 판별이 가능하고, 0과 같아지는 경우가 있으면 0으로 반환해줄 수 있다. 그러면 시간복잡도가 더 줄어들지 않을까?
- 다시 해보자!
-
- 정답이 안나오는 코드(곱셈을 이어나가다보면 int의 표현 범위를 벗어난다. long으로 해도 마찬가지)
```java
class Solution {
public int arraySign(int[] nums) {
long product = 1L;
for (int n : nums) {
product *= n;
if (product == 0)
break;
System.out.println(product);
}
return signFunc(product);
}
private int signFunc(long x) {
if (x > 0)
return 1;
else if (x < 0)
return -1;
else
return 0;
}
}
```
​