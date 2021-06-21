package onearray;

import static java.lang.System.out;
import java.util.*;

/*
	Курс Java online
	Урок 2 - Одномерные массивы - Задание 6
*/

class Task6 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		out.println("Программа вычисляет сумму чисел для элементов массива, индекс, которых является простым числом.");
		out.println("Массив заполняется случайными вещественными числами. Размерность массива N задается оператором.");

		out.print("Введите размер массива N = ");
		int n = in.nextInt();	//здесь возможна исключающая ситуация
		if(n>2) {
			double res = 0;
			double mas[] = new double[n];	//здесь возможна исключающая ситуация
			fillArrayRandom(mas);
			List<Integer> primes = new ArrayList<>();
			fillArrayPrimes(n,primes);
			for(int i = 0; i < primes.size(); i++) {
				int index = primes.get(i);
				double val = mas[index];
				res += val;
				out.println("mas[" + index + "] = " + val);
			}
			out.println("Сумма элементов массива равна " + res);
		} else {
			out.println("Размер массива должен быть не меньше 3.");
		}
		
		in.close();
	}


/*
	fillArrayPrimes - наполняет список простыми числами, найденными в диапазоне от 0 до to
			Примечание: to >= 3
*/
	private static void fillArrayPrimes(int to, List<Integer> primes) {
		if(to > 2) {
			primes.add(2);
			for(int i = 3; i < to; i += 2)
				if(isPrime(i,primes))
					primes.add(i);
		} else {
			out.println("Размер массива должен быть не меньше 3.");
		}
	}


/*
	isPrime - возвращает признак того, что i является простым числом, т.е. делится на 1 и на само себя
*/
	private static boolean isPrime(int n, List<Integer> primes) {
		double sqrt = Math.sqrt(n);
		for(int i = 0; i < primes.size(); i++) {
			int prime = primes.get(i);
			if(prime > sqrt) {
				return true;
			}

			if(n % prime == 0) {
				return false;
			}
		}
		return true;
	}


/*
	fillArrayRandom - заполняет элементы массива случайными вещественными числами от 0 до 1000
*/
	private static void fillArrayRandom(double mas[]) {
		for(int i=0;i<mas.length;i++)
			mas[i]=Math.random()*1000.;
	}
}
