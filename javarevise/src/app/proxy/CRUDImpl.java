package proxy;

public class CRUDImpl implements CRUD {
    @Override
    public void add() {
        System.out.println(this.getClass().getName() + " object is calling method add");
    }    
}

interface CRUD {
    void add();
}
