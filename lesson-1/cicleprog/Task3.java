package cicleprog;

import java.util.Scanner;

/*
	Курс Java Online
	Урок 1 - Циклы - Задание 3
*/

class Task3 {

	public static void main(String args[]) {

		Scanner in=new Scanner(System.in);

		System.out.println("Программа вычисляет сумму квадратов первых 100 чисел.");

		int i,f=0;

		for(i=1;i<=100;i++) f=f+i*i;

		System.out.println("Результат = "+f);

		in.close();
	}
}
