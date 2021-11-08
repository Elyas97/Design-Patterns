
public class ClockTimer extends Subject {
	private int seconds;
	private int minute;
	private int hour;
	public int getSeconds() {
		return seconds;
	}
	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	void tick() {
		seconds++;
		if(seconds==60) {
			minute++;
			seconds=0;
		}
		if(minute==60) {
			hour++;
			minute=0;
			seconds=0;
		}
		if(hour==24) {
			hour=1;
			minute=0;
			seconds=0;
		}
		notifyObservers();
	}
	
	
}
