package com.mpcs.musicalLake.controller;

import java.util.ArrayList;
import java.util.List;

import com.mpcs.musicalLake.model.Concert;

public class ConcertController {

	public String searchLyric(String sound, String[] lyric) {
		String followingSounds = new String();
		try {
			for (int index = 0; index < lyric.length; index++) {
				if (sound.equals(lyric[index])) {
					for (int indexTwo = index+1; indexTwo < lyric.length; indexTwo++) {
						followingSounds+=lyric[indexTwo] ;
						if(indexTwo!=lyric.length-1) followingSounds+=",";
					}
					break;
				}
			}
			if(followingSounds.length()==0) followingSounds="No more sound";
			return followingSounds;
		} catch (Exception e) {
			System.out.println("there are a problem in searchLyric method Enter valid sound:"+e.getStackTrace());
			return followingSounds;
		}
		
	}

	public String [] choiseSong(String sound) {
		String [] songChoised =null;
		Concert concert = new Concert();
		try {
			ArrayList<String[]> songs = new ArrayList<String[]>();
			songs.add(concert.getLyricsOne());
			songs.add(concert.getLyricsTwo());
			songs.add(concert.getLyricsThree());
			
			for(String[] song:songs) {
				for (int index = 0; index < song.length; index++) {
					if (sound.equals(song[index])) {
						songChoised= song;
						break;
					}
				}
			}

			return songChoised;	
		} catch (Exception e) {
			System.out.println("there are a problem in choiseSong method:"+e.getStackTrace());
			return songChoised;	
		}
	
	}

}
