package a_passordutil;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class PassordUtilTest {
	
	//1 - Sjekke at passord gir samme hash med samme salt
	@Test
	public void sammeHashMedSammePassordOgSalt() {
		String passord = "Per";
		String salt = PassordUtil.genererTilfeldigSalt();
		
		String hash1 = PassordUtil.hashMedSalt(passord, salt);
		String hash2 = PassordUtil.hashMedSalt(passord, salt);
		
		assertEquals(hash1, hash2);
	}

	//1 - Sjekke at passord gir ulik hash med ulikt salt
	@Test
	public void ulikHashMedSammePassordOgUliktSalt() {
		String passord = "Per";
		String salt1 = PassordUtil.genererTilfeldigSalt();
		String salt2 = PassordUtil.genererTilfeldigSalt();
		
		String hash1 = PassordUtil.hashMedSalt(passord, salt1);
		String hash2 = PassordUtil.hashMedSalt(passord, salt2);
		
		assertFalse(hash1.equals(hash2));
	}

	/*
	 * Ulike tester på validerMedSalt ...
	 * 		+ smutthull med null-verdier etc.
	 * 
	 * Sjekke at salt ikke er like
	 * Sjekke at salt og hash har riktig lengde + evt. tegnsett
	 * 
	 */
	
}





