package javaproject.src;

public class Main {
    public static void main(String[] args) {
        try {
            Kitchen myKitchen = new Kitchen(
            14.5, 2, 2.7, 
                3, true, "Плитка", 
                true, 6, true
            );

            System.out.println("Методы класса Room");
            System.out.printf("Объем кухни: %.2f м³%n", myKitchen.calculateRoomVolume());
            myKitchen.checkWindowsInRoom();
            myKitchen.checkIsBigRoom();

            System.out.println("\nМетоды класса ResidentialRoom");
            myKitchen.isHeated();
            myKitchen.howManyResidents();
            myKitchen.whatFloorType();

            System.out.println("\nМетоды класса Kitchen");
            myKitchen.cook("Борщ");
            myKitchen.startVentilation();
            
            int dishesCount = 70;
            boolean canFit = myKitchen.canStoreDishes(dishesCount);
            System.out.println("Влезет ли " + dishesCount + " предметов посуды в " 
                               + myKitchen.getKitchenCabinets() + " ящиков? " + (canFit ? "Да" : "Нет"));

        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка валидации: " + e.getMessage());
        }
    }
}
