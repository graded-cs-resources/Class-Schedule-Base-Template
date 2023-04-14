/** 
 * Represents a chuck of time. For example, first period
 * is USUALLY 8:30 - 9:50
 */
public class Period {
    private int periodNumber;
    private String startTime;
    private String endTime;
    private String wedStart;
    private String wedEnd;
    
    public Period(int periodNumber, String startTime, String endTime, String wedStart, String wedEnd) {
        this.periodNumber = periodNumber;
        this.startTime = startTime;
        this.endTime = endTime;
        this.wedStart = wedStart;
        this.wedEnd = wedEnd;
    }

    public int getPeriodNumber() {
        return periodNumber;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public String getWedStart() {
        return wedStart;
    }

    public String getWedEnd() {
        return wedEnd;
    }

    @Override
    public String toString() {
        return "Period [periodNumber=" + periodNumber + ", startTime=" + startTime + ", endTime=" + endTime
                + ", wedStart=" + wedStart + ", wedEnd=" + wedEnd + "]";
    }

    
    

    
}
    