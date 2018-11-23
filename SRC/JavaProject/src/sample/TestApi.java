package sample;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javafx.scene.control.Alert;
import org.json.JSONObject;
public class TestApi {
    public static void main(String[] args) {
        String a="http://www.nbrb.by/API/ExRates/Rates/145";
        try {
            TestApi.call_me(a);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Нет подкл");
        }
    }
    // style guide посмотреть оформить.
    /**
     * Call class
     * @param(String URL) In this function, pass a link with the Id of each currency
     * @return curOfficialRate - current Official Rate.
     * This function makes an HTTP request to the website of the national Bank of Belarus and receives information about the currency, namely curOfficialRate - current Official Rate.
     * @throws Exception
     */
    public static double call_me(String url) throws Exception {
       // String url = "http://www.nbrb.by/API/ExRates/Rates/145";
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        // optional default is GET
        con.setRequestMethod("GET");
        //add request header
        con.setRequestProperty("User-Agent", "Yandex/5.0");
        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'GET' request to URL : " + url);
       // System.out.println("Response Code : " + responseCode);
        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        //print in String
        System.out.println(response.toString());
        //Read JSON response and print
         JSONObject myResponse = new JSONObject(response.toString());
       // System.out.println("result after Reading JSON Response");
        System.out.println("Cur_OfficialRate - "+myResponse.getDouble("Cur_OfficialRate"));
        double curOfficialRate = myResponse.getDouble("Cur_OfficialRate");
        System.out.println(curOfficialRate);
        return curOfficialRate;
    }
}