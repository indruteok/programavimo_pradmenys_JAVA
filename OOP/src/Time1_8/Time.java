package Time1_8;

public class Time {

	private int hour;
	private int minute;
	private int second;

	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public int getSecond() {
		return second;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public void setTime(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	@Override
	public String toString() {
		return String.format("%02d:%02d:%02d ", hour, minute, second);

	}

	public Time nextSecond() {
		int ats = (hour * 60 * 60) + (minute * 60) + second + 1; // 3600 600 10
		hour = ats / 60 / 60;
		minute = ats / 60 % 60;
		second = ats % 60;

		return this;
	}

	public Time previousSecond() {
		int ats = (hour * 60 * 60) + (minute * 60) + second - 1;
		hour = ats / 60 / 60;
		minute = ats / 60 % 60;
		second = ats % 60;
		return this;
	}

}
