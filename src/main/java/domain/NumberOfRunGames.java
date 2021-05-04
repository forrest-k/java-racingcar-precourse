package domain;

public class NumberOfRunGames {

	private int count;

	public NumberOfRunGames(String count) {
		if (!isValidCount(count)) {
			throw new RuntimeException("유효하지 않은 카운트 값");
		}

		this.count = Integer.parseInt(count);
	}

	public int getCount() {
		return count;
	}

	private boolean isValidCount(String inputStr) {
		try {
			int count = Integer.parseInt(inputStr);

			if (count < 1) {
				return false;
			}

		} catch (NumberFormatException e) {
			return false;
		}

		return true;
	}
}
