/**
 * @author sj.kim
 * @project wata backend
 */
public class ValidationUtils {

	public boolean isValidName(String name) {
		if(name.length() < 1 || name.length() > 5) {
			return false;
		}

		return true;
	}

	public boolean isValidCount(String inputStr) {
		try {
			int count = Integer.parseInt(inputStr);

			if(count < 1) {
				return false;
			}

		} catch(NumberFormatException e) {
			return false;
		}
		return true;
	}
}
