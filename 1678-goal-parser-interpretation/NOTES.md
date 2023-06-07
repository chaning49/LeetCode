## 1678. Goal Parser Interpretation
### 문제 설명
- Goal Parser는 문자열 command를 번역할 수 있다. command는 알파벳 "G"와 "()" 및/또는 "(al)"의 순서로 구성된다. Goal Parser는 "G"를 문자열 "G"로, "()"는 "o"로, "(al)"은 문자열 "al"로 해석한다. 해석된 문자열들이 원래의 순서 내에서 이어붙여진다.
- 문자열 command가 주어졌을 때, Goal Parser의 command 해석을 반환해라.
​
### 문제 해결 과정
- replace를 2회만 거치면 될 것이다.
- G는 그대로 두고 나머지 ()와 (al)만 replace 함수를 사용하면 된다.