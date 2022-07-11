/**
 * 
 */
package in.rahulchaudharyofficial.ds.search;

/**
 * @author rahul
 *
 */
public class Hasher {
	
	public static int hash(String key, int size, int maxAddress, int address) {
		address = 0;
		
		for(char c : key.toCharArray())
		{
			if(c != ' ')
			{
				address += (int) c;
				address = address >> 12;
			}
		}
		
		if(address < 0)
			address = address * -1;
		
		address = address % maxAddress;
		return address;
	}
}
