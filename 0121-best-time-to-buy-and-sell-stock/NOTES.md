### 121. Best Time to Buy and Sell Stock
- 주식 수익을 극대화 했을 때의 금액을 찾는 문제입니다.
- 저점에 구매해서 가능한 한 고점에 팔아야 합니다.
- pivot을 하나 두고 배열의 값와 비교를 합니다.
- 만약 pivot보다 배열값이 크다면 배열값 - pivot입니다. 이 값 중에서 가장 큰 값을 찾으면 됩니다.
- 반대로 pivot이 배열값보다 작다면 pivot 값을 배열값으로 변경합니다.

![알고리즈무-4](https://user-images.githubusercontent.com/79316402/221363013-d4a048df-2ff2-45f0-a24a-647e0c4d10d7.jpg)
