package src.statistic.event;

import java.util.Date;

public class NoAvailableVideoEventDataRow implements EventDataRow{
    private int totalDuration; // time cooking (seconds)
    private Date currentDate;

    public NoAvailableVideoEventDataRow(int totalDuration) {
        this.totalDuration = totalDuration;
        currentDate = new Date();
    }

    @Override
    public EventType getType() {
        return EventType.NO_AVAILABLE_VIDEO;
    }
}
