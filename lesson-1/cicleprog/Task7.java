package cicleprog;

import java.util.Scanner;

/*
	Курс Java Online
	Урок 1 - Циклы - Задание 7
*/

class Task7 {

	public static void main(String args[]) {

		Scanner in=new Scanner(System.in);

		System.out.println("Программа находит делители для каждого натурального числа в диапазоне A и B.");

		System.out.print("Введите число A = ");
		long a=in.nextLong();

		System.out.print("Введите число B = ");
		long b=in.nextLong();

		long min,max;
		if(a>b) {
			min=b; max=a;
		} else {
			min=a; max=b;
		}

		long i;
		for(i=min;i<=max;i++) {
			System.out.print("Делители числа "+i+" = ");
			int j=0;
			for(j=2;j<i;j++)
				if(i%j==0) System.out.print(j+" ");

			System.out.println();
		}

		in.close();
	}
}
