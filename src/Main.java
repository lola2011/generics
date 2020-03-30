import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

 /*  Liquid liquid=new Liquid("water");
   Liquid liquid1=new Liquid("juice");
   Liquid liquid2=new Liquid("yoghurt");
   LinkedList liquids=new LinkedList();
   liquids.add(liquid);
   liquids.add(liquid1);
   liquids.add(liquid2);
        System.out.println(liquids);
        pour("water");*/

Liquid<String> liquid=new Liquid<>("water");
Liquid<String> liquid1=new Liquid<>("ayran");
Liquid<String> liquid2=new Liquid<>("maksym");
Liquid<String>liquid3=new Liquid<>("juice");
LinkedList<Liquid> liquids= new LinkedList<>();
liquids.add(liquid);
liquids.add(liquid1);
liquids.add(liquid2);
liquids.add(liquid3);
        System.out.println(liquids);
        Juice juice= new Juice("apple");
        Juice juice1=new Juice("orange");
        pour(liquid);
        pour(liquid1);
pour(juice);
pour(juice1);


    }

    public static <T extends Liquid> void pour(T value) {
        System.out.println("Perelili "+ value);
    }
}