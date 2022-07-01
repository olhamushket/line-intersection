package com.epam.rd.autotasks.intersection;

public class Line {
    private final int k;
    private final int b;
    public Line(int k, int b) {
        this.k=k;
        this.b=b;
    }

    public Point intersection(Line other) {
        int x,y;
        if (this.k - other.k == 0) {
            return null;
        } else {
            x = (this.b - other.b) / (other.k - this.k);
            y = this.k * x + this.b;
        }
        return new Point(x, y);
    }

}
