package Saccon_Ball;

public class Sphere extends Ball{
    private int theRadius;

    public Sphere(String name, int theRadius) {
        super(name);
        this.theRadius = theRadius;
    }

    public void setRadius(int newRadius){
        theRadius = newRadius;
    }

    public int radius(){
        return theRadius;
    }

    public int diameter(){
        return theRadius*2;
    }

    public double circumference(){
        return 2*theRadius*Math.PI;
    }

    public double area(){
        return Math.pow(theRadius, 2)*Math.PI;
    }

    public double volume(){
        return (4/3)*Math.PI*Math.pow(theRadius, 3);
    }

    public boolean equals(Sphere s){
        return (this.equals(s));
    }

    @Override
    public void displayStatistics(){
        //?????????????????
    }
}
