package branchprog;

import java.util.Scanner;

/*
	Курс Java Online
	Урок 1 - Ветвления - Задание 5
*/

class Task5 {

	public static void main(String args[]) {

		Scanner in=new Scanner(System.in);

		System.out.println("Программа вычисляет значения функции F(x) в зависимости от x:");
		System.out.println("\tпри x\u22643 F(x)=x\u00B2-3x+9");
		System.out.println("\tпри x>3 F(x)=1/(x\u00B3+6)");

		System.out.print("Введите значение x = ");
		double x=in.nextDouble();
		double f;

		if(x>3) f=1/(Math.pow(x,3)+6);
		else f=Math.pow(x,2)-3*x+9;

		System.out.println("Ответ = "+f);

		in.close();
	}
}
