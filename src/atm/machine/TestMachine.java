package atm.machine;


import atm.card.*;

public class TestMachine {
	public static void main(String Ar[]) {
		SBICard c1=new SBICard(645646545,4561);
		HDFCCard c2=new HDFCCard(64564621,4561);
		ATMMachine am=new ATMMachine(5454554, "SBI");
		am.insertCard(c1);
		am.withdraw(4556);
		am.removeCard();
		am.insertCard(c2);
		am.withdraw(45566454);
		am.removeCard();

	}
}
