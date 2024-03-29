## 20. Valid Parentheses
### 문제 설명
- 문자 '(', ')', '{', '}', '[', ']'를 포함하는 문자열 s가 주어지고 입력된 문자열이 유효한지 여부를 결정해라
- 입력된 문자열이 유효하다는 것은
- 여는 괄호는 같은 유형의 괄호로 닫혀야 한다.
- 여는 괄호는 정확한 순서로 닫혀야 한다.
- 모든 닫힌 괄호는 같은 유형의 여는 괄호와 상응해야 한다.
​
### 문제 해결 과정
- 여는 괄호가 들어오면 스택에 push
- 닫는 괄호가 들어오면 스택에서 pop
- 단, 빈 스택인 경우에는 닫는 괄호가 들어오면 false를 반환해야 한다.
- 연산 이후 스택에 값이 남아 있다면 false, 비어있다면 true를 반환한다.
​
```java
class Solution {
public boolean isValid(String s) {
Deque<Character> stack = new ArrayDeque<>();
​
for (final char c : s.toCharArray())
if (c == '(')
stack.push(')');
else if (c == '{')
stack.push('}');
else if (c == '[')
stack.push(']');
else if (stack.isEmpty() || stack.pop() != c)
return false;
​
return stack.isEmpty();
}
}
```