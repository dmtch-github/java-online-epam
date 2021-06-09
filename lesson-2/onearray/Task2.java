package onearray;

import static java.lang.System.out;
import java.util.Scanner;

/*
	Курс Java Online
	Урок 2 - Одномерные массивы - Задание 2
*/

class Task2 {

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);

		out.println("Программа в последовательности действительных чисел a ... b заменяет все числа большие Z на Z и выводит количество замен.");

		out.print("Введите начальное и конечное значения последовательности, a и b через пробел = ");
		double a=in.nextDouble();
		double b=in.nextDouble();
		out.print("Введите количество чисел в ряду N = ");
		int n=in.nextInt();
		if(n>1) {

			out.print("Введите число Z, которым надо заменить большие числа = ");
			double z=in.nextDouble();
			
			double mas[] = new double[n]; //TODO обработать нехватку памяти
			//готовим последовательность чисел
			fillArray((a<b?a:b),(a>b?a:b),mas);
			sortArray(mas);

			//заменяем числа большие, чем Z
			int s=0;

			for(int i=0;i<mas.length;i++) {
				if(mas[i]>z) {
					mas[i]=z;
					s++;
				}
			}
			out.println("Размер числовой последовательности = "+mas.length);
			for(double il:mas)
				out.println("Значение элемента = "+il);
			out.println("Количество замен для Z="+z+" составило = "+s);

			
		} else {
			out.println("Задано недопустимое количество чисел в ряду.");
		}

		in.close();
	}

	private static void fillArray(double min, double max, double mas[]) {
		for(int i=0;i<mas.length;i++)
			mas[i]=Math.random()*(max-min)+min;
	}

	private static void sortArray(double mas[]) {
		boolean change;
		double a;
		do {
			change=false;
			for(int i=0;i<mas.length-1;i++) {
				if(mas[i]>mas[i+1]) {
					a=mas[i];
					mas[i]=mas[i+1];
					mas[i+1]=a;
					change=true;
				}
			}
		} while(change);
	}

}
