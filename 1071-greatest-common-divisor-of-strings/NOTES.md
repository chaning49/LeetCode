## 1071. Greatest Common Divisor of Strings
### 문제 설명
- 두 개의 문자열 s와 t는 만약 s = t + ... + t인 경우에 "t가 s를 분리한다"고 이야기한다. (t는 그 자체로 하나 또는 그 이상이 이어붙여진다.)
- str1과 str2가 주어지고, x가 str1과 str2가 분리되는 가장 큰 문자열 x를 반환해라.
​
### 문제 해결 과정
- gcdOfStrings 메서드는 주어진 두 문자열 str1과 str2의 최대 공약수를 찾아 반환합니다.
- if (!(str1 + str2).equals(str2 + str1)) return "";는 두 문자열을 이어 붙였을 때 동일하지 않다면 두 문자열의 최대 공약수가 존재하지 않으므로 빈 문자열을 반환합니다. 이는 문자열의 순서가 서로 다르기 때문에 최대 공약수를 가질 수 없음을 나타냅니다.
- int gcd = gcd(str1.length(), str2.length());은 str1과 str2의 길이를 이용하여 최대 공약수를 계산합니다. gcd 변수에 최대 공약수를 저장합니다.
- return str1.substring(0, gcd);은 str1 문자열에서 첫 번째 문자부터 최대 공약수 길이만큼의 부분 문자열을 반환합니다. 이는 str1과 str2의 최대 공약수를 나타냅니다.
- private int gcd(int a, int b)는 유클리드 알고리즘을 이용하여 주어진 두 수 a와 b의 최대 공약수를 계산하는 메서드입니다. 재귀적으로 호출하여 최대 공약수를 계산합니다.