package tr.edu.mcbu.api.McbuWebApi;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class DersRestApiTest {

	private static final List<String> DERSLER = new ArrayList<>();
	{
		DERSLER.add("Edebiyat");
		DERSLER.add("Mat");

	}

	@Test
	public List<String> test() {

		System.out.println(DERSLER);
		assertEquals("Edebiyat", "Mat", DERSLER);
		return null;

	}

}
