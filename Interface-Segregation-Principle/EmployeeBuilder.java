public class EmployeeBuilder implements BuilderInterface {

    Worker w;
    Sleeper s;
    Eater e;
    

    @Override
    public void setEater() {
        this.e= new Eater();
    }


    @Override
    public void setSleeper() {
        this.s=new Sleeper();
        
    }


    @Override
    public void setWorker() {
        this.w=new Worker();
        
    }


    public Employee getInfo(){
        return new Employee(w, s, e);

    }
    

}
