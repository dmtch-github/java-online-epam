package branchprog;

import java.util.Scanner;

/*
	Курс Java Online
	Урок 1 - Ветвления - Задание 3
*/

class Task3 {

	static final double DOPUSK=0.00000001;

	public static void main(String args[]) {

		Scanner in=new Scanner(System.in);

		System.out.println("Программа определяет расположены 3 точи на одной прямой или нет.");

		System.out.print("Введите координаты точки A, x и y через пробел = ");
		double ax=in.nextDouble();
		double ay=in.nextDouble();

		System.out.print("Введите координаты точки B, x и y через пробел = ");
		double bx=in.nextDouble();
		double by=in.nextDouble();

		System.out.print("Введите координаты точки C, x и y через пробел = ");
		double cx=in.nextDouble();
		double cy=in.nextDouble();


		if(((ax==bx)&&(ax==cx)) || ((ay==by)&&(ay==cy))) {
			System.out.println("Точки расположены на одной прямой");
		} else {
			double p1=(cx-ax)*(by-ay);
			double p2=(cy-ay)*(bx-ax);
			if(Math.abs(p1-p2)<DOPUSK) System.out.println("Точки расположены на одной прямой");
			else System.out.println("Точки НЕ расположены на одной прямой");
		}

		in.close();
	}
}
