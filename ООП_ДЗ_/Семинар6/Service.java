package ООП_ДЗ_.Семинар6;

public interface Service<T, S> {
  T restock(T automat, S product);

}