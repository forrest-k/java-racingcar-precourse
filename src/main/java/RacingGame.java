import domain.Car;
import domain.Cars;
import domain.MoveStatus;
import domain.NumberOfRunGames;
import view.RacingResultPrint;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class RacingGame {

	private Cars cars;
	private NumberOfRunGames racingCount;

	public RacingGame(Cars cars, NumberOfRunGames racingCount) {
		this.cars = cars;
		this.racingCount = racingCount;
	}

	public List<String> play() {
		for(int i = 0; i < racingCount.getCount(); i++) {
			run();
		}

		return getWinners();
	}

	private void run() {
		for (Car car : cars.getCars()) {
			car.setRacingStatus(MoveStatus.goOrStop());
		}

		RacingResultPrint.interimCheck(cars);
	}

	// fixme
	private List<String> getWinners() {
		cars.getCars().sort(Comparator.reverseOrder());
		Car topStatus = cars.getCars().get(0);
		List<String> winners = new ArrayList<>();

		for (Car c : cars.getCars()) {
			if (c.getRacingStatus() == topStatus.getRacingStatus()) {
				winners.add(c.getName());
			} else {
				break;
			}
		}

		return winners;
	}

}
