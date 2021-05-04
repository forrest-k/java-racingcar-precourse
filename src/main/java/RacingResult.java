/**
 * @author sj.kim
 * @project wata backend
 */
public class RacingResult {

	int maxCount;
	String [] wonList;

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

	private static void showWinners(Cars cars) {

	}
}
