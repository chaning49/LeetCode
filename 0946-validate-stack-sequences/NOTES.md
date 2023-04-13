## 946. Validate Stack Sequences
### 문제 설명
- 각각 다른 값을 가진 두 개의 정수 배열 pushed와 popped가 주어지고, 처음에 비어 있던 스택에서 푸시 및 팝업 작업 시퀀스의 결과일 수 있으면 true를 반환하고, 아니면 false를 반환한다.
​
### 문제 해결 과정
- 리스트에 pushed 값을 하나씩 넣으면서 popped의 앞에서부터 값을 비교하면서 리스트에 값이 남아 있다면 false, 빈 리스트라면 true 반환!