package SmartPhone;

import java.io.FileNotFoundException;
import java.util.*;

public class ManagerPhone {
    List<Genuine> genuines;
    List<Portable> portables;

    public ManagerPhone() {
        genuines =  new LinkedList<>();
        portables = new LinkedList<>();
    }

    public void addGenuine(Genuine genuine){
        genuines.add(genuine);
    }
    public void addPortable(Portable portable){
        portables.add(portable);
    }
    public void display(){
        System.out.println(" List Genuine:");
        for (Genuine genuine: genuines) {
            System.out.println(genuine);
        }
        System.out.println("List Portable:");
        for (Portable portable:portables) {
            System.out.println(portable);
        }
    }
    public boolean delete(int id)  {
            for (Phone phone : genuines) {
                if (phone.getId() == id) {
                    genuines.remove(phone);
                    return true;
                }
            }

            for (Phone phone : portables) {
                if (phone.getId() == id) portables.remove(phone);
                return true;
            }
            return false;


    }
    public void Search(String Name){
        for (Genuine genuine:genuines) {
            if (genuine.getName().equals(Name)){
                System.out.println(genuine);
                return;
            }
        }
        for (Portable portable:portables) {
            if (portable.getName().equals(Name)){
                System.out.println(genuines);
                return;
            }
        }
        System.out.println("not Found");
    }
    public void Sort(){
       genuines.sort(new Comparator<Genuine>() {
           @Override
           public int compare(Genuine o1, Genuine o2) {
               double v = o1.getPrice() - o2.getPrice();
               return (int) v;
           }
       });
       portables.sort(new Comparator<Portable>() {
           @Override
           public int compare(Portable o1, Portable o2) {
               double v = o1.getPrice() - o2.getPrice();
               return (int) v;
           }
       });
    }


}
