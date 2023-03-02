## 443. String Compression
### 문제 설명
- chars 배열 내에 있는 문자들의 개수를 표시한 배열로 바꿔주고 그 크기를 구해야 한다.
### 문제 해결
- 중복되는 문자가 있어도 따로 세야 한다.
- 문자가 몇 개 있는지 세서 저장한 후 한 개 이상 존재하면 char 타입으로 바꿔서 chars 배열의 앞에서부터 알파벳, 개수, 알파벳, 개수, ... 의 형태로 바꿔주어야 한다.
```java
// 배열의 길이만 고려한 코드
class Solution {
    public int compress(char[] chars) {
        Map<Character, Integer> map = new HashMap<>();
        int ans = 0;
        
        for (char c : chars) {
            Character ch = Character.valueOf(c);
            if (!map.containsKey(ch)) 
                map.put(ch, 1);
            else
                map.put(ch, map.get(ch) + 1);
        }
        
        for (Character mc : map.keySet()) {
            if (map.get(mc) < 10) ans += 2;
            else if (map.get(mc) >= 10 && map.get(mc) < 100) ans += 3;
            else if (map.get(mc) >= 100 && map.get(mc) < 1000) ans += 4;
            else ans += 5;
        }
        
        return ans;
    }
}
```

```java
// 중복 문자열을 따로 처리해주지 않아서 통과되지 못한 코드
class Solution {
    public int compress(char[] chars) {
        Map<Character, Integer> map = new HashMap<>();
        int ans = 0;
        
        for (char c : chars) {
            Character ch = Character.valueOf(c);
            if (!map.containsKey(ch)) 
                map.put(ch, 1);
            else
                map.put(ch, map.get(ch) + 1);
        }
        
        for (Character ch : map.keySet()) {
            int num = map.get(ch);
            chars[ans++] = ch.charValue();
            if (num == 1) continue;
            else {
                for (char c : String.valueOf(num).toCharArray()) {
                    chars[ans++] = c;
                }
            }
        }
        
        return ans;
    }
}
```
