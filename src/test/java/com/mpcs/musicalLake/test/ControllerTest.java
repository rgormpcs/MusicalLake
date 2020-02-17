package com.mpcs.musicalLake.test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

import org.junit.Test;

import com.mpcs.musicalLake.controller.ConcertController;
import com.mpcs.musicalLake.model.Concert;

public class ControllerTest {
	
	@Test 
	public void searchTest() {
		Concert concert = new Concert();
		ConcertController controller = new ConcertController();
		
		String [] lyricOne= concert.getLyricsOne();
		StringBuilder expected=new StringBuilder();

		assertEquals("cric-cric,brrah", controller.searchLyric("fiu", lyricOne));
		assertEquals("fiu,cric-cric,brrah", controller.searchLyric("brr", lyricOne));
	}
	
	@Test
	public void choiseSongTest() {
		ConcertController controller = new ConcertController();
		String [] lyrics={"brr","fiu","cric-cric","brrah"};
		
		assertArrayEquals(lyrics, controller.choiseSong("fiu"));
	}
	
	@Test
	public void appTest() {
		ConcertController controller=new ConcertController();
		
		assertEquals("cric-cric,brrah",controller.searchLyric("fiu", controller.choiseSong("fiu")));
		assertEquals("trri-trri,croac",controller.searchLyric("birip", controller.choiseSong("birip")));
		assertEquals("cric-cric,brrah",controller.searchLyric("plop", controller.choiseSong("plop")));
		assertEquals("No more sound",controller.searchLyric("croac", controller.choiseSong("croac")));
	}
	
}
