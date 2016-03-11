package com.slin.dictionary.data;

import java.util.HashMap;

public class DictionarySource extends HashMap<LanguageType, HashMap<String, String>> {
    public DictionarySource() {
        HashMap<String, String> chLang = new HashMap<>();
        HashMap<String, String> enLang = new HashMap<>();
        HashMap<String, String> frLang = new HashMap<>();
        this.put(LanguageType.CH, chLang);
        this.put(LanguageType.EN, enLang);
        this.put(LanguageType.FR, frLang);
        chLang.put("aa", "职员");
        chLang.put("aabq", "顺其自然");
        chLang.put("aafv", "负责");
        chLang.put("aafz", "负债");
        chLang.put("aagb", "贵宾");
        chLang.put("aagh", "供货");
        chLang.put("aags", "共识");
        chLang.put("aagz", "供职");
        chLang.put("aamj", "啧啧称奇");
        chLang.put("aamt", "愤愤不平");
        chLang.put("aaqv", "旗子");
        chLang.put("aash", "识货");
        chLang.put("aass", "赏识");
        chLang.put("aavs", "赞赏 ");
        chLang.put("aavu", "赞颂");
        chLang.put("aavz", "资质");
        chLang.put("aayu", "预赛");
        chLang.put("aayy", "演员");

        enLang.put("aa", "clerk");
        enLang.put("aabq", "Go with the flow");
        enLang.put("aafv", "be in charge of ; conscientious ; be responsible for");
        enLang.put("aafz", "be in debt ; incur debts ; libialities");
        enLang.put("aagb", "honored guest");
        enLang.put("aagh", "supply of products");
        enLang.put("aags", "common understanding");
        enLang.put("aagz", "hold office");
        enLang.put("aamj", "be surprised at sth outstanding and express one's thoughts");
        enLang.put("aamt", "be indignant ; feel aggrieved ; be resentful");
        enLang.put("aaqv", "flag ; banner");
        enLang.put("aash", "know all about the goods; be able to tell good from bad; know what' what");
        enLang.put("aass", "recognize the worth of ; appreciate");
        enLang.put("aavs", "appreciate ; admire");
        enLang.put("aavu", "extol ; eulogize ; sing the praises of");
        enLang.put("aavz", "natural endowments ; intelligence");
        enLang.put("aayu", "F. match préparatoire ; compétition préliminaire");
        enLang.put("aayy", "actor, play actor, player, stager, ");

        frLang.put("aa", "employé de bureau");
        frLang.put("aabq", "Aller avec le courant");
        frLang.put("aafv", "assumer ; avoir la responsabilité de ; être chargé de");
        frLang.put("aafz", "être endetté ; avoir des dettes ; contracter des dettes ; débit");
        frLang.put("aagb", "hôte distingué ; hôte de marque");
        frLang.put("aagh", "fourniture de marchandises");
        frLang.put("aags", "compréhension partagée");
        frLang.put("aagz", "remplir une fonction publique");
        frLang.put("aamj", "faire claquer sa langue de surprise et d'admiration");
        frLang.put("aamt", "indigné ; outré ; contrarié");
        frLang.put("aaqv", "drapeau, bannière ");
        frLang.put("aash", "s'y connaître ; être connaisseur");
        frLang.put("aass", "apprécier ; estimer à sa juste valeur ; priser");
        frLang.put("aavs", "louer ; admirer ; apprécier");
        frLang.put("aavu", "louer ; chanter les louanges de ");
        frLang.put("aavz", "dons naturels ; dispositions naturelles");
        frLang.put("aayu", "match préparatoire ; compétition préliminaire");
        frLang.put("aayy", "acteur ; comédien");
    }
}
