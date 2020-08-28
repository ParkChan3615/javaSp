package f_OOP2;

public class TimeTest {
	public static void main(String[] args) {

		TimeVO t = new TimeVO();

		t.setHour(40);
		t.setMinute(200);
		t.setSecond(10000);
		int hour = t.getHour();
		int minute = t.getMinte();
		int seconde = t.getSecond();
		System.out.println(hour + "시" + minute + "분" + seconde + "초");

		t.setHour(22);
		t.setMinute(100);
		t.setSecond(10000);
		int hour2 = t.getHour();
		int minute2 = t.getMinte();
		int seconde2 = t.getSecond();
		System.out.println(hour2 + "시" + minute2 + "분" + seconde2 + "초");

	}
}

class TimeVO {

	private int hour;// 시
	private int minute;// 분
	private int second;// 초

	void setHour(int hour) {
		if (hour > 23) {
			this.hour = hour % 24;
		} else {
			this.hour = hour;
		}
	}

	int getHour() {
		return hour;
	}

	void setMinute(int minute) {

		setHour(hour += minute / 60);
		this.minute = minute % 60;

	}

	int getMinte() {
		return minute;
	}

	void setSecond(int second) {

		this.second = second % 60;
		setMinute(minute += second / 60);

	}

	int getSecond() {
		return second;
	}
}
