package lineprog;

import java.util.Scanner;

/*
	Курс Java Online
	Урок 1 - Линейные программы - Задание 6
*/

class Task6 {

	public static void main(String args[]) {

		Scanner in=new Scanner(System.in);

		System.out.println("Программа печатает true, если точка с координатами (x,y) принадлежит закрашеной области.");

		boolean quit=false;

		do {
			System.out.println("Введите значения x и y через пробел. Для завершения программы введите букву.");
			if(!in.hasNextByte()) quit=true;
			else {
				byte x=in.nextByte();
				if(!in.hasNextByte()) quit=true;
				else {
					byte y=in.nextByte();
					System.out.println("Точка ["+x+","+y+"] = "+checkPoint(x,y)+"\n");
				}
			}
			
		} while(!quit);

		System.out.print("Программа завершена");
		in.close();
	}

	static boolean checkPoint (byte x, byte y) {
		boolean dark=false;
		if((x>-4)&&(x<4)&&(y>-3)&&(y<0)) dark=true; //нижний прямоугольник
		else if((x>-2)&&(x<2)&&(y>=0)&&(y<4)) dark=true; //верхний прямоугольник
		return dark;
	}

}
