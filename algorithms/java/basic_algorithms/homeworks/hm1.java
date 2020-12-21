package midterm1;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;
public class Homework1 {
	public static void main(String[] args) throws InterruptedException {
		boolean uyelikDurumu = false;
		boolean plusUyelik =false;
		String welcome = "Welcome!!"+"\n"+"Are you Premium Member please write '2'"+"\n"+"Are you PremiumPlus Member please write '3'"+"\n"+"If you are not member please write '1'.";		
		System.out.print(welcome);
		Scanner scan = new Scanner(System.in);
		int userId = scan.nextInt();
		switch (userId) {
			case 1:
				System.out.println("Welcom You Are Normal Customer! You should be a member for more advantages");
				uyelikDurumu = false;
				plusUyelik = false;
				break;
			case 2:
				System.out.println("Welcom You Are Premium Member!");
				uyelikDurumu = true;
				plusUyelik = false;
				break;
			case 3:
				System.out.println("Welcom You Are PremiumPlus Member!");
				uyelikDurumu = true;
				plusUyelik = true;
				break;
		}
			
		System.out.println("You can continue shopping.");
		boolean shopping = true; 
		DecimalFormat formatter = new DecimalFormat("##.##");
		double totalProductPrice = 0;
		double totalShoppingPrice = 0;
		double totalDiscount = 0;
		String Receipt= "\n\n\n\nShopping Receipt";
		
		for (int i = 0 ; i < 10;i++ ) {
			int number = i+1;
			int productPrice = i*2;
			System.out.println(number + ") ---- Product"+number+" ---- "+productPrice+".99$");
		}
		
		
		while (shopping == true) {
			System.out.print("Please write the number of product you want to buy or write '99' to complate the shopping.");
			Scanner sl = new Scanner(System.in);
			int buyProduct = sl.nextInt();
			if (buyProduct == 99) {
				break;	
			}
			else if (0 < buyProduct & buyProduct < 11  ) {
				double urunfiyati = ((buyProduct-1) * 2.00) +0.99;
				String urun = "Product"+buyProduct;	
				System.out.println(urun+ " " + urunfiyati +" $, How many do you want to Buy :");
				Scanner num = new Scanner(System.in);
				int hmBuy = num.nextInt();
				totalProductPrice = hmBuy*urunfiyati; 			
				totalShoppingPrice = totalShoppingPrice + totalProductPrice;
				System.out.println("The Total Price Of "+urun+" Is : "+formatter.format(totalProductPrice)+ "$.");
				System.out.println("The Total Price Of Shopping Is : "+formatter.format(totalShoppingPrice)+ "$.");
				String Hesap = urun+" --- " +urunfiyati+"$"+ " x " + hmBuy +" --- " +  formatter.format(totalProductPrice) +"$";
				Receipt = Receipt +"\n"+Hesap;
			}
			else {
				System.out.println("There is no option like this. Try Again.");
				System.out.print("Please write the number of product you want to buy or write '99' to complate the shopping.");
			}
			shopping = true;	
		}
		if (uyelikDurumu == false) {
			System.out.println("You are not member of our super market."+"\n"+"If you want to be member to having advantages"
			+"\n"+"please enter '1' for Premium (It is 12 $)"+"\n"+"please enter '2' for PremiumPlus (It is 20 $)"+"\n"+"If you do not want to be member please enter '0':");
			Scanner userUpgrade = new Scanner(System.in);
			int sUserUpgrade = userUpgrade.nextInt();
			switch(sUserUpgrade) {
				case 0:
					uyelikDurumu = false;
					System.out.println("You did not upgrade your membership.");
					break;
				case 1: 
					uyelikDurumu = true;
					plusUyelik = false;
					Scanner userInfo = new Scanner(System.in);
					System.out.println("Please Write Your Name");
					String userName = userInfo.nextLine();
					System.out.println("Please Write Your Surname");
					String userSName = userInfo.nextLine();
					System.out.println("Please Write Your Phone Number");
					Long userPhoneNumber = userInfo.nextLong();
					System.out.println("CONGRATULATIONS "+userName+" "+userSName+", YOU ARE A PREMIUM MEMBER ANYMORE.");
					totalShoppingPrice = totalShoppingPrice + 12;
					String Hesap = "Being a Premium Member  --- 12 $";
					Receipt = Receipt +"\n"+Hesap;
					
					break;
				case 2:
					uyelikDurumu = true;
					plusUyelik = true;
					Scanner userInfo1 = new Scanner(System.in);
					System.out.println("Please Write Your Name");
					String userName1 = userInfo1.nextLine();
					System.out.println("Please Write Your Surname");
					String userSName1 = userInfo1.nextLine();
					System.out.println("Please Write Your Phone Number");
					Long userPhoneNumber1 = userInfo1.nextLong();
					System.out.println("CONGRATULATIONS, YOU ARE A PREMIUMPLUS MEMBER ANYMORE.");
					totalShoppingPrice = totalShoppingPrice + 20;	
					String Hesap1 = "Being a PremiumPlus Member  --- 20 $";
					Receipt = Receipt +"\n"+Hesap1;
					break;
			}
		}
		else {
			if (plusUyelik == false) {
				System.out.println("Do you want too upgrade your membership to PremiumPlus (It is 10$)."
						+"\n"+"please enter '1' for PremiumPlus (It is 10 $)"+"\n"+"If you do not want to be PremiumPlus member please enter '0':");
				Scanner userUpgrade = new Scanner(System.in);
				int sUserUpgrade = userUpgrade.nextInt();
				switch(sUserUpgrade) {
				case 0:
					uyelikDurumu = true;
					plusUyelik = false;
					System.out.println("You did not upgrade your membership.");
					break;
				case 1: 
					uyelikDurumu = true;
					plusUyelik = true;
					System.out.println("CONGRATULATIONS, YOU ARE A PREMIUMPLUS MEMBER ANYMORE.");
					totalShoppingPrice = totalShoppingPrice + 10;
					String Hesap = "Being a Premium Member  --- 10 $";
					Receipt = Receipt +"\n"+Hesap;
					break;
				}
			}
		}	
		if (uyelikDurumu == false) {
			if(totalShoppingPrice >100) {
				System.out.println("The total price of your shopping:" +  formatter.format(totalShoppingPrice)+"$"+". But you have 2% discount(price is greater than 100 $).");
				totalDiscount = (totalShoppingPrice/100)*2;
				String Hesap = "2% discount --- (-"+formatter.format(totalDiscount)+"$)" ;
				Receipt = Receipt +"\n"+Hesap;
				totalShoppingPrice = (totalShoppingPrice/100)*98;
				System.out.println("The total price of your shopping With 2% discount : " +  formatter.format(totalShoppingPrice) + "$");
			}
			else {
				System.out.println("The total price of your shopping. " +  formatter.format(totalShoppingPrice) + "$");
			}			
		}
		else
			
		{
			if (plusUyelik == false) {
				if (totalShoppingPrice > 100) {
					System.out.println("The total price of your shopping:" +  formatter.format(totalShoppingPrice) +"$"+". But you have 5% discount(For Premium Members and price is greater then 100$ ).");
					totalDiscount = (totalShoppingPrice/100)*5;
					String Hesap = "5% discount --- (-"+formatter.format(totalDiscount)+"$)" ;
					Receipt = Receipt +"\n"+Hesap;
					totalShoppingPrice = (totalShoppingPrice/100)*95;
					System.out.println("The total price of your shopping With 5% discount : " +  formatter.format(totalShoppingPrice) + "$");
				}
				else {
					System.out.println("The total price of your shopping:" +  formatter.format(totalShoppingPrice)+"$"+". But you have 2% discount(For Premium Members).");
					totalDiscount = (totalShoppingPrice/100)*2;
					String Hesap = "2% discount --- (-"+formatter.format(totalDiscount)+"$)" ;
					Receipt = Receipt +"\n"+Hesap;
					totalShoppingPrice = (totalShoppingPrice/100)*98;
					System.out.println("The total price of your shopping With 2% discount : " +  formatter.format(totalShoppingPrice) + "$");
				}	
			}
			else {
				if (totalShoppingPrice > 100) {
					System.out.println("The total price of your shopping:" +  formatter.format(totalShoppingPrice)+"$"+". But you have 10% discount(For PremiumPlus Members and price is greater then 100$ ).");
					totalDiscount = (totalShoppingPrice/100)*10;
					String Hesap = "10% discount --- (-"+formatter.format(totalDiscount)+"$)" ;
					Receipt = Receipt +"\n"+Hesap;
					totalShoppingPrice = (totalShoppingPrice/100)*90;
					System.out.println("The total price of your shopping With 10% discount : " +  formatter.format(totalShoppingPrice) + "$");
				}
				else {
					System.out.println("The total price of your shopping:" +  formatter.format(totalShoppingPrice)+"$"+". But you have 5% discount(For PremiumPlus Members).");
					totalDiscount = (totalShoppingPrice/100)*5;
					String Hesap = "5% discount --- (-"+formatter.format(totalDiscount)+"$)" ;
					Receipt = Receipt +"\n"+Hesap;
					totalShoppingPrice = (totalShoppingPrice/100)*95;
					System.out.println("The total price of your shopping With 5% discount : " +  formatter.format(totalShoppingPrice) + "$");
				}	
			}
		}
		Scanner oT = new Scanner(System.in);
		String sOT = "Select How Will You Pay!"+"\n"+"1.-- Credit Card"+"\n"+"2.-- Bank Card"+"\n"+"3.-- Cash";
		System.out.println(sOT);	
		int odemeTipi = oT.nextInt();
		switch(odemeTipi) {
			case 1:
				System.out.println("Payment by Credit Card Completed");
				break;
			case 2:	
				System.out.println("Payment by Bank Card Completed");
				break;
			case 3:
				System.out.println("Cash Payment Completed");
				break;
		}
		String Hesap = "Total Price------ "+formatter.format(totalShoppingPrice)+"$";
		System.out.println(Receipt);
		System.out.println("Thank you for choosing us. Have a nice day, Goodby :D");
	}
}


