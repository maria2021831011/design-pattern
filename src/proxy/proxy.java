package proxy;

public class proxy implements basic{
real r=new real();
String USERS;
proxy(String USERS)
{
    this.USERS=USERS;
}

    @Override
    public void withdraw(double amount) {
        if(USERS.equals("admin")){
            r.withdraw( amount);
        }
        else{
            System.out.println("access denied");
        }
    }
}
