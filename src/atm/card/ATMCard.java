package atm.card;

public interface ATMCard {
	
	void setATMCardNo(long ATMCardNo);
	void setPin(int Pin);
	void setBankName();
	long getATMCardNo();
	int getPin();
	String getBankName();
	
}
