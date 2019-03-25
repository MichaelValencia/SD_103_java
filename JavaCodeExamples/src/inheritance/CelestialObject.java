package inheritance;

public class CelestialObject {
    private String    name;
    private float     mass;
    private String    NGC;   // New Galactic Catalog number
    private long      age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getMass() {
        return mass;
    }
    public void setMass(float mass) {
        this.mass = mass;
    }
    public String getNGC() {
        return NGC;
    }
    public void setNGC(String NGC) {
        this.NGC = NGC;
    }
    public long getAge() {
        return age;
    }
    public void setAge(long age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "inheritance.CelestialObject{" +
                "name='" + name + '\'' +
                ", mass=" + mass +
                ", NGC='" + NGC + '\'' +
                ", age=" + age +
                '}';
    }

    // then we add in the getters and setters, the toString and the constructor(s)
    public CelestialObject (String name, float mass) {
        this.name = name;
        this.mass = mass;
    }
}
enum PlanetType {
    ROCKY, GAS_GIANT, DWARF, WATER_WORLD;
}
class Planets extends CelestialObject {
    private  int     naturalSatelites;
    private  int     highTempAtEquator;
    private  int     lowTempAtEquator;
//    private  String  planetType;        // "Rocky", "Gas Giant", "Dwarf", "Water World"
    private  PlanetType  type;
    private  boolean inHabitableZone;
    private  long    orbitalPeriod;     // in 10^6 seconds

    @Override
    public String toString() {
        return "inheritance.Planets{" +
                "naturalSatelites=" + naturalSatelites +
                ", highTempAtEquator=" + highTempAtEquator +
                ", lowTempAtEquator=" + lowTempAtEquator +
                ", inHabitableZone=" + inHabitableZone +
                ", orbitalPeriod=" + orbitalPeriod +
                "} " + super.toString();
    }

    public Planets(String name, float mass, boolean inHabitableZone, long orbitalPeriod) {
        super(name, mass);
        this.inHabitableZone = inHabitableZone;
        this.orbitalPeriod = orbitalPeriod;
        this.type = PlanetType.GAS_GIANT;
    }

    public static void main(String[] args) {
        Planets planetX = new Planets("PlanetX", 5e30f, true, 32);
    }
}