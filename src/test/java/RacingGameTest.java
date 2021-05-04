import domain.Car;
import domain.Cars;
import domain.MoveStatus;
import domain.NumberOfRunGames;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import service.RacingGame;
import view.RacingResultPrint;
import java.util.Comparator;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingGameTest {

	@Test
	@DisplayName("자동차_경주_호출")
	void 자동차_경주_호출() {
		// domain.Cars 자동차들, int count

		Cars cars = 경주용_자동차_생성("안녕,하세요,쿠쿠씨,다섯대?111");
		NumberOfRunGames numberOfRunGames = new NumberOfRunGames("4");

		자동차_경주_시작(cars, numberOfRunGames);
	}

	@DisplayName("자동차_경주_시작")
	void 자동차_경주_시작(Cars cars, NumberOfRunGames count) {
		RacingGame racingGame = new RacingGame(cars, count);
		RacingResultPrint.showWinners(racingGame.play());
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
		assertThat(MoveStatus.goOrStop()).isGreaterThanOrEqualTo(0);
		assertThat(MoveStatus.goOrStop()).isLessThan(4);
	}

	@Test
	@DisplayName("중간_실행_결과_값_출력")
	void 중간_실행_결과_값_출력() {
		Cars cars = 경주용_자동차_생성("안녕,하세요,쿠쿠씨,다섯대?1,juddy,mike");
		RacingResultPrint.interimCheck(cars);
	}

	@Test
	@DisplayName("최종_우승자_판단_메소드")
	void 최종_우승자_판단_메소드() {
		Cars cars = 경주용_자동차_생성("안녕,하세요,쿠쿠씨,다섯대?1");
		NumberOfRunGames numberOfRunGames = new NumberOfRunGames("10");
		RacingGame racingGame = new RacingGame(cars, numberOfRunGames);
		racingGame.play();

		System.out.println("--- 시작! ---");
		//System.out.println();
		for (Car c : cars.getCars()) {
			System.out.println("name: " + c.getName() + "/ count: " + c.getRacingStatus());
		}

		cars.getCars().sort(Comparator.reverseOrder());
		System.out.println("--- 리버스! ---");
		for (Car c : cars.getCars()) {
			System.out.println("name: " + c.getName() + "/ count: " + c.getRacingStatus());
		}

		RacingResultPrint.showWinners(racingGame.play());
	}
}
