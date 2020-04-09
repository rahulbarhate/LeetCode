class Solution
{
    public double angleClock(int hour, int minutes)
    {
        int oneMinuteAngle = 6;
        int oneHourAngle = 30;
        
        double minutesAngle = oneMinuteAngle * minutes;
        double hoursAngle = (hour % 12 + minutes/60.0) * oneHourAngle;
        
        double difference = Math.abs(hoursAngle - minutesAngle);
        return Math.min(difference, 360 - difference);
    }
}
