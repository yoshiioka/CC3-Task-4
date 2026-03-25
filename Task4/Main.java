import java.util.List;

public class Main {
    public static void main(String[] args) {
        HardwareRepository repository = new HardwareRepository();
        List<Hardware> hardwareList = repository.getAllHardware();

        System.out.println("=== HARDWARE MASTERLIST ===");
        System.out.println("ID\tBrand\t\t\tSpecification");
        System.out.println("------------------------------------------");
        
        for (Hardware hardware : hardwareList) {
            System.out.printf("%d\t%-20s\t%s%n", 
                hardware.getId(), 
                hardware.getBrand(), 
                hardware.interpretSpec());
        }

        int laptop16GB = 0;
        int laptop32GB = 0;
        int phone50MP = 0;

        for (Hardware hardware : hardwareList) {
            if (hardware instanceof Laptop) {
                if (hardware.getSpec() == 16) {
                    laptop16GB++;
                } else if (hardware.getSpec() == 32) {
                    laptop32GB++;
                }
            } else if (hardware instanceof Phone) {
                if (hardware.getSpec() == 50) {
                    phone50MP++;
                }
            }
        }

        System.out.println("\n=== LAPTOP AND PHONE INVENTORY ===");
        System.out.println("16GB Laptops: " + laptop16GB);
        System.out.println("32GB Laptops: " + laptop32GB);
        System.out.println("50MP Phones: " + phone50MP);
    }
}
