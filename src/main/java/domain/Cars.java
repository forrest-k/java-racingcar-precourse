package domain;

import java.util.ArrayList;
import java.util.List;


public class Cars {

	private List<Car> carList;

	public Cars(String carsName) {
		carList = new ArrayList<>();

		String[] cars = carsName.split(",");

		for (String s : cars) {
			addCars(s);
		}
	}

	private void addCars(String carName) {
		if (carName == null) {
			throw new RuntimeException("자동차 이름 널");
		}

		if (carName.equals("")) {
			throw new RuntimeException("자동차 이름 공백");
		}

		if (carName.length() < 1 || carName.length() > 5) {
			throw new RuntimeException("유효하지 않은 이름 값");
		}

		this.carList.add(new Car(carName));
	}

	public Car showCars(int index) {
		return this.carList.get(index);
	}

	public List<Car> getCars() {
		return this.carList;
	}
}
