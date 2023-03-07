## 2187. Minimum Time to Complete Trips
### 문제 설명
- time 배열이 주어지고 time[i]는 bus를 타고 여행하는데 걸리는 소요시간이다.
- totalTrips가 주어지는데 time 배열에 있는 차량의 운행 횟수가 최소가 되는 시간을 찾는 문제이다.
### 문제 해결
- 이진 탐색으로 해결하는 문제이다. 내가 보통 문제를 보면서 이유 없이 그리디인가 싶은 문제들은 parametric search 문제인게 참 신기할 따름이다.
- 해당 문제에서 찾는 값은 배열 내에 있지 않다. 오히려 특정 범위를 설정해주고 그 범위 사이에 있는 정답을 찾아가는 문제이다.
- 나는 문제에서 제시된 조건을 기반으로 범위를 설정해주었다. (물론 주석 처리한 부분처럼 배열의 최댓값과 totalTrips를 곱해주는 것이 더 나은 방법이다.)
- 이진 탐색으로 시작해서 totalTrips에 가까워지는 값을 찾아야 한다. 그래서 나는 makeTotal이라는 메소드를 만들어 time 배열에 있는 모든 값으로 mid를 나눈 값을 더한 값(value)과 totalTrips를 비교해주면서 범위를 좁혀나갔다.
- Thx [jongwuner](https://github.com/jongwuner) :)