package Exception;

public class Main {
	
	 public class ServiceException extends Exception {

		    private String customMessage;

		    public ServiceException(String customMessage) {
		        super(customMessage);
		        this.customMessage = customMessage;

		    }
		}

	    public static void main(String[] args) {
	        try {
	            new Main().test();
	        } catch (Exception e) {
	            System.out.println("the exception message is " + e.getMessage());
	        }
	    }

	    public void test() throws ServiceException {
	        try {
	            int i = 1 / 0;
	        } catch (Exception e) {
	            throw new ServiceException(e.getMessage());
	        }
	    }

}
