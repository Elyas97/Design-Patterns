
public class DigitalClock implements Observer {
	private ClockTimer timer;
	public DigitalClock(ClockTimer ct) {
		timer=ct;
		timer.attach(this);
	}
	@Override
	public void update(Subject theChangedSubject) {
		if(theChangedSubject==timer) {
			draw();
		}
		
	}
	private void draw() {
		int hour=timer.getHour();
		int minute=timer.getMinute();
		int seconds=timer.getSeconds();
		System.out.println("KELLO: "+hour+":"+minute+":" + seconds );
	}

}
