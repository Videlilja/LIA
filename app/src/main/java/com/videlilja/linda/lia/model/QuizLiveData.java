package com.videlilja.linda.lia.model;

import android.arch.lifecycle.LiveData;
import android.content.res.Resources;

import com.videlilja.linda.lia.R;

import java.util.ArrayList;
import java.util.List;

public class QuizLiveData extends LiveData<List<Quiz>> {

    public QuizLiveData(Categories category) {

        switch (category) {
            case ADDITION:
                ArrayList<Quiz> mathAdd = new ArrayList<>();
                mathAdd.add(new Quiz(R.string.co_af_algeria_dz, R.drawable.dz, Resources.getSystem().getString(R.string.math_question) + Resources.getSystem().getString(R.string.co_af_algeria_dz)));
                mathAdd.add(new Quiz(R.string.co_af_angola_ao, R.drawable.ao, Resources.getSystem().getString(R.string.math_question) + Resources.getSystem().getString(R.string.co_af_angola_ao)));
                mathAdd.add(new Quiz(R.string.co_af_benin_bj, R.drawable.bj, Resources.getSystem().getString(R.string.math_question) + Resources.getSystem().getString(R.string.co_af_benin_bj)));
                mathAdd.add(new Quiz(R.string.co_af_botswana_bw, R.drawable.bw, Resources.getSystem().getString(R.string.math_question) + Resources.getSystem().getString(R.string.co_af_botswana_bw)));
                mathAdd.add(new Quiz(R.string.co_af_burkina_faso_bf, R.drawable.bf, Resources.getSystem().getString(R.string.math_question) + Resources.getSystem().getString(R.string.co_af_burkina_faso_bf)));
                break;

            case SUBTRACTION:
                break;

            case MULTIPLICATION:
                break;

            case DIVISION:
                break;

            case BIRDS:
                break;

            case MAMMALS:
                ArrayList<Quiz> animalsMammals = new ArrayList<>();
                animalsMammals.add(new Quiz(R.string.an_ma_african_wild_dog, R.drawable.africanwilddog, Resources.getSystem().getString(R.string.animal_question) + Resources.getSystem().getString(R.string.an_ma_african_wild_dog)));
                animalsMammals.add(new Quiz(R.string.an_ma_armadillo, R.drawable.armadillo, Resources.getSystem().getString(R.string.animal_question) + Resources.getSystem().getString(R.string.an_ma_armadillo)));
                animalsMammals.add(new Quiz(R.string.an_ma_baboon, R.drawable.baboon, Resources.getSystem().getString(R.string.animal_question) + Resources.getSystem().getString(R.string.an_ma_baboon)));
                animalsMammals.add(new Quiz(R.string.an_ma_bear, R.drawable.bear, Resources.getSystem().getString(R.string.animal_question) + Resources.getSystem().getString(R.string.an_ma_bear)));
                animalsMammals.add(new Quiz(R.string.an_ma_bengal_tiger, R.drawable.bengaltiger, Resources.getSystem().getString(R.string.animal_question) + Resources.getSystem().getString(R.string.an_ma_bengal_tiger)));

                animalsMammals.add(new Quiz(R.string.an_ma_bighorn_sheep, R.drawable.bighornsheep, Resources.getSystem().getString(R.string.animal_question) + Resources.getSystem().getString(R.string.an_ma_bighorn_sheep)));
                animalsMammals.add(new Quiz(R.string.an_ma_bobcat, R.drawable.bobcat, Resources.getSystem().getString(R.string.animal_question) + Resources.getSystem().getString(R.string.an_ma_bobcat)));
                animalsMammals.add(new Quiz(R.string.an_ma_buffalo, R.drawable.buffalo, Resources.getSystem().getString(R.string.animal_question) + Resources.getSystem().getString(R.string.an_ma_buffalo)));
                animalsMammals.add(new Quiz(R.string.an_ma_camel, R.drawable.camel, Resources.getSystem().getString(R.string.animal_question) + Resources.getSystem().getString(R.string.an_ma_camel)));
                animalsMammals.add(new Quiz(R.string.an_ma_cheetah, R.drawable.cheeta, Resources.getSystem().getString(R.string.animal_question) + Resources.getSystem().getString(R.string.an_ma_cheetah)));

                animalsMammals.add(new Quiz(R.string.an_ma_chimpanzee, R.drawable.chimpanzee, Resources.getSystem().getString(R.string.animal_question) + Resources.getSystem().getString(R.string.an_ma_chimpanzee)));
                animalsMammals.add(new Quiz(R.string.an_ma_dolphin, R.drawable.dolphin, Resources.getSystem().getString(R.string.animal_question) + Resources.getSystem().getString(R.string.an_ma_dolphin)));
                animalsMammals.add(new Quiz(R.string.an_ma_donkey, R.drawable.donkey, Resources.getSystem().getString(R.string.animal_question) + Resources.getSystem().getString(R.string.an_ma_donkey)));
                animalsMammals.add(new Quiz(R.string.an_ma_elephant, R.drawable.elephant, Resources.getSystem().getString(R.string.animal_question) + Resources.getSystem().getString(R.string.an_ma_elephant)));
                animalsMammals.add(new Quiz(R.string.an_ma_ferret, R.drawable.ferret, Resources.getSystem().getString(R.string.animal_question) + Resources.getSystem().getString(R.string.an_ma_ferret)));

                animalsMammals.add(new Quiz(R.string.an_ma_fox, R.drawable.fox, Resources.getSystem().getString(R.string.animal_question) + Resources.getSystem().getString(R.string.an_ma_fox)));
                animalsMammals.add(new Quiz(R.string.an_ma_giraffe, R.drawable.giraffe, Resources.getSystem().getString(R.string.animal_question) + Resources.getSystem().getString(R.string.an_ma_giraffe)));
                animalsMammals.add(new Quiz(R.string.an_ma_guinea_pig, R.drawable.guineapig, Resources.getSystem().getString(R.string.animal_question) + Resources.getSystem().getString(R.string.an_ma_guinea_pig)));
                animalsMammals.add(new Quiz(R.string.an_ma_hippopotamus, R.drawable.hippopotamus, Resources.getSystem().getString(R.string.animal_question) + Resources.getSystem().getString(R.string.an_ma_hippopotamus)));
                animalsMammals.add(new Quiz(R.string.an_ma_koala, R.drawable.koala, Resources.getSystem().getString(R.string.animal_question) + Resources.getSystem().getString(R.string.an_ma_koala)));

                animalsMammals.add(new Quiz(R.string.an_ma_lemur, R.drawable.lemur, Resources.getSystem().getString(R.string.animal_question) + Resources.getSystem().getString(R.string.an_ma_lemur)));
                animalsMammals.add(new Quiz(R.string.an_ma_lion, R.drawable.lion, Resources.getSystem().getString(R.string.animal_question) + Resources.getSystem().getString(R.string.an_ma_lion)));
                animalsMammals.add(new Quiz(R.string.an_ma_moose, R.drawable.moose, Resources.getSystem().getString(R.string.animal_question) + Resources.getSystem().getString(R.string.an_ma_moose)));
                animalsMammals.add(new Quiz(R.string.an_ma_mouse, R.drawable.mouse, Resources.getSystem().getString(R.string.animal_question) + Resources.getSystem().getString(R.string.an_ma_mouse)));
                animalsMammals.add(new Quiz(R.string.an_ma_orca, R.drawable.orca, Resources.getSystem().getString(R.string.animal_question) + Resources.getSystem().getString(R.string.an_ma_orca)));

                animalsMammals.add(new Quiz(R.string.an_ma_panda, R.drawable.panda, Resources.getSystem().getString(R.string.animal_question) + Resources.getSystem().getString(R.string.an_ma_panda)));
                animalsMammals.add(new Quiz(R.string.an_ma_rabbit, R.drawable.rabbit, Resources.getSystem().getString(R.string.animal_question) + Resources.getSystem().getString(R.string.an_ma_rabbit)));
                animalsMammals.add(new Quiz(R.string.an_ma_raccoon, R.drawable.raccoon, Resources.getSystem().getString(R.string.animal_question) + Resources.getSystem().getString(R.string.an_ma_raccoon)));
                animalsMammals.add(new Quiz(R.string.an_ma_red_panda, R.drawable.redpanda, Resources.getSystem().getString(R.string.animal_question) + Resources.getSystem().getString(R.string.an_ma_red_panda)));
                animalsMammals.add(new Quiz(R.string.an_ma_riesen, R.drawable.riesen, Resources.getSystem().getString(R.string.animal_question) + Resources.getSystem().getString(R.string.an_ma_riesen)));

                animalsMammals.add(new Quiz(R.string.an_ma_seal, R.drawable.seal, Resources.getSystem().getString(R.string.animal_question) + Resources.getSystem().getString(R.string.an_ma_seal)));
                animalsMammals.add(new Quiz(R.string.an_ma_sheep, R.drawable.sheep, Resources.getSystem().getString(R.string.animal_question) + Resources.getSystem().getString(R.string.an_ma_sheep)));
                animalsMammals.add(new Quiz(R.string.an_ma_squirrel, R.drawable.squirrel, Resources.getSystem().getString(R.string.animal_question) + Resources.getSystem().getString(R.string.an_ma_squirrel)));
                animalsMammals.add(new Quiz(R.string.an_ma_surikat, R.drawable.surikat, Resources.getSystem().getString(R.string.animal_question) + Resources.getSystem().getString(R.string.an_ma_surikat)));
                animalsMammals.add(new Quiz(R.string.an_ma_wallaby, R.drawable.wallaby, Resources.getSystem().getString(R.string.animal_question) + Resources.getSystem().getString(R.string.an_ma_wallaby)));

                animalsMammals.add(new Quiz(R.string.an_ma_walrus, R.drawable.walrus, Resources.getSystem().getString(R.string.animal_question) + Resources.getSystem().getString(R.string.an_ma_walrus)));
                animalsMammals.add(new Quiz(R.string.an_ma_wolf, R.drawable.wolf, Resources.getSystem().getString(R.string.animal_question) + Resources.getSystem().getString(R.string.an_ma_wolf)));
                animalsMammals.add(new Quiz(R.string.an_ma_zebra, R.drawable.zebra, Resources.getSystem().getString(R.string.animal_question) + Resources.getSystem().getString(R.string.an_ma_zebra)));
                break;

            case FLOWERS:
                ArrayList<Quiz> natureFlowers = new ArrayList<>();
                natureFlowers.add(new Quiz(R.string.co_af_algeria_dz, R.drawable.dz, Resources.getSystem().getString(R.string.nature_question) + Resources.getSystem().getString(R.string.co_af_algeria_dz)));
                natureFlowers.add(new Quiz(R.string.co_af_angola_ao, R.drawable.ao, Resources.getSystem().getString(R.string.nature_question) + Resources.getSystem().getString(R.string.co_af_angola_ao)));
                break;

            case HERBS:
                break;

            case AFRICA:
                /*int[] flagsAfrica = new int[]{
                R.drawable.dz, R.drawable.ao, R.drawable.bj, R.drawable.bw, R.drawable.bf, R.drawable.bi, R.drawable.cm, R.drawable.cv, R.drawable.cf,
                R.drawable.td, R.drawable.km, R.drawable.ci, R.drawable.cd, R.drawable.dj, R.drawable.eg, R.drawable.gq, R.drawable.er, R.drawable.et,
                R.drawable.ga, R.drawable.gm, R.drawable.gh, R.drawable.gn, R.drawable.gw, R.drawable.ke, R.drawable.ls, R.drawable.lr, R.drawable.ly,
                R.drawable.mg, R.drawable.mw, R.drawable.ml, R.drawable.mr, R.drawable.mu, R.drawable.ma, R.drawable.mz, R.drawable.na, R.drawable.ne,
                R.drawable.ng, R.drawable.cg, R.drawable.rw, R.drawable.st, R.drawable.sn, R.drawable.sc, R.drawable.sl, R.drawable.so, R.drawable.za,
                R.drawable.sd, R.drawable.sd, R.drawable.sz, R.drawable.tz, R.drawable.tg, R.drawable.tn, R.drawable.ug, R.drawable.eh, R.drawable.zm,
                R.drawable.zw};*/

                ArrayList<Quiz> flagsAfrica = new ArrayList<>();
                flagsAfrica.add(new Quiz(R.string.co_af_algeria_dz, R.drawable.dz, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_af_algeria_dz)));
                flagsAfrica.add(new Quiz(R.string.co_af_angola_ao, R.drawable.ao, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_af_angola_ao)));
                flagsAfrica.add(new Quiz(R.string.co_af_benin_bj, R.drawable.bj, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_af_benin_bj)));
                flagsAfrica.add(new Quiz(R.string.co_af_botswana_bw, R.drawable.bw, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_af_botswana_bw)));
                flagsAfrica.add(new Quiz(R.string.co_af_burkina_faso_bf, R.drawable.bf, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_af_burkina_faso_bf)));

                flagsAfrica.add(new Quiz(R.string.co_af_burundi_bi, R.drawable.bi, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_af_burundi_bi)));
                flagsAfrica.add(new Quiz(R.string.co_af_cameroon_cm, R.drawable.cm, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_af_cameroon_cm)));
                flagsAfrica.add(new Quiz(R.string.co_af_cape_verde_cv, R.drawable.cv, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_af_cape_verde_cv)));
                flagsAfrica.add(new Quiz(R.string.co_af_the_central_african_republic_cf, R.drawable.cf, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_af_the_central_african_republic_cf)));
                flagsAfrica.add(new Quiz(R.string.co_af_chad_td, R.drawable.td, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_af_chad_td)));

                flagsAfrica.add(new Quiz(R.string.co_af_the_comoros_km, R.drawable.km, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_af_the_comoros_km)));
                flagsAfrica.add(new Quiz(R.string.co_af_ivory_coast_ci, R.drawable.ci, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_af_ivory_coast_ci)));
                flagsAfrica.add(new Quiz(R.string.co_af_the_democratic_republic_of_the_congo_cd, R.drawable.cd, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_af_the_democratic_republic_of_the_congo_cd)));
                flagsAfrica.add(new Quiz(R.string.co_af_djibouti_dj, R.drawable.dj, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_af_djibouti_dj)));
                flagsAfrica.add(new Quiz(R.string.co_af_egypt_eg, R.drawable.eg, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_af_egypt_eg)));

                flagsAfrica.add(new Quiz(R.string.co_af_equatorial_guinea_gq, R.drawable.gq, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_af_equatorial_guinea_gq)));
                flagsAfrica.add(new Quiz(R.string.co_af_eritrea_er, R.drawable.er, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_af_eritrea_er)));
                flagsAfrica.add(new Quiz(R.string.co_af_ethiopia_et, R.drawable.et, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_af_ethiopia_et)));
                flagsAfrica.add(new Quiz(R.string.co_af_gabon_ga, R.drawable.ga, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_af_gabon_ga)));
                flagsAfrica.add(new Quiz(R.string.co_af_the_gambia_gm, R.drawable.gm, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_af_the_gambia_gm)));

                flagsAfrica.add(new Quiz(R.string.co_af_ghana_gh, R.drawable.gh, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_af_ghana_gh)));
                flagsAfrica.add(new Quiz(R.string.co_af_guinea_gn, R.drawable.gn, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_af_guinea_gn)));
                flagsAfrica.add(new Quiz(R.string.co_af_guinea_bissau_gw, R.drawable.gw, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_af_guinea_bissau_gw)));
                flagsAfrica.add(new Quiz(R.string.co_af_kenya_ke, R.drawable.ke, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_af_kenya_ke)));
                flagsAfrica.add(new Quiz(R.string.co_af_lesotho_ls, R.drawable.ls, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_af_lesotho_ls)));

                flagsAfrica.add(new Quiz(R.string.co_af_liberia_lr, R.drawable.lr, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_af_liberia_lr)));
                flagsAfrica.add(new Quiz(R.string.co_af_libya_ly, R.drawable.ly, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_af_libya_ly)));
                flagsAfrica.add(new Quiz(R.string.co_af_madagascar_mg, R.drawable.mg, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_af_madagascar_mg)));
                flagsAfrica.add(new Quiz(R.string.co_af_malawi_mw, R.drawable.mw, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_af_malawi_mw)));
                flagsAfrica.add(new Quiz(R.string.co_af_mali_ml, R.drawable.ml, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_af_mali_ml)));

                flagsAfrica.add(new Quiz(R.string.co_af_mauritania_mr, R.drawable.mr, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_af_mauritania_mr)));
                flagsAfrica.add(new Quiz(R.string.co_af_mauritius_mu, R.drawable.mu, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_af_mauritius_mu)));
                flagsAfrica.add(new Quiz(R.string.co_af_morocco_ma, R.drawable.ma, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_af_morocco_ma)));
                flagsAfrica.add(new Quiz(R.string.co_af_mozambique_mz, R.drawable.mz, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_af_mozambique_mz)));
                flagsAfrica.add(new Quiz(R.string.co_af_namibia_na, R.drawable.na, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_af_namibia_na)));

                flagsAfrica.add(new Quiz(R.string.co_af_niger_ne, R.drawable.ne, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_af_niger_ne)));
                flagsAfrica.add(new Quiz(R.string.co_af_nigeria_ng, R.drawable.ng, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_af_nigeria_ng)));
                flagsAfrica.add(new Quiz(R.string.co_af_the_republic_of_the_congo_cg, R.drawable.cg, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_af_the_republic_of_the_congo_cg)));
                flagsAfrica.add(new Quiz(R.string.co_af_rwanda_rw, R.drawable.rw, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_af_rwanda_rw)));
                flagsAfrica.add(new Quiz(R.string.co_af_sao_tome_and_principe_st, R.drawable.st, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_af_sao_tome_and_principe_st)));

                flagsAfrica.add(new Quiz(R.string.co_af_senegal_sn, R.drawable.sn, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_af_senegal_sn)));
                flagsAfrica.add(new Quiz(R.string.co_af_the_seychelles_sc, R.drawable.sc, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_af_the_seychelles_sc)));
                flagsAfrica.add(new Quiz(R.string.co_af_sierra_leone_sl, R.drawable.sl, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_af_sierra_leone_sl)));
                flagsAfrica.add(new Quiz(R.string.co_af_somalia_so, R.drawable.so, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_af_somalia_so)));
                flagsAfrica.add(new Quiz(R.string.co_af_south_africa_za, R.drawable.za, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_af_south_africa_za)));

                flagsAfrica.add(new Quiz(R.string.co_af_south_sudan_sdn, R.drawable.sd, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_af_south_sudan_sdn)));
                flagsAfrica.add(new Quiz(R.string.co_af_sudan_sd, R.drawable.sd, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_af_sudan_sd)));
                flagsAfrica.add(new Quiz(R.string.co_af_swaziland_sz, R.drawable.sz, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_af_swaziland_sz)));
                flagsAfrica.add(new Quiz(R.string.co_af_tanzania_tz, R.drawable.tz, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_af_tanzania_tz)));
                flagsAfrica.add(new Quiz(R.string.co_af_togo_tg, R.drawable.tg, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_af_togo_tg)));

                flagsAfrica.add(new Quiz(R.string.co_af_tunisia_tn, R.drawable.tn, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_af_tunisia_tn)));
                flagsAfrica.add(new Quiz(R.string.co_af_uganda_ug, R.drawable.ug, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_af_uganda_ug)));
                flagsAfrica.add(new Quiz(R.string.co_af_western_sahara_eh, R.drawable.eh, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_af_western_sahara_eh)));
                flagsAfrica.add(new Quiz(R.string.co_af_zambia_zm, R.drawable.zm, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_af_zambia_zm)));
                flagsAfrica.add(new Quiz(R.string.co_af_zimbabwe_zw, R.drawable.zw, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_af_zimbabwe_zw)));
                break;

            case ASIA:
                /*int[] flagsAsia = new int[]{
                    R.drawable.af, R.drawable.am, R.drawable.az, R.drawable.bh, R.drawable.bd, R.drawable.bt, R.drawable.bn, R.drawable.kh, R.drawable.cy,
                    R.drawable.tl, R.drawable.eg, R.drawable.ge, R.drawable.in, R.drawable.id, R.drawable.ir, R.drawable.iq, R.drawable.il, R.drawable.jp,
                    R.drawable.jo, R.drawable.kz, R.drawable.kw, R.drawable.kg, R.drawable.la, R.drawable.lb, R.drawable.my, R.drawable.mv, R.drawable.mn,
                    R.drawable.mm, R.drawable.np, R.drawable.kp, R.drawable.om, R.drawable.pk, R.drawable.cn, R.drawable.ph, R.drawable.qa, R.drawable.tw,
                    R.drawable.ru, R.drawable.sa, R.drawable.sg, R.drawable.kr, R.drawable.lk, R.drawable.sy, R.drawable.tj, R.drawable.th, R.drawable.tr,
                    R.drawable.tm, R.drawable.ae, R.drawable.uz, R.drawable.vn, R.drawable.ye};*/

                ArrayList<Quiz> flagsAsia = new ArrayList<>();
                flagsAsia.add(new Quiz(R.string.co_as_afghanistan_af, R.drawable.af, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_as_afghanistan_af)));
                flagsAsia.add(new Quiz(R.string.co_as_armenia_am, R.drawable.am, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_as_armenia_am)));
                flagsAsia.add(new Quiz(R.string.co_as_azerbaijan_az, R.drawable.az, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_as_azerbaijan_az)));
                flagsAsia.add(new Quiz(R.string.co_as_bahrain_bh, R.drawable.bh, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_as_bahrain_bh)));
                flagsAsia.add(new Quiz(R.string.co_as_bangladesh_bd, R.drawable.bd, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_as_bangladesh_bd)));

                flagsAsia.add(new Quiz(R.string.co_as_bhutan_bt, R.drawable.bt, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_as_bhutan_bt)));
                flagsAsia.add(new Quiz(R.string.co_as_brunei_bn, R.drawable.br, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_as_brunei_bn)));
                flagsAsia.add(new Quiz(R.string.co_as_cambodia_kh, R.drawable.kh, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_as_cambodia_kh)));
                flagsAsia.add(new Quiz(R.string.co_as_cyprus_cy, R.drawable.cy, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_as_cyprus_cy)));
                flagsAsia.add(new Quiz(R.string.co_as_east_timor_tl, R.drawable.tl, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_as_east_timor_tl)));

                flagsAsia.add(new Quiz(R.string.co_as_egypt_eg, R.drawable.eg, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_as_egypt_eg)));
                flagsAsia.add(new Quiz(R.string.co_as_georgia_ge, R.drawable.ge, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_as_georgia_ge)));
                flagsAsia.add(new Quiz(R.string.co_as_india_in, R.drawable.in, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_as_india_in)));
                flagsAsia.add(new Quiz(R.string.co_as_indonesia_id, R.drawable.id, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_as_indonesia_id)));
                flagsAsia.add(new Quiz(R.string.co_as_iran_ir, R.drawable.ir, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_as_iran_ir)));

                flagsAsia.add(new Quiz(R.string.co_as_iraq_iq, R.drawable.iq, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_as_iraq_iq)));
                flagsAsia.add(new Quiz(R.string.co_as_israel_il, R.drawable.il, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_as_israel_il)));
                flagsAsia.add(new Quiz(R.string.co_as_japan_jp, R.drawable.jp, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_as_japan_jp)));
                flagsAsia.add(new Quiz(R.string.co_as_jordan_jo, R.drawable.jo, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_as_jordan_jo)));
                flagsAsia.add(new Quiz(R.string.co_as_kazakhstan_kz, R.drawable.kz, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_as_kazakhstan_kz)));

                flagsAsia.add(new Quiz(R.string.co_as_kuwait_kw, R.drawable.kw, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_as_kuwait_kw)));
                flagsAsia.add(new Quiz(R.string.co_as_kyrgyzstan_kg, R.drawable.kg, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_as_kyrgyzstan_kg)));
                flagsAsia.add(new Quiz(R.string.co_as_laos_la, R.drawable.la, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_as_laos_la)));
                flagsAsia.add(new Quiz(R.string.co_as_lebanon_lb, R.drawable.lb, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_as_lebanon_lb)));
                flagsAsia.add(new Quiz(R.string.co_as_malaysia_my, R.drawable.my, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_as_malaysia_my)));

                flagsAsia.add(new Quiz(R.string.co_as_maldives_mv, R.drawable.mv, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_as_maldives_mv)));
                flagsAsia.add(new Quiz(R.string.co_as_mongolia_mn, R.drawable.mn, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_as_mongolia_mn)));
                flagsAsia.add(new Quiz(R.string.co_as_myanmar_mm, R.drawable.mm, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_as_myanmar_mm)));
                flagsAsia.add(new Quiz(R.string.co_as_nepal_np, R.drawable.np, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_as_nepal_np)));
                flagsAsia.add(new Quiz(R.string.co_as_north_korea_kp, R.drawable.kp, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_as_north_korea_kp)));

                flagsAsia.add(new Quiz(R.string.co_as_oman_om, R.drawable.om, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_as_oman_om)));
                flagsAsia.add(new Quiz(R.string.co_as_pakistan_pk, R.drawable.pk, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_as_pakistan_pk)));
                flagsAsia.add(new Quiz(R.string.co_as_the_peoples_republic_of_china_cn, R.drawable.cn, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_as_the_peoples_republic_of_china_cn)));
                flagsAsia.add(new Quiz(R.string.co_as_the_philippines_ph, R.drawable.ph, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_as_the_philippines_ph)));
                flagsAsia.add(new Quiz(R.string.co_as_qatar_qa, R.drawable.qa, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_as_qatar_qa)));

                flagsAsia.add(new Quiz(R.string.co_as_the_republic_of_china_tw, R.drawable.tw, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_as_the_republic_of_china_tw)));
                flagsAsia.add(new Quiz(R.string.co_as_russia_ru, R.drawable.ru, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_as_russia_ru)));
                flagsAsia.add(new Quiz(R.string.co_as_saudi_arabia_sa, R.drawable.sa, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_as_saudi_arabia_sa)));
                flagsAsia.add(new Quiz(R.string.co_as_singapore_sg, R.drawable.sg, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_as_singapore_sg)));
                flagsAsia.add(new Quiz(R.string.co_as_south_korea_kr, R.drawable.kr, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_as_south_korea_kr)));

                flagsAsia.add(new Quiz(R.string.co_as_sri_lanka_lk, R.drawable.lk, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_as_sri_lanka_lk)));
                flagsAsia.add(new Quiz(R.string.co_as_syria_sy, R.drawable.sy, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_as_syria_sy)));
                flagsAsia.add(new Quiz(R.string.co_as_tajikistan_tj, R.drawable.tj, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_as_tajikistan_tj)));
                flagsAsia.add(new Quiz(R.string.co_as_thailand_th, R.drawable.th, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_as_thailand_th)));
                flagsAsia.add(new Quiz(R.string.co_as_turkey_tr, R.drawable.tr, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_as_turkey_tr)));

                flagsAsia.add(new Quiz(R.string.co_as_turkmenistan_tm, R.drawable.tm, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_as_turkmenistan_tm)));
                flagsAsia.add(new Quiz(R.string.co_as_the_united_arab_emirates_ae, R.drawable.ae, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_as_the_united_arab_emirates_ae)));
                flagsAsia.add(new Quiz(R.string.co_as_uzbekistan_uz, R.drawable.uz, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_as_uzbekistan_uz)));
                flagsAsia.add(new Quiz(R.string.co_as_vietnam_vn, R.drawable.vn, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_as_vietnam_vn)));
                flagsAsia.add(new Quiz(R.string.co_as_yemen_ye, R.drawable.ye, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_as_yemen_ye)));
                break;

            case EUROPE:
                /*int[] flagsEurope = new int[]{
                    R.drawable.al, R.drawable.ad, R.drawable.at, R.drawable.by, R.drawable.be, R.drawable.ba, R.drawable.bg, R.drawable.hr, R.drawable.cz,
                    R.drawable.dk, R.drawable.ee, R.drawable.fi, R.drawable.fr, R.drawable.de, R.drawable.gr, R.drawable.hu, R.drawable.is, R.drawable.ie,
                    R.drawable.it, R.drawable.al, R.drawable.lv, R.drawable.li, R.drawable.lt, R.drawable.lu, R.drawable.mk, R.drawable.mt, R.drawable.md,
                    R.drawable.mc, R.drawable.me, R.drawable.nl, R.drawable.no, R.drawable.pl, R.drawable.pt, R.drawable.ro, R.drawable.ru, R.drawable.sm,
                    R.drawable.rs, R.drawable.sk, R.drawable.si, R.drawable.es, R.drawable.se, R.drawable.ch, R.drawable.tr, R.drawable.ua, R.drawable.gb,
                    R.drawable.va};*/

                ArrayList<Quiz> flagsEurope = new ArrayList<>();
                flagsEurope.add(new Quiz(R.string.co_eu_albania_al, R.drawable.al, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_eu_albania_al)));
                flagsEurope.add(new Quiz(R.string.co_eu_andorra_ad, R.drawable.ad, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_eu_andorra_ad)));
                flagsEurope.add(new Quiz(R.string.co_eu_austria_at, R.drawable.at, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_eu_austria_at)));
                flagsEurope.add(new Quiz(R.string.co_eu_belarus_by, R.drawable.by, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_eu_belarus_by)));
                flagsEurope.add(new Quiz(R.string.co_eu_belgium_be, R.drawable.be, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_eu_belgium_be)));

                flagsEurope.add(new Quiz(R.string.co_eu_bosnia_and_herzegovina_ba, R.drawable.ba, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_eu_bosnia_and_herzegovina_ba)));
                flagsEurope.add(new Quiz(R.string.co_eu_bulgaria_bg, R.drawable.bg, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_eu_bulgaria_bg)));
                flagsEurope.add(new Quiz(R.string.co_eu_croatia_hr, R.drawable.hr, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_eu_croatia_hr)));
                flagsEurope.add(new Quiz(R.string.co_eu_the_czech_republic_cz, R.drawable.cz, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_eu_the_czech_republic_cz)));
                flagsEurope.add(new Quiz(R.string.co_eu_denmark_dk, R.drawable.dk, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_eu_denmark_dk)));

                flagsEurope.add(new Quiz(R.string.co_eu_estonia_ee, R.drawable.ee, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_eu_estonia_ee)));
                flagsEurope.add(new Quiz(R.string.co_eu_finland_fi, R.drawable.fi, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_eu_finland_fi)));
                flagsEurope.add(new Quiz(R.string.co_eu_france_fr, R.drawable.fr, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_eu_france_fr)));
                flagsEurope.add(new Quiz(R.string.co_eu_germany_de, R.drawable.de, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_eu_germany_de)));
                flagsEurope.add(new Quiz(R.string.co_eu_greece_gr, R.drawable.gr, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_eu_greece_gr)));

                flagsEurope.add(new Quiz(R.string.co_eu_hungary_hu, R.drawable.hu, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_eu_hungary_hu)));
                flagsEurope.add(new Quiz(R.string.co_eu_iceland_is, R.drawable.is, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_eu_iceland_is)));
                flagsEurope.add(new Quiz(R.string.co_eu_ireland_ie, R.drawable.ie, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_eu_ireland_ie)));
                flagsEurope.add(new Quiz(R.string.co_eu_italy_it, R.drawable.it, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_eu_italy_it)));
                flagsEurope.add(new Quiz(R.string.co_eu_kosovo_xk, R.drawable.mk, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_eu_kosovo_xk)));

                flagsEurope.add(new Quiz(R.string.co_eu_latvia_lv, R.drawable.lv, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_eu_latvia_lv)));
                flagsEurope.add(new Quiz(R.string.co_eu_liechtenstein_li, R.drawable.li, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_eu_liechtenstein_li)));
                flagsEurope.add(new Quiz(R.string.co_eu_lithuania_lt, R.drawable.lt, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_eu_lithuania_lt)));
                flagsEurope.add(new Quiz(R.string.co_eu_luxembourg_lu, R.drawable.lu, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_eu_luxembourg_lu)));
                flagsEurope.add(new Quiz(R.string.co_eu_macedonia_mk, R.drawable.mk, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_eu_macedonia_mk)));

                flagsEurope.add(new Quiz(R.string.co_eu_malta_mt, R.drawable.mt, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_eu_malta_mt)));
                flagsEurope.add(new Quiz(R.string.co_eu_moldova_md, R.drawable.md, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_eu_moldova_md)));
                flagsEurope.add(new Quiz(R.string.co_eu_monaco_mc, R.drawable.mc, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_eu_monaco_mc)));
                flagsEurope.add(new Quiz(R.string.co_eu_montenegro_me, R.drawable.me, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_eu_montenegro_me)));
                flagsEurope.add(new Quiz(R.string.co_eu_the_netherlands_nl, R.drawable.nl, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_eu_the_netherlands_nl)));

                flagsEurope.add(new Quiz(R.string.co_eu_norway_no, R.drawable.no, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_eu_norway_no)));
                flagsEurope.add(new Quiz(R.string.co_eu_poland_pl, R.drawable.pl, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_eu_poland_pl)));
                flagsEurope.add(new Quiz(R.string.co_eu_portugal_pt, R.drawable.pt, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_eu_portugal_pt)));
                flagsEurope.add(new Quiz(R.string.co_eu_romania_ro, R.drawable.ro, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_eu_romania_ro)));
                flagsEurope.add(new Quiz(R.string.co_eu_russia_ru, R.drawable.ru, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_eu_russia_ru)));

                flagsEurope.add(new Quiz(R.string.co_eu_san_marino_sm, R.drawable.sm, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_eu_san_marino_sm)));
                flagsEurope.add(new Quiz(R.string.co_eu_serbia_rs, R.drawable.rs, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_eu_serbia_rs)));
                flagsEurope.add(new Quiz(R.string.co_eu_slovakia_sk, R.drawable.sk, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_eu_slovakia_sk)));
                flagsEurope.add(new Quiz(R.string.co_eu_slovenia_si, R.drawable.si, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_eu_slovenia_si)));
                flagsEurope.add(new Quiz(R.string.co_eu_spain_es, R.drawable.es, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_eu_spain_es)));

                flagsEurope.add(new Quiz(R.string.co_eu_sweden_se, R.drawable.se, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_eu_sweden_se)));
                flagsEurope.add(new Quiz(R.string.co_eu_switzerland_ch, R.drawable.ch, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_eu_switzerland_ch)));
                flagsEurope.add(new Quiz(R.string.co_eu_turkey_tr, R.drawable.tr, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_eu_turkey_tr)));
                flagsEurope.add(new Quiz(R.string.co_eu_ukraine_ua, R.drawable.ua, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_eu_ukraine_ua)));
                flagsEurope.add(new Quiz(R.string.co_eu_the_united_kingdom_gb, R.drawable.gb, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_eu_the_united_kingdom_gb)));
                flagsEurope.add(new Quiz(R.string.co_eu_the_vatican_city_state_va, R.drawable.va, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_eu_the_vatican_city_state_va)));
                break;

            case NORTH_AMERICA:
                ArrayList<Quiz> flagsNAmerica = new ArrayList<>();
                flagsNAmerica.add(new Quiz(R.string.co_na_antigua_and_barbuda_ag, R.drawable.ag, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_na_antigua_and_barbuda_ag)));
                flagsNAmerica.add(new Quiz(R.string.co_na_the_bahamas_bs, R.drawable.bs, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_na_the_bahamas_bs)));
                flagsNAmerica.add(new Quiz(R.string.co_na_barbados_bb, R.drawable.bb, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_na_barbados_bb)));
                flagsNAmerica.add(new Quiz(R.string.co_na_belize_bz, R.drawable.bz, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_na_belize_bz)));
                flagsNAmerica.add(new Quiz(R.string.co_na_canada_ca, R.drawable.ca, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_na_canada_ca)));

                flagsNAmerica.add(new Quiz(R.string.co_na_costa_rica_cr, R.drawable.cr, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_na_costa_rica_cr)));
                flagsNAmerica.add(new Quiz(R.string.co_na_cuba_cu, R.drawable.cu, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_na_cuba_cu)));
                flagsNAmerica.add(new Quiz(R.string.co_na_dominica_dm, R.drawable.dm, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_na_dominica_dm)));
                flagsNAmerica.add(new Quiz(R.string.co_na_the_dominican_republic_do, R.drawable.dom, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_na_the_dominican_republic_do)));
                flagsNAmerica.add(new Quiz(R.string.co_na_el_salvador_sv, R.drawable.sv, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_na_el_salvador_sv)));

                flagsNAmerica.add(new Quiz(R.string.co_na_grenada_gd, R.drawable.gd, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_na_grenada_gd)));
                flagsNAmerica.add(new Quiz(R.string.co_na_guatemala_gt, R.drawable.gt, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_na_guatemala_gt)));
                flagsNAmerica.add(new Quiz(R.string.co_na_haiti_ht, R.drawable.ht, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_na_haiti_ht)));
                flagsNAmerica.add(new Quiz(R.string.co_na_honduras_hn, R.drawable.hn, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_na_honduras_hn)));
                flagsNAmerica.add(new Quiz(R.string.co_na_jamaica_jm, R.drawable.jm, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_na_jamaica_jm)));

                flagsNAmerica.add(new Quiz(R.string.co_na_mexico_mx, R.drawable.mx, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_na_mexico_mx)));
                flagsNAmerica.add(new Quiz(R.string.co_na_nicaragua_ni, R.drawable.ni, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_na_nicaragua_ni)));
                flagsNAmerica.add(new Quiz(R.string.co_na_panama_pa, R.drawable.pa, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_na_panama_pa)));
                flagsNAmerica.add(new Quiz(R.string.co_na_saint_kitts_and_nevis_kn, R.drawable.kn, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_na_saint_kitts_and_nevis_kn)));
                flagsNAmerica.add(new Quiz(R.string.co_na_saint_lucia_lc, R.drawable.lc, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_na_saint_lucia_lc)));

                flagsNAmerica.add(new Quiz(R.string.co_na_saint_vincent_and_the_grenadines_vc, R.drawable.vc, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_na_saint_vincent_and_the_grenadines_vc)));
                flagsNAmerica.add(new Quiz(R.string.co_na_trinidad_and_tobago_tt, R.drawable.tt, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_na_trinidad_and_tobago_tt)));
                flagsNAmerica.add(new Quiz(R.string.co_na_the_united_states_us, R.drawable.us, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_na_the_united_states_us)));
                break;

            case SOUTH_AMERICA:
                ArrayList<Quiz> flagsSAmerica = new ArrayList<>();
                flagsSAmerica.add(new Quiz(R.string.co_sa_argentina_ar, R.drawable.ar, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_sa_argentina_ar)));
                flagsSAmerica.add(new Quiz(R.string.co_sa_bolivia_bo, R.drawable.bo, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_sa_bolivia_bo)));
                flagsSAmerica.add(new Quiz(R.string.co_sa_brazil_br, R.drawable.br, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_sa_brazil_br)));
                flagsSAmerica.add(new Quiz(R.string.co_sa_chile_cl, R.drawable.cl, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_sa_chile_cl)));
                flagsSAmerica.add(new Quiz(R.string.co_sa_colombia_co, R.drawable.co, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_sa_colombia_co)));

                flagsSAmerica.add(new Quiz(R.string.co_sa_ecuador_ec, R.drawable.ec, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_sa_ecuador_ec)));
                flagsSAmerica.add(new Quiz(R.string.co_sa_guyana_gy, R.drawable.gy, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_sa_guyana_gy)));
                flagsSAmerica.add(new Quiz(R.string.co_sa_paraguay_py, R.drawable.py, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_sa_paraguay_py)));
                flagsSAmerica.add(new Quiz(R.string.co_sa_peru_pe, R.drawable.pe, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_sa_peru_pe)));
                flagsSAmerica.add(new Quiz(R.string.co_sa_suriname_sr, R.drawable.sr, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_sa_suriname_sr)));

                flagsSAmerica.add(new Quiz(R.string.co_sa_trinidad_and_tobago_tt, R.drawable.tt, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_sa_trinidad_and_tobago_tt)));
                flagsSAmerica.add(new Quiz(R.string.co_sa_uruguay_uy, R.drawable.uy, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_sa_uruguay_uy)));
                flagsSAmerica.add(new Quiz(R.string.co_sa_venezuela_ve, R.drawable.ve, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_sa_venezuela_ve)));
                break;

            case OCEANIA:
                ArrayList<Quiz> flagsOceania = new ArrayList<>();
                flagsOceania.add(new Quiz(R.string.co_oc_australia_au, R.drawable.au, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_oc_australia_au)));
                flagsOceania.add(new Quiz(R.string.co_oc_cook_islands_ck, R.drawable.co, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_oc_cook_islands_ck)));
                flagsOceania.add(new Quiz(R.string.co_oc_east_timor_tl, R.drawable.tl, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_oc_east_timor_tl)));
                flagsOceania.add(new Quiz(R.string.co_oc_fiji_fj, R.drawable.fj, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_oc_fiji_fj)));
                flagsOceania.add(new Quiz(R.string.co_oc_indonesia_id, R.drawable.id, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_oc_indonesia_id)));

                flagsOceania.add(new Quiz(R.string.co_oc_kiribati_ki, R.drawable.ki, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_oc_kiribati_ki)));
                flagsOceania.add(new Quiz(R.string.co_oc_the_marshall_islands_mh, R.drawable.mh, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_oc_the_marshall_islands_mh)));
                flagsOceania.add(new Quiz(R.string.co_oc_micronesia_fm, R.drawable.fm, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_oc_micronesia_fm)));
                flagsOceania.add(new Quiz(R.string.co_oc_nauru_nr, R.drawable.nr, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_oc_nauru_nr)));
                flagsOceania.add(new Quiz(R.string.co_oc_new_zealand_nz, R.drawable.nz, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_oc_new_zealand_nz)));

                flagsOceania.add(new Quiz(R.string.co_oc_niue_nu, R.drawable.fm, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_oc_niue_nu)));
                flagsOceania.add(new Quiz(R.string.co_oc_palau_pw, R.drawable.co, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_oc_palau_pw)));
                flagsOceania.add(new Quiz(R.string.co_oc_papua_new_guinea_pg, R.drawable.pg, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_oc_papua_new_guinea_pg)));
                flagsOceania.add(new Quiz(R.string.co_oc_samoa_ws, R.drawable.ws, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_oc_samoa_ws)));
                flagsOceania.add(new Quiz(R.string.co_oc_the_solomon_islands_sb, R.drawable.sb, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_oc_the_solomon_islands_sb)));

                flagsOceania.add(new Quiz(R.string.co_oc_tonga_to, R.drawable.to, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_oc_tonga_to)));
                flagsOceania.add(new Quiz(R.string.co_oc_tuvalu_tv, R.drawable.tv, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_oc_tuvalu_tv)));
                flagsOceania.add(new Quiz(R.string.co_oc_vanuatu_vu, R.drawable.vu, Resources.getSystem().getString(R.string.flag_question) + Resources.getSystem().getString(R.string.co_oc_vanuatu_vu)));
                break;

            case PIC_TO_WORD:
                break;

            case WORD_TO_PIC:
                break;
        }
    }
}