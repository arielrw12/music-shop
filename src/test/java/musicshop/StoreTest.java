package musicshop;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StoreTest {
	
	Store underTest;
	@Before
	public void setup() {
		underTest = new Store("Strings n' Things", 40, 1000);
	}
	
	@Test
	public void shouldGetName() {
		underTest.getName();
		assertEquals("Strings n' Things", underTest.getName());
	}
	
	@Test
	public void shouldBeAbleToOpen() {
		boolean openStatusBeforeOpening = underTest.getOpenStatus();
		underTest.openStore();
		boolean openStatusAfterOpening = underTest.getOpenStatus();
		assertEquals(true, openStatusAfterOpening);
	}
		
	@Test
	public void shouldBeAbleToClose() {
		boolean openStatusBeforeOpening = underTest.getOpenStatus();
		underTest.openStore();
		underTest.closeStore();
		boolean openStatusAfterOpening = underTest.getOpenStatus();
		assertEquals(false, openStatusAfterOpening);
	}
	
	@Test
	public void shouldBeAbleToSellInstruments() {
		int instrumentsBeforeSelling = underTest.getInstrumentNumber();
		underTest.sellInstrument();
		int instrumentsAfterSelling = underTest.getInstrumentNumber();
		assertEquals(instrumentsAfterSelling, instrumentsBeforeSelling - 1);
	}
		
	@Test
	public void shouldGainMoneyWhenSelling() {
		int moneyBeforeSelling = underTest.getMoneyAmount();
		underTest.sellInstrument();
		int moneyAfterSelling = underTest.getMoneyAmount();
		assertEquals(moneyAfterSelling, moneyBeforeSelling + 50);
	}
	
	@Test
	public void shouldBeAbleToBuyInstruments() {
		int instrumentsBeforeBuying = underTest.getInstrumentNumber();
		underTest.buyInstrument();
		int instrumentsAfterBuying = underTest.getInstrumentNumber();
		assertEquals(instrumentsAfterBuying, instrumentsBeforeBuying + 1);
	}

	@Test
	public void shouldSpendMoneyWhenBuying() {
		int moneyBeforeBuying = underTest.getMoneyAmount();
		underTest.buyInstrument();
		int moneyAfterBuying = underTest.getMoneyAmount();
		assertEquals(moneyAfterBuying, moneyBeforeBuying - 50);
	}
	
	@Test
	public void shouldBeCleanable() {
		int cleanlinessBeforeCleaning = underTest.getCleanliness();
		underTest.cleanStore();
		int cleanlinessAfterCleaning = underTest.getCleanliness();
		assertEquals(cleanlinessAfterCleaning, cleanlinessBeforeCleaning + 10);
	}
}
