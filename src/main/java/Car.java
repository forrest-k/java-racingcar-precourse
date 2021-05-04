/**
 * @author sj.kim
 * @project wata backend
 */
public class Car {

	public static final String won = "WON";
	private String name;
	private int racingStatus;

	public Car(String carName) {
		this.name = carName;
	}

	public String getName() {
		return this.name;
	}

	public void setRacingStatus(String status) {
		if (won.equals(status)) {
			this.racingStatus++;
		}
	}

	public int getRacingStatus() {
		return this.racingStatus;
	}

	public void showRacingStatus() {
		for (int i = 0; i < racingStatus; i++) {
			System.out.println("-");
		}
	}

}
