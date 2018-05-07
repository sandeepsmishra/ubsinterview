package com.ubs.opsit.interviews;


public class BerlinClock {
	
	Lamp[][] LampClock={{new Lamp('Y')},
			{new Lamp('R'),new Lamp('R'),new Lamp('R'),new Lamp('R')},
			{new Lamp('R'),new Lamp('R'),new Lamp('R'),new Lamp('R')},
			{new Lamp('Y'),new Lamp('Y'),new Lamp('R'),new Lamp('Y'),new Lamp('Y'),new Lamp('R'),new Lamp('Y'),new Lamp('Y'),new Lamp('R'),new Lamp('Y'),new Lamp('Y')},
			{new Lamp('Y'),new Lamp('Y'),new Lamp('Y'),new Lamp('Y')}};
	
	String regexe = "^(?:([01]?\\d|2[0-4]):([0-5]?\\d):)?([0-5]\\d)$";
	
	public BerlinClock(String time)
	{
		if(time!=null && time.matches(regexe))
		{
			String[] timeSplit=time.split(":");
			int hours=Integer.parseInt(timeSplit[0]);
			int minutes=Integer.parseInt(timeSplit[1]);
			int seconds=Integer.parseInt(timeSplit[2]);
			
			boolean yellowLampStatus = (seconds%2==0);
			int hourFirstRow=hours/5;
			int hoursSecondRow=hours%5;
			int minuteFirstRow=minutes/5;
			int minuteSecondRow=minutes%5;
			
			if(yellowLampStatus)
				LampClock[0][0].putOn();
			else
			    LampClock[0][0].putOff();
			
			for(int i=0;i<hourFirstRow;i++)
			{
				LampClock[1][i].putOn();
			}
			for(int i=0;i<hoursSecondRow;i++)
			{
				LampClock[2][i].putOn();
			}
			for(int i=0;i<minuteFirstRow;i++)
			{
				LampClock[3][i].putOn();
			}
			for(int i=0;i<minuteSecondRow;i++)
			{
				LampClock[4][i].putOn();
			}
		}
	}
	public String showTime()
	{
		StringBuilder sb=new StringBuilder("");
		for(int i=0;i<LampClock.length;i++)
		{
			for(int j=0;j<LampClock[i].length;j++)
			{
				sb.append(LampClock[i][j]);
			}
			sb.append("\n");
		}
		return sb.toString();
	}

}
