package org.example.referencetype;

public class A {
    private int id;
    private B obj;

    public A(int id, B obj) {
        this.id = id;
        this.obj = obj;
    }

    public A(){
    }

    public int getId() {
        return id;
    }

    public B getObj() {
        return obj;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setObj(B obj) {
        this.obj = obj;
    }

    @Override
    public String toString() {
        return "A{" +
                "id=" + id +
                ", obj=" + obj +
                '}';
    }
}
