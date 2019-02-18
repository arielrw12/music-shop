package musicshop;

public class Clerk {
	
	private String name;
	private int inspiration;
	private boolean caffeineState;
	
	public Clerk(String name, int inspiration, boolean caffeine) {
		this.name = name;
		this.inspiration = 40;
		this.caffeineState = false;
	}

	public String getName() {
		return name;
	}

	public int getInspiration() {
		return inspiration;
	}

	public void beInspired() {
		this.inspiration += 5;
	}

	public boolean getCaffeineState() {
		return caffeineState;
	}

	public void drinkCaffeine() {
		this.caffeineState = true;
		this.inspiration += 5;
	}

}
