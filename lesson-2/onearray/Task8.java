package onearray;

import static java.lang.System.out;
import java.util.*;

/*
	Курс Java online
	Урок 2 - Одномерные массивы - Задание 8
*/

class Task8 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		out.println("Программа выбрасывает из массива все элементы, которые равны минимальному значению.");
		out.println("Массив заполняется случайными целыми числами. Размерность массива N задается оператором и должна быть больше 1.");

		out.print("Введите размер массива N = ");
		int n = in.nextInt();	//здесь возможна исключающая ситуация
		if(n>1) {
			int min = Integer.MAX_VALUE;
			int minDeal = 0;
			int mas[] = new int[n];	//здесь возможна исключающая ситуация
			Task2.fillArrayRandom(-1000, 1000, mas);
			for(int i = 0; i < n; i++) {
				if(mas[i] < min) {
					min = mas[i];
					minDeal=1;
				} else {
					if(mas[i] == min) minDeal++;
				}
			}

			if(n > minDeal) {
				int masNew [] = new int[n - minDeal];
				minDeal = 0;
				for(int i = 0; i<n; i++) {
					if(mas[i] != min) masNew[minDeal++] = mas[i];
				}
				out.println("Старый массив = " + Arrays.toString(mas));
				out.println(" Новый массив = " + Arrays.toString(masNew));
				

			} else {
				out.println("Все элементы массива соответствуют минимальному значению.");
				out.println("Новый массив не имеет ни одного элемента.");
			}


		} else {
			out.println("Размер массива должен быть больше 1 элемента.");
		}
		
		in.close();
	}
}
