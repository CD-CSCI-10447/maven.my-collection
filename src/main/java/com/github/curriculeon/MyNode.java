package com.github.curriculeon;

public class MyNode<SomeType> {
    private SomeType data;
    private MyNode<SomeType> next;

    public MyNode() {

    }

    public MyNode(SomeType data, MyNode<SomeType> next) {
        this.setData(data);
        this.setNext(next);
    }

    public SomeType getData() {
        return data;
    }

    public void setData(SomeType data) {
        this.data = data;
    }

    public MyNode<SomeType> getNext() {

        return next;
    }

    public void setNext(MyNode<SomeType> next) {
        try {
            if (next.getNext() == this || next == this) {
                throw new IllegalArgumentException();
            }
        } catch(NullPointerException e){
            this.next = next;
        }


    }
}