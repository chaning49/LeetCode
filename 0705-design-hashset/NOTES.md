## 705. Design HashSet
### 문제 설명
- 내장 hash table 라이브러리를 사용하지 않고 HashSet을 설계해라
- MyHashSet 클래스 구현:
- void add(key): HashSet에 key값을 넣는다.
- bool contains(key): key값이 HashSet에 존재하는지 아닌지 여부를 반환해라.
- void remove(key): HashSet 내에 있는 key값을 삭제한다. 만약 key가 존재하지 않으면 아무 것도 하지 않는다.
​
### 문제 해결 과정
- 리스트로 해결해보려고 한다.
- add는 set의 특성을 고려하여 key값이 존재하면 추가되지 않는다.
- remove는 해당 key값의 인덱스를 찾아서 존재하면 삭제해준다.
- contains는 key가 존재하면 true, 아니면 false를 반환한다.
- 돌아가긴 하는데 효율성이 개판이다. 다른 방법은 없는지 생각을 해봐야 할듯...
- map을 사용해봐야하나??
- map을 사용하니 효율성이 확 오르기는 했다.
- 그냥 전체 데이터의 개수가 10^6개이므로 해당 크기의 배열을 boolean 타입으로 만들어줘도 될 듯