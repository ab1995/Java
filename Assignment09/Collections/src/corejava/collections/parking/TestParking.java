package corejava.collections.parking;

import java.util.Scanner;

public class TestParking {

	public static void main(String[] args) {

		ParkedCarOwenerList parking=new ParkedCarOwenerList();
		String token;
		ParkedCarOwnerDetails[] cars=new ParkedCarOwnerDetails[130];
		for(int i=0;i<130;i++){
			cars[i]=new ParkedCarOwnerDetails("abc"+i, "i0"+i, "MH1290"+i, 9233232, "Pune");
			token=parking.addNewCar(cars[i]);
			if(token==null)
				System.out.println("No slot Available.");
			else
				System.out.println(token);
		}
		
		parking.getParkedCarLocation("F2S3_10");
		parking.removeCar("F2S3_10");
		parking.getParkedCarLocation("F2S3_10");
		
		Scanner sc=new Scanner(System.in);
/*		int choice=0;
		do{
			System.out.println("\n 1) Park Car\n 2) Get Parked Car Details\n 3) Remove Car\n 4) Exit\n Enter your Choice: ");
			choice=sc.nextInt();
			
			switch(choice){
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4: break;
			default: System.out.println("Invalid Choice!");
			}
		}while(choice!=4);*/
		
	}

}

