import service.ServiceImpl;

/**
 * MainApp class
 */
public class MainApp {
    /**
     * Main Method
     * @param args
     */
    public static void main(String args[]){
        ServiceImpl serviceObj = new ServiceImpl(5000L);
        System.out.println("Calling methods in ServiceImpl Class");
        // Calling methods in ServiceImpl Class.
    }
}
