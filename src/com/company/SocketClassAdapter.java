package com.company;

public class SocketClassAdapter extends Socket implements SocketAdapter {
    @Override
    public Volt get120Volt() {
        return getV();
    }

    @Override
    public Volt get12Volt() {
       return new Volt(getV().getVolts()/10); //получили значение В = 120/10 = 12 и создали объект 12В
   }

    @Override
    public Volt get3Volt() {
        return new Volt(getV().getVolts()/40); //получили значение В = 120/40 = 3 и создали объект 3В
    }
}
