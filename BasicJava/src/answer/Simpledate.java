package answer;

public class Simpledate {
	Date today = new Date();
	SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd E요일");
	SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss");
	SimpleDateFormat sdf3 = new SimpleDateFormat("a hh:mm:ss");
	SimpleDateFormat sdf4 = new SimpleDateFormat("오늘은 올 해의 D번째 날");
	SimpleDateFormat sdf5 = new SimpleDateFormat("오늘은 이 달의 d번째 날");
	SimpleDateFormat sdf6 = new SimpleDateFormat("오늘은 올 해의 w번째 주");
	SimpleDateFormat sdf7 = new SimpleDateFormat("오늘은 이 달의 W번째 주");
	SimpleDateFormat sdf8 = new SimpleDateFormat("오늘은 이 달의 F번째 E요일");
}
