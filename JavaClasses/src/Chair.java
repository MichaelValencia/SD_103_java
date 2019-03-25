public class Chair {
    private String Color;
    private int legCount;
    private int weightSupport;
    private int maxSeatHeight;
    private int currentHeight;
    private boolean isAdjustable;


    public String getColor() {
        return Color;
    }

    public int getLegCount() {
        return legCount;
    }

    public int getWeightSupport() {
        return weightSupport;
    }

    public int getMaxSeatHeight() {
        return maxSeatHeight;
    }

    public int getCurrentHeight() {
        return currentHeight;
    }

    public void setCurrentHeight(int currentHeight) {
        if(isAdjustable == false){
            return;
        }
        if (currentHeight > maxSeatHeight) {
            this.currentHeight = maxSeatHeight;
        } else if (currentHeight < 0) {
            this.currentHeight = 0;
        } else {
            this.currentHeight = currentHeight;
        }
    }

    public boolean isAdjustable() {
        return isAdjustable;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "Color='" + Color + '\'' +
                ", legCount=" + legCount +
                ", weightSupport=" + weightSupport +
                ", maxSeatHeight=" + maxSeatHeight +
                ", currentHeight=" + currentHeight +
                ", isAdjustable=" + isAdjustable +
                '}';
    }

    public Chair(String color, int maxSeatHeight, boolean isAdjustable) {
        Color = color;
        this.maxSeatHeight = maxSeatHeight;
        this.isAdjustable = isAdjustable;
        this.currentHeight = 0;
    }


}// end of the chair class
