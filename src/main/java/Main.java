public class Main {
    public static void main(String[] args) {
        System.out.println("Сумма int = " + sumInt(30, 40));
        System.out.println("Умножение int = " + multiplicationInt(5, 30));
        System.out.println("Деление int = " + divisionInt(10000_00, 50_00));
        System.out.println("Вычитание int = " + subtractInt(35812, 25548));
        System.out.println("Сумма double = " + sumDouble(15.48, 68.35));
        System.out.println("Сумма double + int = " + sumIntDouble(10.39, 537));
        System.out.println("Деление double = " + divisionDouble(30.45, 4.10));
        System.out.println("Сравнение int = " + compareInt(100500, 69));
        System.out.println("Сравние double и int = " + compareDoubleInt(1000.35, 36));
        System.out.println("Сложение с переполнением = " + sumOverflowInt(2147483647, 2));
        System.out.println("Остаток от деления = " + remainDivisionInt(10, 3));
        System.out.println("Инкремент = " + incrementInt(55));
        System.out.println(getoOperatingSystem("IOS"));
        System.out.println(getoOperatingSystem("Android"));
        System.out.println(getoOperatingSystem("Symbian"));
        System.out.println(getCarBrand("BMW"));
        System.out.println(getCarBrand("Ford"));
        System.out.println(getCarBrand("Lada"));
        System.out.println("Умножение int с переполнением = " + multiplicationOverflowInt(1000000, 2000000));
    }

    public static int sumInt(int a, int b) {
        return a + b;
    }

    public static int multiplicationInt(int a, int b) {
        return a * b;
    }

    public static int divisionInt(int a, int b) {
        return a / b;
    }

    public static int subtractInt(int a, int b) {
        return a - b;
    }

    public static double sumDouble(double a, double b) {
        return a + b;
    }

    public static double sumIntDouble(double a, int b) {
        return a + b;
    }

    public static double divisionDouble(double a, double b) {
        return a / b;
    }

    public static boolean compareInt(int a, int b) {
        return a > b;
    }

    public static boolean compareDoubleInt(double a, int b) {
        return a <= b;
    }

    public static int sumOverflowInt(int a, int b) {
        return a * b;
    }

    public static int remainDivisionInt(int a, int b) {
        return a % b;
    }

    public static int incrementInt(int a) {
        return ++a;
    }

    public static String getoOperatingSystem(String system) {
        if (system != null && system.equals("IOS")) {
            return system;
        } else if ((system != null && system.equals("Android"))) {
            return system;
        } else {
            return "Операционная система не актуальна";
        }
    }
    public static int multiplicationOverflowInt(int a, int b) {
        return a * b;
    }
    public static String getCarBrand(String nameBrand) {
        switch (nameBrand) {
            case "BMW":
            case "Mercedes":
                System.out.println("Вы выбрали премиум-марку автомобиля.");
                break;
            case "Toyota":
            case "Honda":
                System.out.println("Вы выбрали японскую марку автомобиля.");
                break;
            case "Ford":
            case "Chevrolet":
                System.out.println("Вы выбрали американскую марку автомобиля.");
                break;
            default:
                System.out.println("Вы выбрали неизвестную марку автомобиля.");
                break;
        }
        return nameBrand;
    }
}

