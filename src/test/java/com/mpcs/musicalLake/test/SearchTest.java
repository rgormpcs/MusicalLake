package com.mpcs.musicalLake.test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

import org.junit.Test;

import com.mpcs.musicalLake.controller.ConcertController;
import com.mpcs.musicalLake.model.Concert;

public class SearchTest {
	
	@Test 
	public void searchTest() {
		Concert concert = new Concert();
		ConcertController controller = new ConcertController();
		
		String [] lyricOne=concert.getLyricsOne();		
		StringBuilder followingSounds=controller.search("fiu", Arrays.asList(lyricOne));

		assertEquals("cric-cric,brrah,", followingSounds);
	}

}
