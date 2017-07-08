package com.straussj.sandstorm;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.wrapper.spotify.models.Track;

public class LocalPlaylist implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Track> tracks;
	private int size;
	
	public LocalPlaylist() {
		
	}
	
	public LocalPlaylist(Track t) {
		tracks = new ArrayList<Track>();
		tracks.add(t);
	}
	
	public void addTrack(Track t) {
		tracks.add(t);
	}
	
	public List<Track> getTracks() {
		return tracks;
	}
	
	public int getSize() {
		if(tracks != null) {
			return tracks.size();
		}
		else return -1;
	}
}