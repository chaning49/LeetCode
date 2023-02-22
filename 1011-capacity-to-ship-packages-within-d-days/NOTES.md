### 1011. Capacity To Ship Packages Within D Days
- 이진 탐색
- weights 배열에 있는 패키지들을 days에 나누는데, 그 안에서 최소 output을 찾아내야 한다.
- 시작 값은 배열 내에 있는 값 중에서 최대값이 되고, 마지막 값은 총합이 되어야 한다.
- 이진 탐색 코드 내에서는 parameter search라는 방법을 사용하는데, 이 문제에서는 weigths에 있는각 weight 하나씩 꺼내어 중간 값인 mid와 대조해본다. 찾는 기준인 mid의 값과 weight + sum 값에 따라 cnt가 정해지는데, cnt와 days를 비교해서 찾는 범위를 줄여나간다.