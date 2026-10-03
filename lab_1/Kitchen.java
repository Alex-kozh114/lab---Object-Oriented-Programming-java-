package javaproject.src;

public class Kitchen extends ResidentialRoom {
    private boolean hasGas;
    private int kitchenCabinets;
    private boolean hasExhaustHood;

    public Kitchen(double numberSquareMeters, int windowsCount, double сeilingHeight, int numberOfResidents,
            boolean heating, String floorType, boolean hasGas, int kitchenCabinets, boolean hasExhausHood) {
        super(numberSquareMeters, windowsCount, сeilingHeight, numberOfResidents, heating, floorType);
        setHasGas(hasGas);
        setKitchenCabinets(kitchenCabinets);
        setHasExhaustHood(hasExhausHood);
    }

    public void setHasGas(boolean hasGas) {
        this.hasGas = hasGas;
    }

    public boolean getHasGas() {
        return hasGas;
    }

    public void setKitchenCabinets(int kitchenCabinets) {
        if (kitchenCabinets < 0) {
            throw new IllegalArgumentException("Количество ящиков не может быть отриацательным");
        } else {
            this.kitchenCabinets = kitchenCabinets;
        }
    }

    public int getKitchenCabinets() {
        return kitchenCabinets;
    }

    public void setHasExhaustHood(boolean hasExhaustHood) {
        this.hasExhaustHood = hasExhaustHood;
    }

    public boolean hasExhaustHood() {
        return hasExhaustHood;
    }

    public void cook(String dish) {
        if (dish == null || dish.trim().isEmpty()) {
            throw new IllegalArgumentException("Название блюда не может быть пустым!");
        }
        String stoveType = hasGas ? "газовой плите" : "электрической плите";
        System.out.println("Готовим блюдо «" + dish + "» на " + stoveType + ".");
    }

    public void startVentilation() {
        if (hasExhaustHood) {
            System.out.println("Вытяжка включена на полную мощность.");
        } else {
            System.out.println("Вытяжки нет, проветриваем через окна, для проветривания есть" + getWindowsCount() + " окон.");
        }
    }

    public boolean canStoreDishes(int totalDishesCount) {
        if (totalDishesCount < 0) {
            throw new IllegalArgumentException("Количество посуды не может быть отрицательным!");
        }
        // в один ящик помещается максимум 15 предметов посуды
        int capacity = kitchenCabinets * 15;
        return totalDishesCount <= capacity;
    }
}
