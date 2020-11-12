import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MathServerClass extends UnicastRemoteObject implements MathServer {

    public MathServerClass() throws RemoteException {
    }

    public double sum(double a, double b) throws RemoteException {
        return a + b;
    }

    public double subtract(double a, double b) throws RemoteException {
        return a - b;
    }

    public double multiply(double a, double b) throws RemoteException {
        return a * b;
    }

    public double divide(double a, double b) throws RemoteException {
        return a / b;
    }
}
