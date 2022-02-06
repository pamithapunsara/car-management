public class Standard {

    private String slotType = "Standard";
    private String gps;
    private String id;
    private boolean isEmpty = true;

    public Standard(String gps, String id) {
        this.gps = gps;
        this.id = id;
    }

    public String getSlotType() {
        return slotType;
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
