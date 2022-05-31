package homeworks.homework4.robot;

public class RobotTest {
    public static void main(String[] args) {

        RobotCrew robotCrew = new RobotCrew();
        robotCrew.addRobotCrew(new Robot.CoffeeRobot());
        robotCrew.addRobotCrew(new Robot.RobotDancer());
        robotCrew.addRobotCrew(new Robot.CoffeeRobot());
        robotCrew.addRobotCrew(new Robot.RobotCooker());

        robotCrew.makeAllCoffeRobotsWork();
        robotCrew.makeAllCookerRobotsWork();
        robotCrew.makeAllDancerRobotsWork();
        robotCrew.makeAllRobotWork();
    }
}
