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
            "       \"Detalhes\":\"Numa combinação de estilos românico, gótico, manuelino e maneirista, o monumento apresenta planta no formato pentagonal. Sem talude, a muralha, coroada por merlões prismáticos, possui adarve envolvente, estando flanqueada originalmente por quarenta torres (entre as quais a de menagem), rasgada por sete portas e dois postigos, e circundada por barbacãs.\n" +
            "\n" + "A robusta Torre de Menagem, em estilo gótico, é considerada como um dos mais belos exemplos da arquitectura militar da Idade Média em Portugal. Elevando-se a quarenta metros de altura (a mais alta do país), é constituída por três pavimentos. A torre apresenta balcões angulares sobre matacães, unidos por varandins defendidos por ameias piramidais. É rasgada por portas ogivais e janelas geminadas, em arco de ferradura. As salas em seu interior, ricamente decoradas, apresentam tetos em abóbada em cruzaria de ogivas.\n" +
            "\n" + "A porta principal do castelo abre-se em arco ogival e acessa a praça de armas. Das primitivas portas restam ainda duas de origem românica: a Porta de Évora, contígua ao castelo; e o arco da Porta de Avis. A Porta de Moura é defendida por dois torreões.\n" +
            "\n" + "Horario: TODOS OS DIAS 09:00h - 12:30h 14:00h - 18:00h\",\n" +
            "       \"Contacto\":\"284311913\",\n" +
            "       \"Location\":\"38.0174, -7.8654667\",\n" +
            "       \"Image\":\"http://www.cm-beja.pt/docs/ImagensDC/Turismo/conhecer_beja/castelo/CastelodeBeja.jpg\"\n" +
            "   },\n" +
            "   {\n" +
            "       \"Nome\":\"Castelo de Serpa\",\n" +
            "       \"Detalhes\":\"O castelo ergue-se no centro histórico da povoação, a duzentos e trinta metros acima do nível do mar. No plano mais elevado, junto à muralha, a norte, implanta-se a alcáçova, de planta quadrangular.\n" +
            "\n" + "A cerca da vila apresenta planta ovalada, reforçada por cubelos e torres de planta quadrangular e semicircular, rematada por merlões prismáticos. Nela se rasgavam originalmente três portões monumentais (Porta de Moura, a nordeste, Porta de Beja, a noroeste e a Porta de Sevilha a sul, esta última hoje desaparecida) flanqueados por dois torreões cilíndricos chanfrados, estes com merlões de remate pentagonal. O pano oeste das muralhas é encimado por um aqueduto assente em arcada de vão redondo, unindo o Palácio dos Condes de Ficalho, do lado norte e uma gigantesca nora assente num poço, junto ao ângulo sudeste, construída no século XVII para abastecer o palácio. Em período posterior foram abertas a Porta da Corredoura e a Porta Nova.\n" +
            "\n" + "A muralha da alcáçova é reforçada pela Torre de Menagem, de planta quadrangular, adossada ao pano sul, de que resta a parte inferior; por um cubelo de planta semicircular pelo mesmo lado e por uma torre de planta retangular no ângulo sudeste, junto à qual é ainda visível uma parte da barbacã que a envolvia. Ali se encontra instalado o Museu Arqueológico de Serpa, expondo os testemunhos recuperados na região do Concelho, do Paleolítico, do Neolítico, da Idade dos Metais e da época romana.\n" +
            "\n" + "Na praça fronteira à Igreja Matriz de Santa Maria (antiga mesquita muçulmana) ergue-se a chamada Torre do Relógio, de planta quadrangular, onde se ergue a sineira, com coruchéus de remate cônico rodeados por merlões chanfrados. Vestígio da cerca da vila, foi transformada em relógio em 1440, constituindo-se na terceira torre relojoeira mais antiga do país.\n" +
            "\n" + "Inserido no pano das muralhas inscreve-se o Palácio dos Condes de Ficalho, em estilo maneirista, iniciado por D. Francisco de Melo, alcaide-mor de Serpa no final do século XVI e prosseguido por seus filhos, D. Pedro de Melo, governador da Capitania do Rio de Janeiro (1662-1666), e D. António Martim de Melo, bispo da Guarda.\n" +
            "\n" + "Horario: Aberto de Terça a Domingo 09:00h - 17:30h\",\n" +
            "       \"Contacto\":\"284540100\",\n" +
            "       \"Location\":\"37.9444873, -7.597635\",\n" +
            "       \"Image\":\"https://media-cdn.tripadvisor.com/media/photo-s/08/c2/5d/0d/castelo-de-serpa.jpg\"\n" +
            "   },\n" +
            "   {\n" +
            "       \"Nome\":\"Castelo de Moura\",\n" +
            "       \"Detalhes\":\"Sobre uma elevação calcário, na cota de 184 metros acima do nível do mar, o castelo compõe-se por alcáçova e barbacã de planta ovalada, com as dimensões máximas de 200 x 100 metros. Em seu interior localizam-se as ruínas do Convento de Freiras Dominicanas de Nossa Senhora da Assunção (abandonado desde 1875) e da igreja anexa, erguidos a partir de 1562 no local da primitiva Igreja Matriz, junto à entrada da alcáçova, para onde se volta a fachada da igreja. Esta é de planta rectangular e nave única, nela se destacando o túmulo, em estilo manuelino, de Pedro e Álvaro Rodrigues, supostos conquistadores de Moura aos muçulmanos em 1166, e protagonistas da lenda de fundação da vila.\n" +
            "\n" + "A alcáçova é acessada por uma porta em cotovelo, a Sudeste. O conjunto é dominado pela torre de menagem, dionisina, de planta quadrada. Ladeando-a, identificamos a base maciça de outra torre, menor, e ainda um cubelo circular, na junção com a muralha exterior. Tanto a torre de menagem, quanto o cubelo apresentam merlões prismáticos piramidais. Em alguns trechos da muralha ainda subsiste o adarve. A cerca externa é reforçada por torres de planta quadrangular e circular. No século XIX uma das torres foi adaptada a Torre do Relógio.\n" +
            "\n" + "A torre de menagem, em estilo gótico, maciça na parte inferior, tem no segundo pavimento uma sala de planta octogonal (Sala dos Alcaides) coberta por abóbada em cruzaria de ogivas, assente em oito colunas de fuste delgado.\n" +
            "\n" + "A linha abaluartada do século XVII apresenta planta no formato estrelado, com muro rampante (em alambor), originalmente cercado por fosso, hoje quase que totalmente encoberto.\n" +
            "\n" + "Horário\n" +
            "\n" + "Inverno\n" +
            "\n" + "Outubro a Maio\n" +
            "\n" + "09:00h - 12:30h 14:00h - 17:30h\n" +
            "\n" + "Verão\n" +
            "\n" + "Junho a Setembro\n" +
            "\n" + "Segunda a Sexta - 09:00h - 18:00h\n" +
            "\n" + "Fins de Semana e Feriados - 10:00h - 13:00h 14:00h - 18:00h\",\n" +
            "       \"Contacto\":\"285250400\",\n" +
            "       \"Location\":\"38.1435875, -7.4513362\",\n" +
            "       \"Image\":\"http://www.roteirodoalqueva.com/_/rsrc/1470264949226/patrimonio/castelo-de-moura/CasteloMoura.jpg\"\n" +
            "   },\n" +
            "   {\n" +
            "       \"Nome\":\"Castelo de Mértola\",\n" +
            "       \"Detalhes\":\"Do perímetro defensivo medieval, com uma área de aproximadamente 2.000 m², nos estilos românico e gótico, subsistem:\n" +
            "\n" + "trechos das muralhas exteriores que circundavam a vila, alongando-se até ao rio, reforçadas por cubelos (perímetro externo);\n" +
            "\n" + "o castelo (perímetro interno), com duas torres, destacando-se a de menagem.\n" +
            "\n" + "Um torreão semi-cilindríco defende e integra o conjunto do portal de entrada do castelo. Através dele, ultrapassando-se um arco, obtém-se acesso a um corredor em cotovelo que comunica com a praça de armas. Ao centro desta, abre-se a cisterna, coberta por abóbada de berço.\n" +
            "\n" + "A torre de menagem, de planta quadrangular, apresenta embasamento maciço e ergue-se a cerca de trinta metros de altura, coroada por ameias. O acesso ao seu interior é feito por uma porta em arco ogival, para uma ampla e alta sala, coberta por abóbada em cruzaria ogival. Atualmente,\n" +
            "\n" + "nesta sala conserva-se um valioso espólio de pedras lavradas das épocas romana, visigótica, islâmica e portuguesa até ao século XVIII.\n"+
            "\n" + "Horário: Aberto de Terça a Domingo 09:15h - 17:15h\",\n" +
            "       \"Contacto\":\"286610100\",\n" +
            "       \"Location\":\"37.6379625, -7.6646792\",\n" +
            "       \"Image\":\"http://www.patrimoniocultural.gov.pt/static/data/cache/13/6f/136fc40cda84220079430c2754756b79.jpg\"\n" +
            "   },\n" +
            "   {\n" +
            "       \"Nome\":\"Castelo De Noudar\",\n" +
            "       \"Detalhes\":\"O castelo apresenta uma planta hexagonal, de eixo longitudinal noroeste-sudeste, onde se definem dois espaços: o da alcáçova e o da cerca da vila.\n" +
            "\n" + "O primeiro é dominado pela torre de menagem, de planta quadrangular, com cerca de 18 metros de altura, coroada por ameias, defendendo a entrada do recinto. Possui duas portas de acesso a pavimentos distintos e,\n" +
            "\n" + "em seu interior, no segundo pavimento acessível através de uma escadaria de pedra, abre-se uma cisterna. De acordo com a iconografia de Duarte de Armas (c. 1509), o seu interior era abobadado e provido de mais um aposento superior.\n" +
            "\n" +"Ainda na Alcáçova, junto à torre de menagem, uma segunda cisterna, esta quatrocentista, apresenta arcos sustentando a abóbada.\n" +
            "\n" + "A cerca amuralhada é reforçada por uma dezena de torres e cubelos adossados, o principal dos quais protegendo a Porta da Vila. Em seu interior destacam-se a Igreja da Nossa Senhora do Desterro, reconstruída na década de 1980 e a Casa do Governador.\n" +
            "\n" + "Lembrando antigas técnicas construtivas levantam-se, circundando o castelo, uma série de construções, de planta circular, muros em aparelho de pedra solta e cobertura de falsa cúpula, ligadas à pastorícia.\n" +
            "\n" + "Horário: Aberto de Terça a Domingo 10:00h - 18:00h\",\n" +
            "       \"Contacto\":\"285950630\",\n" +
            "       \"Location\":\"38.1782119, -7.063117\",\n" +
            "       \"Image\":\"http://estaticos.guiadacidade.pt/bpt/destup/large/4f5fe256b26d6dsc01793jpg.jpg\"\n" +
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

    public static void setCastelos(List<Castelo> castelos) {CastelosData.castelos = castelos; }
}
