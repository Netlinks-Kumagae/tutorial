package com.example;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Country> countries = new ArrayList<>();

        countries.add(new Country("アルジェリア", 213));
        countries.add(new Country("アルゼンチン", 54));
        countries.add(new Country("アメリカ", 1));
        countries.add(new Country("イラク", 964));
        countries.add(new Country("イラン", 98));
        countries.add(new Country("イングランド", 44));
        countries.add(new Country("ウルグアイ", 598));
        countries.add(new Country("ウズベキスタン", 998));
        countries.add(new Country("エクアドル", 593));
        countries.add(new Country("エジプト", 20));
        countries.add(new Country("オーストラリア", 61));
        countries.add(new Country("オーストリア", 43));
        countries.add(new Country("オランダ", 31));
        countries.add(new Country("カナダ", 1));
        countries.add(new Country("カーボベルデ", 238));
        countries.add(new Country("カタール", 974));
        countries.add(new Country("ガーナ", 233));
        countries.add(new Country("キュラソー", 599));
        countries.add(new Country("クロアチア", 385));
        countries.add(new Country("コートジボワール", 225));
        countries.add(new Country("コロンビア", 57));
        countries.add(new Country("コンゴ民主共和国", 243));
        countries.add(new Country("サウジアラビア", 966));
        countries.add(new Country("スイス", 41));
        countries.add(new Country("スウェーデン", 46));
        countries.add(new Country("スコットランド", 44));
        countries.add(new Country("スペイン", 34));
        countries.add(new Country("セネガル", 221));
        countries.add(new Country("チェコ", 420));
        countries.add(new Country("チュニジア", 216));
        countries.add(new Country("ドイツ", 49));
        countries.add(new Country("トルコ", 90));
        countries.add(new Country("ニュージーランド", 64));
        countries.add(new Country("ノルウェー", 47));
        countries.add(new Country("ハイチ", 509));
        countries.add(new Country("パナマ", 507));
        countries.add(new Country("パラグアイ", 595));
        countries.add(new Country("ブラジル", 55));
        countries.add(new Country("フランス", 33));
        countries.add(new Country("ベルギー", 32));
        countries.add(new Country("ボスニア・ヘルツェゴビナ", 387));
        countries.add(new Country("ポルトガル", 351));
        countries.add(new Country("メキシコ", 52));
        countries.add(new Country("モロッコ", 212));
        countries.add(new Country("ヨルダン", 962));
        countries.add(new Country("南アフリカ", 27));
        countries.add(new Country("韓国", 82));
        countries.add(new Country("日本", 81));

        System.out.println("2026 FIFAワールドカップ グループステージ出場国一覧");
        System.out.println("出場国数: " + countries.size() + " か国");
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < countries.size(); i++) {
            Country c = countries.get(i);
            System.out.println((i + 1) + ". [+" + c.getCountryCode() + "] " + c.getName());
        }
    }
}
