import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Comparator;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingTest {

	@Test
	@DisplayName("자동차_경주_호출")
	void 자동차_경주_호출() {
		// Cars 자동차들, int count
		Cars cars = 경주용_자동차_생성("안녕,하세요,쿠쿠씨,다섯대?111");
		String count = "4";

		if (!ValidationUtils.isValidCount(count)) {
			throw new RuntimeException("유효하지 않은 카운트 값");
		}

		ValidationUtils.isValidCount(count);
		자동차_경주_시작(cars, Integer.parseInt(count));
	}

	@DisplayName("자동차_경주_시작")
	void 자동차_경주_시작(Cars cars, int count) {
		Racing racing = new Racing(cars, count);
		racing.play();
		assertThat(racing.getRandomNumber()).isLessThan(10);
		assertThat(racing.getRandomNumber()).isGreaterThanOrEqualTo(0);
	}

	@Test
	@DisplayName("경주용_자동차_생성")
	Cars 경주용_자동차_생성(String carsName) {
		Cars myCars = new Cars(carsName);
		assertThat(myCars.showCars(0).getName()).isNotEmpty();
		assertThat(myCars.showCars(0).getName()).isEqualTo("안녕");
		assertThat(myCars.showCars(1).getName()).isEqualTo("하세요");

		return myCars;
	}

	@Test
	@DisplayName("자동차별_전진_멈춤_여부")
	void 자동차별_전진_멈춤_여부() {
		// Cars 자동차들, int count
		Cars cars = 경주용_자동차_생성("안녕,하세요,쿠쿠씨,다섯대?1");
		int count = 4;
		Racing racing = new Racing(cars, count);
		assertThat(racing.goOrStop()).isNotEmpty();
		assertThat(racing.goOrStop()).isNotBlank();
		//assertThat(racing.goOrStop()).matches(Racing.lose);
//		assertThat(racing.goOrStop()).contains(Racing.lose);
	}

	@Test
	@DisplayName("중간_실행_결과_값_출력")
	void 중간_실행_결과_값_출력() {
		Cars cars = 경주용_자동차_생성("안녕,하세요,쿠쿠씨,다섯대?1,juddy,mike");
		int count = 4;
		RacingResult.interimCheck(cars);
	}

	@Test
	@DisplayName("최종_우승자_판단_메소드")
	void 최종_우승자_판단_메소드() {
		Cars cars = 경주용_자동차_생성("안녕,하세요,쿠쿠씨,다섯대?1");
		int count = 10;
		Racing racing = new Racing(cars, count);
		racing.play();

		System.out.println("--- 시작! ---");
		//System.out.println();
		for(Car c : cars.getCars()) {
			System.out.println("name: " + c.getName() + "/ count: " + c.getRacingStatus());
		}

		cars.getCars().sort(Comparator.reverseOrder());
		System.out.println("--- 리버스! ---");
		for(Car c : cars.getCars()) {
			System.out.println("name: " + c.getName() + "/ count: " + c.getRacingStatus());
		}

		RacingResult.showWinners(cars);
	}
}
