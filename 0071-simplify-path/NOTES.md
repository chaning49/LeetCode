- 틀렸다. 다시.
- 위 조건을 통과한 경우, 배열의 원소가 공백이나 . 또는 .. 이 아닌 경우에만 push
- 배열을 모두 순회하고 생긴 스택이 비어있으면 / 홈 디렉토리만 반환한다.
- 스택에 내용물이 있는 경우에는 스택의 내용물을 하나씩 꺼내면서 슬래시를 앞에 붙여준다.
​
**기가 막히는 솔루션 코드**
```java
class Solution {
public String simplifyPath(String path) {
final String[] dirs = path.split("/");
Stack<String> stack = new Stack<>();
​
for (final String dir : dirs) {
if (dir.isEmpty() || dir.equals("."))
continue;
if (dir.equals("..")) {
if (!stack.isEmpty())
stack.pop();
} else {
stack.push(dir);
}
}
​
return "/" + String.join("/", stack);
}
}
```