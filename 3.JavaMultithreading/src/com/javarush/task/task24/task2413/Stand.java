package com.javarush.task.task24.task2413;

/**
 * Created by Ilya2710 on 18.12.2021.
 */

public class Stand extends BaseObject {
    private double speed, direction;

    public Stand(double x, double y, double radius) {
        super(x, y, radius);
    }

    public Stand(double x, double y) {
        super(x, y, 3);
        speed = 1;
        direction = 0;
    }

    @Override
    public void draw(Canvas canvas) {

    }

    @Override
    public void move() {
        x += direction * speed;
    }

    public void moveLeft() {
        direction = -1;
    }

    public void moveRight() {
        direction = 1;
    }

    public double getSpeed() {
        return speed;
    }

    public double getDirection() {
        return direction;
    }
}