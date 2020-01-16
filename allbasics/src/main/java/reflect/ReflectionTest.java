package reflect;

import reflect.Student;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionTest {
    public static void main(String[] args) throws IllegalAccessException {

        Student student = new Student();

        Class<? extends Student> studentClass = student.getClass();
        System.out.println("classname: "+ studentClass.getName());
        Field[] declaredFields = studentClass.getDeclaredFields();
            for(Field  field : declaredFields) {
                System.out.println("fields: " + field);
            }
        Method[] studentClassDeclaredMethod = studentClass.getDeclaredMethods();
            for (Method methodNames : studentClassDeclaredMethod) {

                System.out.println(methodNames);
        }
    }
}
