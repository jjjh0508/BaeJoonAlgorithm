package baejoon;

import java.util.Scanner;

public class BaeJoon2525 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);;
		int hour = sc.nextInt();
		int minute =sc.nextInt();
		int plus = sc.nextInt();
		
		if((minute+plus)<60) {
			minute+=plus;
			System.out.println(hour+" "+minute);
		}else {
			hour+=(minute+plus)/60;
			minute =(minute+plus)%60;
			if(hour>23) {
				hour=hour-24;
			}
			System.out.println(hour+" "+minute);
		}
	}

}
