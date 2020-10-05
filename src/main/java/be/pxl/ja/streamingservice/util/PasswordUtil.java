package be.pxl.ja.streamingservice.util;

public class PasswordUtil {

	private static final String SPECIAL_CHARACTERS = "~!@#$%^&*()_-";
	private static final String UPPER_CASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static final String LOWER_CASE = "abcdefghijklmnopqrstuvwxyz";
	private static final String NUMBERS = "0123456789";

	private static int score;

	public static int calculateStrength(String password) {
		score = 0;
		if (password.length() < 6) {
			return score;
		} else if (password.length() <= 10) {
			score++;
		} else {
			score += 2;
		}
		hasLowerCase(password);
		hasUpperCase(password);
		hasNumber(password);
		hasSpecialCharacters(password);
		return score;
	}

	private static void hasNumber(String password) {
		for (int i = 0; i < password.length(); i++) {
			if (NUMBERS.contains(String.valueOf(password.charAt(i)))) {
				score += 2;
				return;
			}
		}
	}

	private static void hasLowerCase(String password) {
		for (int i = 0; i < password.length(); i++) {
			if (LOWER_CASE.contains(String.valueOf(password.charAt(i)))) {
				score += 2;
				return;
			}
		}
	}

	private static void hasUpperCase(String password) {
		for (int i = 0; i < password.length(); i++) {
			if (UPPER_CASE.contains(String.valueOf(password.charAt(i)))) {
				score += 2;
				return;
			}
		}
	}

	private static void hasSpecialCharacters(String password) {
		for (int i = 0; i < password.length(); i++) {
			if (SPECIAL_CHARACTERS.contains(String.valueOf(password.charAt(i)))) {
				score += 2;
				return;
			}
		}
	}
}
