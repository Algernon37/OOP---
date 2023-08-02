package ООП_ДЗ_.Семинар2;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    Product beverageProduct1 = new HotBeverage("Espresso", 100, 12, new GregorianCalendar(2023, 7, 20, 0, 0), 0.2,
        80);
    Product beverageProduct2 = new HotBeverage("Latte", 200, 10, new GregorianCalendar(2023, 7, 20, 0, 0), 0.8, 60);
    Product beverageProduct3 = new HotBeverage("Cappuccino", 150, 5, new GregorianCalendar(2023, 7, 20, 0, 0), 0.5,
        80);
    HotBeverage beverageProduct4 = new HotBeverage("Glasse", 210, 18, new GregorianCalendar(2023, 7, 20, 0, 0), 0.8,
        50);
    HotBeverage beverageProduct5 = new HotBeverage("Americano", 100, 13, new GregorianCalendar(2023, 7, 20, 0, 0), 0.2,
        80);

    List<Product> myList = new ArrayList<>();
    myList.add(beverageProduct1);
    myList.add(beverageProduct2);
    myList.add(beverageProduct3);
    myList.add(beverageProduct4);
    myList.add(beverageProduct5);

    Automat hbAutomat = new HotBeverageAutomat();
    hbAutomat.initProduct(myList);

    Human human = new Human("Alex", false, false, 500);
    human.setAutomat(hbAutomat);
    System.out.println(human.toString());
    System.out.println("----------");
    List<String> listHuman = new ArrayList<>();
    listHuman.add("Espresso");
    listHuman.add("Glasse");
    System.out.println(human.makeOrder(listHuman, hbAutomat, human));

    System.out.println("----------");
    System.out.println(human.toString());

  }
}