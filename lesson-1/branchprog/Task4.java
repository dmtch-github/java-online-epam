package branchprog;

import java.util.Scanner;

/*
	Курс Java Online
	Урок 1 - Ветвления - Задание 4
*/

class Task4 {

	public static void main(String args[]) {

		Scanner in=new Scanner(System.in);

		System.out.println("Программа определяет пройдет ли в прямоугольное отверстие с размерами A и B кирпич с размерами x, y, z");

		System.out.print("Введите размеры прямоугольного отверстия A и B через пробел = ");
		double a=in.nextDouble();
		double b=in.nextDouble();

		System.out.print("Введите размеры кирпича, x, y, z через пробел = ");
		double x=in.nextDouble();
		double y=in.nextDouble();
		double z=in.nextDouble();

		double k[] = {0.,0.,0.};
		if(x<y) {
			k[0]=x;
			k[1]=y;
		} else {
			k[0]=y;
			k[1]=x;
		}
		if(z<k[0]) {
			k[2]=k[1];
			k[1]=k[0];
			k[0]=z;
		} else {
			if(z<k[1]) {
				k[2]=k[1];
				k[1]=z;
			} else k[2]=z;
		}

		boolean pass=false;
		if(a<b) {//минимальный размер отверстия A
			if((k[0]<a) && (k[1]<b)) pass=true;
		} else {//минимальный размер отверстия B
			if((k[0]<b) && (k[1]<a)) pass=true;
		}

		System.out.printf("Кирпич %sпроходит в отверстие.\n",(pass?"":"НЕ "));

		in.close();
	}
}
