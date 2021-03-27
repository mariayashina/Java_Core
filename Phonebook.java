import java.util.*;

class PhoneBook {
    private Map<String, HashSet<String>> map;

    PhoneBook() {
        this.map = new HashMap<>();
    }

    void add(String lastName, String phone) {
        HashSet<String> numbers;

        if (map.containsKey(lastName)) {
            numbers = map.get(lastName);
        } else {
            numbers = new HashSet<>();
        }
        numbers.add(phone);
        map.put(lastName, numbers);
    }

    Set<String> get(String lastName) {
        System.out.println(lastName);
        return map.get(lastName);
    }
}

public class Phonebook {
    public static void main(String[] args) {
        String[] words = {"sky", "day", "night", "light", "swift", "marble", "darkness", "night", "check", "light"};

        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);

        System.out.println(map.keySet());

        System.out.println();
        PhoneBook pb = new PhoneBook();

        pb.add("Yashina", "+79286456969");
        pb.add("Ivanov", "+79467653446");
        pb.add("Petrov", "+79128673475");
        pb.add("Sidorov", "+76546579712");
        pb.add("Povarov", "+79053721295");
        pb.add("Yashina", "+79257613464");

        String lastName = "Yashina";
        System.out.println(pb.get(lastName));
    }
}
