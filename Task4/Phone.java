public class Phone extends Hardware {

    public Phone(int id, String brand, int spec) {
        super(id, brand, spec);
    }
    public String interpretSpec() {
        return spec + " Megapixels";
    }
}
