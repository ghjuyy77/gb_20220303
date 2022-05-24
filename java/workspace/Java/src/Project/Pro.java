package Project;

import java.util.Scanner;

public class Pro {


	private static Scanner scan;

	public static void main(String[] args) {
		
		int num = 0;
		int price = 0; int money2;
		int totalprice;
		int su = 0;
        String menu ="";
        scan = new Scanner(System.in);
       
        System.out.println("안녕하세요 한신우동입니다.");
        System.out.println("주문 도와드릴까요 ? (Y / N )");
        String intro = scan.next();
        if(intro.equalsIgnoreCase("N")){
			System.out.println("감사합니다. 또 방문해주세요 :)");
			System.exit(0);
        }
        
        while(true){    
		System.out.println("★한신우동 메뉴판★");
		System.out.println("1. 즉석우동(6000원)");
		System.out.println("2. 어묵우동(7000원)");
		System.out.println("3. 왕돈까스(8000원)");
		System.out.println("4. 맥주(5000원)");
		System.out.println("5. 소주(4000원)");
		
		
		System.out.println(" ");
		System.out.print("메뉴를 입력하세요: ");
		num = scan.nextInt();
		
		// if문 사용하여 각 메뉴당 번호에 해당하는 가격 부여 
		if(num == 1){
			menu = "1.즉석우동";
			price = 6000;
		}else if(num == 2){
			menu = "2. 어묵우동";
			price = 7000;	
		}else if(num == 3){
			menu = "3. 왕돈까스";
			price = 8000;
		}else if(num == 4){
			menu = "4. 맥주";
			price = 5000;	
		}else if(num == 5){
			menu = "5. 소주";
			price = 4000;	
		}else{
			menu ="없는 메뉴입니다";
			System.out.println(menu);
		}
		if((num==1)||(num==2)||(num==3)||(num==4)){
		System.out.print("수량을 입력하세요 : ");
		su = scan.nextInt();
		
		System.out.print("지불할 금액은? ");
		int money = scan.nextInt();

		 //구매금액
		totalprice = (price * su);
		
		//거스름돈
		money2 = money - totalprice;
		
		
		System.out.println("입금액 :"+money+" 종류 :"+menu+" 수량 :"+su);
		if(totalprice>money){
			System.out.println("입금액이 부족합니다. 금액을 확인하세요!");
		}else{
		System.out.println("구매금액 :"+totalprice+" 거스름돈 : "+money2);
		}
	}
  
		System.out.println();
		System.out.print("계속 구매하시겠습니까?(Y/N)");
		String str = scan.next();
		if(str.equalsIgnoreCase("N")){
			System.out.println("감사합니다 !! 안녕히가세요 :)");
			break;
		}
      }
	}
}