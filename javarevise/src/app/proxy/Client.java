package proxy;

public class Client {
    
    public static void main(String[] args) {
        CRUDImpl rc = new CRUDImpl();
        ProxyTest pt = new ProxyTest(rc);
        CRUD rcProxy = (CRUD) pt.getProxy();
        rcProxy.add();


        // user info service test
        CRUD userInfoService = new UserInfoService();
        UserInfoProxy up = new UserInfoProxy(userInfoService);
        CRUD uiProxy = (CRUD) up.getProxy();
        uiProxy.add();

    }
}
