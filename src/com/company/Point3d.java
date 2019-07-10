package com.company;

public class Point3d extends Point2d {
    private float z = 0.0f;

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public Point3d(float z) {
        this.z = z;
    }

    public Point3d(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3d() {
    }

    public Point3d(float x, float y) {
        super(x, y);
    }
    public float[] getXYZ() {
        float[] xy = super.getXY();
        float[] xyz = {xy[0], xy[1], z};
        return xyz;
    }
    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point3d{" +
                "z=" + z + " x =" + super.getX()+ " y =" +super.getY()+
                '}';
    }
}
