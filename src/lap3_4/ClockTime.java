package lap3_4;

public class ClockTime {
	private int hour;
	private int minute;
	//Contructor
	public ClockTime(int hour, int minutes) {
		super();
		this.hour = hour;
		this.minute = minutes;
	}
	
	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	//In ra định dạng 2 chữ số
	public String toString() {
		return String.format("%02d:%02d", hour, minute);
	}
	//Đổi thời gian thành số phút
	public int toMinutes() {
		return this.getHour() * 60 + this.getMinute();
	}
	//Tính thời gian chênh lệch (phút)
	public int difference(ClockTime that) {
		return this.toMinutes() - that.toMinutes();
	}
	

}
