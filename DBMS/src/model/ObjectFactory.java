package model;
 
public class ObjectFactory {
    public static Object parseToObject(Class<?> cls, String str) throws ClassCastException {
        if (Integer.class.equals(cls)) {
            return Integer.valueOf(str);
        } else if (Double.class.equals(cls)) {
            return Double.valueOf(str);
        } else if (Float.class.equals(cls)) {
            return Float.valueOf(str);
        } else if (String.class.equals(cls)) {
            return String.valueOf(str);
        } else if (Boolean.class.equals(cls)) {
            return Boolean.valueOf(str);
        } else if (Character.class.equals(cls)) {
            return Character.valueOf(str.charAt(0));
        } else if (Byte.class.equals(cls)) {
            return Byte.valueOf(str);
        } else {
            return str;
        }
    }
}
