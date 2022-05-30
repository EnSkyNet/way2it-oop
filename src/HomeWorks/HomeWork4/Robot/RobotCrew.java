package HomeWorks.HomeWork4.Robot;

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
        Robot robot = new Robot();
        addRobotCrew(robot);
    }

    public void makeAllCoffeRobotsWork() {
        Robot.CoffeeRobot robot = new Robot.CoffeeRobot();
        addRobotCrew(robot);
    }

    public void makeAllDancerRobotsWork() {
        Robot.RobotDancer robot = new Robot.RobotDancer();
        addRobotCrew(robot);
    }

    public void makeAllCookerRobotsWork() {
        Robot.RobotCooker robot = new Robot.RobotCooker();
        addRobotCrew(robot);
    }

    public void works() {
        for (Robot r : robotCrew) {
            r.work();
        }
    }

}

