public class Chair {
    private int legCount;
    private String seatColor;
    private boolean isSeatAdjustable;
    private int chairCurrentHeight;
    private int chairMaxHeight;
    private int chairSupportWeight;


    public int getLegCount() {
        return legCount;
    }

    public String getSeatColor() {
        return seatColor;
    }

    public void setSeatColor(String seatColor) {
        this.seatColor = seatColor;
    }

    public boolean isSeatAdjustable() {
        return isSeatAdjustable;
    }

    public int getChairCurrentHeight() {
        return chairCurrentHeight;
    }

    public void setChairCurrentHeight(int chairCurrentHeight) {
        this.chairCurrentHeight = chairCurrentHeight;
    }

    public int getChairMaxHeight() {
        return chairMaxHeight;
    }

    public int getChairSupportWeight() {
        return chairSupportWeight;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "legCount=" + legCount +
                ", seatColor='" + seatColor + '\'' +
                ", isSeatAdjustable=" + isSeatAdjustable +
                ", chairCurrentHeight=" + chairCurrentHeight +
                ", chairMaxHeight=" + chairMaxHeight +
                ", chairSupportWeight=" + chairSupportWeight +
                '}';
    }

    public Chair(int legCount, String seatColor, boolean isSeatAdjustable, int chairMaxHeight, int chairSupportWeight) {
        this.legCount = legCount;
        this.seatColor = seatColor;
        this.isSeatAdjustable = isSeatAdjustable;
        this.chairMaxHeight = chairMaxHeight;
        this.chairSupportWeight = chairSupportWeight;
        chairCurrentHeight  =0;
    }

    public static void main(String[] args) {
        Chair officeChair = new Chair(5,"red",true,10,200);
        Chair schoolChair = new Chair(4,"black",false,10,200);

        System.out.println("officeChair = " + officeChair);
        System.out.println("schoolChair = " + schoolChair);
    }
}
