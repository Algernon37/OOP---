package ООП_ДЗ_.Семинар4;


public interface Service<T, S> {
  T restock(T automat, S product);

}