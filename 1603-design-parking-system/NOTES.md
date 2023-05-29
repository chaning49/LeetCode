## 1603. Design Parking System
### 문제 설명
- 주차장을 위한 주차 시스템을 설계해라. 주차장은 세 종류의 주차 공간이 있다. 각 사이즈별 칸의 정해진 숫자가 있는 대형, 중형, 소형차 공간이다.
- ParkingSystem 클래스를 구현해라.
- ParkingSystem(int big, int medium, int small): ParkingSystem의 객체를 초기화한다. 각 주차 공간의 칸의 숫자는 생성자의 부분으로 주어진다.
- bool addCar(int carType): 주차장에 넣고 싶은 차량을 위한 carType의 주차공간이 있는지 없는지 확인한다. carType은 세 종류로 나뉠 수 있는데, 1, 2, 3으로 대형, 중형, 소형이 표현된다. 차량은 해당 차량의 carType인 주차 공간에 주차할 수 있다. 만약 가능한 공간이 없다면 false를 반환하고, 아니라면 크기에 맞는 공간에 차량을 주차하고 true를 반환해라.
​
### 문제 해결 과정
- big, medium, small을 static 변수로 선언하고, 생성자로 값을 저장한다.
- addCar에서는 carType에 따라서 개수를 체크한 후 true 또는 false 값을 반환하는 동시에 0보다 큰 경우에는 개수를 하나 차감한다.