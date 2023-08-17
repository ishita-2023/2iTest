import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * Step definitions of the test steps of feature file
 */
public class numberListSteps extends common {

    private List<Integer> numbers;
    private List<Integer> uniqueSortedNumbers;

    @Given("a list of numbers ranging between 1 and 100")
    public void aListOfNumbersRangingBetween1And100() {
        numbers = generateListOfNumbers(10, 1, 100);
        System.out.println("List of numbers ranging between 1-100 : " + numbers );
    }

    @When("I remove duplicates and sort the numbers in descending order")
    public void iRemoveDuplicatesAndSortTheNumbersInDescendingOrder() {
        uniqueSortedNumbers = removeDuplicatesAndSort(numbers);
    }

    @Then("I should see the sorted unique numbers")
    public void iShouldSeeTheSortedUniqueNumbers() {
        assertTrue(!uniqueSortedNumbers.isEmpty());
        System.out.println("Sorted Unique Numbers in Descending Order with duplicates removed :" + uniqueSortedNumbers);

    }
}
