package lineprog;

import java.util.Scanner;

/*
	Курс Java Online
	Урок 1 - Линейные программы - Задание 1
*/

class Task1 {

	private static final String format = "Для \"%s\" задано недопустимое значение. Необходимо ввести число.";

	public static void main(String args[]) {

		Scanner in=new Scanner(System.in);

		System.out.println("Программа вычисляет значение функции z=((a-3)*b/2)+c");

		double a=0,b=0,c=0;

		System.out.print("Введите значение a = ");
		try {
			a=in.nextDouble();
		} catch (Exception e) {
			System.out.println(String.format(format,"a"));
			in.close();
			System.exit(1);
		}

		System.out.print("Введите значение b = ");
		try {
			b=in.nextDouble();
		} catch (Exception e) {
			System.out.println(String.format(format,"b"));
			in.close();
			System.exit(1);
		}

		System.out.print("Введите значение c = ");
		try {
			c=in.nextDouble();
		} catch (Exception e) {
			System.out.println(String.format(format,"c"));
			in.close();
			System.exit(1);
		}

		System.out.println("Результат z = "+(((a-3)*b/2)+c));
		in.close();
	}
}
