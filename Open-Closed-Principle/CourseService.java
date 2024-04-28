public class CourseService {
    
    private PricingStrategy pricingStrategy;

    public CourseService(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public double calculateCoursePrice(Course course) {
        return pricingStrategy.calculatePrice(course);
    }
}
