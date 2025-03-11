package javaProblems.HashMap;

import java.util.ArrayList;
import java.util.LinkedList;

public class HashMapFinal {

    private final float lf = 0.5f;
    ArrayList<LinkedList<Entity>> list;
    private int size = 0;

    HashMapFinal() {

        list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(new LinkedList<>());
        }

    }

    public void put(String key, String value) {

        int hash = Math.abs(key.hashCode()) % list.size();
        LinkedList<Entity> temp = list.get(hash);

        for (Entity entity : temp) {
            if (entity.key.equals(key)) {
                entity.value = value;
                return;
            }
        }

        if ((float) (size) / list.size() > lf) {
            reHash();
        }

        temp.add(new Entity(key, value));
        size++;

    }

    private void reHash() {

        System.out.println("We are now rehasing...");

        ArrayList<LinkedList<Entity>> old = list;

        list = new ArrayList<>();

        size = 0;

        for (int i = 0; i < old.size() * 2; i++) {

            list.add(new LinkedList<>());

        }

        for (LinkedList<Entity> entities : old) {
            for (Entity entry : entities) {

                put(entry.key, entry.value);

            }
        }


    }

    public String get(String key) {

        int hash = Math.abs(key.hashCode()) % list.size();

        if (list.get(hash).size() == 0) {
            return null;
        }

        LinkedList<Entity> temp = list.get(hash);

        for (Entity entry : temp) {

            if (entry.key.equals(key)) {
                return entry.value;
            }

        }

        return null;

    }


    static class Entity {

        String key;
        String value;

        Entity(String key, String value) {

            this.key = key;
            this.value = value;

        }

    }

}