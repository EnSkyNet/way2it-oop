package HomeWorks.HomeWork4.Robot;

public class RobotTest {
    public static void main(String[] args) {
        Robot robot = new Robot();
        Robot.CoffeeRobot coffeeRobot = new Robot.CoffeeRobot();
        Robot.RobotDancer robotDancer = new Robot.RobotDancer();
        Robot.RobotCooker robotCooker = new Robot.RobotCooker();
        Robot[] robotArray = new Robot[] {robot, coffeeRobot, robotDancer, robotCooker};
        for(Robot robots : robotArray){
            robots.work();
        }

        Robot.robotCrew[] robot1 = new Robot.robotCrew[]{};
               robot1[0].makeAllRobotWork();

    }
}
