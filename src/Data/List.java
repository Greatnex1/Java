package Data;

public interface List {


    boolean isEmpty();
    void add (String item);

    void remove(String item);

    int size();

    String get(int index);

    int capacity();
    void print();
}

//    boolean isEmpty() {
//        return true;
//    }
//
//    void add(String item);
//
//    void remove(String item);
//
//
//    int size();
//
//    public static ArrayList removeElementUsingCollection(ArrayList arrayList, String item) {
//
//        arrayList.remove(item);
//        return arrayList;
//
//    }

