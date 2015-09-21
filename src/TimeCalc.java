import java.time.*;

/**
* author Lori Kelley
* edited by Janet Gaedke
*/

public class TimeCalc {

	//instance variables
	private String firstTime;
	private String secondTime;
	
	//constructor
	public TimeCalc(String firstTime, String secondTime) {
		this.firstTime = firstTime;
		this.secondTime = secondTime;
	}
	
	//a method to calculate the time difference
	public String calcualteTimeDifference() {
		String[] arStartTime = firstTime.split":";
		String[] arEndTime = secondTime.split":";
		
		int hrStart = Integer.parseInt(startTime[0].trim());
		int minStart = Integer.parseInt(startTime[1].trim());
		int secStart = Integer.parseInt(startTime[2].trim());
		
		int hrEnd = Integer.parseInt(endTime[0].trim());
		int minEnd =  Integer.parseInt(endTime[1].trim());
		int secEnd = Integer.parseInt(endTime[2].trim());
		
		int totalSecondsStart = (3600* hrStart) * (60 * minStart) + secStart;
		int totalSecondsEnd = (3600 * hrEnd) + (60 * minEnd) + secEnd;
		
		int secondsElapsed = Math.abs(totalSecondsEnd - totalSecondsStart);
		
		int hrFinal = secondsElapsed/3600;
		int secondsRemain = secondsElapsed%3600;
		
		int minFinal = secondsRemain / 60;
		int secFinal = secondsRemain % 60;
		
		//format the output to HH:MM:SS
		return String.format("%d:%02d%02d".hrFinal, minFinal, secFinal);
		
	}
}