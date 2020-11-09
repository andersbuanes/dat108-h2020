package c_logginnutil;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.mock.web.MockHttpServletRequest;

public class LoggInnUtilTest {

	/*
	 * boolean isLoggetInn(HttpServletRequest request)
	 * void loggInn(HttpServletRequest request, Deltager deltager)
	 * void loggUt(HttpServletRequest request)
	 * 
	 */
	
	//1 - I utgangspunktet skal man ikke være innlogget
	//2 - Etter at loggInn er kjørt skal man være innlogget
	//3 - Etter at loggInn er kjørt og deretter loggUt skal man ikke være innlogget
	//...
	// Timeout
	// At innlogging gir ny sessionId
	//...
	
	private MockHttpServletRequest request;		
	
	@BeforeEach
	public void oppsett() {
		request = new MockHttpServletRequest();		
	}
	
	@Test
	public void skalStarteSomIkkeInnlogget() {
		assertFalse(LoggInnUtil.isLoggetInn(request));
	}
	
	@Test
	public void etterInnloggingSkalViVaereInnlogget() {
		
		Deltager deltager = new Deltager("12345678", "hash", "Atle", "Patle", "mann");
		LoggInnUtil.loggInn(request, deltager);
		
		assertTrue(LoggInnUtil.isLoggetInn(request));
	}
	
	/*
	 * Teste utlogging
	 * Teste timeout
	 * Teste om vi får ny session-id
	 * ...
	 */
	
	
}








