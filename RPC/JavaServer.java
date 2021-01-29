import org.apache.xmlrpc.*;

public class JavaServer { 

   public Integer suma(int x, int y){
      return new Integer(x+y);
   }

   public static void main (String [] args){
   
      try {

         System.out.println("Attempting to start XML-RPC Server...");
         
         WebServer server = new WebServer(8866);
         server.addHandler("calcular", new JavaServer());
         server.start();
         
         System.out.println("Started successfully.");
         System.out.println("Accepting requests. (Halt program to stop.)");
         
      } catch (Exception exception){
         System.err.println("JavaServer: " + exception);
      }
   }
}