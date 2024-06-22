public class Main {

  public static void main(String[] args) {

    int num = 29;
    boolean flag = false;
    for (int i = 2; i <= num / 2; ++i) {
      // condition for nonprime number
      if (num % i == 0) {
        flag = true;
        break;
      }
    }

    if (!flag)
      System.out.println(num + " is a prime number.");
    else
      System.out.println(num + " is not a prime number.");
  }
}

public class Main {

  public static void main(String[] args) {

    int num = 29;
    boolean flag = false;
    for (int i = 2; i <= num / 2; ++i) {
      // condition for nonprime number
      if (num % i == 0) {
        flag = true;
        break;
      }
    }
=======
import oracle.search.admin.api.ws.client.AdminAPIRuntimeFault;
import oracle.search.admin.api.ws.client.AdminAPIRuntimeFault_Exception;
import oracle.search.admin.api.ws.client.AdminKeyPair;
import oracle.search.admin.api.ws.client.AdminPortType;
import oracle.search.admin.api.ws.client.AdminService;
import oracle.search.admin.api.ws.client.Credentials;
import oracle.search.admin.api.ws.client.ObjectKey;
import oracle.search.admin.api.ws.client.ObjectOutput;
 
import java.util.List;
import java.net.URL;
 
import javax.xml.ws.BindingProvider;
import javax.xml.namespace.QName;
 
public class CreateWebSource
{
  public static void main(String[] args) throws Exception
  {
    System.out.println( "" );
 
    try
    {
      if ( args == null || args.length != 4 )
      {
        System.out.println(
          "Usage:\n  CreateWebSource <webServiceURL> <userName> <password> <webSourceURL>"
        );
      }
      else
      {
        // Get web service URL from command-line arguments
        String webServiceURL = args[0];
        System.out.println( "Using web service URL \"" + webServiceURL + "\"\n" ); 
        
        // Get username and password
        String userName = args[1];
        String password = args[2];

