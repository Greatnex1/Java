package HackerRank;

import java.sql.SQLOutput;

public class MultipleDataTypes <T, U> {
    T obj1;
    U obj2;

    public MultipleDataTypes(T obj1, U obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public void print() {
        System.out.println(obj1);
        System.out.println(obj2);
    }


    public static void main(String[] args) {
MultipleDataTypes<Integer,String> obj = new MultipleDataTypes <>(123, "Hello\nWorld");
obj.print();
    }
}
/*
    Type Parameters in Java Generics
        The type parameters naming conventions are important to learn generics thoroughly. The common type parameters are as follows:

        T – Type
        E – Element
        K – Key
        N – Number
        V – Value
*/