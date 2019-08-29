package atm.machine;
import java.util.Scanner;

import atm.card.*;
public class ATMMachine {
	
	int stockCash;
	String bankName;
	ATMCard card;
	
	public ATMMachine() {
	}
	public ATMMachine(int stockCash, String bankName) {
		super();
		this.stockCash = stockCash;
		this.bankName = bankName;
		
	}
	public int getStockCash() {
		return stockCash;
	}
	public void setStockCash(int stockCash) {
		this.stockCash = stockCash;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public ATMCard getCard() {
		return card;
	}
	public void setCard(ATMCard card) {
		this.card = card;
	}
	void insertCard(ATMCard card) {
		Scanner in=new Scanner(System.in);
		if(card==null) {
			setCard(card);
			System.out.println("Insert Pin");
			if(card.getPin()==in.nextInt()) {
				System.out.println("Pin Success");
				
			}
			else {
				System.out.print("Wrong pin. Try again/n Card removed");
				removeCard();
			
			}
		}
		else {
			System.out.println("Please remove the pre inserted atm card");
			
		}
	}
	 void removeCard() {
		card=null;
		
	}
	void withdraw(int i) {
		if(card==null) {
			if(stockCash-i<0) {
				System.out.println("Not Enough monew in ATM");
			}
			else {
				stockCash-=i;
				System.out.println(i+" withdrawn from "+card);
			}
			System.out.println("THANK YOU");
			System.out.println();
			
			removeCard();
		}
		else {
			System.out.println("No ATM card found");
		}
	}
}
