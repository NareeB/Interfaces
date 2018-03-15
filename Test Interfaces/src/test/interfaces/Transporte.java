
package test.interfaces;

/**
 *
 * @author Nareyii
 * @date Mar 15, 2018
 * @time 8:21:31 AM
 */
public abstract class Transporte implements Comparable{
    int velocidadMax;
    
    public void setVelocidadMax(int vel){
        velocidadMax = vel;
    }
    public int getVelocidadMax(){
        return velocidadMax;
    }
    
    public int compareTo(Object obj){
        Transporte t = (Transporte)obj;
        if (velocidadMax < t.getVelocidadMax())
            return -1;
        if (velocidadMax == t.getVelocidadMax())
            return 0;
        return 1;
        }
    }
}
