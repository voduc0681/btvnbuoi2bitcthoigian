public class TimeConversionApp {
    public int covertHoursToMinutes(int hours) {
        return hours * 60;
    }
    public int covertDaysToMinutes(int days) {
        return days * 24 * 60;
    }
    public static void main(String[] args) {
        TimeConversionApp timeConversionApp = new TimeConversionApp();
        int covertHourToMinute = timeConversionApp.covertHoursToMinutes(2);
        System.out.println("Chuyển đổi 2 giờ sang phút: " + covertHourToMinute);
        int covertDayToMinute = timeConversionApp.covertDaysToMinutes(3);
        System.out.println("Chuyển đổi 3 ngày sang phút: " + covertDayToMinute);
    }
}

 