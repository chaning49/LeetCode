## 1576. Replace All ?'s to Avoid Consecutive Repeating Characters
### 문제 설명
- 영어 소문자 글자들과 '?'로만 구성된 문자열 s가 주어지고, 모든 '?' 문자를 소문자로 변환하여 최종 문자열에 연속적으로 반복되는 문자가 포함되지 않도록 한다. '?'가 아닌 문자는 변경하면 안된다.
- 지정된 문자열에 '?'를 제외하고 연속적으로 반복되는 문자가 없음을 보장한다.
- 모든 변환(0일 수 있음)이 완료된 후 마지막 문자열을 반환한다. 솔루션이 두 개 이상 있는 경우 해당 솔루션 중 하나를 반환한다. 주어진 제약 조건으로 항상 답이 가능하다는 것을 보여줄 수 있다.
​
### 문제 해결 과정
- s를 하나씩 체크하면서 prev와 next에 문자열을 저장해서 ?가 나오면 현재까지 나오지 않은 문자열을 아무거나 집어 넣는다.
- charArray를 만들어서 해당 인덱스에 있는 문자열을 바꿔가면서 값을 찾아야한다.
- 배열값이 ?이면 이전값과 다음값을 저장하고, 알파벳 a부터 이전값 또는 다음값이 아닐때까지 반복문을 돌린 후 ?를 알파벳으로 변경해준다.