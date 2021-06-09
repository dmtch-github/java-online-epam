package onearray;

import static java.lang.System.out;
import java.util.Scanner;

/*
	Курс Java online
	Урок 2 - Одномерные массивы - Задание 5
*/

class Task5 {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		out.println("Программа из массива целых чисел a1, a2 ... an выводит числа для которых ai>i");

		out.print("Введите размер массива N = ");
		int n=in.nextInt();
		if(n>0) {
			int mas[] = new int[n]; //TODO обработать нехватку памяти
			fillArray(mas);

			for(int i=0;i<mas.length;i++)
				if(mas[i]>i) out.println(i+") <\t "+mas[i]);//+" +");
				//else out.println(i+") > "+mas[i]);
		} else {
			out.println("Задан недопустимый размер массива.");
		}

		in.close();
	}


/*
fillArray - заполняет элементы массива случайными положительными целыми числами от 0 до 1000
*/
	private static void fillArray(int mas[]) {
		for(int i=0;i<mas.length;i++)
			mas[i]=(int)(Math.random()*1000.);
	}

}
