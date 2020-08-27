package f_OOP2;

public class TimeTest {
	public static void main(String[] args) {

		TimeVO t = new TimeVO();
		
		t.setHour(0);
		t.setMinute(0);
		t.setSecond(10000);
		int hour = t.getHour();
		int minute = t.getMinte();
		int seconde = t.getSecond();
		System.out.println(hour+"시"+minute+"분"+seconde+"초");
		
	
		
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
		if (minute > 59) {
			this.minute = minute % 60;
			this.hour += minute / 60;
		} else {
			this.minute = minute;
		}
	}

	int getMinte() {
		return minute;
	}

	void setSecond(int second) {
		if (second > 59) {
			
			this.second = second % 60;
			this.minute += second / 60;
			this.setMinute(minute);
			this.setHour(hour);
//			
			
		
		} else {
			this.second = second;
		}
	}

	int getSecond() {
		return second;
	}
}
