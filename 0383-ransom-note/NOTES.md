## 383. Ransom Note
### 문제 설명
- ransomNote와 magazine이라는 두 개의 문자열이 주어지고, 만약 ransomNote가 magazine에 있는 문자를 사용해서 만들 수 있는 문자열이면 true, 아니면 false를 반환해라.
- magazine에 있는 각 문자는 ransomNote에서 **한 번씩만** 사용할 수 있다.
​
### 문제 해결 과정
- 알파벳 a부터 z까지 개수를 저장할 수 있는 배열을 생성한 뒤, magazine에 있는 알파벳의 개수를 표시하고 ransomNote에서 겹치는 알파벳이 나오면 -1씩 줄인다.
- 만약 해당 배열에 있는 값이 0이 되면 false를 반환하고 for문을 빠져나오면 true를 반환한다.
​