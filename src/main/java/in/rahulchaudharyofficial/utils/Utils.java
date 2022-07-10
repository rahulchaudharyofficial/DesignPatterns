/**
 * 
 */
package in.rahulchaudharyofficial.utils;

import java.lang.reflect.Method;

/**
 * @author rahul
 *
 */
public class Utils<T> {
	public boolean doesImplementEquals(T item) {
        boolean isValid = false;
        for(Method m : item.getClass().getDeclaredMethods()) {
            if(m.getName()=="equals")
                isValid = true;
        }
        return isValid;
    }
}
