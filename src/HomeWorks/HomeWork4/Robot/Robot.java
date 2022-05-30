package HomeWorks.HomeWork4.Robot;

public class Robot {
    public void work() {
        System.out.println("I`m Robot, I`m just working!");
    }

    public static class CoffeeRobot extends Robot {
        @Override
        public void work() {
            System.out.println("I`m CoffeeRobot, I`m make coffee!");
        }
    }

    public static class RobotDancer extends Robot {
        @Override
        public void work() {
            System.out.println("I`m RobotDancer, I`m just dance!");
        }
    }

    public static class RobotCooker extends Robot {
        @Override
        public void work() {
            System.out.println("I`m RobotCooker, I`m just cooking!");
        }
    }

    public static class robotCrew extends Robot {
       private Robot[] robotCrew = new Robot[]{};

        public void makeAllRobotWork() {
            robotCrew[0] = new Robot();
        }

        public void makeAllCoffeRobotsWork() {
            robotCrew[1] = new CoffeeRobot();
        }

        public void makeAllDancerRobotsWork() {
            robotCrew[2] = new RobotDancer();
        }

        public void makeAllCookerRobotsWork() {
            robotCrew[3] = new RobotCooker();
        }
    }
}
