## 412. Fizz Buzz
### 문제 설명
- 정수 n이 주어지고, 다음과 같은 문자열 배열 answer를 반환해라
- i를 3과 5로 나눌 수 있으면 answer[i] == "FizzBuzz".
- i를 3으로 나눌 수 있으면 answer[i] == "Fizz".
- i를 5로 나눌 수 있으면 answer[i] == "Buzz".
- 위에 있는 조건에 모두 해당되지 않으면 문자열 형태로 answer[i] == i.
​
### 문제 해결 과정
- 조건문을 통해 처리해줄 수 있다.
- 메소드를 하나 만들어서 조건을 처리해주고, 반환된 String을 List에 하나씩 add한다.