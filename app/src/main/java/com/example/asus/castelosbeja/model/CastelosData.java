package com.example.asus.castelosbeja.model;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Asus on 01/02/2018.
 */

public class CastelosData {
    private  static final String fakeResponse = "[\n" +
            "   {\n" +
            "       \"Nome\":\"Castelo de Beja\",\n" +
            "       \"Detalhes\":\"Escolher um Hotel não se resume à simples escolha de um quarto para dormir. A experiência de ficar, e viver o ambiente que o rodeia, vai muito além das quatro paredes. Logo, da excelência do serviço, à atenção dedicada a cada pormenor, o Hotel Dom Vasco eleva cada estadia a uma experiência única. Acima de tudo, partilhe este modo de estar.\",\n" +
            "       \"Contacto\":\"269 630 960\",\n" +
            "       \"Location\":\"37.957798, -8.8753941\",\n" +
            "       \"Image\":\"http://www.cm-beja.pt/docs/ImagensDC/Turismo/conhecer_beja/castelo/CastelodeBeja.jpg\"\n" +
            "   },\n" +
            "   {\n" +
            "       \"Nome\":\"Castelo de Serpa\",\n" +
            "       \"Detalhes\":\"Este alojamento fica a 5 minutos a pé da praia. Localizado no centro de Sines, o Hotel Apartamento Sinerama dispõe de quartos e apartamentos auto-suficientes, alguns com vistas panorâmicas para o mar. O pequeno-almoço gratuito inclui sumos de frutas, ovos, bolo, pão e queijo.\",\n" +
            "       \"Contacto\":\"269 000 100\",\n" +
            "       \"Location\":\"37.956041, -8.869475\",\n" +
            "       \"Image\":\"https://media-cdn.tripadvisor.com/media/photo-s/08/c2/5d/0d/castelo-de-serpa.jpg\"\n" +
            "   },\n" +
            "   {\n" +
            "       \"Nome\":\"Castelo de Moura\",\n" +
            "       \"Detalhes\":\"O Hotel Veleiro beneficia de uma localização privilegiada com vista para a Baía de Sines. Disponibiliza quartos com 1 cama de casal ou com 2 camas individuais, uma casa de banho privada e acesso Wi-Fi gratuito em todas as áreas. A Praia Vasco da Gama encontra-se a uma caminhada de 2 minutos.\",\n" +
            "       \"Contacto\":\"269 634 751\",\n" +
            "       \"Location\":\"37.9547622, -8.8683794\",\n" +
            "       \"Image\":\"http://www.roteirodoalqueva.com/_/rsrc/1470264949226/patrimonio/castelo-de-moura/CasteloMoura.jpg\"\n" +
            "   }\n" +
            "]";

    private static List<Castelo> castelos;

    public static List<Castelo> getCastelos(){
        if (castelos == null){
            castelos = new ArrayList<>();

            try {
                JSONArray fakeJSONArray = new JSONArray(fakeResponse);
                for (int i = 0; i < fakeJSONArray.length(); i++) {
                    JSONObject jsonObject = fakeJSONArray.getJSONObject(i);

                    String name = jsonObject.optString("Nome");
                    String details = jsonObject.optString("Detalhes");
                    String contact = jsonObject.optString("Contacto");
                    String location = jsonObject.optString("Location");
                    String image = jsonObject.optString("Image");

                    Castelo castelo = new Castelo(name, details, contact, location, image);

                    castelos.add(castelo);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return castelos;
    }

    public static void setCastelos(List<Castelo> castelos) {castelos = castelos; }
}
