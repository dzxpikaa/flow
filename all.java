 class A {
     A(){

        System.out.println("in side a");
    }

}
 class  B extends A  {
    B (){
        System.out.println("in b");

        
    }

    
}
 class C extends B  {
C(){
System.out.println(" in c");
}
    
}
 class all {
public static void main(String[] args) {
    C obj = new C();
}
}