import java.util.HashMap;
import java.util.Random;

public class JustPrix implements IPrix{
    private final Random r = new Random();

    private int essaie = 0;
    private final int ramdon = r.nextInt(1,3)+ 1;
    private HashMap<Integer,Objet> donne = new HashMap<>();

    public JustPrix(){
        this.donne.put(1,new Objet(49.99f,"https://m.media-amazon.com/images/I/61kPun+OZFL._CR0,204,1224,1224_UX175.jpg","https://www.amazon.fr/dp/B0813WWWDT/ref=sspa_dk_detail_0?pd_rd_i=B0813WWWDT&pd_rd_w=rZbey&content-id=amzn1.sym.d9b1a9d1-cd4a-47bf-8586-2b11bbbee16b&pf_rd_p=d9b1a9d1-cd4a-47bf-8586-2b11bbbee16b&pf_rd_r=R0Y5DAV4S2ZK5GB8CAGH&pd_rd_wg=imU9C&pd_rd_r=e6660ba5-fd4c-4c38-b73c-f3ee429032ee&s=kitchen&sp_csd=d2lkZ2V0TmFtZT1zcF9kZXRhaWwy&spLa=ZW5jcnlwdGVkUXVhbGlmaWVyPUExQ1JHRlZXNTlDQkNBJmVuY3J5cHRlZElkPUEwNjA3ODczMjRSWEZVTlFYUkcySiZlbmNyeXB0ZWRBZElkPUEwODAxODE5WUZGT0gyUlVJSVNIJndpZGdldE5hbWU9c3BfZGV0YWlsMiZhY3Rpb249Y2xpY2tSZWRpcmVjdCZkb05vdExvZ0NsaWNrPXRydWU&th=1"));
        this.donne.put(2,new Objet(21.97f,"https://m.media-amazon.com/images/I/815M3efYPCL._CR0,204,1224,1224_UX175.jpg","https://www.amazon.fr/Portefeuille-V%C3%A9ritable-Porte-Monnaie-Compartiment-Classique/dp/B083N1NCHS/?_encoding=UTF8&pd_rd_w=NfWG0&content-id=amzn1.sym.3f18360a-f15a-426f-acc4-bbb390de39b3&pf_rd_p=3f18360a-f15a-426f-acc4-bbb390de39b3&pf_rd_r=PDDZYGTSQXCAWVGZEAWY&pd_rd_wg=VNYzL&pd_rd_r=29b92e5c-44e6-48dc-bdef-cda362ebabe8&ref_=pd_gw_bmx_gp"));
        this.donne.put(3,new Objet(22.99f,"https://m.media-amazon.com/images/I/61n07ZPzBnL._AC_SS450_.jpg","https://www.amazon.fr/PROMiXX-Original-Shaker-Bouteille-prot%C3%A9in%C3%A9es/dp/B09LDFB2F5/?_encoding=UTF8&pd_rd_w=NfWG0&content-id=amzn1.sym.3f18360a-f15a-426f-acc4-bbb390de39b3&pf_rd_p=3f18360a-f15a-426f-acc4-bbb390de39b3&pf_rd_r=PDDZYGTSQXCAWVGZEAWY&pd_rd_wg=VNYzL&pd_rd_r=29b92e5c-44e6-48dc-bdef-cda362ebabe8&ref_=pd_gw_bmx_gp&th=1"));
        System.out.println(ramdon);
    }

    public String comparatif(float prix){
        toTry();
        if (prix < donne.get(ramdon).getPrix()){
            if (prix - donne.get(ramdon).getPrix() < 2){
                return "plus (vous êtes très proche)";
            }
            return "plus";
        }else if(prix > donne.get(ramdon).getPrix()){
            if (prix - donne.get(ramdon).getPrix() > 50){
                return "moins (vous êtes très proche)";
            }
            return "moins";
        }else if (prix == donne.get(ramdon).getPrix()){
            System.out.println("Bravo vous avez Gagner, Voici le liens de l'article : " + donne.get(ramdon).getArticle());
        }
        return "";
    }

    public void affiche(){
        System.out.println("Vous devez devinais en 5 essaies le prix de cet objet  : (mettez le lien dans votre navigateur) " + donne.get(ramdon).getPhoto());
    }

    public void toTry(){
        essaie++;
        if(essaie == 5){
            throw new RuntimeException("TROP D'ESSAIE , vous avez perdu");
        }
    }

}
