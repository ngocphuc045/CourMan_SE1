package a1_1901040156;

public class CourseManProg {
    public static void main(String[] args) throws Exception {
        // Initialise at least 5 modules (3 compulsory and 2 elective) and 5 students
        Student bnp = new Student("Bui Ngoc Phuc", "20/10/2001", "Ha Noi", "bnpdsf07@gmail.com");
        Student duc = new Student("Pham Minh duc", "15/02/2001", "Vinh Phuc", "duc_lm@gmail.com");
        Student trinh = new Student("Tran Manh Trinh", "13/07/2001", "Ha Noi", "trinh_nt@gmail.com");
        Student hanh = new Student("Nguyen Hong Hanh", "13/09/2001", "Ha Noi", "ahnhsda_dq@gmail.com");
        Student doan = new Student("Bui Cong Doan", "27/09/2001", "Ha Noi", "đoan3545@gmail.com");

        CompulsoryModule wpr = new CompulsoryModule("WPR", 2, 3);
        CompulsoryModule sqa = new CompulsoryModule("SQA", 1, 3);
        CompulsoryModule dbs = new CompulsoryModule("DBS", 2, 3);

        ElectiveModule mpr = new ElectiveModule("MPR", 1, 3, "FIT");
        ElectiveModule req = new ElectiveModule("REQ", 2, 3, "FIT");

        // Initialise and use to create 10 enrolments (containing a mixture of
        //compulsory and elective modules)
        // Initialise and enter marks for 5 enrolments
        EnrolmentManager manager = new EnrolmentManager();

        Enrolment bnpWprEnrolment = new Enrolment(bnp, wpr, (float) 9.2, (float) 7.8);
        Enrolment bnpSe1Enrolment = new Enrolment(bnp, mpr, 9, (float) 7.5);
        Enrolment bnpSs1Enrolment = new Enrolment(bnp, req, (float) 8.5, (float) 8.5);
        Enrolment bnpSqaEnrolment = new Enrolment(bnp, sqa, 8, (float) 6.5);
        Enrolment bnpDbsEnrolment = new Enrolment(bnp, dbs, 7, (float) 9.1);

        Enrolment ducReqEnrolment = new Enrolment(duc, req, 9, 6);
        Enrolment ducDbsEnrolment = new Enrolment(duc, dbs, (float) 8.5, 10);

        Enrolment trinhWprEnrolment = new Enrolment(trinh, wpr, 8, 9);
        Enrolment trinhMprEnrolment = new Enrolment(trinh, mpr, (float) 9.5, (float) 7.5);
        Enrolment trinhReqEnrolment = new Enrolment(trinh, req, (float) 8.2, (float) 7.5);
        Enrolment trinhDbsEnrolment = new Enrolment(trinh, dbs, (float) 7.1, (float) 9.3);

        Enrolment hanhDbsEnrolment = new Enrolment(hanh, dbs, 8, (float) 7.5);
        Enrolment hanhReqEnrolment = new Enrolment(hanh, req, 10, 10);

        Enrolment doanWprEnrolment = new Enrolment(doan, wpr, (float) 7.2, (float) 8.1);
        Enrolment doanSqaEnrolment = new Enrolment(doan, sqa, (float) 8.5, (float) 6.5);
        Enrolment doanDbsEnrolment = new Enrolment(doan, dbs, (float) 7.5, (float) 8.5);
        Enrolment doanMprEnrolment = new Enrolment(doan, mpr, 1, 6);
        Enrolment doanReqEnrolment = new Enrolment(doan, req, (float) 8.5, (float) 5.5);

        manager.addEnrolment(ducDbsEnrolment);
        manager.addEnrolment(ducReqEnrolment);

        manager.addEnrolment(bnpDbsEnrolment);
        manager.addEnrolment(bnpSe1Enrolment);
        manager.addEnrolment(bnpSqaEnrolment);
        manager.addEnrolment(bnpWprEnrolment);
        manager.addEnrolment(bnpSs1Enrolment);

        manager.addEnrolment(hanhDbsEnrolment);
        manager.addEnrolment(hanhReqEnrolment);

        manager.addEnrolment(trinhMprEnrolment);
        manager.addEnrolment(trinhReqEnrolment);
        manager.addEnrolment(trinhWprEnrolment);
        manager.addEnrolment(trinhDbsEnrolment);

        manager.addEnrolment(doanDbsEnrolment);
        manager.addEnrolment(doanMprEnrolment);
        manager.addEnrolment(doanReqEnrolment);
        manager.addEnrolment(doanSqaEnrolment);
        manager.addEnrolment(doanWprEnrolment);

        // Print a non-sorted initial report of the enrolments on the standard output
        System.out.println("Non-sorted initial report of the enrolments" + "\n" + "---------------------------------------------------------------------------------------------------");
        String report = manager.report();
        System.out.println(report);

        // Print a sorted initial report of the enrolments on the standard output
        System.out.println("Sorted initial report of the enrolments! " + "\n" + "---------------------------------------------------------------------------------------------------");
        manager.sort();
        System.out.println(manager.report());

        // Print a (sorted) assessment report of the enrolments on the standard output
        System.out.println("Sorted assessment report of the enrolments!" + "\n" + "---------------------------------------------------------------------------------------------------");
        String reportAssessment = manager.reportAssessment();
        System.out.println(reportAssessment);
        System.out.println("End the program" + "\n" + "---------------------------------------------------------------------------------------------------");
    }

}