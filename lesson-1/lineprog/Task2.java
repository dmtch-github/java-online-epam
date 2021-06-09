package lineprog;

import java.util.Scanner;

/*
	Курс Java Online
	Урок 1 - Линейные программы - Задание 2
*/

class Task2 {

	public static void main(String args[]) {

		Scanner in=new Scanner(System.in);

		System.out.println("Программа вычисляет значение функции (b+\u221A(b\u00B2+4ac))/2a - a\u00B3c + 1/b\u00B2");
		System.out.println("Примечание: a \u2260 0, b \u2260 0");

		System.out.print("Введите значение a = ");
		double a=in.nextDouble();

		System.out.print("Введите значение b = ");
		double b=in.nextDouble();

		System.out.print("Введите значение c = ");
		double c=in.nextDouble();

		if((a!=0)&&(b!=0))
			System.out.println("Результат = "+((Math.sqrt(Math.pow(b,2)+4*a*c)+b)/(2*a)-Math.pow(a,3)*c+1/Math.pow(b,2)));
		else System.out.println("Значения a и b должны отличаться от нуля.");
		in.close();
	}
}
