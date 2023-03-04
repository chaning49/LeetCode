## 2444. Count Subarrays With Fixed Bounds
### 문제 설명
- 정수 타입의 배열 nums와 2개의 정수 minK, maxK가 있다.
- 다음의 조건을 만족하는 subarray의 개수를 구해야 한다.
- subarray의 최소값이 minK와 같다.
- subarray의 최대값이 maxK와 같다.
​
### 문제 해결
**이번 문제는 너무 오래걸려서 정답을 보고 학습했습니다.**
- 배열을 순차적으로 순회하면서 minK보다 작거나 maxK보다 큰 값이 나오면 outIdx에 현재 인덱스를 저장한다. 그 이유는 minK와 maxK 사이의 값인지 확인할 때, 조건을 만족하지 않으면 ans에 0을 더해주기 위해서이다.
- 그 후에 현재 가리키고 있는 nums[i] 값이 minK 또는 maxK이면 prevMinIdx나 prevMaxIdx에 i(인덱스 값)를 저장한다.
- ans는 prevMinIdx와 prevMaxIdx 중에서 더 작은 값에 j를 뺀 값과 0 중에서 더 큰 값을 더해준다.
- outIdx 값은 subarray가 minK와 maxK의 조건을 만족하는지 아닌지를 판별하는 값으로 볼 수 있다.

![알고리즈무-13](https://user-images.githubusercontent.com/79316402/222906970-611e3f40-3e80-47f4-9bfd-6c31756c3d41.jpg)

![알고리즈무-14](https://user-images.githubusercontent.com/79316402/222906976-c3b2799c-653a-4eb3-bbe2-b40f68fa32e4.jpg)
