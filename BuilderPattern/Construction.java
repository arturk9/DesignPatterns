package BuilderPattern;

public class Construction {

    private Construction(Builder builder) {
        this.name = builder.name;
        this.address = builder.address;
    }

    private String name;
    private String address;
    private int overgroundFloorCount;
    private int undergroundFloodCount;
    private int area;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getOvergroundFloorCount() {
        return overgroundFloorCount;
    }

    public int getUndergroundFloodCount() {
        return undergroundFloodCount;
    }

    public int getArea() {
        return area;
    }

    public static class Builder{
        private String name;
        private String address;
        private int overgroundFloorCount;
        private int undergroundFloodCount;
        private int area;

        public Builder(){};

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder address(String address){
            this.address = address;
            return this;
        }

        public Builder overgroundFloorCount(int overgroundFloorCount){
            this.overgroundFloorCount = overgroundFloorCount;
            return this;
        }

        public Builder undergroundFloorCount(int undergroundFloorCount){
            this.undergroundFloodCount = undergroundFloorCount;
            return this;
        }

        public Builder area(int area){
            this.area = area;
            return this;
        }

        public Construction build(){return new Construction(this);}

        @Override
        public String toString() {
            return "Builder{" +
                    "name='" + name + '\'' +
                    ", address='" + address + '\'' +
                    ", overgroundFloorCount=" + overgroundFloorCount +
                    ", undergroundFloodCount=" + undergroundFloodCount +
                    ", area=" + area +
                    '}';
        }

    }
}
