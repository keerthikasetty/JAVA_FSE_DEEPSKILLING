package FSE_WEEK1_DESIGN_PATTERNS.builderpattern;

class Computer {
    private String CPU, RAM, Storage;

    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.Storage = builder.Storage;
    }

    public static class Builder {
        private String CPU, RAM, Storage;

        public Builder setCPU(String CPU) { this.CPU = CPU; return this; }
        public Builder setRAM(String RAM) { this.RAM = RAM; return this; }
        public Builder setStorage(String Storage) { this.Storage = Storage; return this; }

        public Computer build() {
            return new Computer(this);
        }
    }

    public void display() {
        System.out.println("CPU: " + CPU + ", RAM: " + RAM + ", Storage: " + Storage);
    }
}

public class Main {
    public static void main(String[] args) {
        Computer myComputer = new Computer.Builder()
                .setCPU("Intel i7")
                .setRAM("16GB")
                .setStorage("512GB SSD")
                .build();
        myComputer.display();
    }
}
