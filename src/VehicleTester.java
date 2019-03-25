public class VehicleTester {
    public static void main(String[] args) {
        Vehicle mikescar = new Vehicle(100, 2900, 2, 4);
        System.out.println(mikescar);

        mikescar.accelerate(20);


        mikescar.accelerate(20);


        mikescar.accelerate(20);

        mikescar.accelerate(-40);


        mikescar.accelerate(-40);


        mikescar.accelerate(-40);


        mikescar.accelerate(-40);
        System.out.println("mikescar = " + mikescar);
    }
}
