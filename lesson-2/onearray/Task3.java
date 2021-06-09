package onearray;

import static java.lang.System.out;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/*
	Курс Java Online
	Урок 2 - Одномерные массивы - Задание 3
*/

class Task3 {
	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);

		out.println("Программа в массиве размерностью N подсчитывает количество отрицательных, положительных и нулевых элементов.");

		out.print("Введите размер массива N = ");
		int n=in.nextInt();
		if(n>0) {
			out.print("Введите количество знаков после запятой для вещественных чисел (целое) = ");
			int num=in.nextInt();
			if(num>=0) {
				double mas[] = new double[n]; //TODO обработать нехватку памяти
				final DecimalFormat decimalFormat = new DecimalFormat(String.format("#0"+(num>0?".%0"+num+"d":""),0));
				double precision = 1.0/Math.pow(10,num);

				fillArray(mas);
				int pos=0,neg=0,zero=0;
				for(double i:mas) {
					if(i>=precision) pos++;
					else if(i<=-precision) neg++;
						else { zero++; i=0.0; }; //исключаем отрицательный ноль
					out.println(decimalFormat.format(i));
				}
				out.println("Положительных="+pos+" Отрицательных="+neg+" Нулевых="+zero);

			} else {
			
				out.println("Задана недопустимая точность для вещественных чисел.");
			}
		} else {
			out.println("Задан недопустимый размер массива.");
		}

		in.close();
	}


	private static void fillArray(double mas[]) {
		double min=-100.,max=100.;
		for(int i=0;i<mas.length;i++)
			mas[i]=Math.random()*(max-min)+min;
	}
}
