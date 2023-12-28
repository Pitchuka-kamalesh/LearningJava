package org.example;




class Parent{

    public void topic(){
        System.out.println("This is the main class parent class");
    }

}

class Child extends Parent{

    public void topics() {
        System.out.println("This is the child class");


    }
}
class Data{
    public static void main(String[] args) {



//        Parent par = new Child();
//        System.out.println(par);
//        System.out.println();
//        par.topic();
//        Child chi = (Child)par;
//        chi.topics();
        Parent par = new Parent();
        par.topic();
        ((Child)par).topics();






    }
}