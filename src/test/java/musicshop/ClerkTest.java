package musicshop;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClerkTest {
	
	Clerk underTest;
	@Before
	public void setup() {
	underTest = new Clerk("Bob", 40, false);
	}
	
	@Test
	public void shouldHaveName() {
		underTest.getName();
		assertEquals("Bob", underTest.getName());
	}
	
	@Test
	public void shouldBeAbleToBeInspired() {
		int inspirationBeforeInspiring = underTest.getInspiration();
		underTest.beInspired();
		int inspirationAfterInspiring = underTest.getInspiration();
		assertEquals(inspirationAfterInspiring, inspirationBeforeInspiring + 5);
	}
	
	@Test
	public void shouldChangeCaffeineState() {
		boolean caffeinatedBeforeDrinking = underTest.getCaffeineState();
		underTest.drinkCaffeine();
		boolean caffeinatedAfterDrinking = underTest.getCaffeineState();
		assertEquals(true, underTest.getCaffeineState());
	}
	
	@Test
	public void shouldBeInspiredByCoffee() {
		int inspirationBeforeCaffeine = underTest.getInspiration();
		underTest.drinkCaffeine();
		int inspirationAfterCaffeine = underTest.getInspiration();
		assertEquals(inspirationAfterCaffeine, inspirationBeforeCaffeine + 5);
	}

}
