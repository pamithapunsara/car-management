public class Handicapped {

    private String slotType = "Handicapped";
    private String nearestBuildingName;
    private String gps;
    private String id;
    private boolean isEmpty = true;

    public Handicapped(String nearestBuildingName, String gps, String id) {
        this.nearestBuildingName = nearestBuildingName;
        this.gps = gps;
        this.id = id;
    }

    public String getSlotType() {
        return slotType;
    }

    public String getNearestBuildingName() {
        return nearestBuildingName;
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
