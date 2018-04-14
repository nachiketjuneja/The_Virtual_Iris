
import java.rmi.Remote;
import java.rmi.RemoteException;


public interface LoginInterface  extends  Remote
{
            boolean check(String userId,String password)throws RemoteException;

  }
