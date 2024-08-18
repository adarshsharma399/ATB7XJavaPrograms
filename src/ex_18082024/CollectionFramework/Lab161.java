package ex_18082024.CollectionFramework;

import java.util.List;

public class Lab161 {
    public static void main(String[] args) {

        List shopping_list = List.of("Milk", "Bread", "Butter", "Cheese"); //static function
        System.out.println(shopping_list);
        System.out.println(shopping_list.size());

        shopping_list.add("Banana"); // non-static

    }
}
