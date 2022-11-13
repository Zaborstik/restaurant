package src.statistic;

import src.statistic.event.EventDataRow;
import src.statistic.event.EventType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StatisticManager {
    private static class InstanceHolder{
        private static final StatisticManager ourInstance = new StatisticManager();
    }

    public static StatisticManager getInstance() {
        return InstanceHolder.ourInstance;
    }

    private StatisticStorage statisticStorage = new StatisticStorage();

    private StatisticManager(){
    }

    public void register(EventDataRow data){
    }

    private class StatisticStorage{
        private Map<EventType, List<EventDataRow>> storage = new HashMap<>();

        private StatisticStorage(){
            for (EventType event :
                    EventType.values()) {
                storage.put(event, new ArrayList<EventDataRow>());
            }
        }
    }
}
