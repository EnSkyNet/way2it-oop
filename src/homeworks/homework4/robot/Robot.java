package homeworks.homework4.robot;

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
}
