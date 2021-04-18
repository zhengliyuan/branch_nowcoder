package study.myself.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.util.Arrays;

/**
 * @author liyuan zheng
 * @date 2021/2/21 20:20
 * @Description Java反射
 */
public class TestReflection {

    /**
     * 获取类Class的四种方式
     */
    public void testClassFor(){
        //1.通过类实例获取
        Person person = new Person();
        Class<? extends Person> clazz1 = person.getClass();
        System.out.println("01--"+clazz1);
        //2.通过类直接调用class
        Class<Person> clazz2 = Person.class;
        System.out.println("02--"+clazz2);
        //3.通过Class.forName
        Class<?> clazz3 = null;
        try {
            clazz3 =Class.forName("study.myself.reflection.Person");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("03--"+clazz3);
        //4.通过类加载器获取
        ClassLoader classLoader = this.getClass().getClassLoader();
        Class<?> clazz4 = null;
        try {
            clazz4 = classLoader.loadClass("study.myself.reflection.Person");
        }catch (ClassNotFoundException e){
            e.printStackTrace();;
        }
        System.out.println("04--"+clazz4);

        //hashcode相等，说明这四种方式获取的是同一个对象
        System.out.println("05--"+clazz1.hashCode());
        System.out.println("06--"+clazz2.hashCode());
        System.out.println("07--"+clazz3.hashCode());
        System.out.println("08--"+clazz4.hashCode());
    }

    /**
     * Class类，相关方法
     */
    public void testClass() throws Exception {
        Class<?> clazz = Class.forName("study.myself.reflection.Person");
        //获取该类所在包路径
        Package aPackage = clazz.getPackage();
        System.out.println("01--"+aPackage);
        //获取该类上所有注解
        Annotation[] declaredAnnotations = clazz.getDeclaredAnnotations();
        System.out.println("02--"+Arrays.toString(declaredAnnotations));
        //获取该类上所有修饰符
        int modifiers = clazz.getModifiers();
        String modifier = Modifier.toString(modifiers);
        System.out.println("03--"+modifier);
        //获取类名称
        String name = clazz.getName();
        System.out.println("04--"+name);
        //获取简单类名
        String simpleName = clazz.getSimpleName();
        System.out.println("05--"+simpleName);
        //获取直属超类
        Type genericSuperclass = clazz.getGenericSuperclass();
        System.out.println("06--"+genericSuperclass);
        //获取直属实现的接口
        Type[] genericInterfaces = clazz.getGenericInterfaces();
        System.out.println("07--"+genericInterfaces);
    }

    /**
     * Constructor构造函数
     */
    public void testConstructor() throws Exception{
        Class<?> clazz = Class.forName("study.myself.reflection.Person");
        //获取一个声明为public构造函数实例
        Constructor<?> constructor1 = clazz.getConstructor(String.class,int.class,String.class);
        System.out.println("01 - " + constructor1);
        //获取所有声明为public构造函数实例
        Constructor<?>[] constructorsArray1 = clazz.getConstructors();
        System.out.println("02 - " +Arrays.toString(constructorsArray1));
        //获取一个声明的构造函数实例
        Constructor<?> constructor2 = clazz.getDeclaredConstructor(String.class);
        System.out.println("03 - " + constructor2);
        //获取所有声明的构造函数实例
        Constructor<?>[] constructorsArray2 = clazz.getDeclaredConstructors();
        System.out.println("04 - " +Arrays.toString(constructorsArray2));
        //根据构造函数创建一个实例
        Object o1 = constructor1.newInstance("杨过",25,"man");
        System.out.println("05 - " + o1);
        // 将构造函数的可访问标志设为 true 后，可以通过私有构造函数创建实例
        constructor2.setAccessible(true);
        Object o2 = constructor2.newInstance("小龙女");
        System.out.println("06 - " + o2);
        // 获取该构造函数上的所有注解
        Annotation[] annotations = constructor1.getDeclaredAnnotations();
        System.out.println("07 - " + Arrays.toString(annotations));

        // 获取该构造函数上的所有参数类型
        Type[] genericParameterTypes = constructor1.getGenericParameterTypes();
        System.out.println("08 - " + Arrays.toString(genericParameterTypes));
    }

    /**
     * Field属性相关方法
     * @throws Exception
     */
    public void testField() throws Exception{
        Class<?> clazz = Class.forName("study.myself.reflection.Person");
        //获取一个该类或者父类中声明为public的属性,如果不存在，会报异常
        Field field1 = clazz.getField("birthday");
        System.out.println("01--"+field1);
        //获取该类及父类中所有声明为public的属性
        Field[] fieldArray1 = clazz.getFields();
        System.out.println("02--"+Arrays.toString(fieldArray1));
        //获取该类中声明为public的属性
        Field field2 = clazz.getDeclaredField("birthday");
        System.out.println("03--" + field2);
        //获取该类中所有声明为public的属性
        Field[] fieldArray2 = clazz.getDeclaredFields();
        System.out.println("04--"+Arrays.toString(fieldArray2));
        // 获取该属性上的所有注解
        Annotation[] declaredAnnotations = field2.getDeclaredAnnotations();
        for (Annotation declaredAnnotation : declaredAnnotations) {
            System.out.println("05 - " + declaredAnnotation);
        }

        // 获取修饰符
        String modifier = Modifier.toString(field2.getModifiers());
        System.out.println("06 - " + modifier);

        // 获取属性类型，返回类对象
        Class<?> type = field2.getType();
        System.out.println("07 - " + type);
        // 获取属性类型，返回Type对象
        Type genericType = field2.getGenericType();
        System.out.println("08 - " + genericType);

        // 获取属性名称
        String name = field2.getName();
        System.out.println("09 - " + name);
    }
    public void testMethod() throws Exception{
        Class<?> clazz = Class.forName("study.myself.reflection.Person");
        // 获取一个该类及父类中声明为 public 的方法，需要指定方法的入参类型
        Method method = clazz.getMethod("setUserName", String.class);
        System.out.println("01 - " + method);

        // 获取该类及父类中所有声明为 public 的方法,此处包含Object类的默认方法（equals,toString等），因为所有对象的父类都是Object
        Method[] methods = clazz.getMethods();
        for (Method temp : methods) {
            System.out.println("02 - " + temp);
        }

        // 获取一个在该类中声明的方法
        Method declaredMethod = clazz.getDeclaredMethod("display");
        System.out.println("03 - " + declaredMethod);

        // 获取所有在该类中声明的方法，此处不包含Object类的默认方法（equals,toString等）
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method temp : declaredMethods) {
            System.out.println("04 - " + temp);
        }

        // 获取该方法上的所有注解
        Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
        for (Annotation temp : declaredAnnotations) {
            System.out.println("05 - " + temp);
        }

        // 获取修饰符
        String modifier = Modifier.toString(method.getModifiers());
        System.out.println("06 - " + modifier);

        // 获取返回值类型，返回类对象
        Class<?> returnType = method.getReturnType();
        System.out.println("07 - " + returnType);
        // 获取返回值类型，返回Type对象
        Type genericReturnType = method.getGenericReturnType();
        System.out.println("08 - " + genericReturnType);

        // 获取方法名称
        String name = method.getName();
        System.out.println("09 - " + name);

        // 获取所有入参
        Parameter[] parameters = method.getParameters();
        for (Parameter temp : parameters) {
            System.out.println("10 - " + temp);
        }
    }

    /**
     * Modifier修饰符相关方法
     * @throws Exception
     */
    public void testModifier() throws Exception{
        Class<?> clazz = Class.forName("study.myself.reflection.Person");
        //获取类的修饰符
        int modifiers1 = clazz.getModifiers();
        System.out.println("01--"+modifiers1);
        //获取某个属性的修饰符
        int modifiers2 = clazz.getDeclaredField("userName").getModifiers();
        System.out.println("02--"+modifiers2);
        //获取构造函数修饰符
        int modifiers3 = clazz.getDeclaredConstructor(String.class).getModifiers();
        System.out.println("03--"+modifiers3);
        //获取方法修饰符
        int modifiers4 = clazz.getDeclaredMethod("display").getModifiers();
        System.out.println("04--"+modifiers4);
        // 判断修饰符值是否 final 类型
        boolean isFinal = Modifier.isFinal(modifiers1);
        System.out.println("05--"+isFinal);
        // 判断修饰符值是否 public 类型
        boolean isPublic = Modifier.isPublic(modifiers1);
        System.out.println("06--"+isPublic);
        // 根据修饰符值，获取修饰符标志的字符串
        String modifier = Modifier.toString(modifiers1);
        System.out.println("07 - " + modifier);
        System.out.println("08 - " + Modifier.toString(modifiers2));
    }
    public void testParamter() throws Exception{
        Class<?> clazz = Class.forName("study.myself.reflection.Person");
        // 获取构造函数的参数
        Constructor<?> constructor = clazz.getConstructor(String.class, int.class, String.class);
        Parameter[] parameterArray1 = constructor.getParameters();
        for (Parameter temp : parameterArray1) {
            System.out.println("01 - " + temp);
        }

        // 获取方法的参数
        Method method = clazz.getMethod("setName", String.class);
        Parameter[] parameterArray2 = method.getParameters();
        for (Parameter temp : parameterArray2) {
            System.out.println("02 - " + temp);
        }

        Parameter parameter = parameterArray1[0];
        // 获取参数上的注解
        Annotation[] annotationArray = parameter.getAnnotations();
        for (Annotation temp : annotationArray) {
            System.out.println("02 - " + temp);
        }

        // 获取参数名称
        String name = parameter.getName();
        System.out.println("03 - " + name);

        // 获取参数类型
        Type parameterizedType = parameter.getParameterizedType();
        System.out.println("04 - " + parameterizedType);
        Class<?> type = parameter.getType();
        System.out.println("05 - " + type);
    }

    public static void main(String[] args) throws Exception {
        TestReflection testReflection = new TestReflection();
        /*testReflection.testClassFor();
        System.out.println("-------------------------");
        testReflection.testClass();
        System.out.println("-------------------------");*/
        /*testReflection.testConstructor();*/
        /*testReflection.testField();*/
        /*testReflection.testMethod();*/
        /*testReflection.testModifier();*/
        testReflection.testParamter();
    }
}
