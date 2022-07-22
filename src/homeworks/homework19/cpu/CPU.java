package homeworks.homework19.cpu;

class CPU {
    double price;

    public static class Processor{
        private static int cores;
        private String manufacturer;

        public Processor(int cores, String manufacturer) {
            this.cores = cores;
            this.manufacturer = manufacturer;
        }
        public void hardWorking(int tasks){
            System.out.println("Your processor is running on " + tasks*100/cores + " percent");
        }

        public static int getCores() {
            return cores;
        }

        public void setCores(int cores) {
            this.cores = cores;
        }
    }
    public static class Ram{
        private double memory;
        private String manufacturer;

        public Ram(double memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }
        public void ramWorking(int tasks){
            System.out.println("Your RAM is busy on " + tasks*50 + "Mb");
        }
    }

    public CPU(double price) {
        this.price = price;
    }

    public void cost(){
        System.out.println("Your CPU is cost: " + price*Processor.getCores());
    }
}
