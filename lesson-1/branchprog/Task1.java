package branchprog;

import java.util.Scanner;

/*
	Курс Java Online
	Урок 1 - Ветвления - Задание 1
*/

class Task1 {

	public static void main(String args[]) {

		Scanner in=new Scanner(System.in);

		System.out.println("Программа определяет возможность существования треугольника, если заданы 2 угла.");

		System.out.print("Введите значение первого угла \u03b1 = ");
		int a=in.nextInt();

		System.out.print("Введите значение второго угла \u03b2 = ");
		int b=in.nextInt();

		int c=180-a-b;
		if((a<0) || (b<0) || (c<0)) {
			System.out.println("Треугольник с заданными углами существовать не может.");
		} else {
			String info="";
			if((a==90) || (b==90) || (c==90)) info=" Треугольник является прямоугольным.";
			System.out.println("Треугольник может существовать."+info);
		}

		in.close();
	}
}
