
import java.rmi.RemoteException;
import java.rmi.server.RemoteRef;
import java.rmi.server.UnicastRemoteObject;

public class CheckLogin  extends UnicastRemoteObject implements  LoginInterface
{
    public CheckLogin()throws RemoteException
    {
    }
public boolean check(String userId,String password)throws RemoteException
{
if(userId.equals("admin") && password.equals("nachiket"))    
    return true;
else
    return false;
}
}
