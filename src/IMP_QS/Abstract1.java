package IMP_QS;

public  abstract class Abstract1 {
    public  abstract int add();// un implemented
    public int sub(int a,int b){ // implemented
        return a-b;
    }

    class Hello extends Abstract1{
    @Override
    public int add() {
        return 10;
    }
}
}


