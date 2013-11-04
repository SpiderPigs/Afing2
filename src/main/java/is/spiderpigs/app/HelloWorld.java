package is.spiderpigs.app;

import static spark.Spark.*;
import spark.*;

/**
 * Hello world!
 *
 */
public class HelloWorld {

   public static void main(String[] args) {
      
      get(new Route("/hello") {
         @Override
         public Object handle(Request request, Response response) {
            return "Hello World!";
         }
      });

   }

}

