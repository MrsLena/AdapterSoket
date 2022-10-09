package com.company;

public class Main {

    //необходимо создать адаптер, который может выдавать 3 вольта, 12 вольт и 120 вольт
    //из стандартной розетки 120В



    public static void main(String[] args) {

        System.out.println("Стандартная розетка выдает "+ new Socket().getV().getVolts() + "В");



        System.out.println("Реализация адаптера Класса :");
        SocketAdapter sockAdapterC = new SocketClassAdapter();
        Volt v3C = sockAdapterC.get3Volt();
        Volt v12C = sockAdapterC.get12Volt();
        Volt v120C = sockAdapterC.get120Volt();
        System.out.println("После преобразования адаптера(3) получили "+v3C.getVolts());
        System.out.println("После преобразования адаптера(12) получили "+v12C.getVolts());
        System.out.println("После преобразования адаптера(120) получили "+v120C.getVolts());



        System.out.println("Реализация адаптера Объекта :");
        SocketAdapter sockAdapter = new SocketObjectAdapter();
        Volt v3 = sockAdapter.get3Volt();
        Volt v12 = sockAdapter.get12Volt();
        Volt v120 = sockAdapter.get120Volt();
        System.out.println("После преобразования адаптера(3) получили "+v3.getVolts() + "В");
        System.out.println("После преобразования адаптера(12) получили "+v12.getVolts()+ "В");
        System.out.println("После преобразования адаптера(120) получили "+v120.getVolts() + "В");


    }
}
