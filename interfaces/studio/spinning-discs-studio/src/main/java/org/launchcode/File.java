package org.launchcode;

public class File {
    private final String name;
    private final double size;

    public File(String name, double size){
        this.name = name;
        this.size = size;
    }

    public double getSize() {
        return size;
    }


    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return name + " - " + size + "MB";
    }
}
