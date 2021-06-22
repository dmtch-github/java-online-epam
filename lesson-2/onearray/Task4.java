package onearray;

import static java.lang.System.out;
import java.util.Scanner;

/*
	Курс Java Online
	Урок 2 - Одномерные массивы - Задание 4
*/

class Task4 {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		out.println("Программа меняет местами наибольший и наименьший элементы в массиве действительных чисел.");

		out.print("Введите размер массива N = ");
		int n=in.nextInt();
		if(n>0) {
			double mas[] = new double[n]; //TODO обработать нехватку памяти
			Task2.fillArrayRandom(-1000., 1000., mas);

			int imax=0,imin=0;
			double max=0,min=0;
			for(int i=0;i<mas.length;i++) {
				if(mas[i]<min) {
					min=mas[i];
					imin=i;
				} else if(mas[i]>max) {
					max=mas[i];
					imax=i;
				}
				out.println(i+") "+mas[i]);
			}

			mas[imin]=max;
			mas[imax]=min;
			out.println("Обмен значениями произведен между элементами "+imin+" и "+imax);
			out.println("Минимальное значение = "+min+", максимальное = "+max);

			for(int i=0;i<mas.length;i++)
				out.println(i+") "+mas[i]);

		} else {
			out.println("Задан недопустимый размер массива.");
		}

		in.close();
	}
}
