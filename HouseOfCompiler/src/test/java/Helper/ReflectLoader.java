package Helper;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class ReflectLoader extends ClassLoader {
    private byte[] byteCode;
        private Map<String, byte[]> byteCodes;
        private Map<String, Class<?>> classes = new HashMap<>();

    public ReflectLoader(byte[] byteCode) {
            byteCodes = new HashMap<>();
        this.byteCode = byteCode;
    }

    public ReflectLoader(Map<String, byte[]> byteCodes) {
        this.byteCodes = byteCodes;
    }

    @Override
    public Class findClass(String name) {
        if(!byteCodes.containsKey(name)) {
            if(byteCode != null) {
                byteCodes.put(name, byteCode);
                byteCode = null;
            }
            else {
                return null;
            }
        }
        if(classes.containsKey(name)) {
            return classes.get(name);
        }
        else {
            Class<?> clazz = defineClass(name, byteCodes.get(name), 0, byteCodes.get(name).length);
            classes.put(name, clazz);
            return clazz;
        }
    }

    public Method getMethod(String className, String method, Class<?>... parameterTypes) throws NoSuchMethodException {
        Method method1 = findClass(className).getDeclaredMethod(method, parameterTypes);
        method1.setAccessible(true);
        return method1;
    }

    public Field getField(String className, String field) throws NoSuchFieldException {
        Field field1 = findClass(className).getDeclaredField(field);
        field1.setAccessible(true);
        return field1;
    }

    public Constructor getConstructor(String classname, Class<?>... parameterTyped) throws NoSuchMethodException {
        Constructor<?> constructor = findClass(classname).getDeclaredConstructor(parameterTyped);
        constructor.setAccessible(true);
        return constructor;
    }
}
