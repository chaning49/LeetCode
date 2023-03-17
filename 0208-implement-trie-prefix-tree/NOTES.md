## 208. Implement Trie (Prefix Tree)
### 문제 설명
- 트리(try) 또는 접두사 트리(prefix tree)는 문자열 데이터 집합에서 키를 효율적으로 저장하고 검색하는 데 사용되는 트리 데이터 구조이다. 이 데이터 구조에는 자동 완성 및 맞춤법 검사와 같은 다양한 응용 프로그램이 있다.
- Trie()는 trie 객체로 초기화한다.
- void insert(String word) 문자열 단어를 트라이에 삽입한다.
- boolean search(String word) 문자열 단어가 트라이에 있으면 true를 반환하고(예: 이전에 삽입된 경우) 그렇지 않으면 false를 반환한다.
- boolean startsWith(String 접두사) prefix 접두사가 있는 이전에 삽입된 문자열 단어가 있으면 true를 반환하고, 그렇지 않으면 false를 반환한다.
​
### 문제 해결 과정
- **못풀어서 정답 확인함**
- TrieNode를 따로 만든다. TrieNode는 알파벳을 TrieNode의 배열 타입으로 저장하는 Children과 단어가 존재하는지 확인하기 위한 isWord로 구성되어 있다.
- insert 메소드는 현재 root 노드에 word의 알파벳을 하나씩 TrieNode 타입으로 이어붙인다. 그 다음 isWord를 true로 바꿔준다.
- search 메소드는 word를 find라는 메소드에서 검사 후 해당 노드가 null이 아니면서 해당 노드의 isWord가 true이면 존재하는 것으로 간주한다.
- find 메소드는 노드에 단어가 존재하는지 확인하는 메소드로 노드의 children이 null이면 단어가 없다는 의미이다.
- startsWith은 prefix를 매개변수로 받아 find 함수에서 해당 prefix가 단어에 포함되는지 확인하는 것이다. null이 아니어야 prefix가 존재한다는 의미이다.
- 이 문제는 TrieNode라는 방식으로 단어를 Tree 형태로 저장한다. 그 이유는 단어 하나를 낱개의 알파벳으로 이어주는데 단어나 prefix를 찾을 때에 순차적으로 저장된 노드를 비교할 수 있기 때문이다.