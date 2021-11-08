
public class AnalogClock implements Observer {
	private ClockTimer timer;
	public AnalogClock (ClockTimer timer){
		this.timer=timer;
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
			if(hour==24 || hour==0) {
				hour=12;
			}
			int minute=timer.getMinute();
			int seconds=timer.getSeconds();
			System.out.println("KELLO: "+hour+":"+minute+":" + seconds );
		}

}
