package domain;

public class Car implements Comparable<Car> {

	private String name;
	private int racingStatus;

	public Car(String carName) {
		this.name = carName;
	}

	public String getName() {
		return this.name;
	}

	public void setRacingStatus(int moveSignal) {
		this.racingStatus += moveSignal;
	}

	public int getRacingStatus() {
		return this.racingStatus;
	}

	@Override
	public int compareTo(Car car) {
		if (this.racingStatus == car.racingStatus) {
			return 0;
		}
		return this.racingStatus > car.racingStatus ? 1 : -1;
	}
}
