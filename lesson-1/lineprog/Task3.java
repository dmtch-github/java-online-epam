package lineprog;

import java.util.Scanner;

/*
	Курс Java Online
	Урок 1 - Линейные программы - Задание 3
*/

class Task3 {

	public static void main(String args[]) {

		Scanner in=new Scanner(System.in);

		System.out.println("Программа вычисляет значение функции (sin x + cos y)/(cos x - sin y) * tg xy");
		System.out.println("Примечание: значения x и y вводите в градусах");

		System.out.print("Введите значение x = ");
		double x=in.nextDouble();
		double rx=Math.toRadians(x);

		System.out.print("Введите значение y = ");
		double y=in.nextDouble();
		double ry=Math.toRadians(y);

		System.out.println("Результат = "+((Math.sin(rx)+Math.cos(ry))/(Math.cos(rx)-Math.sin(ry))*Math.tan(rx*ry)));
		in.close();
	}
}
