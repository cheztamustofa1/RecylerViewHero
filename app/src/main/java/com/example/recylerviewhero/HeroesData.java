package com.example.recylerviewhero;

import com.example.recylerviewhero.Hero;

import java.util.ArrayList;

public class HeroesData {
    public static String[][] data = new String[][]{
            {"Cristiano Ronaldo", "Pemain sepakbola terkaya pertama diduduki oleh pemain asal Portugal yang sekarang bermain untuk Real Madrid, yaitu Cristiano Ronaldo. Dia merupakan pemain termahal dunia, pada tahun 2015 hingga kini dengan total income pendapatan yang mencacapi Rp 4,8 triliun.", "https://specials-images.forbesimg.com/imageserve/5cfe985e4c687b0008593a14/416x416.jpg?background=000000&cropX1=474&cropX2=1931&cropY1=166&cropY2=1622"},
            {"Lionel Messi", "Posisi kedua diduduki oleh pemain asal Barcelona yang juga menjadi pesaing terberat Cristiano Ronaldo, yaitu Lionel Messi. Pemain cetusan akademi Barcelona ini punya pendapatan USD 217,1 juta atau berkisar Rp 3,86 triliun. Rival CR7 ini sedang dalam puncak kariernya di Barcelona.", "http://poskotanews.com/cms/wp-content/uploads/2019/06/lionel-messi-reuters.jpg"},
            {"Neymar Jr", "Pemain sepakbola yang menduduki peringkat ketiga ada pemain yang berasal dari brasil dan sekarang sedang berkarier di Paris Saint Germain. Neymar masuk dalam nominasi nomor 3 besar  pemain terkaya ditahun 2017. Total income pedapatannya mencapai USD 146,54 juta atau berkisat Rp 2,25 triliun.", "https://img.bleacherreport.net/img/images/photos/003/769/883/hi-res-b12f08482b83ecc478d0e9708320a6d3_crop_north.jpg?h=533&w=800&q=70&crop_x=center&crop_y=top"},
            {"Zlatan Ibrahimovic", "Dilansir Guardian, ibra mendapatkan gaji dari Manchester United sebesar 220 Pounds setara Rp 4,8 miliar per pekan. Nilai ini bukan masalah bagu MU. Sebab, stiker 34 tahun ini didatangkan dari PSG tanpa bianya transfer sepersenpun alias gratis.", "https://gmsrp.cachefly.net/images/18/03/25/437f8ca402c695708a7d191689d5ffc4/960.jpg"},
            {"Wayne Rooney", "Posisi kelima pemain bola tekanya di pegang oleh Wayne Rooney. tetapi, pesona Rooney masih tetap menjadi sosok yang vital dalam Liga Primer Inggris. Bukan hanya penghasilan di sepakbola saja, namun dia juga menjadi bintang dalam mempromosikan sponsor shirt internasional Chevrolet. Hebatnya lagi, sang bintang ini mempunyai kegiatan lain bersama sejumlah organisasi di Inggris. Total income pendapatan Rooney berkisat Rp 1,57 triliun.", "http://cdn2.tstatic.net/tribunnews/foto/bank/images/wayne-rooney_20180628_233038.jpg"},
            {"Carlos Tevez", "Kepindahan Striker Argentina Carlos Tevez ke Shanghai Senhua membuatnya jadi pemain bergaji paling tinggi di dunia. Kedatangan Carlos Tevez menyusul nama-nama beken seperti Oscar, Ramires, Hulk, dan Graziani Pelle. Di Senhua, dia dilatih  oleh eks-manajer Real Betis Gus Peyet. Seperti dilansir Daily Mail, pemain 35 tahun ini bakal digaji 615 pounds atau Ro 10 miliar per pekan.", "https://s.hs-data.com/bilder/spieler/gross/17450.jpg"},
            {"Oscar", "Seperti dikutip dari Marca, Oscar kini menjadi pesepakbola dengan gaji terbesar di bawah Teves. Gelandang 25 tahun itu mendaptkan gaji 24 juta euro atau setara Rp 337 miliar per tahun dari Shangao SIPG.”, “https://gmsrp.cachefly.net/images/18/05/09/3a042c9feda52fd1ab6f542bdd13806d/960.jpg",
            {"Hulk", "Seperti dilansir The Guardian, penyerang berusia 30 tahun ini di klaim akan mendapatkan gaji sebesar 320 ribu pounds per pekan dari Shanghai. atau sekitar 16, 6 juta puonds per tahun.",  "https://i.ytimg.com/vi/r1m64pZqQZw/maxresdefault.jpg",
            {"Paul Pogba", "Kesepakatan harga Pogba sudah tercapai di angka 110 juta euro untuk Juventus, dengan komisi agen dibayarkan oleh Manchester United. Durasi kontrak di Manchester United akan berlangsung selama lima tahun.selain itu gelandang 23 tahun tersebut juga menerima gaji 1 juta euro pertahun atau setara dengan Rp 189 miliar. Gaji yang diterima Pogba di Manchester United naik tiga kali lipat dari gaji yang diterima selam bermain di Juventus.”, https://i0.wp.com/metro.co.uk/wp-content/uploads/2019/06/GettyImages-1147097040.jpg?quality=90&strip=all&zoom=1&resize=644%2C429&ssl=1"},
            {"Gareth Bale", "Media Inggris melansir bahwa Bale dan Real madrid sepakat terkait perjanjian kerja yang baru. Kontrak tersebut akan membuat sang pemain bertahan di Santiago Bernabeu hingga 2022. Otomatis gaji Bale melonjak. Sumber serupa menyebutkan bahwa mantan idola Spurs ini akan mengantongi pendapatan sekitar Rp 6,1 miliar per pekan.", "https://en.as.com/futbol/imagenes/2019/06/15/primera/1560555078_880489_1560555285_noticia_normal.jpg",
    };
    public static ArrayList<Hero> getListData(){
        ArrayList<Hero> list = new ArrayList<>();
        for (String[] aData : data) {
            Hero hero = new Hero();
            hero.setName(aData[0]);
            hero.setFrom(aData[1]);
            hero.setPhoto(aData[2]);
            list.add(hero);
        }
        return list;
    }
}
