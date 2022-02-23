import java.util.Scanner;

public class p115 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int num;
		int left;
		int right;
		int decima;
		int suma;
		boolean kaprekar;
		
		num = s.nextInt();

		while(num != 0) {

			decima = 1;
			left = 0;
			right = 0;
			suma = 0;

			kaprekar = false;

			left = num * num;

			while(left > 0 && !kaprekar) {

				right = right + (left % 10) * decima;
				left /= 10;
				decima *= 10;

				suma = left + right;

				if(right > 0 && suma == num) {
					kaprekar = true;
				}

			}


			if(kaprekar == true) {

				System.out.println("SI");

			} else if (kaprekar == false) {

				System.out.println("NO");

			}

			num = s.nextInt();

		}

		s.close();
	}


}
