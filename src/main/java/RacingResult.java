import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class RacingResult {

	public static void interimCheck(Cars cars) {
		System.out.println();
		System.out.println();
		for(Car car : cars.getCars()) {
			System.out.println("이름: " + car.getName() + ": " + getStatusBars(car.getRacingStatus()));
		}
	}

	private static String getStatusBars(int count) {
		String statusBar = "";
		for (int i = 0; i < count; i++) {
			statusBar += "-";
		}

		return statusBar;
	}

	public static void showWinners(Cars cars) {
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

		System.out.println(String.join(", ", winners));
	}
}
