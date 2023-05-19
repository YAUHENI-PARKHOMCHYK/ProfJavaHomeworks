package homeworksJavaPro.homework16_05_2023;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Information {
    public static void main(String[] args) {
        Handbook handbook = new Handbook();
        handbook.add("Luk", 234223423);
        handbook.add("Luk", 324444444);
        handbook.add("Sidorov", 675362246);
        handbook.add("Parkhomchyk", 501199039);
        handbook.add("Parkhomchyk", 292057763);
        handbook.add("Ivanov", 532342522);
        handbook.add("Tsaruk", 54238675);
        handbook.add("Tsaruk", 36525384);
        handbook.add("Tysevich", 29237965);
        handbook.add("Boyko", 298765434);
        handbook.add("Mriush", 632365473);
        System.out.println(handbook.get("Parkhomchyk"));
        System.out.println(handbook.get("Parkhomchyk"));
        System.out.println(handbook.get("Ivanov"));
        System.out.println(handbook.get("Tsaruk"));

    }


}
