package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton(){}

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "CarSkeleton{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public String startEngine(){
        return name+" is starting";
    }
    public String drive(){
        runEngine();
        return name+" is driving";

    }
    protected String runEngine(){
        return name+" is running engine";
    }
}
