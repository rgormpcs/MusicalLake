package com.mpcs.musicalLake.controller;

import java.util.ArrayList;
import java.util.List;

import com.mpcs.musicalLake.model.Concert;

public class ConcertController{
	
	public void choiceLyric(String sound) {
		
		Concert concert = new Concert();
		//switch(sound);
		
		String [] lyricOne=concert.lyricsOne;
	}
	
	public StringBuilder search(String sound ,List<String> lyric){
		StringBuilder followingSounds=new StringBuilder();
		
		for(int index=0;index<lyric.size();index++) {
			if(sound.equals(lyric.get(index))) {
				for(int indexTwo=index;index<lyric.size();indexTwo++) {
				
				followingSounds.append(lyric.get(indexTwo));
				followingSounds.append(",");
			}
		}
		}
			
				System.out.print(followingSounds);
			
		return followingSounds;
	}

	
	
}
