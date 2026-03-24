public class Laptop extends Hardware {

    public Laptop(int id, String brand, int spec) {
        super(id, brand, spec);
    }
    public String interpretSpec() {
        return spec + "GB RAM";
    }
}
