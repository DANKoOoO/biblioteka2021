package biblioteka.interfejs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import biblioteka.Knjiga;

public abstract class BibliotekainterfejsTest {
	
	protected Bibliotekainterfejs biblioteka;
	
	@Test
	void testDodajKnjigu() {
		Knjiga k = new Knjiga();
		k.setNaslov("Knjiga 1");
	}

	@Test
	void testObrisiKnjigu() {
		fail("Not yet implemented");
	}

	@Test
	void testVratiSveKnjige() {
		fail("Not yet implemented");
	}

	@Test
	void testPronadjiKnjigu() {
		fail("Not yet implemented");
	}

}
