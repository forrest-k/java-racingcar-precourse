package domain;

import java.util.Random;

public enum MoveStatus {

	GO(1), STOP(0);

	int moveSignal;

	MoveStatus(int moveSignal) {
		this.moveSignal = moveSignal;
	}

	public int getMoveSignal() {
		return this.moveSignal;
	}

	public static int getRandomNumber() {
		return new Random().nextInt(10);
	}

	public static int goOrStop() {
		return getRandomNumber() >= 4 ? GO.getMoveSignal() : STOP.getMoveSignal();
	}
}
