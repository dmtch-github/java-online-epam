package branchprog;

import java.util.Scanner;

/*
	Курс Java Online
	Урок 1 - Ветвления - Задание 2
*/

class Task2 {

	public static void main(String args[]) {

		Scanner in=new Scanner(System.in);

		System.out.println("Программа вычисляет ответ для задания max{min(a,b), min(c,d)}");

		System.out.print("Введите значения a и b через пробел = ");
		double a=in.nextDouble();
		double b=in.nextDouble();

		System.out.print("Введите значения c и d через пробел = ");
		double c=in.nextDouble();
		double d=in.nextDouble();

		double ab=b;
		if(a<b) ab=a;

		double cd=d;
		if(c<d) cd=c;

		if(ab>cd) System.out.println("Результат = "+ab);
		else System.out.println("Результат = "+cd);

		in.close();
	}
}
