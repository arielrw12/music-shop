package musicshop;

public class Customer {
	
	private String name;
	private int instrumentNumber;
	private int moneyAmount;
	private int inspiration;
	
	public Customer(String name, int instrumentNumber, int moneyAmount, int inspiration) {
		this.name = name;
		this.instrumentNumber = 1;
		this.moneyAmount = 100;
		this.inspiration = 20;
	}

	public String getName() {
		return name;	
	}

	public int getInstrumentNumber() {
		return instrumentNumber;
	}

	public int getMoneyAmount() {
		return moneyAmount;
	}
	
	public void buyInstrument() {
		this.instrumentNumber++;
		this.moneyAmount -= 50;
	}


	public void sellInstrument() {
		this.instrumentNumber--;
		this.moneyAmount += 50;
	}

	public int getInspiration() {
		return inspiration;
	}

	public void beInspired() {
		this.inspiration += 5;
	}

}
