package com.springtut.invenapp.dao.ImplClasses;

public class ProductDimension {

    double height =0.0;
    double width = 0.0;
    double depth = 0.0;
    double weight = 0.0;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public String toString(){
        return ""+ height + " x "+ width + " x "+ depth;
    }
}
