package lesson2.MethodApp;

public class homework2Barmin {

    public static void main(String[] args) {

        System.out.println(sumMethod(10,5));
        celNumber(-5);
        System.out.println(isNegative(6));
        //argNum ("любое слово" + 5);

    }
//Задание № 1 Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно),
// если да – вернуть true, в противном случае – false.

    public static boolean sumMethod(int a, int b) {
        int sum = a + b;
        return (sum >= 10) && (sum <=20);
    }
    // Задание № 2 Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
    // положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.

    public static void celNumber (int a){
        if (a >=0) {
            System.out.println("Число " + a + " Положительное");
        }else{
            System.out.println("Число " + a + " Отрицательное");
        }
    // Задание № 3 Написать метод, которому в качестве параметра передается целое число.
        // Метод должен вернуть true, если число отрицательное, и вернуть false если положительное

        public static boolean isNegative(int x) {
            return (x < 0);
        }

            //Задание № 4 Написать метод, которому в качестве аргументов передается строка и число,
        // метод должен отпечатать в консоль указанную строку, указанное количество раз
public static void argNum(String str, int a) {
            for (int i = 0; i < a, i++);
            System.out.println(str);
        }

                // с заданием 5 еще не разобрался
        }

    }
