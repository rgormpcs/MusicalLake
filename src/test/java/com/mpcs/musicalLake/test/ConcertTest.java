package com.mpcs.musicalLake.test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.mpcs.musicalLake.model.Concert;

public class ConcertTest {
	
	@Test
	public void lirycOneTest() {
		Concert concert = new Concert();
		String [] lyrics={"brr","fiu","cric-cric","brrah"};
		assertArrayEquals(lyrics, concert.getLyricsOne());
	}
	
	@Test
	public void lirycTwoTest() {
		Concert concert = new Concert();
		String [] lyrics={"pep","birip","trri-trri","croac"};
		assertArrayEquals(lyrics, concert.getLyricsTwo());
	}
	@Test
	public void lirycThreeTest() {
		Concert concert = new Concert();
		String [] lyrics={"bri-bri", "plop", "cric-cric", "brrah"};
		assertArrayEquals(lyrics, concert.getLyricsThree());
	}
}
