public class Demo {
    public static void main(String[] args) {
        EmployeeBuilder builder = new EmployeeBuilder();
        builder.setWorker();
        builder.getInfo();
        Employee emp=builder.getInfo();
    
    
        System.out.println(emp);
        
    }
    
}
