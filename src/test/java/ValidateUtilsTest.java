import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ValidateUtilsTest {

	@Test
	@DisplayName("이름_입력값_유효성")
	public void 이름_입력값_유효성() {
		ValidationUtils validationUtils = new ValidationUtils();
		assertThat(validationUtils.isValidName("ㅋㅋㅋㅋ1212")).isFalse();
	}

	@Test
	@DisplayName("횟수_입력값_유효성")
	public void 횟수_입력값_유효성() {
		ValidationUtils validationUtils = new ValidationUtils();
		assertThat(validationUtils.isValidCount("ㅋㅋㅋㅋ1212")).isFalse();
		assertThat(validationUtils.isValidCount("1")).isTrue();
		assertThat(validationUtils.isValidCount("10000")).isTrue();
		assertThat(validationUtils.isValidCount("test_case")).isFalse();
		assertThat(validationUtils.isValidCount("0")).isFalse();
	}
}