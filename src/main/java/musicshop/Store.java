package musicshop;

public class Store {
	
	private String name;
	private int instrumentNumber;
	private int moneyAmount;
	private int cleanliness;
	private boolean openStatus;
	
	public Store(String name, int instrumentNumber, int moneyAmount) {
		this.name = name;
		this.instrumentNumber = 40;
		this.moneyAmount = 1000;
		this.cleanliness = 100;
		this.openStatus = false;
	}

	public String getName() {
		return name;
	}

	public boolean getOpenStatus() {
		return openStatus;
	}

	public void openStore() {
		this.openStatus = true;
	}

	public void closeStore() {
		this.openStatus = false;
	}
	
	public int getInstrumentNumber() {
		return instrumentNumber;
	}

	public void sellInstrument() {
		this.instrumentNumber--;
		this.moneyAmount += 50;
	}
	
	public void buyInstrument() {
		this.instrumentNumber++;
		this.moneyAmount -= 50;
	}

	public int getMoneyAmount() {
		return moneyAmount;
	}

	public int getCleanliness() {
		return cleanliness;
	}

	public void cleanStore() {
		this.cleanliness += 10;
	}



}
