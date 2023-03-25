package com.company;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Controller {
    private Notebook notebook1 = new Notebook("16", "1000", "win", "black");
    private Notebook notebook2 = new Notebook("16", "2000", "mac", "white");
    private Notebook notebook3 = new Notebook("16", "2000", "win", "black");
    private Notebook notebook4 = new Notebook("8", "1000", "win", "black");
    private Notebook notebook5 = new Notebook("8", "2000", "mac", "white");

    private Map createOZU(){
        Map store = new HashMap();
        store.put(notebook1.getOZU(), notebook1);
        store.put(notebook2.getOZU(), notebook2);
        store.put(notebook3.getOZU(), notebook3);
        store.put(notebook4.getOZU(), notebook4);
        store.put(notebook5.getOZU(), notebook5);
        return store;
    }

    private Map createHDD(){
        Map store = new HashMap();
        store.put(notebook1.getHDD(), notebook1);
        store.put(notebook2.getHDD(), notebook2);
        store.put(notebook3.getHDD(), notebook3);
        store.put(notebook4.getHDD(), notebook4);
        store.put(notebook5.getHDD(), notebook5);
        return store;
    }

    private Map createOS() {
        Map store = new HashMap();
        store.put(notebook1.getOS(), notebook1);
        store.put(notebook2.getOS(), notebook2);
        store.put(notebook3.getOS(), notebook3);
        store.put(notebook4.getOS(), notebook4);
        store.put(notebook5.getOS(), notebook5);
        return store;
    }

    private Map createColor(){
        Map store = new HashMap();
        store.put(notebook1.getColor(), notebook1);
        store.put(notebook2.getColor(), notebook2);
        store.put(notebook3.getColor(), notebook3);
        store.put(notebook4.getColor(), notebook4);
        store.put(notebook5.getColor(), notebook5);
        return store;
    }

    private void search (Map param, int punkt) throws IOException{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        if (punkt == 1 || punkt == 2){
            int min, max;
            System.out.print("\nОт [Гб]: ");
            min = Integer.parseInt(reader.readLine());
            System.out.print("До [Гб]: ");
            max = Integer.parseInt(reader.readLine());

            Iterator iterator = param.keySet().iterator();
            System.out.println("Результаты: ");
            String value = "ничего не найдено";
            int key;
            int count = 0;

            while(iterator.hasNext()){
                key = Integer.parseInt((String) (iterator.next()));

                if (min >= key && key >= max) {
                    System.out.println(param.get(key));
                    value = (String)(param.get(key));
                    System.out.println(value);
                    count++;
                }
            }
            if (count == 0)
            System.out.println(value);

        } else {
            System.out.println("Параметр сортировки:");
            String key;
            String str = reader.readLine();

            System.out.println("Результаты:");
            String value = "ничего не найдено";
            int count = 0;

            Iterator iterator = param.keySet().iterator();
            while(iterator.hasNext()){
                 key = (String)iterator.next();

                if (key.equals(str)) {
                    value = (String)(param.get(key));
                    System.out.println(value);
                    count++;
                }
            }
            if (count == 0)
                System.out.println(value);
        }
    }


    public void menu() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите цифру, соответствующую необходимому критерию:");
        System.out.println("1 - ОЗУ\n" +
                        "2 - Объем ЖД\n" +
                        "3 - Операционная система\n" +
                        "4 - Цвет");
        int punkt = Integer.parseInt(reader.readLine());

        switch (punkt){
            case 1:
                search(createOZU(), 1);
                break;
            case 2:
                search(createHDD(), 2);
                break;
            case 3:
                search(createOS(), 3);
                break;
            case 4:
                search(createColor(), 4);
                break;
            default:
                System.out.println("Unknown");

        }
        reader.close();
    }



}
