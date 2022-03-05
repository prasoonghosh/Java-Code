class ParentClass {
    public static void pcmethod() {
        System.out.println("This is a parent class");
    }
}
class ChildClass extends ParentClass {
    public static void ccmethod(){
        System.out.println("This is a child class");
    }
}
class object {
    public static void main(String [] args) {
       ParentClass pc = new ParentClass();
       ChildClass cc = new ChildClass();
        pc.pcmethod();
        cc.ccmethod();
        cc.pcmethod();
    }

}