package session15.challanges.challange_16;

public enum CarType {

    KUGA,

    GOLF,

    Q7;

    @Override
    public String toString() {
        return "CarType : " + this.name() + ", Brand : " + brand() + ", price : " + price() + "$";
    }

    public double price() {
        double price = 0.0;
        switch (this.name()) {
            case "KUGA" -> price = 35000;
            case "GOLF" -> price = 20000;
            case "Q7" -> price = 80000;
        }
        return price;
    }

    public String brand() {
        String updatedString = "brand";
        switch (this.name()) {
            case "KUGA" -> updatedString = "FORD";
            case "GOLF" -> updatedString = " VOLSWAGEN ";
            case "Q7" -> updatedString = "Audi";
        }
        return updatedString;
    }
}
