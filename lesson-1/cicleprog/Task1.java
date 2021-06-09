package cicleprog;

import java.util.Scanner;

/*
	Курс Java Online
	Урок 1 - Циклы - Задание 1
*/

class Task1 {

	public static void main(String args[]) {

		Scanner in=new Scanner(System.in);

		System.out.println("Программа вычисляет сумму чисел от 1 до A, где a-целое положительное число.");

		System.out.print("Введите значение A = ");
		int a=in.nextInt();

		if(a<1) System.out.println("Ошибка: A должно быть положительным числом");

		int i,f=0;

		for(i=1;i<a;i++) f+=i;

		System.out.println("Результат = "+f);

		in.close();
	}
}
