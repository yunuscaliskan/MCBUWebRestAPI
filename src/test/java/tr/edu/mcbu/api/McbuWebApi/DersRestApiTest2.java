package tr.edu.mcbu.api.McbuWebApi;

import static org.junit.Assert.*;


import org.junit.Test;

public class DersRestApiTest2 {

	@Test
	public String test() {
		String DERSLER = "Edebiyat";
		
		String sonuc = (DERSLER);
		
		assertEquals("Edebiyat", sonuc);
		
		return DERSLER;
		
	}

}
