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
        return "�ȵ��� " + getName();
    }
    
    /**
     * ��дtoString()
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
     * ��д���෽����ʵ�ֶ�̬
     */
    public String drink(){
        return "�ȵ��� " + getName();
    }
    
    /**
     * ��дtoString()
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
     * ��д���෽����ʵ�ֶ�̬
     */
    public String drink(){
        return "�ȵ��� " + getName();
    }
    
    /**
     * ��дtoString()
     */
    public String toString(){
        return "Wine : " + getName();
    }
}

public class DuotaiTest2 {
    public static void main(String[] args) {
        //���常������
        Wine1[] wines = new Wine1[2];
        //������������
        JNC1 jnc = new JNC1();
        JGJ1 jgj = new JGJ1();
        
        //���������������
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
