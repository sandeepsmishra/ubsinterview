package com.ubs.opsit.interviews;

public class TimeConverterImpl implements TimeConverter{
	
	public String convertTime(String aTime) {
		BerlinClock clock = new BerlinClock(aTime);
		return clock.showTime();
	}
}

