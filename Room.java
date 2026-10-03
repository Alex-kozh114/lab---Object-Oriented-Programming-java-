package javaproject.src;

public class Room {
    private double numberSquareMeters;
    private int windowsCount;
    private double ceilingHeight;

    public Room(double numberSquareMeters, int windowsCount, double ceilingHeight) {
        setNumberSquareMeters(numberSquareMeters);
        setWindowsCount(windowsCount);
        setCeilingHeight(ceilingHeight);
    }

    public void setNumberSquareMeters(double numberSquareMeters) {
        if (numberSquareMeters <= 0) {
            throw new IllegalArgumentException("Кол-во квадратных метров не может быть отрицательным или равным нулю");
        } else {
            this.numberSquareMeters = numberSquareMeters;
        }
    }

    public double getNumberSquareMeters() {
        return numberSquareMeters;
    }

    public void setWindowsCount(int windowsCount) {
        if (windowsCount < 0) {
            throw new IllegalArgumentException("Кол-во окон не может быть отрицательным");
        } else {
            this.windowsCount = windowsCount;
        }
    }

    public int getWindowsCount() {
        return windowsCount;
    }

    public void setCeilingHeight(double ceilingHeight) {
        if (ceilingHeight < 1.8 || ceilingHeight > 50.0) {
            throw new IllegalArgumentException("Неразумная высота потолков");
        } else {
            this.ceilingHeight = ceilingHeight;
        }
    }

    public double getCeilingHeight() {
        return ceilingHeight;
    }

    public double calculateRoomVolume() {
        return numberSquareMeters * ceilingHeight;
    }

    public void checkWindowsInRoom() {
        if (windowsCount > 0) {
            System.out.println("В комнате есть окна");
        } else {
            System.out.println("В комнате нет окон");
        }
    }

    public void checkIsBigRoom() {
        if (numberSquareMeters > 30) {
            System.out.println("Комната большая");
        } else {
            System.out.println("Комната маленькая");
        }
    }
}