package web.model;

import java.util.Objects;

public class Car {
    private int number;
    private String engine;

    private String color;

    public Car() {
    }

    public Car(int number, String engine, String color) {
        this.number = number;
        this.engine = engine;
        this.color = color;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return number == car.number && Objects.equals(engine, car.engine) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, engine, color);
    }

    @Override
    public String toString() {
        return "Car{" +
                "number=" + number +
                ", engine='" + engine + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
