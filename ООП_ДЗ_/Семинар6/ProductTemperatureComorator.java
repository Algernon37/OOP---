package ООП_ДЗ_.Семинар6;

import java.util.Comparator;

public class ProductTemperatureComorator implements Comparator<Product> { // Принцип единственной ответственности,
                                                                          // Принцип Разделения интерфейса

  @Override
  public int compare(Product o1, Product o2) {
    if (((HotBeverage) o1).getTemperature() > ((HotBeverage) o2).getTemperature()) {
      return 1;
    } else if (((HotBeverage) o1).getTemperature() < ((HotBeverage) o2).getTemperature()) {
      return -1;
    } else
      return 0;
  }

}