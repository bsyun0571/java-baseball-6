package baseball.view;

import static baseball.validator.InputValidator.checkNumber;
import static baseball.validator.InputValidator.checkRestart;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

	public static String insertNumber() {
		System.out.println("숫자를 입력해주세요 : ");
		String input = Console.readLine();

		checkNumber(input);
		return input;
	}

	public static void restartGame() {
		int reStart = Integer.parseInt(Console.readLine());
		checkRestart(reStart);
		System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
	}


}