public class Singleton {

    private volatile static Singleton instance;

    private Singleton(){}

    public static Singleton getInstance(){
        if (instance==null){
            synchronized (Singleton.class){
                if (instance==null){
                    instance=new Singleton();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        Singleton singleton=getInstance();
        Singleton singleton1=getInstance();

        System.out.println(singleton==singleton1);
        System.out.println(singleton.hashCode());
        System.out.println(singleton1.hashCode());
    }
}
