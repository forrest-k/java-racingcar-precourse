package view;

import domain.Car;
import domain.Cars;

import java.util.List;

public class RacingResultPrint {

	public static void interimCheck(Cars cars) {
		System.out.println();
		for(Car car : cars.getCars()) {
			System.out.println(car.getName() + " : " + getStatusBars(car.getRacingStatus()));
		}
	}

	private static String getStatusBars(int count) {
		StringBuilder statusBar = new StringBuilder();
		for (int i = 0; i < count; i++) {
			statusBar.append("-");
		}

		return statusBar.toString();
	}

	public static void showWinners(List<String> winners) {
		System.out.println(String.join(", ", winners) + "가 최종 우승했습니다.");
	}
}
