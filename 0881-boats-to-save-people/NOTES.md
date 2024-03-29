## 881. Boats to Save People
### 문제 설명
- people 배열이 주어지는데, people[i]는 i번째 사람의 몸무게이고 최대로 실을 수 있는 무게가 limit인 배가 무한하게 있다. 각 보트는 동시에 최대 두 명까지만 실어 나를 수 있고, 그 사람들의 무게의 합은 최대 limit까지 가능하다.
- 주어진 인원을 실어 나를 수 있는 배의 최소 개수를 반환해라.
​
### 문제 해결 과정
- 일단 정렬을 해서 boat에 실을 수 있는 무게를 구한다.
- 탐색을 통해 limit 값이 시작되는 지점을 찾고, 그 아래에 있는 값들을 기준으로 boat의 개수를 구한다. 여기서 limit보다 people의 원소가 커지는 경우는 없으므로 고려하지 않아도 된다.
- 얼추 비슷했지만 코드는 바보같이 작성함.
- 오름차순으로 정렬하면 배열 내에서 최솟값과 최댓값을 더했을 경우 limit 값과 같거나 작은지 체크해주어야 배의 개수를 최소로 만들 수 있다.