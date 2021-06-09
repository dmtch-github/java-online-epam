package cicleprog;

import java.util.Scanner;

/*
	Курс Java Online
	Урок 1 - Циклы - Задание 6
*/

class Task6 {

	public static void main(String args[]) {

		Scanner in=new Scanner(System.in);

		System.out.println("Программа выводит соответствие кода символу от 0 до 65535 по 256 символов.");

		char c=0;
		boolean ask=true;
		do {
			
			//System.out.print("["+(int)c+"]=\""+c+"\" ");
			System.out.printf("[%X]=",(long)c);
			System.out.print("\""+c+"\" ");
			c+=1;
			if(c%16==0) System.out.println();
		
			if((c%256==0) && ask) {
				System.out.print("Для продолжения введите \"Y\"-показать еще 256 символов /\"YY\"-показать символы до 65535 /любой символ - прервать: ");
				if(in.hasNext("YY")) ask=false;
				else if(!in.hasNext("Y")) break;
				in.next();
			}	

		} while(c!=0);
		in.close();
	}
}
