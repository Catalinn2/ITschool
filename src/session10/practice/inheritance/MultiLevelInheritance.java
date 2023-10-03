package session10.practice.inheritance;

public class MultiLevelInheritance {
}

class Grandparent {
    void dance(){
        System.out.println("Grandpa should not dance");
    }
}

class Parentt extends Grandparent{
    @Override
    void dance() {
        System.out.println("Parent can dangce");;
    }
}

class Childd extends Parent {
    @Override
    void displayParent() {
        System.out.println("Child can dance too");;
    }
}