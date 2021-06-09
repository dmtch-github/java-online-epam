package lineprog;

import java.util.Scanner;

/*
	Курс Java Online
	Урок 1 - Линейные программы - Задание 4
*/

class Task4 {

	public static void main(String args[]) {

		Scanner in=new Scanner(System.in);

		System.out.println("Программа меняет дробную и целую части числа nnn.ddd");
		System.out.println("Примечания: Максимальное количество цифр в любой части числа: 3");
		System.out.println("            Разделитель - запятая\n");

		System.out.print("Введите дробное число = ");
		double DoubleX=in.nextDouble();

		int IntX=(int)DoubleX;				//получаем целую часть исходного числа X
		int IntY=(int)(DoubleX*1000.)-IntX*1000;	//сдвигаем дробную часть исходного числа в целое
		for(;IntY%10==0;IntY/=10);			//формируем целую часть нового числа Y, удаляя лишние нули
	

		double FracY=(double)IntX/10.;
		for(;FracY>1;FracY/=10.);			//формируем дробную часть нового числа Y

		double DoubleY=IntY+FracY;

		System.out.println("Исходное число = "+DoubleX+", целое = "+IntX+", дробное = "+IntY);
		System.out.println("Новое число = "+DoubleY);
		in.close();
	}
}
