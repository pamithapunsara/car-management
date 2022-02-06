import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ParkingArea {

    private String areaName;
    private int id;
    private String entrance, exit;
    private int numberOfSlots;
    int currentNumberSlots = 0;

    private List<Standard> allStandardSlots = new ArrayList<Standard>();
    private List<Handicapped> allHandiCappedSlots = new ArrayList<Handicapped>();
    private List<LongVehicles> allLongVehiclesSlots = new ArrayList<LongVehicles>();

    public ParkingArea(String areaName, int id, int numberOfSlots, String entrance, String exit) {
        this.areaName = areaName;
        this.id = id;
        this.entrance = entrance;
        this.exit = exit;
        this.numberOfSlots = numberOfSlots;
    }

    public boolean isFull() {
        if (currentNumberSlots == numberOfSlots) {
            return true;
        }else {
            return false;
        }
    }

    public void printAll() {
            for (int j=0; j<allStandardSlots.size(); j++) {
                System.out.println("Type- "+allStandardSlots.get(j).getSlotType()+" | gps- "+allStandardSlots.get(j).getGps()+" | id- "+
                        allStandardSlots.get(j).getId()+" | available- "+allStandardSlots.get(j).isEmpty());
            }

        for (int j=0; j<allHandiCappedSlots.size(); j++) {

            System.out.println("Type- "+allHandiCappedSlots.get(j).getSlotType()+" | gps- "+allHandiCappedSlots.get(j).getGps()+" | nearest building- "+
                    allHandiCappedSlots.get(j).getNearestBuildingName()+" | id- "+
                    allHandiCappedSlots.get(j).getId()+" | available- "+allHandiCappedSlots.get(j).isEmpty());
        }

        for (int j=0; j<allLongVehiclesSlots.size(); j++) {

            System.out.println("Type- "+allLongVehiclesSlots.get(j).getSlotType()+" | gps- "+allLongVehiclesSlots.get(j).getGps()+" | width- "+
                    allLongVehiclesSlots.get(j).getWidth()+" | length-"+allLongVehiclesSlots.get(j).getLength()+" | id- "+
                    allLongVehiclesSlots.get(j).getId()+" | available- "+allLongVehiclesSlots.get(j).isEmpty());
        }
    }

    public void createSlots() {
        Random rd = new Random();
        for (int i=0; i<5; i++) {
            allStandardSlots.add(new Standard(Float.toString(rd.nextFloat()), "Standard"+i));
            allHandiCappedSlots.add(new Handicapped("eFac", Float.toString(rd.nextFloat()), "HandiCapped"+i));
            allLongVehiclesSlots.add(new LongVehicles(22,32,Float.toString(rd.nextFloat()),"LongVehical"+i));

            currentNumberSlots += 3;
        }
    }

    public String getAreaName() {
        return areaName;
    }

    public int getId() {
        return id;
    }

    public String getEntrance() {
        return entrance;
    }

    public String getExit() {
        return exit;
    }

    public List<Standard> getAllStandardSlots() {
        return allStandardSlots;
    }

    public List<Handicapped> getAllHandiCappedSlots() {
        return allHandiCappedSlots;
    }

    public List<LongVehicles> getAllLongVehiclesSlots() {
        return allLongVehiclesSlots;
    }
}
