package cicleprog;

import java.util.Scanner;

/*
	Курс Java Online
	Урок 1 - Циклы - Задание 5
*/

class Task5 {

	public static void main(String args[]) {

		Scanner in=new Scanner(System.in);

		System.out.println("");
		System.out.print("Введите начальное и конечное значения для числового ряда, a и b через пробел (целые числа) = ");

		int a=in.nextInt();
		int b=in.nextInt();
		int min=(a<b?a:b);
		int max=(a>b?a:b);

		System.out.print("Введите число E = ");
		double e=in.nextDouble();

		int i;
		double n,f=0;
		for(i=min;i<=max;i++) {
			String result="-";
			n=1/Math.pow(2,i)+1/Math.pow(3,i);
			if(Math.abs(n)>=e) { f+=n; result="+"; }
			System.out.println("Член ряда "+i+" = "+n+" "+result);
		}

		System.out.println("\nРезультат = "+f);
		in.close();
	}
}
