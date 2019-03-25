package inheritance;

/**
 * Created by Edge Tech Academy on 11/14/2016.
 */
public class SUV extends VehicleE {
    private int seatCount;

    public SUV(int engineSize, int gearCount, COLOR color, String model, int seatCount) {
        super(engineSize, gearCount, color, model);
        this.seatCount = seatCount;
    }

    public SUV(WHEELS wheels, DOORS doors, int engineSize, int gearCount, TRANS transmission, SEATS seatingCapacity, COLOR color, String model, int seatCount) {
        super(wheels, doors, engineSize, gearCount, transmission, seatingCapacity, color, model);
        this.seatCount = seatCount;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void printDescription(){
        super.printDescription();
        System.out.println("inheritance.SUV: has " + getSeatCount() +
                " seats.");
    }

    @Override
    public String toString() {
        return "inheritance.SUV{" +
                "seatCount=" + seatCount +
                "} " + super.toString();
    }

    public static void main(String[] args) {
        SUV suv = new SUV(200, 6, COLOR.BLACK, "Chevy", 6);
        System.out.println(suv);
    }
}
