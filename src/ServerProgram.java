import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class ServerProgram {
    public static void main(String[] args) {
        System.out.println("[Server started]");
        try {
            Naming.rebind("MathServer1", new MathServerClass());
            // rmi://127.0.0.1/MathServer1
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
