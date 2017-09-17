package us.benfoster.amazon;

import us.benfoster.amazon.model.User;

import static spark.Spark.before;
import static spark.Spark.staticFileLocation;

/**
 * Created by ben_foster on 9/14/17.
 */
public class Application {

    //TODO add SessionFactory

    public static void main(String[] args) {
        System.out.println(new User("a","b"));

        staticFileLocation("/public");

        before((req, res) ->) {
            if(req.cookie())
        }
    }
}
