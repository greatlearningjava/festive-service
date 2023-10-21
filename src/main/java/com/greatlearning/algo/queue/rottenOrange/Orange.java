package com.greatlearning.algo.queue.rottenOrange;

import java.util.Objects;

public class Orange {
    int x;
    int y;
    int d;

    public Orange(int x, int y, int day) {
        this.x = x;
        this.y = y;
        this.d = day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Orange point = (Orange) o;
        return x == point.x &&
                y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
