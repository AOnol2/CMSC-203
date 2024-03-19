import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CryptoManagerTestStudnet {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void testStringInBounds() {
	    assertTrue(CryptoManager.isStringInBounds("FOLLOW THE RABBIT"));
	    assertTrue(CryptoManager.isStringInBounds("UNUSUAL CHARS #$&"));
	    assertFalse(CryptoManager.isStringInBounds("CURVED BRACES {} ARE OUT"));
	    assertFalse(CryptoManager.isStringInBounds("VERTICAL BAR | IS OUT TOO"));
	}

	@Test
	public void testCaesarEncryption() {
	    assertEquals("The selected string is not in bounds, Try again.", CryptoManager.caesarEncryption("OUT OF BOUNDS[]", 5));
	    assertEquals("WKLQN RXWVLGH WKH ER[", CryptoManager.caesarEncryption("THINK OUTSIDE THE BOX", 3));
	    assertEquals("YKIXKZ SKKZOTM", CryptoManager.caesarEncryption("VENICE BEACH", 6));
	}

	@Test
	public void testCaesarDecryption() {
	    assertEquals("SECRET MESSAGE", CryptoManager.caesarDecryption("VHFUHW PHVVDJH", 3));
	    assertEquals("BACK TO BASICS", CryptoManager.caesarDecryption("EDFN WR EDVICS", 3));
	    assertEquals("The selected string is not in bounds, Try again.", CryptoManager.caesarDecryption("OUTSIDE OF BOUNDS[]", 100));
	}

	@Test
	public void testBellasoEncryption() {
	    assertEquals("WXMJXG DUCNWP UWWI", CryptoManager.bellasoEncryption("HELLO WORLD AGAIN", "KEYKEYKEY"));
	    assertEquals("The selected string is not in bounds, Try again.", CryptoManager.bellasoEncryption("INVALID STRING!", "VALIDKEY"));
	    assertEquals("MXCCZ VXMVX OZIOV", CryptoManager.bellasoEncryption("SECRET MESSAGE", "KEY"));
	    assertEquals("SXDDT EDBTR TEXEI", CryptoManager.bellasoEncryption("PLAIN TEXT", "LONGERKEY"));
	}

	@Test
	public void testBellasoDecryption() {
	    assertEquals("HELLO WORLD AGAIN", CryptoManager.bellasoDecryption("WXMJXG DUCNWP UWWI", "KEYKEYKEY"));
	    assertEquals("The selected string is not in bounds, Try again.", CryptoManager.bellasoDecryption("INVALID ENCRYPTED!", "SOMEKEY"));
	    assertEquals("SECRET MESSAGE", CryptoManager.bellasoDecryption("MXCCZ VXMVX OZIOV", "KEY"));
	    assertEquals("PLAIN TEXT", CryptoManager.bellasoDecryption("SXDDT EDBTR TEXEI", "LONGERKEY"));
	}
}
