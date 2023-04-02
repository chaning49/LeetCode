## 2300. Successful Pairs of Spells and Potions
### 문제 설명
- 각각 길이 n과 m의 두 개의 양의 정수 배열 spell과 potion이 주어진다. 여기서 spell[i]는 i번째 spell의 강도를 나타내고 potion[j]는 j번째 potion의 강도를 나타낸다.
- 정수 success도 제공된다. spell과 potion 쌍은 그들의 강도의 산물이 적어도 success인 경우에 성공적인 것으로 간주한다.
- 길이 n의 정수 배열 쌍을 반환한다. 여기서 pairs[i]는 ith spell로 성공적인 쌍을 형성할 potion의 수이다.
​
### 문제 해결 과정
- postions에 spell[i]를 차례로 곱해주고, 해당 값이 success 이상인 원소의 수를 담은 정수형 배열을 반환해야 한다.
- 이중 for문을 사용한다면 최악의 경우 10^10회의 반복횟수를 가져가기 때문에 단순하게 반복문을 쓰면 안될 것 같다.
- 첫 코드는 potions도 있는 그대로 써야한다고 생각해서 코드를 작성했으나 Wrong Answer가 나왔다. 방법은 Map에 이미 나왔던 값이 나오는 경우 개수만 정답 배열에 넣어놓고 continue를 해주었다.
- 따져보자면 potions는 success보다 큰 값의 개수를 찾는 것이 중요하다. 그래서 정렬을 한다면 탐색할 수 있는 범위를 줄일 수 있다.
- 정렬 후 탐색할 때의 방식은 이진 탐색으로 진행하고 나서 해당 spell에서 success보다 큰 수의 개수는 potion의 전체 길이에서 success보다 큰 값이 시작되는 위치를 빼주면 된다.