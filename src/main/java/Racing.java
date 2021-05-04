import java.util.Random;

/**
 * @author sj.kim
 * @project wata backend
 */
public class Racing {

	public static final String won = "WON";
	public static final String lose = "LOSE";

	private Cars cars;
	private int racingCount;

	Racing(Cars cars, int racingCount) {
		this.cars = cars;
		this.racingCount = racingCount;
	}

	public RacingResult play() {
		for(int i = 0; i < racingCount; i++) {
			run();
		}

		return wonList(cars);
	}

	public void run() {
		for (Car car : cars.getCars()) {
			car.setRacingStatus(goOrStop());
		}

		RacingResult.interimCheck(cars);
	}

	// utils 느낌
	public int getRandomNumber() {
		return new Random().nextInt(10);
	}

	public String goOrStop() {
		if (getRandomNumber() >= 4) {
			return won;
		}
		return lose;
	}

	private RacingResult wonList(Cars cars) {
		RacingResult racingResult = new RacingResult();
		return racingResult;
	}
}
