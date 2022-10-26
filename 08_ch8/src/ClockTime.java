
public class ClockTime {

	private int hours;
	private int minutes;

	public ClockTime() {
		this.hours = 00;
		this.minutes = 00;
	}

	public void add(int hours, int minutes) {
		if (minutes < 0) {
			hours = 0;
			minutes = 0;
		}
		
		this.hours = this.hours + hours;
		while (this.hours >= 24) {
			this.hours = this.hours - 24;
		} 

		this.minutes = this.minutes + minutes;
		while(this.minutes >= 60) {
			this.hours = this.hours + 1;
			this.minutes = this.minutes - 60;
			if (this.hours >= 24) {
				this.hours = this.hours - 24;
			}
		} 
	}

	public String toString() {
		String hourString;
		String minuteString;
		if (this.hours < 10 && this.minutes < 10) {
			hourString = String.format("%02d", this.hours);
			minuteString = String.format("%02d", this.minutes);
			return hourString + ":" + minuteString;
		} else if (this.hours < 10 && this.minutes >= 10) {
			hourString = String.format("%02d", this.hours);
			return hourString + ":" + this.minutes;
		} else if (this.hours >= 10 && this.minutes < 10) {
			minuteString = String.format("%02d", this.minutes);
			return this.hours + ":" + minuteString;
		} else {
			return this.hours + ":" + this.minutes;
		}
	}
}
