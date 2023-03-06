package xay_dung_lop_StopWatch;

public class StopWatch {
    private long startTime , endTime;

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }
    public long getStartTime() {
        return startTime;
    }
    public long getEndTime() {
        return endTime;
    }

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    public void start() {
        this.setStartTime(System.currentTimeMillis());
    }

    public void stop() {
        this.setEndTime(System.currentTimeMillis());
    }

    public long getElapsedTime() {
        return this.getEndTime() - this.getStartTime();
    }

}
