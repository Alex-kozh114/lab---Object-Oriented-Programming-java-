package javaproject.src;

public class ResidentialRoom extends Room {
    private int numberOfResidents;
    private boolean heating;
    private String floorType;

    public ResidentialRoom(double numberSquareMeters, int windowsCount, double сeilingHeight, int numberOfResidents,
            boolean heating, String floorType) {
        super(numberSquareMeters, windowsCount, сeilingHeight);
        setNumberOfResidents(numberOfResidents);
        setHeating(heating);
        setFloorType(floorType);
    }

    public void setNumberOfResidents(int numberOfResidents) {
        if (numberOfResidents < 0) {
            throw new IllegalArgumentException("Кол-во жителей не может быть отрицательным");
        } else {
            this.numberOfResidents = numberOfResidents;
        }
    }

    public int getNumberOfResidents() {
        return numberOfResidents;
    }

    public void setHeating(boolean heating) {
        this.heating = heating;
    }

    public boolean getHeating() {
        return heating;
    }

    public void setFloorType(String floorType) {
        if (floorType == null || floorType.isEmpty()) {
            throw new IllegalArgumentException("Тип пола не может быть пустым");
        } else {
            this.floorType = floorType;
        }
    }

    public String getFloorType() {
        return floorType;
    }

    public void isHeated() {
        if (heating) {
            System.out.println("Комната отапливается");
        } else {
            System.out.println("Комната не отапливается");
        }
    }
    public void howManyResidents() {
        if (numberOfResidents > 0) {
            System.out.println("В комнате живут " + numberOfResidents + " человек");
        } else {
            System.out.println("Комната пуста");
        }
    }

    public void whatFloorType() {
        System.out.println("Тип пола в комнате: " + floorType);
    }
}
