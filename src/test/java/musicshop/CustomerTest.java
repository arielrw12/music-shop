package musicshop;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
	
	Customer underTest;
	@Before
	public void setup() {
		underTest = new Customer("Tracy", 1, 100, 20);
	}

	@Test
	public void shouldHaveName() {
		underTest.getName();
		assertEquals("Tracy", underTest.getName());
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
	public void shouldBeAbleToSellInstruments() {
		int instrumentsBeforeBuying = underTest.getInstrumentNumber();
		underTest.sellInstrument();
		int instrumentsAfterBuying = underTest.getInstrumentNumber();
		assertEquals(instrumentsAfterBuying, instrumentsBeforeBuying - 1);
	}

	@Test
	public void shouldGainMoneyWhenSelling() {
		int moneyBeforeSelling = underTest.getMoneyAmount();
		underTest.sellInstrument();
		int moneyAfterSelling = underTest.getMoneyAmount();
		assertEquals(moneyAfterSelling, moneyBeforeSelling + 50);
	}
	
	@Test
	public void shouldBeAbleToBeInspired() {
		int inspirationBeforeInspiring = underTest.getInspiration();
		underTest.beInspired();
		int inspirationAfterInspiring = underTest.getInspiration();
		assertEquals(inspirationAfterInspiring, inspirationBeforeInspiring + 5);
		
	}
}
