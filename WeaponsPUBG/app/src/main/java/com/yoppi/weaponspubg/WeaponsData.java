package com.yoppi.weaponspubg;

import java.util.ArrayList;

public class WeaponsData {
    public static String[][] data = new String[][]{

            {"Shotgun", "Shotgun menjadi salah satu senjata PUBG mobile yang harus kalian miliki. Dari 3 slot yang disediakan, setidaknya kalian memegang satu senjata bertipe shotgun karena senjata ini adalah senjata terbaik untuk jarak dekat.\n" +
                    "\n" +
                    "Sekali ditembakan, Shotgun bisa mengeluarkan sampai puluhan butir peluru yang menyebar. Namun, Shotgun kurang efektif jika digunakan untuk menembak sasaran dari jarak jauh."},
            {"Sniper Rifle", "Jika kalian bisa menemukan senjata Sniper Rifle di awal pertempuran, lebih baik kalian simpan karena Sniper Rifle adalah senjata terbaik dalam game PUBG mobile untuk urusan jarak dan kekuatan.\n" +
                    "\n" +
                    "Pemain dari platform PUBG Android maupun PUBG mobile iOS pasti selalu mengincar senjata Sniper Rifle karena akurasi dan damage yang sangat mematikan. Namun, kekurangan dari senjata PUBG mobile bertipe Sniper Rifle ini adalah slot peluru yang sedikit dan rendahnya kecepatan dalam menembak."},
            {"Asault Rifle", "Assault Rifle adalah senjata pada game PUBG mobile yang sangat efektif, karena menggabungkan kelebihan dari dua tipe senjata sekaligus yaitu Light Machine Gun karena memiliki kapasitas peluru yang cukup banyak dan DMR atau Sniper Rifle karena memiliki tingkat akurasi yang tinggi.\n" +
                    "\n" +
                    "Hal ini menjadikannya salah satu senjata PUBG Mobile terfavorit bagi para pemain game ini. Sangat mendukung di awal-awal pertempuran hingga akhir bila ditambahkan dengan attachments yang sesuai. "},
            {"Submachine Gun", "Senjata PUBG mobile yang satu ini sangat cocok dipakai untuk menembak musuh secara membabi buta dari jarak dekat dengan jumlah peluru yang banyak dan berukuran cukup besar. Walaupun tingkat akurasi yang rendah, jika ditembakan terus menerus pasti bisa bikin musuh kalang kabut."},
            {"DMR / Carbine", "Secara harfiah, DMR adalah singkatan dari Designated Marksman Rifle. Sedangkan secara fungsi, DMR adalah senjata yang menggabungkan kecanggihan Assault Rifle dan Sniper Rifle. Senjata ini memiliki damage sedikit lebih tinggi dari Assault Rifle namun jarak tembak tidak sejauh Sniper Rifle. Senjata PUBG mobile satu ini akan berfungsi dengan baik saat akhir-akhir pertempuran ketika safe zone telah mengecil.\n" +
                    "\n" +
                    "Carbine sendiri adalah senjata PUBG mobile yang lebih canggih karena menggabungkan kelebihan yang dimiliki dari senjata tipe Assault Rifle, Sniper Rifle, dan DMR. Kelebihan yang paling mencolok dari senjata tipe Carbine adalah ukurannya yang lebih kecil dan lebih ringan ketimbang Assault Rifle, Sniper Rifle, dan DMR. Sangat direkomendasikan untuk para pemain game PUBG mobile."},
            {"Light Machine Gun", "Light Machine Gun mengandalkan kecepatan menembak yang sangat cepat, bahkan lebih cepat dari tipe senjata Assault Rifle. Saking cepatnya, arah peluru yang ditembakan menjadi tidak karuan. Senjata PUBG mobile ini membutuhkan waktu yang cukup lama ketika mengisi peluru tapi terbayarkan dengan damage yang sakit jika mengenai musuh."},
            {"Pistol", "Senjata yang paling sering kita temukan namun juga sering diabaikan. Sejatinya, senjata ini sangat baik untuk dijadikan senjata sekunder karena memiliki damage yang sakit. Sangat berguna untuk menyerang musuh-musuh yang mendarat di dekat kalian saat awal-awal pertempuran.\n" +
                    "\n" +
                    "Dalam game PUBG mobile, senjata PUBG yang satu ini tidak akan berguna untuk jangka waktu lama karena keterbatasan jumlah peluru yang bisa dibawa."},
            {"Crossbow", "Hanya ada satu jenis Crossbow dalam daftar senjata PUBG mobile. Sangat efektif untuk kalian yang memainkan strategi bersembunyi, karena ketika ditembakan Crossbow tidak akan mengeluarkan suara sedikitpun.\n" +
                    "\n" +
                    "Berkat itu juga, senjata ini cocok untuk kalian yang tidak ingin menjadi pusat perhatian ketika safe zone telah mengecil. Cukup dengan 2 kali tembakan, musuh langsung meninggal di tempat."},
            {"Grenade / Trhowable", "Ini adalah senjata tambahan untuk kalian yang kesal dengan para pemain PUBG mobile yang doyan ngumpet. Senjata lempar dalam game PUBG mobile sering disalahgunakan kegunaanya namun malah efektif. Seperti merusak konsentrasi musuh atau mengelabui musuh agar tidak mengetahui posisi kita yang sebenarnya."},
            {"Melee", "Di dalam game PUBG mobile, panci adalah senjata jenis melee atau jarak dekat yang terkadang justru bisa menjadi senjata terpenting. Percayalah, akan menjadi sebuah kebanggan tersendiri bila membunuh musuh dengan hanya menggunakan panci.\n" +
                    "\n" +
                    "Tapi bukan cuma panci saja yang ada dalam daftar senjata melee yang harus kalian simpan untuk berjaga-jaga, karena kita sering mendapati musuh yang muncul dari arah yang tidak kita duga."}
    };

    public static int []gambar = new int[]
            {
                    R.drawable.s1897,
                    R.drawable.awm,
                    R.drawable.m416,
                    R.drawable.ump9,
                    R.drawable.mini14,
                    R.drawable.m249,
                    R.drawable.r1895,
                    R.drawable.crossbow,
                    R.drawable.fraggrenade,
                    R.drawable.pan

            };

    public static ArrayList<Weapon> getListData(){
        ArrayList<Weapon> list = new ArrayList<>();
        int i = 0;
        for (String[] aData : data){
            Weapon weapon = new Weapon();
            weapon.setName(aData[0]);
            weapon.setDescription(aData[1]);
            weapon.setPhoto(gambar[i]);

            i++;

            list.add(weapon);
        }
        return list;
    }
}
