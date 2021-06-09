package lineprog;

import java.util.Scanner;

/*
	Курс Java Online
	Урок 1 - Линейные программы - Задание 5
*/

class Task5 {

	private static final String message = "Количество секунд Т должно быть целым положительным числом";

	public static void main(String args[]) {

		Scanner in=new Scanner(System.in);

		System.out.println("Программа преобразует количество секунд T в длительность в формате HHч MMмин SSс");

		System.out.print("Введите количество секунд T = ");
		
		long T=0;

		try {
			T=in.nextLong();
		} catch (Exception e) {
			System.out.println(message);
			System.exit(1);
		}

		if(T>=0) {
			byte sec=(byte)(T%60);
			byte min=(byte)((T/60)%60);
			long hour=T/3600;

			System.out.print("Количество секунд T = "+T+" соответствует длительности ");
			System.out.printf("%02dч %02dмин %02dс\n",hour,min,sec);
		} else {
			System.out.println(message);
		}
	}
}
