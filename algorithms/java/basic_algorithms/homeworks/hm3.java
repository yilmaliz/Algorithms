package homework2;

import java.util.Scanner;


public class Homework3 {
	
	public static void main(String[] args) { 
		
		Scanner scanner = new Scanner(System.in);
		
		int given_size, student_number, num_0=0, num_1=0, num_2=0,
						num_3=0, num_4=0, num_5=0,num_6=0,
						num_7=0, num_8=0, num_9=0; 
		
		String given_char, num_zero="", num_one="", num_two="",
				num_three="", num_four="", num_five="", num_six="",
				num_seven="", num_eight="", num_nine="";
															
		
		System.out.println("Enter Size of the Digit: ");
		given_size = scanner.nextInt();
		
		System.out.println("Enter Character of the Digit: ");
		given_char = scanner.next();
		
		System.out.println("Enter Student Number: ");
		student_number = scanner.nextInt();
		
		//number 0
		
		while(num_0 < given_size*5) {
			
			if(num_0 < given_size || num_0 >= given_size*4) {
				for(int i = 0; i < given_size*3; i++) {
					num_zero = num_zero + given_char;
				}
			}
			else {
				for(int i = 0; i<given_size*3; i++) {
					if(i < given_size || i >= given_size*2){
						num_zero = num_zero + given_char;
					}else {
						num_zero = num_zero + " ";
					}
				}
			}
			
			num_zero = num_zero + "\n";
			num_0++;
		}
		
		//number 1
		
		while (num_1 < given_size*5) {
			
			for (int i = 0; i < given_size*3; i++) {
				if(i < given_size*2) {
					num_one = num_one +" ";
				}else {
					num_one = num_one + given_char;
				}
			}
			
			num_one = num_one + "\n";
			num_1++;
		}
		
		//number 2
		
		while (num_2 < given_size*5) {
			
			if(num_2 < given_size || num_2 >= given_size*4 || (num_2  >= given_size*2 & num_2<given_size*3)) {
				for(int i = 0; i < given_size*3; i++) {
					num_two = num_two + given_char;	
				}
			}else {
				if(num_2 >=given_size & num_2 < given_size*2 ) {
					for(int i = 0; i <given_size*3; i++) {
						if(i >= given_size*2) {
							num_two = num_two + given_char;
						}
						else {
							num_two = num_two + " ";
						}
					}
				}else {
					for(int i = 0; i < given_size*3; i++) {
						if(i < given_size) {
							num_two = num_two + given_char;
						}
						else {
							num_two = num_two + " ";
						}
					}
					
				}
				
			}
			
			num_two = num_two + "\n";
			num_2++;
	
		}
		
		//number 3
		
		while(num_3 < given_size*5) {
			
			if(num_3 < given_size || num_3 >= given_size*2 && num_3 < given_size*3 || num_3 >= given_size*4 ) {
				for(int i = 0; i < given_size*3; i++) {
					num_three = num_three + given_char;
				}
			}
			else {
				for(int i = 0; i<given_size*3; i++) {
					if(	i >= given_size*2){
						num_three = num_three + given_char;
					}else {
						num_three = num_three + " ";
					}
				}
			}
			
			num_three = num_three + "\n";
			num_3++;
		}
		
		//number 4
		
		while(num_4 < given_size*5) {
			
			if(num_4 >= given_size*2 && num_4 < given_size*3) {
				for(int i = 0; i < given_size*3; i++) {
					num_four = num_four + given_char;
				}
			}
			else if (num_4 < given_size*2 ){
				for(int i = 0; i < given_size*3; i++) {
					if(i < given_size || i >= given_size*2){
						num_four = num_four + given_char;
					}else {
						num_four = num_four + " ";
					}	
				}
			}
			else {
				for(int i = 0; i<given_size*3; i++) {
					if(i >= given_size*2){
						num_four = num_four + given_char;
					}else {
						num_four = num_four + " ";
					}
				}
				
			}
			
			num_four = num_four + "\n";
			num_4++;
		}	
		
		//number 5
		
		while (num_5 < given_size*5) {
			
			if(num_5 < given_size || num_5 >= given_size*4 || (num_5  >= given_size*2 & num_5<given_size*3)) {
				for(int i = 0; i<given_size*3;i++) {
					num_five = num_five + given_char;	
				}
			}else {
				if(num_5 >=given_size & num_5 < given_size*2 ) {
					for(int i = 0; i< given_size*3; i++) {
						if(i < given_size) {
							num_five = num_five + given_char;
						}
						else {
							num_five = num_five + " ";
						}
					}
	
				}else {
					for(int i = 0;i<given_size*3;i++) {
						if(i >= given_size*2) {
							num_five = num_five + given_char;
						}
						else {
							num_five = num_five + " ";
						}
					}
					
				}
				
			}

			num_five = num_five + "\n";
			num_5++;
	
		}
		
		
		//number 6
		
		while(num_6 < given_size*5) {
			
			if(num_6 < given_size || num_6 >= given_size*2 && num_6 < given_size*3 || num_6 >= given_size*4 ) {
				for(int i = 0; i < given_size*3; i++) {
					num_six = num_six + given_char;
				}
			}
			else if (num_6 >= given_size && num_6 < given_size*2 ){
				for(int i = 0; i<given_size*3; i++) {
					if(i < given_size){
						num_six = num_six + given_char;
					}else {
						num_six = num_six + " ";
					}
				}
			}
			else {
				for(int i = 0; i<given_size*3; i++) {
					if(i < given_size || i >= given_size*2){
						num_six = num_six + given_char;
					}else {
						num_six = num_six + " ";
					}
				}
				
			}
			
			num_six = num_six + "\n";
			num_6++;
		}	
		//number 7
		
		while (num_7 < given_size*5) {
			
			if(num_7 >= given_size*2) {
				for(int i = 0; i < given_size*3; i++) {
					if(i >= given_size*2) {
						num_seven = num_seven + given_char;
					}
					else {
						num_seven = num_seven + " ";
					}
				}	
			}
			else if(num_7 < given_size) {
				for(int i = 0; i < given_size*3; i++) {
					num_seven = num_seven + given_char;	
				}	
			}
			else {
				for(int i = 0; i < given_size*3; i++) {
					if(i < given_size || i >= given_size*2) {
						num_seven = num_seven + given_char;
					}else {
						num_seven = num_seven + " ";
					}
				}
				
			}
			
			num_seven = num_seven + "\n";
			num_7++;
		
		}
		

		// number 8
		
		while(num_8 < given_size*5) {
			
			if(num_8 < given_size || num_8 >= given_size*2 && num_8 < given_size*3 || num_8 >= given_size*4 ) {
				for(int i = 0; i < given_size*3; i++) {
					num_eight = num_eight + given_char;
				}
			}
			else {
				for(int i = 0; i<given_size*3; i++) {
					
					if(i < given_size || i >= given_size*2){
						num_eight = num_eight + given_char;
					}else {
						num_eight = num_eight + " ";
					}
				}
			}
			
			num_eight = num_eight + "\n";
			num_8++;
		}
		
		//number 9
		
		while(num_9 < given_size*5) {
			
			if(num_9 < given_size || num_9 >= given_size*2 && num_9 < given_size*3 || num_9 >= given_size*4 ) {
				for(int i = 0; i < given_size*3; i++) {
					num_nine = num_nine + given_char;
				}
			}
			else if (num_9 >= given_size*3 && num_9 < given_size*4 ){
				for(int i = 0; i<given_size*3; i++) {
					if(i >= given_size*2){
						num_nine = num_nine + given_char;
					}else {
						num_nine = num_nine + " ";
					}
				}
			}
			else {
				for(int i = 0; i<given_size*3; i++) {
					if(i < given_size || i >= given_size*2){
						num_nine = num_nine + given_char;
					}else {
						num_nine = num_nine + " ";
					}
				}
				
			}
			
			num_nine = num_nine + "\n";
			num_9++;
		}	
		
	
		System.out.print(num_seven);

		scanner.close();

	}

}





//	public static void main(String[] args) {
//		
//		String karakter = "*";		
//		int size =3;
//		
//		int d =0;
//		String sifir = "";
//		while (d<size*5) {
//			if(d < size || d >= size*4 ) {
//				for(int i = 0; i<size*3;i++) {
//					sifir = sifir + karakter;	
//				}
//			}else {
//				for(int i = 0; i<size*3;i++) {
//					if(i<size || i>=size*2) {
//						sifir = sifir + karakter;
//					}else {
//						sifir = sifir + " ";
//					}
//				}
//			}
//			sifir = sifir + "\n";
//			d++;
//	
//		}
//		
//
//		int d1 =0;
//		String bir = "";
//		while (d1<size*5) {
//			for (int i = 0; i < size*3;i++) {
//				if(i < size*2) {
//					bir = bir +" ";
//				}else {
//					bir = bir + karakter;
//				}
//			}
//
//			bir = bir + "\n";
//			d1++;
//	
//		}
//		
//		
//		int d2 =0;
//		String iki = "";
//		while (d2<size*5) {
//			if(d2 < size || d2 >= size*4 || (d2  >= size*2 & d2<size*3)) {
//				for(int i = 0; i<size*3;i++) {
//					iki = iki + karakter;	
//				}
//			}else {
//				if(d2 >=size & d2 < size*2 ) {
//					for(int i = 0;i<size*3;i++) {
//						if(i >= size*2) {
//							iki = iki + karakter;
//						}
//						else {
//							iki = iki + " ";
//						}
//					}
//					
//				}else {
//					for(int i = 0;i<size*3;i++) {
//						if(i < size) {
//							iki = iki + karakter;
//						}
//						else {
//							iki = iki + " ";
//						}
//					}
//					
//				}
//				
//				
//			}
//
//			iki = iki + "\n";
//			d2++;
//	
//		}
//
//		
//		
//		
//		
//
//		int d5 =0;
//		String bes = "";
//		while (d5<size*5) {
//			if(d5 < size || d5 >= size*4 || (d5  >= size*2 & d5<size*3)) {
//				for(int i = 0; i<size*3;i++) {
//					bes = bes + karakter;	
//				}
//			}else {
//				if(d5 >=size & d5 < size*2 ) {
//					for(int i = 0;i<size*3;i++) {
//						if(i < size) {
//							bes = bes + karakter;
//						}
//						else {
//							bes = bes + " ";
//						}
//					}
//	
//				}else {
//					for(int i = 0;i<size*3;i++) {
//						if(i >= size*2) {
//							bes = bes + karakter;
//						}
//						else {
//							bes = bes + " ";
//						}
//					}
//	
//				}
//	
//			}
//
//			bes = bes + "\n";
//			d5++;
//	
//		}
//
//		
//		
//		int d7 =0;
//		String yedi = "";
//		while (d7<size*5) {
//			if(d7 >= size*2) {
//				for(int i = 0;i<size*3;i++) {
//					if(i >= size*2) {
//						yedi = yedi + karakter;
//					}
//					else {
//						yedi = yedi + " ";
//					}
//				}	
//			}
//			else if(d7 < size) {
//				for(int i = 0; i<size*3;i++) {
//					yedi = yedi + karakter;	
//				}	
//			}
//			else {
//				for(int i = 0; i<size*3;i++) {
//					if(i<size || i>=size*2) {
//						yedi = yedi + karakter;
//					}else {
//						yedi = yedi + " ";
//					}
//				}
//				
//			}
//			yedi = yedi + "\n";
//			d7++;
//		
//		}
//
//
//
//		
//			
//
//		for (int i = 0; i<size*5;i++) {
//			System.out.print(sifir.substring(size*3*i+i,size*3*(i+1)+i));
//			System.out.print(" ");
//			System.out.print(bir.substring(size*3*i+i,size*3*(i+1)+i));
//			System.out.print(" ");
//			System.out.print(iki.substring(size*3*i+i,size*3*(i+1)+i));
//			System.out.print(" ");
//			System.out.print(bes.substring(size*3*i+i,size*3*(i+1)+i));
//			System.out.println(" ");
//			System.out.print(yedi.substring(size*3*i+i,size*3*(i+1)+i));
//			System.out.println(" ");
//			
//		}
		
		

		
		
		
		
		
		
	}

}
