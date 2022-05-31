package homeworks.homework4.robot;

import java.util.ArrayList;

public class RobotCrew {
    private ArrayList<Robot> robotCrew;

    public RobotCrew() {
        this.robotCrew = new ArrayList<>();
    }

    public void addRobotCrew(Robot robot) {
        robotCrew.add(robot);
    }

    public void makeAllRobotWork() {
        for (Robot r : robotCrew) {
            if(r instanceof Robot){
                r.work();
            }
        }
    }

    public void makeAllCoffeRobotsWork() {
        for (Robot r : robotCrew) {
            if(r instanceof Robot.CoffeeRobot){
                r.work();
            }
        }
    }

    public void makeAllDancerRobotsWork() {
        for (Robot r : robotCrew) {
            if(r instanceof Robot.RobotDancer){
                r.work();
            }
        }
    }

    public void makeAllCookerRobotsWork() {
        for (Robot r : robotCrew) {
            if(r instanceof Robot.RobotCooker){
                r.work();
            }
        }
    }
}

