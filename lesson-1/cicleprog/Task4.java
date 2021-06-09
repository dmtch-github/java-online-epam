package cicleprog;

import java.util.Scanner;
import java.math.BigInteger;

/*
	Курс Java Online
	Урок 1 - Циклы - Задание 4
*/

class Task4 {

	public static void main(String args[]) {

		Scanner in=new Scanner(System.in);

		System.out.println("Программа вычисляет произведение квадратов первых 200 чисел.");

		long i;
		BigInteger f = new BigInteger("1");

		for(i=1;i<=200;i+=1) {
			f=f.multiply(BigInteger.valueOf(i*i));
			System.out.println(i+") f="+f);
		}

		System.out.println("\nРезультат = "+f);

		in.close();
	}
}
