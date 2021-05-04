# 자동차 경주 게임

## 구현할 기능 목록

### 기본 플로우
    1. 사용자에게 필요 값 2가지(자동차 이름, 이동 횟수)를 입력 받는다. (UI)
        - 이름은 5글자 이내, (,) 구분 값으로 입력 받음
        - 횟수는 1 이상일 것
    2. 입력된 이동 횟수 만큼 랜덤값을 기반한 n대의 자동차 경주가 진행된다. (메인 경주 로직)
    3. 최종적으로 우승자를 노출한다. (결과 값 노출, UI)

### 도메인 객체
    - 자동차 경주 클래스: 경주에 참여한 자동차들과 경주 횟수 등의 값을 멤버변수로 갖으며 핵심 로직을 수행하는 메소드를 가지고 있는 클래스
    - 경주에 참여한 자동차들 클래스: 사용자에게 입력받은 자동차 이름으로 순서를 가지고 있는 클래스
    - 개별 자동차 클래스: 이름과 경주의 결과 값을 가지고 있는 도메인 최소 단위 클래스

### 자동차 경주
    1. 자동차 경주 실행 메소드 (입력된 이동 횟수 값 만큼 2번 메소드 실행)
    2. n대의 자동차에 대한 경주 실행 메소드
    3. 특정 자동차에 대한 랜덤 값 및 전진/멈춤 여부
        - 랜덤값은 0~9 사이의 값
    4. 중간 실행 결과 값 출력
    5. 최종 우승자 판단
    6. 최종 우승자 출력
---

### 요건

#### 기능 요구사항
	- 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
		진행되는 횟수동안의 전진한 값을 가지고 있어야 한다.
	- 각 자동차에 이름을 부여할 수 있다. 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력해야 한다.
		(프로그램 실행결과 참고) 실행될 때 기존 실행된 값에 추가로 값이 더해진다.
	- 자동차 이름은 쉼표(,)를 기준으로 구분하며 이름은 5자 이하만 가능하다.
		유효성 체크
	- 사용자는 몇번의 이동을 할 것인지 입력할 수 있어야 한다.
		유효성 체크
	- 전진하는 조건은 0~9 사이에서 random 값을 구한 후 random 값이 4 이상일 경우 전진하고, 3 이하의 값이면 멈춘다.
	- 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다. 우승자는 한 명 이상일 수 있다.


#### 프로그램 요구사항
	(기본 1주차와 내용 동일)
	- 자바 코드 컨벤션
	- 들여쓰기 1까지만 허용
	- stream api 사용 않고, 람다 사용만 허용
	- else 예약어 사용 금지
	- 함수 라인 10 이내

	(추가 내용)
	- 일급 콜렉션을 활용하여 구현
	- 모든 원시값과 문자열을 포장

#### 프로그래밍 요구사항
	- 로직에 단위 테스트를 구현한다. 단 UI 로직은 제외 (System.out, System.in, Scanner) 로직은 제외

