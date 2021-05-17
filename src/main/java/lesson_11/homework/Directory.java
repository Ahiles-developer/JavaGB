package lesson_11.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Directory {
    private Map<String, List<String>> directory = new HashMap<>();
    private List<String> phoneNumbersList;

    public void add(String surname, String phoneNumber) {
        if (directory.containsKey(surname)) {
            phoneNumbersList = directory.get(surname);
            phoneNumbersList.add(phoneNumber);
            directory.put(surname, phoneNumbersList);
        } else {
            phoneNumbersList = new ArrayList<>();
            phoneNumbersList.add(phoneNumber);
            directory.put(surname, phoneNumbersList);
        }
    }

    public List<String> get(String surname) {
        return directory.get(surname);
    }
}
