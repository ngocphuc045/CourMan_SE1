package a1_1901040156;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EnrolmentManager {
    public List<Enrolment> enrolments;

    public EnrolmentManager() {
        this.enrolments = new ArrayList<>();
    }

    public void addEnrolment(Enrolment enrolment) {
        if (enrolment != null) {
            this.enrolments.add(enrolment);
        }
    }

    public Enrolment getEnrolment(Student student, Module module) {
        if (!this.enrolments.isEmpty()) {
            for (Enrolment e : enrolments) {
                if (e.getStudent().getId().equals(student.getId())
                        && e.getModule().getCode().equals(module.getCode())
                        && e.getModule().getName().equals(module.getName())) {
                    return e;
                }
            }
        }
        return null;
    }

    public void setMarks(Student student, Module module, double internalMark, double examinationMark) {
        if (!this.enrolments.isEmpty()) {
            for (Enrolment e : enrolments) {
                if (e.getStudent().getId().equals(student.getId())
                        && e.getModule().getCode().equals(module.getCode())
                        && e.getModule().getName().equals(module.getName())) {
                    e.setInternalMark((float) internalMark);
                    e.setExaminationMark((float) examinationMark);
                }
            }
        }
    }

    public String report() {
        String report = "";
        for (Enrolment e : enrolments) {
            report += e.getStudent().toString() + ";" + e.getModule().toString() + "\n";
        }

        return report;
    }

    public String reportAssessment() {
        String report = "";
        for (Enrolment e : enrolments) {
            report += e.getStudent().toString() + ";" + e.getModule().toString() +
                    "; Internal Mark=" + e.getInternalMark() +
                    ", Examination Mark=" + e.getExaminationMark() +
                    ", Final Grade=" + e.getFinalGrade() +
                    "\n";
        }

        return report;
    }

    public void sort() {
        enrolments.sort(new Comparator<Enrolment>() {
            @Override
            public int compare(Enrolment o1, Enrolment o2) {
                return o2.getStudent().getId().compareTo(o1.getStudent().getId());
            }
        });
    }
}