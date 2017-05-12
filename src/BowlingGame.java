import java.util.ArrayList;
import java.util.List;

// Before you commit and push write your student ID and finish time here.
// Finish time: 12:48
// Student ID: IT 43/2015

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	private int bonusBroj = 0;
	Frame frame = new Frame();
	public int frameNumber;
	
	
	
	public BowlingGame(){}
	
	public BowlingGame(Frame frame){
		
	}
	
	// adds a frame to the game
	public void addFrame(Frame frame){
		if(frame.frameDodavanje == true){
			frames.add(frame);	
			frameNumber++;
		}
			
		
	}
	
	// Sets the bonus throws at the end of the game
	public void setBonus(int firstThrow, int secondThrow) {
		if(firstThrow == 10){
			bonusBroj = bonus.getFirstThrow() * 2; 
		} else if(firstThrow + secondThrow == 10){
			bonusBroj = bonus.getFirstThrow(); 
		} else 
			bonusBroj = 0;
		
	}
	
	// Returns the game score
	public int score(){
		 return frame.getFirstThrow() + frame.getSecondThrow() + bonusBroj ;
		
	}
}
