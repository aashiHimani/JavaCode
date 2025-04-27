package com.behaviouraldesignpattern.Observer;

import java.util.ArrayList;
import java.util.List;

interface Subject{
    void subscribe(Observ ob);
    void unsubscribe(Observ ob);
    void notifychanges();
}
interface Observ{
    void notified();
}
class Youtube implements Subject{
    List<Observ> subscribers=new ArrayList<>();
    @Override
    public void subscribe(Observ ob) {
        this.subscribers.add(ob);
    }
    @Override
    public void unsubscribe(Observ ob) {
        this.subscribers.remove(ob);
    }
    @Override
    public void notifychanges() {
        for(Observ ob:this.subscribers){
            ob.notified();
        }
    }
}
class Subscribe implements Observ{
    String name;
    Subscribe(String name){
        this.name=name;
    }
    @Override
    public void notified() {
        System.out.println(this.name+" new video upload:notification");
    }
}
public class Observer {
    public static void main(String[] args) {
        Youtube youtube=new Youtube();
        Subscribe himu=new Subscribe("himu");
        youtube.subscribe(himu);
        youtube.notifychanges();
    }
}
