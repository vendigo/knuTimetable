package ua.com.vendigo.knutimetable.domain.timetable;

import ua.com.vendigo.knutimetable.domain.pair.FlatPair;

/**
 * Contains information only about current (or closest) and next pair.
 */
public class SnapshotTimeTable {
    private final FlatPair currentPair;
    private final FlatPair nextPair;

    public SnapshotTimeTable(FlatPair currentPair, FlatPair nextPair) {
        this.currentPair = currentPair;
        this.nextPair = nextPair;
    }

    public FlatPair getCurrentPair() {
        return currentPair;
    }

    public FlatPair getNextPair() {
        return nextPair;
    }
}
