package com.oops;

import java.util.ArrayList;
import java.util.Random;

class MusicLibrary{
	private ArrayList<Song> song;

	public MusicLibrary() {
		song = new ArrayList<Song>();
	}

	public ArrayList<Song> getSong() {
		return song;
	}
	public void addSong(Song songs) {
		song.add(songs);
	}
	public void removeSong(Song songs) {
		song.remove(songs);
	}
	public void randomSong() {
		int size=song.size();
		if(size==0) {
			System.out.println("no songs in library..");
			return;
		}
		Random random=new Random();
		int i=random.nextInt(size);
		System.out.println("Playing "+song.get(i).getTitle()+" by "+song.get(i).getArtist());
	}
}
class Song{
	private String title;
	private String artist;
	public Song(String title, String artist) {
		this.title = title;
		this.artist = artist;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
}
public class Example15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MusicLibrary m=new MusicLibrary();
		m.addSong(new Song("Chaleya","Anirudh"));
		m.addSong(new Song("Dil me chupa lunga","Tulsi"));
		m.addSong(new Song("Apna bana le","Arijit"));
		m.addSong(new Song("Papa meri jaan","Prannk"));
		m.addSong(new Song("Satranga","Momita"));
		
		System.out.println("all songs:-");
		for(Song s:m.getSong()) {
			System.out.println(s.getTitle()+" by "+s.getArtist());
		}
		
		System.out.println("playing random songs:-");
		m.randomSong();
		System.out.println();
	}

}
