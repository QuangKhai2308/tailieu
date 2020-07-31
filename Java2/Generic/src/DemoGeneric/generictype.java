/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoGeneric;

/**
 *
 * @author Khai2
 */
public class generictype<T> {

    private T t;

    public generictype() {
    }

    public generictype(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "generictype{" + "t=" + t + '}';
    }

}
