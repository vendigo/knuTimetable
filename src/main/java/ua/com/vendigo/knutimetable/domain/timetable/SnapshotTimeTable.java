package ua.com.vendigo.knutimetable.domain.timetable;

import ua.com.vendigo.knutimetable.domain.pair.FlatPair;

import java.util.Optional;

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

    public Optional<FlatPair> getCurrentPair() {
        return Optional.ofNullable(currentPair);
    }

    public Optional<FlatPair> getNextPair() {
        return Optional.ofNullable(nextPair);
    }
}
