import org.joox.JOOX;
import org.joox.Match;
import org.xml.sax.SAXException;

import java.io.File;
import java.io.IOException;

import static org.joox.JOOX.$;

/**
 * Created by usta on 12.10.2014.
 */
public class oku {

    public static void main(String[] args) throws IOException, SAXException {
        String xml_dosya="deneme.xml";
        Match $game = $(new File(xml_dosya));

        System.out.println();
        // burası döngü  ile okumak için kullanılabilir
        System.out.println( $game.find("Oyun").find().text(0));
        //ilk değeri oku
        Match firstBook = $game.find("Oyun").first();
        //sondeger
        Match lastBook =  $game.find("Oyun").last();

        String ilkdeger = firstBook.find("OyunAdi").text();
        String sondeger = lastBook.find("Tur").text();

        System.out.format("OyunAdı: %s %n",ilkdeger);
        System.out.format("Tur: %s %n",sondeger);
    }
}