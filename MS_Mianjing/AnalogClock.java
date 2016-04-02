package MS.MS_Mianjing;

/**
 * Created by xiaopengliu on 3/04/16.
 */
public class AnalogClock {

    public static void main(String[] args) {
        String time = "7:55";
        System.out.println("The degree between hr and minute is: "+calculateDegree(time));
    }

    public static double calculateDegree(String time) {
        if(time == null || time.length() == 0) {
            return 0;
        }
        String[] timeArr = time.split(":");
        if(timeArr.length < 2) {
            return 0;
        }
        int hr = Integer.parseInt(timeArr[0]);
        int min = Integer.parseInt(timeArr[1]);
        double min_degree = min*6;
        double hr_degree = hr*30 + min*0.5;
        double diff = Math.abs(min_degree - hr_degree);
        if(diff > 180) {
            diff = 360 - diff;
        }
        return diff;

    }
}
