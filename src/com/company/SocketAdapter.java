package com.company;

//возвращает объект Вольт с нужным значением В
public interface SocketAdapter {

    public Volt get120Volt();

    public Volt get12Volt();

    public Volt get3Volt();
}
