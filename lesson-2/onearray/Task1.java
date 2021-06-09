package onearray;

import static java.lang.System.out;
import java.util.Scanner;
import java.util.Random;
import java.math.BigInteger;

/*
	Курс Java Online
	Урок 2 - Одномерные массивы - Задание 1
*/

class Task1 {

	public static void main(String args[]) {

		Scanner in=new Scanner(System.in);

		out.println("Программа вычисляет сумму для всех элементов массива A[N], кратных K.");

		out.print("Задайте размер массива A[N], (целое,положительное) N = ");
		int n=in.nextInt();

		if(n>0) {
			out.print("Задайте число (целое, не 0) K = ");
			int k=in.nextInt();
			if(k!=0) {
				final Random rand = new Random();
				int i, a[] = new int[n];
				//заполняем массив натуральными числами
				for(i=0;i<n;i++) a[i]=rand.nextInt(Integer.MAX_VALUE);

				BigInteger f = new BigInteger("0");
				for(i=0;i<n;i++) {
					String result;
					if(a[i]%k==0) {
						result="кратно";
						f=f.add(BigInteger.valueOf(a[i]));
					}
					else result="НЕ кратно";
					out.println(i+") "+a[i]+" "+result+" "+k);
				}
				out.println("\nРезультат = "+f);
			} else out.println("Неверно задан делитель.");
		} else out.println("Неверно задан размер массива.");

		in.close();
	}
}
