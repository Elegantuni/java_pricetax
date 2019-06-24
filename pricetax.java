import java.util.Scanner;

public class pricetax
{
	public static void main(String[] args)
	{
		double price = 0.0;
		double tax = 0.0;
		double dollars_off = 0.0;
		double the_new_price = 0.0;
		int the_input = 0;

		System.out.println("Enter 1 to calculate price and price off from tax and the final price");
		System.out.println("Enter 2 to calculate price off and final price from price and tax");
		System.out.println("Enter 3 to calculate price and tax percentage from price off and the final price");
		System.out.println("Enter 4 to calculate price off and tax from the price and final price");
		System.out.println("Enter 5 to calculate price and tax price added from tax and the final price");
		System.out.println("Enter 6 to calculate price added and final price from price and tax");
		System.out.println("Enter 7 to calculate price and tax percentage from price added and the final price");
		System.out.println("Enter 8 to calculate price added and tax from the price and final price");

		Scanner scan = new Scanner(System.in);
		the_input = Integer.parseInt(scan.nextLine());

		switch(the_input)
		{
			case 1:
				System.out.print("Enter the tax percentage (ex: 50 for 50%): ");
				scan = new Scanner(System.in);
				tax = Double.parseDouble(scan.nextLine());

				System.out.print("Enter the final price: ");
				scan = new Scanner(System.in);
				the_new_price = Double.parseDouble(scan.nextLine());

				price = -the_new_price / (tax/100 - 1);

				price = roundToTenths(price);

				dollars_off = price - the_new_price;

				dollars_off = roundToTenths(dollars_off);

				System.out.println("The price is " + price);
				System.out.println("The price off is " + dollars_off);

				break;

			case 2:
				System.out.print("Enter the price: ");
				scan = new Scanner(System.in);
				price = Double.parseDouble(scan.nextLine());

				System.out.print("Enter the tax percentage (ex: 50 for 50%): ");
				scan = new Scanner(System.in);
				tax = Double.parseDouble(scan.nextLine());

				dollars_off = price * (tax / 100);

				dollars_off = roundToTenths(dollars_off);

				the_new_price = price - dollars_off;

				the_new_price = roundToTenths(the_new_price);

				System.out.println("The price off is " + dollars_off);
				System.out.println("The final price is " + the_new_price);

				break;

			case 3:
				System.out.print("Enter the price off: ");
				scan = new Scanner(System.in);
				dollars_off = Double.parseDouble(scan.nextLine());

				System.out.print("Enter the final price: ");
				scan = new Scanner(System.in);
				the_new_price = Double.parseDouble(scan.nextLine());

				price = the_new_price + dollars_off;

				price = roundToTenths(price);

				tax = dollars_off * 100 / price;

				tax = roundToTenths(tax);

				System.out.println("The price is " + price);
				System.out.println("The tax percentage is " + tax);

				break;

			case 4:
				System.out.print("Enter the price: ");
				scan = new Scanner(System.in);
				price = Double.parseDouble(scan.nextLine());

				System.out.print("Enter the final price: ");
				scan = new Scanner(System.in);
				the_new_price = Double.parseDouble(scan.nextLine());

				dollars_off = price - the_new_price;

				dollars_off = roundToTenths(dollars_off);

				tax = dollars_off * 100 / price;

				tax = roundToTenths(tax);

				System.out.println("The price off is " + dollars_off);
				System.out.println("The tax percentage is " + tax);

				break;

			case 5:
				System.out.print("Enter the tax percentage (ex: 50 for 50%): ");
				scan = new Scanner(System.in);
				tax = Double.parseDouble(scan.nextLine());

				System.out.print("Enter the final price: ");
				scan = new Scanner(System.in);
				the_new_price = Double.parseDouble(scan.nextLine());

				price = the_new_price / (tax/100 + 1);

				price = roundToTenths(price);

				dollars_off = price * tax/100;

				dollars_off = roundToTenths(dollars_off);

				while(price + dollars_off > the_new_price)
				{
					price -= 0.01;
					dollars_off = price * tax/100;
					dollars_off = roundToTenths(dollars_off);
				}

				System.out.println("The price added is " + dollars_off);
				System.out.println("The price is " + price);

				break;

			case 6:
				System.out.print("Enter the price: ");
				scan = new Scanner(System.in);
				price = Double.parseDouble(scan.nextLine());

				System.out.print("Enter the tax percentage (ex: 50 for 50%) ");
				scan = new Scanner(System.in);
				tax = Double.parseDouble(scan.nextLine());

				dollars_off = price * (tax / 100);

				dollars_off = roundToTenths(dollars_off);

				the_new_price = price + dollars_off;
				
				the_new_price = roundToTenths(the_new_price);

				System.out.println("The price added is " + dollars_off);
				System.out.println("The final price is " + the_new_price);

				break;

			case 7:
				System.out.print("Enter the price added: ");
				scan = new Scanner(System.in);
				dollars_off = Double.parseDouble(scan.nextLine());

				System.out.print("Enter the final price: ");
				scan = new Scanner(System.in);
				the_new_price = Double.parseDouble(scan.nextLine());

				price = the_new_price - dollars_off;

				price = roundToTenths(price);

				tax = dollars_off * 100 / price;

				tax = roundToTenths(tax);

				System.out.println("The price is " + price);
				System.out.println("The tax percentage is " + tax);

				break;

			case 8:
				System.out.print("Enter the price: ");
				scan = new Scanner(System.in);
				price = Double.parseDouble(scan.nextLine());

				System.out.print("Enter the final price: ");
				scan = new Scanner(System.in);
				the_new_price = Double.parseDouble(scan.nextLine());

				dollars_off = the_new_price - price;

				dollars_off = roundToTenths(dollars_off);

				tax = dollars_off * 100 / price;

				tax = roundToTenths(tax);

				System.out.println("The price added is " + dollars_off);
				System.out.println("The tax percentage is " + tax);

				break;

			default:
				System.out.println("Enter 1 to calculate price and price off from tax and the final price");
			        System.out.println("Enter 2 to calculate price off and final price from price and tax");
			        System.out.println("Enter 3 to calculate price and tax percentage from price off and the final price");
			        System.out.println("Enter 4 to calculate price off and tax from the price and final price");
			        System.out.println("Enter 5 to calculate price and tax price added from tax and the final price");
			        System.out.println("Enter 6 to calculate price added and final price from price and tax");
			        System.out.println("Enter 7 to calculate price and tax percentage from price added and the final price");
			        System.out.println("Enter 8 to calculate price added and tax from the price and final price");
			       	scan = new Scanner(System.in);
				the_input = Integer.parseInt(scan.nextLine());
		}
	}

	public static double roundToTenths(double data1)
	{
		data1 *= 100;
		return Math.floor(data1 + 0.5) / 100;
	}
}

