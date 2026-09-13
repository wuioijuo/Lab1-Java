public class lab1 {

    public static void main(String[] args) {
        lab1 m = new lab1();

        System.out.println("Задание 1");

        System.out.println("1.1 Дробная часть: " + m.fraction(5.25));
        System.out.println("1.3 Букву в число: " + m.charToNum('3'));
        System.out.println("1.5 Двузначное: " + m.is2Digits(32));
        System.out.println("1.7 Диапазон: " + m.isInRange(5, 1, 3));
        System.out.println("1.9 Равенство: " + m.isEqual(3, 3, 3));


        System.out.println("\nЗадание 2");

        System.out.println("2.1 Модуль числа: " + m.abs(-5));
        System.out.println("2.3 Тридцать пять: " + m.is35(15));
        System.out.println("2.5 Тройной максимум: " + m.max3(8, -1, 4));
        System.out.println("2.7 Двойная сумма: " + m.sum2(5, 7));
        System.out.println("2.9 День недели: " + m.day(5));


        System.out.println("\nЗадание 3");

        System.out.println("3.1 Числа подряд: " + m.listNums(5));
        System.out.println("3.3 Четные числа: " + m.chet(9));
        System.out.println("3.5 Длина числа: " + m.numLen(12567));

        System.out.println("3.7 Квадрат:");
        m.square(3);

        System.out.println("3.9 Правый треугольник:");
        m.rightTriangle(4);


        System.out.println("\nЗадание 4");

        int[] arr = {1, 2, 3, 4, 2, 2, 5};

        System.out.println("4.1 Первый индекс: " + m.findFirst(arr, 2));

        int[] arr2 = {1, -2, -7, 4, 2, 2, 5};
        System.out.println("4.3 Максимальный по модулю: " + m.maxAbs(arr2));

        int[] arr3 = {1, 2, 3, 4, 5};
        System.out.print("4.5 Добавление массива: ");
        int[] result = m.add(arr3, new int[]{7, 8, 9}, 3);
        for (int i : result) {
            System.out.print(i + " ");
        }

        int[] reverseArr = {1, 2, 3, 4, 5};
        m.reverse(reverseArr);
        System.out.print("\n4.7 Возвратный реверс: ");
        int[] back = m.reverseBack(reverseArr);
        for (int i : back) {
            System.out.print(i + " ");
        }

        System.out.print("\n4.9 Все вхождения: ");
        int[] indexes = m.findAll(arr, 2);
        for (int i : indexes) {
            System.out.print(i + " ");
        }
    }


    // задание 1
    public double fraction(double x) {
        return x - (int)x;
    }


    public int charToNum(char x) {
        return x - '0';
    }


    public boolean is2Digits(int x) {
        return (x >= -99 && x <= -10) || (x >= 10 && x <= 99);
    }


    public boolean isInRange(int a, int b, int num) {
        if (a > b) {
            return num >= b && num <= a;
        } else {
            return num >= a && num <= b;
        }
    }


    public boolean isEqual(int a, int b, int c) {
        return (a == b) && (b == c);
    }


    // задание 2
    public int abs(int x) {
        if (x < 0) {
            return -x;
        }
        return x;
    }


    public boolean is35(int x) {
        if (x % 3 == 0 && x % 5 == 0) {
            return false;
        } else {
            return x % 3 == 0 || x % 5 == 0;
        }
    }


    public int max3(int x, int y, int z) {
        int max = x;
        if (y > max) {
            max = y;
        }
        if (z > max) {
            max = z;
        }
        return max;
    }


    public int sum2(int x, int y) {
        int sum = x + y;
        if (sum >= 10 && sum <= 19) {
            return 20;
        }
        return sum;
    }


    public String day(int x) {
        switch (x) {
            case 1:
                return "понедельник";
            case 2:
                return "вторник";
            case 3:
                return "среда";
            case 4:
                return "четверг";
            case 5:
                return "пятница";
            case 6:
                return "суббота";
            case 7:
                return "воскресенье";
            default:
                return "это не день недели";
        }
    }

    // задание 3
    public String listNums(int x) {
        String result = "";
        for (int i = 0; i <= x; i++) {
            result += i + " ";
        }
        return result.trim();
    }


    public String chet(int x) {
        String result = "";
        for (int i = 0; i <= x; i += 2) {
            result += i + " ";
        }
        return result.trim();
    }


    public int numLen(long x) {
        int count = 0;
        if (x < 0) {
            x = -x;
        }
        while (x != 0) {
            count++;
            x /= 10;
        }
        return count;
    }


    public void square(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public void rightTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 0; j < x - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // задание 4
    public int findFirst(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public int maxAbs(int[] arr) {
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (Math.abs(arr[i]) > Math.abs(result)) {
                result = arr[i];
            }
        }
        return result;
    }

    public int[] add(int[] arr, int[] ins, int pos) {
        int[] result = new int[arr.length + ins.length];
        for (int i = 0; i < pos; i++) {
            result[i] = arr[i];
        }
        for (int i = 0; i < ins.length; i++) {
            result[pos + i] = ins[i];
        }
        for (int i = pos; i < arr.length; i++) {
            result[ins.length + i] = arr[i];
        }
        return result;
    }

    public int[] reverseBack(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[arr.length - 1 - i];
        }
        return result;
    }

    public int[] findAll(int[] arr, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                result[index] = i;
                index++;
            }
        }
        return result;
    }
}
