import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                String[][] myArray = {
                        {"1", "5", "2", "9"},
                        {"4", "7", "7", "15"},
                        {"10", "6", "4", "20"},
                        {"13", "2", "1", "8"},
                };

                try {
                        System.out.println("Сумма значений массива - " + getSum(myArray, 4));
                } catch (MyArraySizeException e) {
                        System.out.println("Невозможно вычислить сумму массива. Массив имеет неверный размер.");
                } catch (MyArrayDataException e) {
                        System.out.println("Невозможно вычислить сумму массива. В ячейке " + e.getCoordinates() + " ошибочные данные");
                }
        }

        public static int getSum(String[][] arr, int arraySize) throws MyArrayDataException, MyArraySizeException {
                int result = 0;

                if (arr.length != arraySize) {
                        throw new MyArraySizeException("Неверный размер массива", arr.length);
                }

                for (int i = 0; i < arr.length; i++) {
                        if (arr[i].length != arraySize) {
                                throw new MyArraySizeException("Неверный размер массива", arr[i].length);
                        }

                        for (int j = 0; j < arr[i].length; ++j) {
                                try {
                                        result += Integer.parseInt(arr[i][j]);
                                } catch (NumberFormatException e) {
                                        throw new MyArrayDataException("Элемент невозможно привести к цифровому значению", i, j);
                                }
                        }
                }

                return result;
        }
}
