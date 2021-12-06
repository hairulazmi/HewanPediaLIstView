package simple.example.hewanpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.hewanpedia.model.Merpati;
import simple.example.hewanpedia.model.Hewan;
import simple.example.hewanpedia.model.Sapi;
import simple.example.hewanpedia.model.Turtle;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Sapi> initDataSapi(Context ctx) {
        List<Sapi> sapis = new ArrayList<>();
        sapis.add(new Sapi("Angus", "Skotlandia",
                "Ciri khas sapi ini berkulit hitam pekat sehingga namanya mudah diingat dengan sebutan sapi Angus karena dalam bahasa Indonesia Angus=hangus, gosong.", R.drawable.sapi_angus));
        sapis.add(new Sapi("Holstein","Eropa",
                "Sapi holstein atau frisia merupakan salah satu trah sapi perah yang sekarang dikenal sebagai sapi yang terbanyak memproduksi susu di peternakan susu.",R.drawable.sapi_holstein));
        sapis.add(new Sapi("Hereford","Inggris",
                "Sapi Hereford merupakan salah satu jenis sapi potong yang berasal dari daerah dengan iklim subtropis.",R.drawable.sapi_hereford));
        sapis.add(new Sapi("Simmental","Swiss",
                "Simmental memiliki warna bulu kemerahan dengan corak warna putih, dan diternakkan untuk diambil susu dan dagingnya.",R.drawable.sapi_simmental));
        sapis.add(new Sapi("Limousin","Prancis",
                "Sapi limousin merupakan tipe sapi potong dengan perototan yang lebih baik dari Sapi Simmental.",R.drawable.sapi_limousin));
        sapis.add(new Sapi("Galloway","Skotlandia",
                "Galloway adalah salah satu breed sapi potong terpanjang di dunia, dinamai sesuai dengan wilayah Galloway di Skotlandia, tempat asalnya, pada abad ke-17.",R.drawable.sapi_galloway));
        return sapis;
    }

    private static List<Merpati> initDataMerpati(Context ctx) {
        List<Merpati> merpatis = new ArrayList<>();
        merpatis.add(new Merpati("Modena", "Italia",
                "Mempunyai bentuk tubuh yang gemuk dan bulat. Selain itu ekornya berukuran pendek yakni sekitar 25 cm.", R.drawable.merpati_modena));
        merpatis.add(new Merpati("Jacobin","India",
                "Ciri yang paling menonjol dari jenis ini adalah bulu yang berada di sekitar kepala sampai leher berbentuk seperti mantel (Jacob).", R.drawable.merpati_jacobin));
        merpatis.add(new Merpati("Brongsong","Indonesia",
                "Ciri-cirinya tubuh yang berukuran besar, jambul yang lebar dan menyebar pada bagian kepala sampai pipi, sedang bagian kakinya tidak memiliki bulu.", R.drawable.merpati_brongsong));
        merpatis.add(new Merpati("Wulung","Indonesia",
                "Disebut dengan wulung karena merpati ini mempunyai motif warna yang persis dengan burung elang wulung/elang bondol.", R.drawable.merpati_wulung));
        merpatis.add(new Merpati("Satinette Oriental Frill","Turki",
                "Ciri yang paling menonjol dari jenis ini yaitu bulu terbalik dari leher sampai dada, dan juga terdapat jambul di bagian kepalanya.", R.drawable.merpati_satinette));
        return merpatis;
    }

    private static List<Turtle> initDataTutle(Context ctx) {
        List<Turtle> turtles = new ArrayList<>();
        turtles.add(new Turtle("Red Ear Slider", "Brazil",
                "Sesuai dengan namanya, ciri khasnya adalah warna merah pada telinganya.", R.drawable.turtle_redearslider));
        turtles.add(new Turtle("Leopard", "Afrika",
                "Daya tarik kura-kura ini terdapat pada corak di batoknya yang seperti corat pada kulit macan tutul.", R.drawable.turtle_leopard));
        turtles.add(new Turtle("Spurred", "Afrika",
                "Kura-kura ini sangat diminati banyak orang ketika ukurannya masih kecil. Ketika dewasa, panjang spurred tortoise bisa mencapai 60-90 cm", R.drawable.turtle_spurred));
        turtles.add(new Turtle("Radiated", "Madagaskar",
                "Kura-kura ini memiliki corak yang sangat mencolok, dan kura-kura ini masuk ke dalam golongan kura-kura yang terancam punah.", R.drawable.turtle_radiated));
        turtles.add(new Turtle("Sulcata", "Afrika",
                "kura-kura ini berwarna kekuningan yang tinggal di iklim gurun dan dapat beradaptasi dengan iklim tropis", R.drawable.turtle_sulcata));
        turtles.add(new Turtle("Aldabra", "Seychelles",
                "ciri khas kura-kura ini warna gelap, corak tidak mencolok, leher yang bisa memanjang dan bisa tumbuh hingga panjang 1,2 meter", R.drawable.turtle_aldabra));
        return turtles;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataSapi(ctx));
        hewans.addAll(initDataMerpati(ctx));
        hewans.addAll(initDataTutle(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}
