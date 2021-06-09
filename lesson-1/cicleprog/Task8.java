package cicleprog;

import java.util.Scanner;

/*
	Курс Java Online
	Урок 1 - Циклы - Задание 8
*/

class Task8 {

	public static void main(String args[]) {

		Scanner in=new Scanner(System.in);

		System.out.println("Программа определяет цифры, входящие в число A и B.");

		System.out.print("Введите число A = ");
		long a=in.nextLong();

		System.out.print("Введите число B = ");
		long b=in.nextLong();

		byte ab[] = {0,0,0,0,0,0,0,0,0,0};
		int i;
		boolean found=false;

		while(a>0) {
			i=(int)(a%10);
			a/=10;
			ab[i]=1;
		}

		while(b>0) {
			i=(int)(b%10);
			b/=10;
			if(ab[i]==1) {
				ab[i]=2;
				found=true;
			}
		}

		if(found) {

			System.out.print("Следующие цифры являются общими = ");
			for(i=0;i<10;i++) if(ab[i]==2) System.out.print(i+" ");
			System.out.println();

		} else System.out.println("Общих цифр НЕТ.");

		in.close();
	}
}
