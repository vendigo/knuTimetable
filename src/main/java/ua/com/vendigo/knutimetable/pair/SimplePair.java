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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SimplePair that = (SimplePair) o;

        if (cabinet != null ? !cabinet.equals(that.cabinet) : that.cabinet != null) return false;
        if (examType != that.examType) return false;
        if (pairType != that.pairType) return false;
        if (subject != null ? !subject.equals(that.subject) : that.subject != null) return false;
        if (teacher != null ? !teacher.equals(that.teacher) : that.teacher != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = subject != null ? subject.hashCode() : 0;
        result = 31 * result + (teacher != null ? teacher.hashCode() : 0);
        result = 31 * result + (cabinet != null ? cabinet.hashCode() : 0);
        result = 31 * result + (pairType != null ? pairType.hashCode() : 0);
        result = 31 * result + (examType != null ? examType.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return subject;
    }
}
