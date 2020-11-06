package calculator;

import java.util.*;
import java.util.Map;
import java.util.Scanner;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.ToIntFunction;

public final class Calculator {
	private static final String ROMAN = "[IVX]|II|III|IV|VI|VII|VIII|IX";
	private static final String ARABIC = "[1-9]|10";
	private static final String OPERATION = "[-+*/]";
	private static final String OR = "|";
	private static final Map<String, IntBinaryOperator> calculator = Map.of(
			"+", (x, y) -> x + y,
			"-", (x, y) -> x - y,
			"*", (x, y) -> x * y,
			"/", (x, y) -> x / y);

	public static void main(String[] args) {
		Scanner equation = new Scanner(System.in);
		var x = equation.next(ROMAN + OR + ARABIC);
		var op = equation.next(OPERATION);
		var isRoman = x.matches(ROMAN);
		var y = equation.next(isRoman ? ROMAN : ARABIC);

		ToIntFunction<String> toInt = isRoman ? Calculator::romanToArabic : Integer::parseInt;
		IntFunction<String> toString = isRoman ? Calculator::arabicToRoman : Integer::toString;

		int result = calculator.get(op).applyAsInt(toInt.applyAsInt(x), toInt.applyAsInt(y));

		System.out.println(toString.apply(result));
	}

	static int romanToArabic(final String number) {
		return 1 + List.of("I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X").indexOf(number);
    }

	static String arabicToRoman(final int number) {
		return String.join("",
			number == 100 ? "C" : "",
			new String[]{"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"}[number % 100 / 10],
			new String[]{"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"}[number % 10]
		);
	}
}
