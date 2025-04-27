package com.creationaldesignpattern.prototype;

import java.util.ArrayList;
import java.util.List;

class NetworkConnection implements Cloneable{
    private String ip;
    private String data;
    private List<String> domains=new ArrayList<>();

    public List<String> getDomains() {
        return domains;
    }
    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    public String getIp() {
        return ip;
    }
    public void setIp(String ip) {
        this.ip = ip;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public void loadData(){
        this.data="data";
        domains.add("www.gfg.com");
        domains.add("www.lceed.com");
    }

    @Override
    public String toString() {
        return "NetworkConnection{" + "ip='" + ip + '\'' +
                ", data='" + data + '\'' + ", domains=" + domains + '}';
    }

//    public Object clone() throws CloneNotSupportedException{
//        return super.clone();
//    }
    //deep
    public Object clone() throws CloneNotSupportedException{
        NetworkConnection networkConnection=new NetworkConnection();
        networkConnection.setIp(this.getIp());
        networkConnection.setData(this.getData());
        for(String d:this.getDomains()){
            networkConnection.getDomains().add(d);
        }
        return networkConnection;
    }
}

public class ExamplePrototype {
    public static void main(String[] args) {
        NetworkConnection networkConnection=new NetworkConnection();
        networkConnection.setIp("192.67.98");
        networkConnection.loadData();
        System.out.println(networkConnection);

        //shallow
        try{
           NetworkConnection networkConnection2= (NetworkConnection) networkConnection.clone();
            System.out.println(networkConnection2);
        }
        catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

        //deep
        try{
            NetworkConnection networkConnection3= (NetworkConnection) networkConnection.clone();
            System.out.println(networkConnection3);
            networkConnection.getDomains().remove(0);
            System.out.println(networkConnection);
            System.out.println(networkConnection3);
        }
        catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}
