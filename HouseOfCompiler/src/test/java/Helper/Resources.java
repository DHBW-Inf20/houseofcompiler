package Helper;

import org.junit.Assert;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Resources {

    public static InputStream getFileAsStream(String fileName)
    {
        ClassLoader classLoader = Resources.class.getClassLoader();
        File file = new File(classLoader.getResource(fileName).getFile());
        Assert.assertNotNull(file);
        try
        {
            return new FileInputStream(file);
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
            Assert.fail();
        }

        throw new IllegalStateException();
    }

}
