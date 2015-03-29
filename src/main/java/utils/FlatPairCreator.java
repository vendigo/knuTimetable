package utils;

import ua.com.vendigo.knutimetable.domain.pair.FlatPair;
import ua.com.vendigo.knutimetable.domain.pair.Pair;
import ua.com.vendigo.knutimetable.domain.pair.PairType;

/**
 * Creates {@link ua.com.vendigo.knutimetable.domain.pair.FlatPair} from {@link ua.com.vendigo.knutimetable.domain.pair.Pair}
 */
public class FlatPairCreator {
    public static FlatPair createFlatPair(Pair pair) {
        String subjectName = pair.getSubject().getName();
        PairType pairType = pair.getPairType();
        String cabinetNumber = pair.getCabinet().getNumber();
        String teacherName = pair.getTeacher().getName();

        return new FlatPair(subjectName, pairType, cabinetNumber, teacherName);
    }
}
