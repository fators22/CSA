package Weather;

import com.mongodb.client.*;
import org.bson.Document;

import java.util.*;

public class DB {

    static MongoClient mclient;
    static MongoDatabase database;
    static MongoCollection<Document> collection;
    static List<Document> alldata;
    public DB(){
        String connectionString="mongodb+srv://admin:admin123@cluster0.qu76zxs.mongodb.net/";
        mclient = MongoClients.create(connectionString);
        database=mclient.getDatabase("Weather");
        collection= database.getCollection("forecast");
        alldata= collection.find().into(new ArrayList<>());
    }
    public Document getRandom(){
        //return random element from an arraylist
        int index= (int)(Math.random()*alldata.size() ) ;
         return alldata.get(index);
    }

    public static void main(String[] args) {
        DB db = new DB();

       Document randomDocument= db.getRandom();
     // Extract values from the random document
        String city = randomDocument.getString("City");
        double highTemp = randomDocument.getDouble("High");
        double lowTemp = randomDocument.getDouble("Low");
        String condition = randomDocument.getString("Condition");
        String iconURL = randomDocument.getString("Icon");

        System.out.println(city );
        System.out.println(highTemp);
        System.out.println(lowTemp );
        System.out.println(condition);
        System.out.println(iconURL );




    }


}
