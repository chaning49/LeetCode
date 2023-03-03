## 28. Find the Index of the First Occurrence in a String
### 문제 설명
- 두 개의 문자열 haystack과 needle이 있다.
- haystack에서 needle과 일치하는 첫 번째 문자열의 시작 인덱스를 정답으로 반환한다.
- 만약 없는 경우에는 -1을 반환한다.
### 문제 해결
- 첫 번째 방법은 indexOf() 메소드를 사용하는 것이다. 문제에서 제시한 내용과 일치하는 메소드가 있기 때문에 한 줄로 가능하다.
- 두 번째 방법은 haystack에서 겹치는 문자열의 인덱스를 for문으로 찾는 방법이다. haystack.length() - needle.length() + 1 만큼의 크기만 순회하면 되고, 일치하는 문자열이 생기면 haystack의 시작 인덱스를 반환한다.
​
```java
class Solution {
public int strStr(String haystack, String needle) {
for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
if (haystack.substring(i, i + needle.length()).equals(needle))
return i;
}
return -1;
}
}
```