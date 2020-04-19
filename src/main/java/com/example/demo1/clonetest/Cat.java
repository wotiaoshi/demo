package com.example.demo1.clonetest;

/**
 * @author shkstart
 * @creat #(YEAR)-$(MONTH)-$(DAY)-$(TIME)
 */
public class Cat implements Cloneable{
    private String clolor;

    public Cat(String clolor) {
        this.clolor = clolor;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "clolor='" + clolor + '\'' +
                '}';
    }

    public String getClolor() {
        return clolor;
    }

    public void setClolor(String clolor) {
        this.clolor = clolor;
    }
    public Cat clone(){
        Cat cat = null;
        try {
            cat = (Cat) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return cat;
    }
}
