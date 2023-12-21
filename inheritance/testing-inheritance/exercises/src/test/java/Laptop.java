public class Laptop {
    private String speed = "2GHz";
    private String memory = "RAM";
    private double logical;

    public Laptop(double aLogical) {
        logical = aLogical;
    }

    public String isSpeed() {
        return speed;
    }

    public void setSpeed(String aSpeed) {
        speed = aSpeed;

    }
    public String isMemory() {
        return memory;
    }

    public void setMemory(String aMemory) {
        memory = aMemory;

    }
    public double isLogical(){
        return logical;
    }
    public void setLogical(double aLogical){
        logical = aLogical;
    }


    public void some() {
        speed  = "2GHz";
        memory = "RAM";
    }



}