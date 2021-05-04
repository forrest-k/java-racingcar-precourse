import domain.Cars;
import domain.NumberOfRunGames;
import service.RacingGame;
import view.RacingResultPrint;

import java.util.Scanner;

/**
 * @author sj.kim
 * @project wata backend
 */
public class RacingGameController {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉽표(,) 기준으로 구분)");
		String names = scanner.next();

		System.out.println("시도할 횟수는 몇회인가요?");
		String count = scanner.next();

		Cars cars = new Cars(names);
		NumberOfRunGames numberOfRunGames = new NumberOfRunGames(count);
		RacingGame racingGame = new RacingGame(cars, numberOfRunGames);

		RacingResultPrint.showWinners(racingGame.play());
	}
}
