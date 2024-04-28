public class EdTechPlatform {
    public static void main(String[] args) {

        Student student = new Student("Saakira", "saakira@gmail.com", "S12345");

        ProgressTracker progressTracker = new ProgressTracker();
        ReportGenerator reportGenerator = new ReportGenerator();
        Course course = new Course("Java Programming");

        progressTracker.trackProgress(student, course);

        String progressReport = reportGenerator.generateProgressReport(student);
        System.out.println(progressReport);
    }
}