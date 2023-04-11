## 2390. Removing Stars From a String
### 문제 설명
- 별( * ) 모양을 포함하는 문자열 s가 주어진다.
- 한 번의 동작에서
- s 내에 있는 별을 고른다.
- * 의 바로 왼쪽에 위치한 * 모양이 아닌 문자를 삭제한다. (별 하나에 문자 하나 삭제 가능)
- 모든 별이 제거된 문자열을 반환하면 된다.
- **입력은 동작이 항상 가능하도록 주어질 것이다.**
- **결과 문자열이 항상 고유하다는 것을 알 수 있다.**
​
### 문제 해결 과정
- 스택으로 해결해볼까 생각이 든다.
- 문자열 s를 문자 하나씩 검사해서 * 이외의 문자는 push * 이 나오면 pop 연산을 수행한다.
- 만약 스택이 비어있는 경우 * 이 나오면 실패로 처리하면 되지만 해당 문제에서는 그런 경우는 고려하지 않는다.
​
```
Stack<String> stack = new Stack<>();
for (char c : s.toCharArray()) {
if (c == '*' && !stack.isEmpty())
stack.pop();
else
stack.push(Character.toString(c));
}
String ans = "";
while (!stack.isEmpty())
ans += stack.pop();
return ans;
```