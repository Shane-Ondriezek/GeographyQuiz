
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

public class ListManager {

    public static LinkedList<String[]> makelist(){
        LinkedList<String[]> list = new LinkedList<>();
        Collections.addAll(list, stateCapitals);
        return list;
    }
    private static String[][] stateCapitals = {
        {"Alabama", "Montgomery"},
        {"Alaska", "Juneau"},
        {"Arizona", "Phoenix"},
        {"Arkansas", "Little Rock"},
        {"California", "Sacramento"},
        {"Colorado", "Denver"},
        {"Connecticut", "Hartford"},
        {"Delaware", "Dover"},
        {"Florida", "Tallahassee"},
        {"Georgia", "Atlanta"},
        {"Hawaii", "Honolulu"},
        {"Idaho", "Boise"},
        {"Illinois", "Springfield"},
        {"Maryland", "Annapolis"},
        {"Minnesota", "Saint Paul"},
        {"Iowa", "Des Moines"},
        {"Maine", "Augusta"},
        {"Kentucky", "Frankfort"},
        {"Indiana", "Indianapolis"},
        {"Kansas", "Topeka"},
        {"Louisiana", "Baton Rouge"},
        {"Oregon", "Salem"},
        {"Oklahoma", "Oklahoma City"},
        {"Ohio", "Columbus"},
        {"North Dakota", "Bismark"},
        {"New York", "Albany"},
        {"New Mexico", "Santa Fe"},
        {"New Jersey", "Trenton"},
        {"New Hampshire", "Concord"},
        {"Nevada", "Carson City"},
        {"Nebraska", "Lincoln"},
        {"Montana", "Helena"},
        {"North Carolina", "Raleigh"},
        {"Missouri", "Jefferson City"},
        {"Mississippi", "Jackson"},
        {"Massachusetts", "Boston"},
        {"Michigan", "Lansing"},
        {"Pennsylvania", "Harrisburg"},
        {"Rhode Island", "Providence"},
        {"South Carolina", "Columbia"},
        {"South Dakota", "Pierre"},
        {"Tennessee", "Nashville"},
        {"Texas", "Austin"},
        {"Utah", "Salt Lake City"},
        {"Vermont", "Montpelier"},
        {"Virginia", "Richmond"},
        {"Washington", "Olympia"},
        {"West Virginia", "Charleston"},
        {"Wisconsin", "Madison"},
        {"Wyoming", "Cheyenne"}
    };
    
    public static void loadCoordsMap(HashMap<String, String> map) {
        map.put("Washington", "157,125");
        map.put("Orgeon", "122,179");
        map.put("Idaho", "254,236");
        map.put("Montana", "353,184");
        map.put("California", "93,337");
        map.put("Nevada", "147,330");
        map.put("Wyoming", "472,334");
        map.put("Utah", "325,331");
        map.put("Arizona", "280,511");
        map.put("Colorado", "464,377");
        map.put("New Mexico", "435,477");
        map.put("Alaska", "489,804");
        map.put("North Dakota", "578,205");
        map.put("South Dakota", "578,271");
        map.put("Nebraska", "657,353");
        map.put("Kansas", "671,402");
        map.put("Oklahoma", "635,494");
        map.put("Texas", "625,622");
        map.put("Minnesota", "725,254");
        map.put("Iowa", "731,337");
        map.put("Missouri", "759,413");
        map.put("Arkansas", "760,508");
        map.put("Louisiana", "795,622");
        map.put("Wisconsin", "809,296");
        map.put("Illinois", "815,384");
        map.put("Mississippi", "808,566");
        map.put("Michigan", "913,299");
        map.put("Indiana", "888,376");
        map.put("Kentucky", "921,411");
        map.put("Tennessee", "885,464");
        map.put("Alabama", "906,559");
        map.put("Florida", "965,603");
        map.put("Georgia", "950,523");
        map.put("South Carolina", "1025,502");
        map.put("North Carolina", "1087,450");
        map.put("Virginia", "1096,407");
        map.put("West Virginia", "994,400");
        map.put("Ohio", "959,361");
        map.put("Maryland", "1100,366");
        map.put("Delaware", "1126,359");
        map.put("New Jersey", "1139,329");
        map.put("Pennsylvania", "1092,334");
        map.put("New York", "1135,268");
        map.put("Connecticut", "1169,282");
        map.put("Rhode Island", "1192,273");
        map.put("Massachusetts", "1198,258");
        map.put("New Hampshire", "1179,241");
        map.put("Vermont", "1151,215");
        map.put("Maine", "1209,205");
        map.put("Hawaii", "854,766");
    }
}
