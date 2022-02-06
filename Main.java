import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("------------------");
        System.out.println("Car Parking System");
        System.out.println("------------------");

        Random rd = new Random();




        List<ParkingArea> parkingAreas = new ArrayList<ParkingArea>();
        parkingAreas.add(new ParkingArea("Chemical", 1, 20, Float.toString(rd.nextFloat()), Float.toString(rd.nextFloat())));
        parkingAreas.add(new ParkingArea("Computing", 2, 20, Float.toString(rd.nextFloat()), Float.toString(rd.nextFloat())));

        for (int i=0; i<parkingAreas.size(); i++) {
            parkingAreas.get(i).createSlots();
        }

        Scanner getInput = new Scanner(System.in);


        while (true) {
            System.out.println("\n1 - Check the list");
            System.out.println("2 - Reserve a slot");
            System.out.println("3 - Want to exit");
            System.out.print("\nPlease enter - ");

            int choice = Integer.parseInt(getInput.nextLine());

            if (choice == 1) {

                for (int j=0; j<parkingAreas.size(); j++) {
                    System.out.println("\n------------------");
                    System.out.print("Parking area at "+ parkingAreas.get(j).getAreaName()+"  |");
                    System.out.println("Entrance: "+parkingAreas.get(j).getEntrance()+"  Exit: "+parkingAreas.get(j).getExit());
                    System.out.println("------------------");
                    if (parkingAreas.get(j).isFull()) {
                        System.out.println("Sorry this area is full");
                    }else {
                        System.out.println("You are lucky this area is not full");
                    }

                    parkingAreas.get(j).printAll();


                }


            }else if (choice == 2) {
                System.out.print("Please enter the area you want - ");
                String area = getInput.nextLine();
                System.out.print("Please enter id of the slot - ");
                String wantedSlot = getInput.nextLine();


                outerloop:
                for (int i=0; i<parkingAreas.size(); i++) {

                    if (parkingAreas.get(i).getAreaName().equals(area)) {
                        for (int j=0; j<parkingAreas.get(i).getAllStandardSlots().size(); j++) {
                            if (wantedSlot.equals(parkingAreas.get(i).getAllStandardSlots().get(j).getId())) {
                                parkingAreas.get(i).getAllStandardSlots().get(j).setEmpty(false);
                                break outerloop;
                            }
                        }

                        for (int j=0; j<parkingAreas.get(i).getAllHandiCappedSlots().size(); j++) {
                            if (wantedSlot.equals(parkingAreas.get(i).getAllHandiCappedSlots().get(j).getId())) {
                                parkingAreas.get(i).getAllHandiCappedSlots().get(j).setEmpty(false);
                                break outerloop;
                            }
                        }

                        for (int j=0; j<parkingAreas.get(i).getAllLongVehiclesSlots().size(); j++) {
                            if (wantedSlot.equals(parkingAreas.get(i).getAllLongVehiclesSlots().get(j).getId())) {
                                parkingAreas.get(i).getAllLongVehiclesSlots().get(j).setEmpty(false);
                                break outerloop;
                            }
                        }
                    }


                }

            }else if(choice == 3) {

                System.out.print("Please enter the area you exit from - ");
                String area = getInput.nextLine();
                System.out.print("Please enter id of the slot - ");
                String wantedSlot = getInput.nextLine();


                outerloop:
                for (int i=0; i<parkingAreas.size(); i++) {

                    if (parkingAreas.get(i).getAreaName().equals(area)) {
                        for (int j=0; j<parkingAreas.get(i).getAllStandardSlots().size(); j++) {
                            if (wantedSlot.equals(parkingAreas.get(i).getAllStandardSlots().get(j).getId())) {
                                parkingAreas.get(i).getAllStandardSlots().get(j).setEmpty(true);
                                break outerloop;
                            }
                        }

                        for (int j=0; j<parkingAreas.get(i).getAllHandiCappedSlots().size(); j++) {
                            if (wantedSlot.equals(parkingAreas.get(i).getAllHandiCappedSlots().get(j).getId())) {
                                parkingAreas.get(i).getAllHandiCappedSlots().get(j).setEmpty(true);
                                break outerloop;
                            }
                        }

                        for (int j=0; j<parkingAreas.get(i).getAllLongVehiclesSlots().size(); j++) {
                            if (wantedSlot.equals(parkingAreas.get(i).getAllLongVehiclesSlots().get(j).getId())) {
                                parkingAreas.get(i).getAllLongVehiclesSlots().get(j).setEmpty(true);
                                break outerloop;
                            }
                        }
                    }


                }


            }else {
                System.out.println("Wrong choice\n");
                continue;
            }

        }

    }
}
