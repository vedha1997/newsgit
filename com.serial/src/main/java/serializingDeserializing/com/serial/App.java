package serializingDeserializing.com.serial;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args ) throws FileNotFoundException
	{
		Serial serial = new Serial(2," ");
		String filename ="vedha.txt";

		FileOutputStream file = new FileOutputStream(filename); 
		try {
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(serial);
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		Serial serial1 = new Serial(12,null);
		Gson gson = new Gson();
		System.out.println("Without NullSerialize:"+gson.toJson(serial1));
		GsonBuilder builder = new GsonBuilder();
		gson = builder.serializeNulls().create();
		System.out.println("With    NullSerialize:"+gson.toJson(serial1));

	}
}
