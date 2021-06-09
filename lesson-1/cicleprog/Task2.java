package cicleprog;

import java.util.Scanner;

/*
	Курс Java Online
	Урок 1 - Циклы - Задание 2
*/

class Task2 {

	public static void main(String args[]) {

		Scanner in=new Scanner(System.in);

		System.out.println("Программа вычисляет значения функции на отрезке [a,b] с шагом h.");
		System.out.println("\tпри x\u22642 y=-x");
		System.out.println("\tпри x>2 y=x");

		System.out.print("Задайте отрезок. Введите a и b через пробел = ");
		double a=in.nextDouble();
		double b=in.nextDouble();

		System.out.print("Задайте шаг. Введите h = ");
		double h=in.nextDouble();

		if(h==0) System.out.println("Значение шага h должно быть отлично от 0.");
		else {
			double start,stop,delta=Math.abs(h);
			if(a<b) {
				start=a;
				stop=b;
			} else {
				start=b;
				stop=a;
			}
			double x,y;
			for(x=start;x<=stop;x+=delta) {
				if(x>2) {
					y=x;
				} else {
					y=-x;
				}

				System.out.println("x="+x+" y="+y);
			}
		}

		in.close();
	}
}
