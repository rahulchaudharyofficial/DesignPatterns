/**
 * 
 */
package in.rahulchaudharyofficial.utils;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;

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
	
	public List<Integer> getRandomArrayBySize(long size)
	{
		List<Integer> list = null;
		
		if(size > 0) {
			Random r = new Random(1L);
			list = new ArrayList<>();
			for(long i = 0;i < size; i++)
			{
				list.add(r.nextInt((int) size));
			}
		}
		return list;
	}
}
