package ua.com.vendigo.knutimetable.pair;

public class SimplePair {
    private final String subject;
    private final String teacher;
    private final String cabinet;
    private final PairType pairType;
    private final ExamType examType;

    public SimplePair(Pair pair) {
        this.subject = pair.getSubject();
        this.teacher = pair.getTeacher();
        this.cabinet = pair.getCabinet();
        this.pairType = pair.getPairType();
        this.examType = pair.getExamType();
    }

    public String getSubject() {
        return subject;
    }

    public String getTeacher() {
        return teacher;
    }

    public String getCabinet() {
        return cabinet;
    }

    public PairType getPairType() {
        return pairType;
    }

    public ExamType getExamType() {
        return examType;
    }
}
