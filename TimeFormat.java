// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		String minute;
		if (minutes < 10) {
			minute = '0'+Integer.toString(minutes);
		}
		else {
			minute = Integer.toString(minutes);
		}
		if (hours >= 13) {
			hours = hours -12;
			System.out.println(hours +":" +minute + " PM");
		}
		if (hours==12) {
				System.out.println(hours +":" +minute + " PM");
			}
			else {
					System.out.println(hours+ ":"+minute + " AM");

				}
			}
	}
