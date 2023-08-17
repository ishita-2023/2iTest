import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.random;
import static java.util.Comparator.reverseOrder;

public class common {
    /**
     * To generate a random list of numbers
     * @param count the size of the list
     * @param minValue the minimum limit of the range
     * @param maxValue the maximum limit of the range
     * @return list of numbers
     */
    public List<Integer> generateListOfNumbers(int count, int minValue, int maxValue) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            numbers.add((int) (random() * (maxValue - minValue + 1)) + minValue);
        }
        return numbers;
    }

    /**
     * To remove duplicates (if any) and sort the list in descending order
     * @param inputNumbers the list of the numbers ranging between min and max value
     * @return list of sorted unique numbers
     */
    public List<Integer> removeDuplicatesAndSort(List<Integer> inputNumbers) {
        List<Integer> uniqueNumbers = new ArrayList<>();
        for (int number : inputNumbers) {
            if (!uniqueNumbers.contains(number)) {
                uniqueNumbers.add(number);
            }
            else
                System.out.println("Duplicates : " + number);
        }
        uniqueNumbers.sort(reverseOrder()); // to sort the list in descending order
        return uniqueNumbers;
    }
}
