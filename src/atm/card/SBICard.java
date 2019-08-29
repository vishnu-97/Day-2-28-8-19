package atm.card;

public class SBICard implements ATMCard {

	long ATMCardNo;
	int pin;
	String bankName;
	
	@Override
	public long getATMCardNo() {
		return ATMCardNo;
	}

	@Override
	public int getPin() {
		return pin;
	}

	@Override
	public String toString() {
		return "ATMCardNo=" + ATMCardNo + ", pin=" + pin + ", bankName=" + bankName ;
	}

	public SBICard(long aTMCardNo, int pin) {
		ATMCardNo = aTMCardNo;
		this.pin = pin;
	}

	@Override
	public String getBankName() {
		return bankName;
	}

	@Override
	public void setATMCardNo(long ATMCardNo) {
		this.ATMCardNo=ATMCardNo;
	}

	@Override
	public void setPin(int pin) {
		this.pin=pin;
	}

	@Override
	public void setBankName() {
		this.bankName="SBI";
	}
	

}
