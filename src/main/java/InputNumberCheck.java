import java.util.Arrays;
import java.util.List;

public class InputNumberCheck {
    public boolean numberCheck(String inputNumber) {
        if (containZero(inputNumber) || !digitCheck(inputNumber) || duplicateCheck(inputNumber)) {
            System.out.println("Wrong Input Number!");
            return false;
        }
        return true;
    }

    public boolean digitCheck(String inputNumber) {
        String[] inputArray = inputNumber.split("");

        return inputArray.length == 3;
    }

    public boolean duplicateCheck(String inputNumber) {
        int[] inputArray = inputNumber.chars()
                .distinct()
                .toArray();

        return inputArray.length != 3;
    }

    public boolean containZero(String inputNumber) {
        String[] inputArray = inputNumber.split("");
        List<String> inputListArray = Arrays.asList(inputArray);

        return inputListArray.contains("0");

//        List<Integer> inputArray = new ArrayList<>();
//        String[] inputStringArray = inputNumber.split("");
//
//        for (String s : inputStringArray) {
//            inputArray.add(Integer.valueOf(s));
//        }
//
//        return !inputArray.contains(0);
    }
}
