public class Main {
    public static void main(String[] args) {

        PricingStrategy mathPricing = new MathematicsPricingStrategy();
        PricingStrategy sciencePricing = new SciencePricingStrategy();

        Course mathCourse = new Course("Algebra", "Mathematics");
        Course scienceCourse = new Course("Physics", "Science");

        CourseService mathCourseService = new CourseService(mathPricing);
        CourseService scienceCourseService = new CourseService(sciencePricing);

        double mathPrice = mathCourseService.calculateCoursePrice(mathCourse);
        double sciencePrice = scienceCourseService.calculateCoursePrice(scienceCourse);

        System.out.println("Price for " + mathCourse.getName() + " course: Rs." + mathPrice);
        System.out.println("Price for " + scienceCourse.getName() + " course: Rs." + sciencePrice);
    }
}
