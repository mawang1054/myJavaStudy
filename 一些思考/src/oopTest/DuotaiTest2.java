package oopTest;

class Wine1 {
    private String name;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Wine1(){
    }
    
    public String drink(){
        return "喝的是 " + getName();
    }
    
    /**
     * 重写toString()
     */
    public String toString(){
        return "wine";
    }
}

class JNC1 extends Wine1{
    public JNC1(){
        setName("JNC");
    }
    
    /**
     * 重写父类方法，实现多态
     */
    public String drink(){
        return "喝的是 " + getName();
    }
    
    /**
     * 重写toString()
     */
//    public String toString(){
//        return "Wine : " + getName();
//    }
}

class JGJ1 extends Wine1{
    public JGJ1(){
        setName("JGJ");
    }
    
    /**
     * 重写父类方法，实现多态
     */
    public String drink(){
        return "喝的是 " + getName();
    }
    
    /**
     * 重写toString()
     */
    public String toString(){
        return "Wine : " + getName();
    }
}

public class DuotaiTest2 {
    public static void main(String[] args) {
        //定义父类数组
        Wine1[] wines = new Wine1[2];
        //定义两个子类
        JNC1 jnc = new JNC1();
        JGJ1 jgj = new JGJ1();
        
        //父类引用子类对象
        wines[0] = jnc;
        wines[1] = jgj;
        
        for(int i = 0 ; i < 2 ; i++){
            System.out.println(wines[i].toString() + "--" + wines[i].drink());
        }
        
        Object a = new JNC1();
        System.out.println(a.toString());
        
        System.out.println("-------------------------------");
    }
}
