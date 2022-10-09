package com.company;


//класс Розетка - производит 120В всегда (отдает объект Вольт с значением 120В)
public class Socket {
    public Volt getV() {
        return new Volt(120);
    }
}
