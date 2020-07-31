/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pair;

/**
 *
 * @author Khai2
 */
public class pairtype<K, T> {
    private K k;
    private T t;

    public pairtype() {
    }

    public pairtype(K k, T t) {
        this.k = k;
        this.t = t;
    }

    public K getK() {
        return k;
    }

    public void setK(K k) {
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "pairtype{" + "k=" + k + ", t=" + t + '}';
    }
    
    
}
