package b_cookieutil;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.servlet.http.Cookie;

import org.junit.jupiter.api.Test;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

public class CookieUtilTest {
	
	private MockHttpServletResponse response = new MockHttpServletResponse();
	private MockHttpServletRequest request = new MockHttpServletRequest();
	
	/*
	 * void addCookieToResponse(HttpServletResponse response, String navn, String verdi)
	 * String getCookieFromRequest(HttpServletRequest request, String navn)
	 */
	
	// Hvis vi legger til en cookie skal den puttes i respons-objektet
	@Test
	public void cookieBlirPuttetIResponse() {
		CookieUtil.addCookieToResponse(response, "mincookie", "enverdi");
		assertEquals("enverdi", response.getCookies()[0].getValue());
	}
	
	// Sjekke at vi får ut cookie som finnes i request
	@Test
	public void cookieBlirHentetFraRequest() {
		request.setCookies(new Cookie[] {new Cookie("mincookie", "enverdi")});
		String cookieverdi = CookieUtil.getCookieFromRequest(request, "mincookie");
		assertEquals("enverdi", cookieverdi);
	}
	
	/*
	 * Sjekke timeout, dvs. sjekke at cookie sin Max-Age er satt
	 * Sjekke dersom requesten har flere cookies
	 * Sjekke encoding 
	 */
	

}
