## 1431. Kids With the Greatest Number of Candies
### 문제 설명
- 사탕들을 가진 어린이들이 n명 있다. 정수형 배열 candies가 주어지고, candies[i]는 i번째 어린이가 가진 사탕의 개수를 의미하며 정수 extraCandies는 당신이 가진 여분의 사탕 개수를 뜻한다.
- 길이가 n인 boolean형 배열인 result를 반환해야 하는데, result[i]는 i번째 어린이에게 extraCandies를 모두 주고 나서 다른 모든 어린이들 중 가장 많은 사탕을 가지게 된다면 true, 아니면 false를 반환해라.
- 여러 명의 어린이들이 가장 많은 사탕을 가지고 있을 수 있음을 기억하자.
​
### 문제 해결 과정
- 우선 candies에서 최대값(사탕의 최대 개수)을 구하여 저장한 뒤, candies를 순회하면서 extraCandis와 candies[i]와 candies의 최대값을 비교한다.
- 비교한 결과를 리스트에 저장해서 반환하면 된다.