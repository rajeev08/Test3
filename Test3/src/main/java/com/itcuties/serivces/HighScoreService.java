package com.itcuties.serivces;

import java.util.ArrayList;
import java.util.List;


public class HighScoreService {

	// A list to hold highScores
	private static List<HighScore> highScores = new ArrayList<HighScore>();
	
	// Add highscore
	public void addHighScore(HighScore score) {
		System.out.println("{addHighscore} Adding: ["+score.getNickname()+","+score.getScore()+"]");
		
		highScores.add(score);
	}

	// Get highscores
	public List<HighScore> getHighScores() {
		System.out.println("{getHighScores}:: start");
		
		for (HighScore h: highScores)
			System.out.println("{getHighScores} Returning: ["+h.getNickname()+","+h.getScore()+"]");
		
		return highScores;
	}
	
	// Get highscores for user nickname
	public List<HighScore> getHighScoresForNickname(String nickname) {
		System.out.println("{getHighScoresForNickname}:: start");
		
		List<HighScore> userScores = new ArrayList<HighScore>();
		
		for (HighScore h: highScores)
			if (h.getNickname().equals(nickname)) {
				System.out.println("{getHighScoresForNickname} Returning: ["+h.getNickname()+","+h.getScore()+"]");
				userScores.add(h);
			}
		
		return userScores;
	}
	
	// Get the size of the scores list
	public int getHighScoresSize() {
		System.out.println("{getHighScoresSize}:: start");
		return highScores.size();
	} 
}
