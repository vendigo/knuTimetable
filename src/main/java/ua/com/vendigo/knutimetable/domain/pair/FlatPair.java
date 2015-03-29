package ua.com.vendigo.knutimetable.domain.pair;

import static utils.Validator.*;

/**
 * Flat view for {@link ua.com.vendigo.knutimetable.domain.pair.Pair}.
 * Contains only text values of required fields.
 */
public class FlatPair {
    private final String subjectName;
    private final PairType pairType;
    private final String cabinetNumber;
    private final String teacherName;

    public FlatPair(String subjectName, PairType pairType, String cabinetNumber, String teacherName) {
        this.subjectName = notEmpty(subjectName, "subjectName");
        this.pairType = notNull(pairType, "pairType");
        this.cabinetNumber = notEmpty(cabinetNumber, "cabinetNumber");
        this.teacherName = notEmpty(teacherName, "teacherName");
    }

    public String getSubjectName() {
        return subjectName;
    }

    public PairType getPairType() {
        return pairType;
    }

    public String getCabinetNumber() {
        return cabinetNumber;
    }

    public String getTeacherName() {
        return teacherName;
    }
}
