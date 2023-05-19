package homeworksJavaPro.homework16_05_2023;

import java.util.*;

public class Handbook {

    static Map<Object, List<Integer>> phoneNumberBook = new HashMap<>();

    public void add(String lastName, Integer phoneNumber) {
        List<Integer> info = phoneNumberBook.getOrDefault(lastName, new ArrayList<>());
        info.add(phoneNumber);
        phoneNumberBook.put(lastName, info);

    }

    public List<Integer> get(String lastName) {
        return phoneNumberBook.get(lastName);
    }

    public static void main(String[] args) {

//        Map<List<String>, List<Integer>> handBook = new HashMap<>();
//        handBook.put(Arrays.asList("Parkhomchyk","Yauheni"),Arrays.asList(501199039, 292057763));
//        handBook.put(Arrays.asList("Ivanov","Ivan"),Arrays.asList(532342522));
//        handBook.put(Arrays.asList("Sidorov","Vasiliy"),Arrays.asList(675362246, 823543235));
//        handBook.put(Arrays.asList("Tsaruk","Illya"),Arrays.asList(54238675, 36525384));
//        handBook.put(Arrays.asList("Tysevich","Natallia"),Arrays.asList(29237965));
//        handBook.put(Arrays.asList("Boyko","Anna"),Arrays.asList(298765434, 326798523));
//        handBook.put(Arrays.asList("Mriush","Valerya"),Arrays.asList(256542342, 632365473));
//        System.out.println(handBook.get(List.of("Ivanov","Ivan")));
//        System.out.println(handBook.get(List.of("Parkhomchyk","Yauheni")));
//        System.out.println(handBook.get(List.of("Tysevich","Natallia")));

// Код выше то же работает с добавлением имен!

        Map<String, List<Integer>> handBook = new HashMap<>();
        handBook.put("Parkhomchyk", Arrays.asList(501199039, 292057763));
        handBook.put("Ivanov", Arrays.asList(532342522));
        handBook.put("Sidorov", Arrays.asList(675362246, 823543235));
        handBook.put("Tsaruk", Arrays.asList(54238675, 36525384));
        handBook.put("Tysevich", Arrays.asList(29237965));
        handBook.put("Boyko", Arrays.asList(298765434, 326798523));
        handBook.put("Mriush", Arrays.asList(256542342, 632365473));
        System.out.println(handBook.get("Ivanov"));
        System.out.println(handBook.get("Parkhomchyk"));
        System.out.println(handBook.get("Tysevich"));
    }


}
