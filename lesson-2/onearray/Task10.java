package onearray;

import static java.lang.System.out;
import java.util.*;

/*
	Курс Java online
	Урок 2 - Одномерные массивы - Задание 10
*/

class Task10 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		out.println("Программа выбрасывает четные элементы массива, сжимает его, освободившиеся элементы заполняет нулями.");
		out.println("Массив заполняется случайными целыми числами. Размерность массива N задается оператором и должна быть больше 2.");

		out.print("Введите размер массива N = ");
		int n = in.nextInt();	//здесь возможна исключающая ситуация
		if(n>2) {
			int mas [] = new int[n];
			int index = 0;
			Task2.fillArrayRandom(-10, 10, mas);
			out.println("Исходный массив = " + Arrays.toString(mas));
			for(int i = 2; i < mas.length; i += 2) {
				index = i / 2;
				mas[index]=mas[i];
			}

			out.println("Сжатый массив = " + Arrays.toString(mas));
			for(int i = index+1; i < mas.length; i++) {
				mas[i] = 0;
			}
			out.println("Обнуленный массив = " + Arrays.toString(mas));



		} else {
			out.println("Размер массива должен быть больше 2 элементов.");
		}
		
		in.close();
	}
}
