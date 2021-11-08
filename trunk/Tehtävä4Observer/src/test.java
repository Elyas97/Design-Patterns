
public class test {

	public static void main(String[] args) {
		ClockTimer clock=new ClockTimer();
		DigitalClock digital=new DigitalClock(clock);
		AnalogClock analog=new AnalogClock(clock);
		for(int i=0;i<3600;i++) {
			clock.tick();
		}

	}

}
