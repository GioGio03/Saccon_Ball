package Saccon_Ball;

public class Ball {
    private String name;

    public Ball(String name) {
        this.name = name;
    }

    public void setName(String newName){
        name = newName;
    }

    public String name(){
        return name;
    }

    public void resetBall(int newRadius, String newName){
        name = newName; //????????????????? newRadius nn centra con la palla ma con la sfera
    }

    public boolean equals(Ball b){
        return (this.equals(b));
    }


    public void displayStatistics(){
        //?????????????????
    }
}
