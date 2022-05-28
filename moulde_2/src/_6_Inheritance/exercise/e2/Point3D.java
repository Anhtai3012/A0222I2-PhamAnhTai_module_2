package _6_Inheritance.exercise.e2;

public class Point3D extends Point2D {
    private float z=0.0f;
    public Point3D(){

    }
    public Point3D(float x, float y,float z){
        super(x, y);
        this.z=z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y,float z){
        super.setXY(x, y);
        this.z=z;
    }
    public float[] getXYZ(){
         float [] arr ={super.getX(),super.getY(),z};
        return arr;
    }

    @Override
    public String toString() {
        float arr[] =getXYZ();
        return "X:"+arr[0]+" Y:"+arr[1]+" Z:"+arr[2];
    }
}
