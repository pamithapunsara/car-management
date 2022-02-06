public class LongVehicles {

    private String slotType = "Long Vehicle";
    private float length, width;
    private String gps;
    private String id;
    private boolean isEmpty = true;

    public LongVehicles(float length, float width, String gps, String id) {
        this.length = length;
        this.width = width;
        this.gps = gps;
        this.id = id;

    }

    public String getSlotType() {
        return slotType;
    }

    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }

    public String getGps() {
        return gps;
    }

    public String getId() {
        return id;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }
}
