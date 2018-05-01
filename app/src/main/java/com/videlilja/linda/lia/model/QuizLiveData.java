package com.videlilja.linda.lia.model;

import android.arch.lifecycle.LiveData;
import android.content.Context;
import android.content.res.Resources;

import com.videlilja.linda.lia.R;

import java.util.ArrayList;
import java.util.List;

public class QuizLiveData extends LiveData<List<Quiz>> {

    public QuizLiveData(Categories category, Context context) {

        switch (category) {


            case BIRDS:
                break;

            case MAMMALS:
                List<Quiz> animalsMammals = new ArrayList<>();
                animalsMammals.add(new Quiz(context.getString(R.string.an_ma_african_wild_dog), R.drawable.africanwilddog, context.getString(R.string.animal_question)));
                animalsMammals.add(new Quiz(context.getString(R.string.an_ma_armadillo), R.drawable.armadillo, context.getString(R.string.animal_question)));
                animalsMammals.add(new Quiz(context.getString(R.string.an_ma_baboon), R.drawable.baboon, context.getString(R.string.animal_question)));
                animalsMammals.add(new Quiz(context.getString(R.string.an_ma_bear), R.drawable.bear, context.getString(R.string.animal_question)));
                animalsMammals.add(new Quiz(context.getString(R.string.an_ma_bengal_tiger), R.drawable.bengaltiger, context.getString(R.string.animal_question)));
                setValue(animalsMammals);
                /*animalsMammals.add(new Quiz(context.getString(R.string.an_ma_bighorn_sheep), R.drawable.bighornsheep, context.getString(R.string.animal_question) + context.getString(R.string.an_ma_bighorn_sheep)));
                animalsMammals.add(new Quiz(R.string.an_ma_bobcat, R.drawable.bobcat, context.getString(R.string.animal_question) + context.getString(R.string.an_ma_bobcat)));
                animalsMammals.add(new Quiz(R.string.an_ma_buffalo, R.drawable.buffalo, context.getString(R.string.animal_question) + context.getString(R.string.an_ma_buffalo)));
                animalsMammals.add(new Quiz(R.string.an_ma_camel, R.drawable.camel, context.getString(R.string.animal_question) + context.getString(R.string.an_ma_camel)));
                animalsMammals.add(new Quiz(R.string.an_ma_cheetah, R.drawable.cheeta, context.getString(R.string.animal_question) + context.getString(R.string.an_ma_cheetah)));

                animalsMammals.add(new Quiz(R.string.an_ma_chimpanzee, R.drawable.chimpanzee, context.getString(R.string.animal_question) + context.getString(R.string.an_ma_chimpanzee)));
                animalsMammals.add(new Quiz(R.string.an_ma_dolphin, R.drawable.dolphin, context.getString(R.string.animal_question) + context.getString(R.string.an_ma_dolphin)));
                animalsMammals.add(new Quiz(R.string.an_ma_donkey, R.drawable.donkey, context.getString(R.string.animal_question) + context.getString(R.string.an_ma_donkey)));
                animalsMammals.add(new Quiz(R.string.an_ma_elephant, R.drawable.elephant, context.getString(R.string.animal_question) + context.getString(R.string.an_ma_elephant)));
                animalsMammals.add(new Quiz(R.string.an_ma_ferret, R.drawable.ferret, context.getString(R.string.animal_question) + context.getString(R.string.an_ma_ferret)));

                animalsMammals.add(new Quiz(R.string.an_ma_fox, R.drawable.fox, context.getString(R.string.animal_question) + context.getString(R.string.an_ma_fox)));
                animalsMammals.add(new Quiz(R.string.an_ma_giraffe, R.drawable.giraffe, context.getString(R.string.animal_question) + context.getString(R.string.an_ma_giraffe)));
                animalsMammals.add(new Quiz(R.string.an_ma_guinea_pig, R.drawable.guineapig, context.getString(R.string.animal_question) + context.getString(R.string.an_ma_guinea_pig)));
                animalsMammals.add(new Quiz(R.string.an_ma_hippopotamus, R.drawable.hippopotamus, context.getString(R.string.animal_question) + context.getString(R.string.an_ma_hippopotamus)));
                animalsMammals.add(new Quiz(R.string.an_ma_koala, R.drawable.koala, context.getString(R.string.animal_question) + context.getString(R.string.an_ma_koala)));

                animalsMammals.add(new Quiz(R.string.an_ma_lemur, R.drawable.lemur, context.getString(R.string.animal_question) + context.getString(R.string.an_ma_lemur)));
                animalsMammals.add(new Quiz(R.string.an_ma_lion, R.drawable.lion, context.getString(R.string.animal_question) + context.getString(R.string.an_ma_lion)));
                animalsMammals.add(new Quiz(R.string.an_ma_moose, R.drawable.moose, context.getString(R.string.animal_question) + context.getString(R.string.an_ma_moose)));
                animalsMammals.add(new Quiz(R.string.an_ma_mouse, R.drawable.mouse, context.getString(R.string.animal_question) + context.getString(R.string.an_ma_mouse)));
                animalsMammals.add(new Quiz(R.string.an_ma_orca, R.drawable.orca, context.getString(R.string.animal_question) + context.getString(R.string.an_ma_orca)));

                animalsMammals.add(new Quiz(R.string.an_ma_panda, R.drawable.panda, context.getString(R.string.animal_question) + context.getString(R.string.an_ma_panda)));
                animalsMammals.add(new Quiz(R.string.an_ma_rabbit, R.drawable.rabbit, context.getString(R.string.animal_question) + context.getString(R.string.an_ma_rabbit)));
                animalsMammals.add(new Quiz(R.string.an_ma_raccoon, R.drawable.raccoon, context.getString(R.string.animal_question) + context.getString(R.string.an_ma_raccoon)));
                animalsMammals.add(new Quiz(R.string.an_ma_red_panda, R.drawable.redpanda, context.getString(R.string.animal_question) + context.getString(R.string.an_ma_red_panda)));
                animalsMammals.add(new Quiz(R.string.an_ma_riesen, R.drawable.riesen, context.getString(R.string.animal_question) + context.getString(R.string.an_ma_riesen)));

                animalsMammals.add(new Quiz(R.string.an_ma_seal, R.drawable.seal, context.getString(R.string.animal_question) + context.getString(R.string.an_ma_seal)));
                animalsMammals.add(new Quiz(R.string.an_ma_sheep, R.drawable.sheep, context.getString(R.string.animal_question) + context.getString(R.string.an_ma_sheep)));
                animalsMammals.add(new Quiz(R.string.an_ma_squirrel, R.drawable.squirrel, context.getString(R.string.animal_question) + context.getString(R.string.an_ma_squirrel)));
                animalsMammals.add(new Quiz(R.string.an_ma_surikat, R.drawable.surikat, context.getString(R.string.animal_question) + context.getString(R.string.an_ma_surikat)));
                animalsMammals.add(new Quiz(R.string.an_ma_wallaby, R.drawable.wallaby, context.getString(R.string.animal_question) + context.getString(R.string.an_ma_wallaby)));

                animalsMammals.add(new Quiz(R.string.an_ma_walrus, R.drawable.walrus, context.getString(R.string.animal_question) + context.getString(R.string.an_ma_walrus)));
                animalsMammals.add(new Quiz(R.string.an_ma_wolf, R.drawable.wolf, context.getString(R.string.animal_question) + context.getString(R.string.an_ma_wolf)));
                animalsMammals.add(new Quiz(R.string.an_ma_zebra, R.drawable.zebra, context.getString(R.string.animal_question) + context.getString(R.string.an_ma_zebra)));
                setValue(animalsMammals);
                break;
/*
            case FLOWERS:
                List<Quiz> natureFlowers = new ArrayList<>();
                natureFlowers.add(new Quiz(R.string.na_fl_chrysanthemum, R.drawable.chrysanthemum, context.getString(R.string.nature_question) + context.getString(R.string.na_fl_chrysanthemum)));
                natureFlowers.add(new Quiz(R.string.na_fl_coltsfoot, R.drawable.coltsfoot, context.getString(R.string.nature_question) + context.getString(R.string.na_fl_coltsfoot)));
                natureFlowers.add(new Quiz(R.string.na_fl_cornflower, R.drawable.cornflower, context.getString(R.string.nature_question) + context.getString(R.string.na_fl_cornflower)));
                natureFlowers.add(new Quiz(R.string.na_fl_crocus, R.drawable.crocus, context.getString(R.string.nature_question) + context.getString(R.string.na_fl_crocus)));
                natureFlowers.add(new Quiz(R.string.na_fl_daffodil, R.drawable.daffodil, context.getString(R.string.nature_question) + context.getString(R.string.na_fl_daffodil)));

                natureFlowers.add(new Quiz(R.string.na_fl_dahlia, R.drawable.dahlia, context.getString(R.string.nature_question) + context.getString(R.string.na_fl_dahlia)));
                natureFlowers.add(new Quiz(R.string.na_fl_daisy, R.drawable.daisy, context.getString(R.string.nature_question) + context.getString(R.string.na_fl_daisy)));
                natureFlowers.add(new Quiz(R.string.na_fl_dandelion, R.drawable.dandelion, context.getString(R.string.nature_question) + context.getString(R.string.na_fl_dandelion)));
                natureFlowers.add(new Quiz(R.string.na_fl_gerbera, R.drawable.gerbera, context.getString(R.string.nature_question) + context.getString(R.string.na_fl_gerbera)));
                natureFlowers.add(new Quiz(R.string.na_fl_hydrangea, R.drawable.hydrangea, context.getString(R.string.nature_question) + context.getString(R.string.na_fl_hydrangea)));

                natureFlowers.add(new Quiz(R.string.na_fl_iris, R.drawable.iris, context.getString(R.string.nature_question) + context.getString(R.string.na_fl_iris)));
                natureFlowers.add(new Quiz(R.string.na_fl_lilac, R.drawable.lilac, context.getString(R.string.nature_question) + context.getString(R.string.na_fl_lilac)));
                natureFlowers.add(new Quiz(R.string.na_fl_lily, R.drawable.lily, context.getString(R.string.nature_question) + context.getString(R.string.na_fl_lily)));
                natureFlowers.add(new Quiz(R.string.na_fl_lily_of_the_valley, R.drawable.lilyofthevalley, context.getString(R.string.nature_question) + context.getString(R.string.na_fl_lily_of_the_valley)));
                natureFlowers.add(new Quiz(R.string.na_fl_pelargonium, R.drawable.pelargonium, context.getString(R.string.nature_question) + context.getString(R.string.na_fl_pelargonium)));

                natureFlowers.add(new Quiz(R.string.na_fl_petunia, R.drawable.petunia, context.getString(R.string.nature_question) + context.getString(R.string.na_fl_petunia)));
                natureFlowers.add(new Quiz(R.string.na_fl_poppy, R.drawable.poppy, context.getString(R.string.nature_question) + context.getString(R.string.na_fl_poppy)));
                natureFlowers.add(new Quiz(R.string.na_fl_snowdrop, R.drawable.snowdrop, context.getString(R.string.nature_question) + context.getString(R.string.na_fl_snowdrop)));
                natureFlowers.add(new Quiz(R.string.na_fl_sunflower, R.drawable.sunflower, context.getString(R.string.nature_question) + context.getString(R.string.na_fl_sunflower)));
                natureFlowers.add(new Quiz(R.string.na_fl_tulip, R.drawable.tulip, context.getString(R.string.nature_question) + context.getString(R.string.na_fl_tulip)));
                setValue(natureFlowers);
                break;

            case HERBS:
                break;

            case ADDITION:
                List<Quiz> mathAdd = new ArrayList<>();
                mathAdd.add(new Quiz(R.string.co_af_algeria_dz, R.drawable.dz, context.getString(R.string.math_question) + context.getString(R.string.co_af_algeria_dz)));
                mathAdd.add(new Quiz(R.string.co_af_angola_ao, R.drawable.ao, context.getString(R.string.math_question) + context.getString(R.string.co_af_angola_ao)));
                mathAdd.add(new Quiz(R.string.co_af_benin_bj, R.drawable.bj, context.getString(R.string.math_question) + context.getString(R.string.co_af_benin_bj)));
                mathAdd.add(new Quiz(R.string.co_af_botswana_bw, R.drawable.bw, context.getString(R.string.math_question) + context.getString(R.string.co_af_botswana_bw)));
                mathAdd.add(new Quiz(R.string.co_af_burkina_faso_bf, R.drawable.bf, context.getString(R.string.math_question) + context.getString(R.string.co_af_burkina_faso_bf)));
                setValue(mathAdd);
                break;

            case SUBTRACTION:
                break;

            case MULTIPLICATION:
                break;

            case DIVISION:
                break;

            case F_AFRICA:
                List<Quiz> flagsAfrica = new ArrayList<>();
                flagsAfrica.add(new Quiz(R.string.co_af_algeria_dz, R.drawable.dz, context.getString(R.string.flag_question) + context.getString(R.string.co_af_algeria_dz)));
                flagsAfrica.add(new Quiz(R.string.co_af_angola_ao, R.drawable.ao, context.getString(R.string.flag_question) + context.getString(R.string.co_af_angola_ao)));
                flagsAfrica.add(new Quiz(R.string.co_af_benin_bj, R.drawable.bj, context.getString(R.string.flag_question) + context.getString(R.string.co_af_benin_bj)));
                flagsAfrica.add(new Quiz(R.string.co_af_botswana_bw, R.drawable.bw, context.getString(R.string.flag_question) + context.getString(R.string.co_af_botswana_bw)));
                flagsAfrica.add(new Quiz(R.string.co_af_burkina_faso_bf, R.drawable.bf, context.getString(R.string.flag_question) + context.getString(R.string.co_af_burkina_faso_bf)));

                flagsAfrica.add(new Quiz(R.string.co_af_burundi_bi, R.drawable.bi, context.getString(R.string.flag_question) + context.getString(R.string.co_af_burundi_bi)));
                flagsAfrica.add(new Quiz(R.string.co_af_cameroon_cm, R.drawable.cm, context.getString(R.string.flag_question) + context.getString(R.string.co_af_cameroon_cm)));
                flagsAfrica.add(new Quiz(R.string.co_af_cape_verde_cv, R.drawable.cv, context.getString(R.string.flag_question) + context.getString(R.string.co_af_cape_verde_cv)));
                flagsAfrica.add(new Quiz(R.string.co_af_the_central_african_republic_cf, R.drawable.cf, context.getString(R.string.flag_question) + context.getString(R.string.co_af_the_central_african_republic_cf)));
                flagsAfrica.add(new Quiz(R.string.co_af_chad_td, R.drawable.td, context.getString(R.string.flag_question) + context.getString(R.string.co_af_chad_td)));

                flagsAfrica.add(new Quiz(R.string.co_af_the_comoros_km, R.drawable.km, context.getString(R.string.flag_question) + context.getString(R.string.co_af_the_comoros_km)));
                flagsAfrica.add(new Quiz(R.string.co_af_ivory_coast_ci, R.drawable.ci, context.getString(R.string.flag_question) + context.getString(R.string.co_af_ivory_coast_ci)));
                flagsAfrica.add(new Quiz(R.string.co_af_the_democratic_republic_of_the_congo_cd, R.drawable.cd, context.getString(R.string.flag_question) + context.getString(R.string.co_af_the_democratic_republic_of_the_congo_cd)));
                flagsAfrica.add(new Quiz(R.string.co_af_djibouti_dj, R.drawable.dj, context.getString(R.string.flag_question) + context.getString(R.string.co_af_djibouti_dj)));
                flagsAfrica.add(new Quiz(R.string.co_af_egypt_eg, R.drawable.eg, context.getString(R.string.flag_question) + context.getString(R.string.co_af_egypt_eg)));

                flagsAfrica.add(new Quiz(R.string.co_af_equatorial_guinea_gq, R.drawable.gq, context.getString(R.string.flag_question) + context.getString(R.string.co_af_equatorial_guinea_gq)));
                flagsAfrica.add(new Quiz(R.string.co_af_eritrea_er, R.drawable.er, context.getString(R.string.flag_question) + context.getString(R.string.co_af_eritrea_er)));
                flagsAfrica.add(new Quiz(R.string.co_af_ethiopia_et, R.drawable.et, context.getString(R.string.flag_question) + context.getString(R.string.co_af_ethiopia_et)));
                flagsAfrica.add(new Quiz(R.string.co_af_gabon_ga, R.drawable.ga, context.getString(R.string.flag_question) + context.getString(R.string.co_af_gabon_ga)));
                flagsAfrica.add(new Quiz(R.string.co_af_the_gambia_gm, R.drawable.gm, context.getString(R.string.flag_question) + context.getString(R.string.co_af_the_gambia_gm)));

                flagsAfrica.add(new Quiz(R.string.co_af_ghana_gh, R.drawable.gh, context.getString(R.string.flag_question) + context.getString(R.string.co_af_ghana_gh)));
                flagsAfrica.add(new Quiz(R.string.co_af_guinea_gn, R.drawable.gn, context.getString(R.string.flag_question) + context.getString(R.string.co_af_guinea_gn)));
                flagsAfrica.add(new Quiz(R.string.co_af_guinea_bissau_gw, R.drawable.gw, context.getString(R.string.flag_question) + context.getString(R.string.co_af_guinea_bissau_gw)));
                flagsAfrica.add(new Quiz(R.string.co_af_kenya_ke, R.drawable.ke, context.getString(R.string.flag_question) + context.getString(R.string.co_af_kenya_ke)));
                flagsAfrica.add(new Quiz(R.string.co_af_lesotho_ls, R.drawable.ls, context.getString(R.string.flag_question) + context.getString(R.string.co_af_lesotho_ls)));

                flagsAfrica.add(new Quiz(R.string.co_af_liberia_lr, R.drawable.lr, context.getString(R.string.flag_question) + context.getString(R.string.co_af_liberia_lr)));
                flagsAfrica.add(new Quiz(R.string.co_af_libya_ly, R.drawable.ly, context.getString(R.string.flag_question) + context.getString(R.string.co_af_libya_ly)));
                flagsAfrica.add(new Quiz(R.string.co_af_madagascar_mg, R.drawable.mg, context.getString(R.string.flag_question) + context.getString(R.string.co_af_madagascar_mg)));
                flagsAfrica.add(new Quiz(R.string.co_af_malawi_mw, R.drawable.mw, context.getString(R.string.flag_question) + context.getString(R.string.co_af_malawi_mw)));
                flagsAfrica.add(new Quiz(R.string.co_af_mali_ml, R.drawable.ml, context.getString(R.string.flag_question) + context.getString(R.string.co_af_mali_ml)));

                flagsAfrica.add(new Quiz(R.string.co_af_mauritania_mr, R.drawable.mr, context.getString(R.string.flag_question) + context.getString(R.string.co_af_mauritania_mr)));
                flagsAfrica.add(new Quiz(R.string.co_af_mauritius_mu, R.drawable.mu, context.getString(R.string.flag_question) + context.getString(R.string.co_af_mauritius_mu)));
                flagsAfrica.add(new Quiz(R.string.co_af_morocco_ma, R.drawable.ma, context.getString(R.string.flag_question) + context.getString(R.string.co_af_morocco_ma)));
                flagsAfrica.add(new Quiz(R.string.co_af_mozambique_mz, R.drawable.mz, context.getString(R.string.flag_question) + context.getString(R.string.co_af_mozambique_mz)));
                flagsAfrica.add(new Quiz(R.string.co_af_namibia_na, R.drawable.na, context.getString(R.string.flag_question) + context.getString(R.string.co_af_namibia_na)));

                flagsAfrica.add(new Quiz(R.string.co_af_niger_ne, R.drawable.ne, context.getString(R.string.flag_question) + context.getString(R.string.co_af_niger_ne)));
                flagsAfrica.add(new Quiz(R.string.co_af_nigeria_ng, R.drawable.ng, context.getString(R.string.flag_question) + context.getString(R.string.co_af_nigeria_ng)));
                flagsAfrica.add(new Quiz(R.string.co_af_the_republic_of_the_congo_cg, R.drawable.cg, context.getString(R.string.flag_question) + context.getString(R.string.co_af_the_republic_of_the_congo_cg)));
                flagsAfrica.add(new Quiz(R.string.co_af_rwanda_rw, R.drawable.rw, context.getString(R.string.flag_question) + context.getString(R.string.co_af_rwanda_rw)));
                flagsAfrica.add(new Quiz(R.string.co_af_sao_tome_and_principe_st, R.drawable.st, context.getString(R.string.flag_question) + context.getString(R.string.co_af_sao_tome_and_principe_st)));

                flagsAfrica.add(new Quiz(R.string.co_af_senegal_sn, R.drawable.sn, context.getString(R.string.flag_question) + context.getString(R.string.co_af_senegal_sn)));
                flagsAfrica.add(new Quiz(R.string.co_af_the_seychelles_sc, R.drawable.sc, context.getString(R.string.flag_question) + context.getString(R.string.co_af_the_seychelles_sc)));
                flagsAfrica.add(new Quiz(R.string.co_af_sierra_leone_sl, R.drawable.sl, context.getString(R.string.flag_question) + context.getString(R.string.co_af_sierra_leone_sl)));
                flagsAfrica.add(new Quiz(R.string.co_af_somalia_so, R.drawable.so, context.getString(R.string.flag_question) + context.getString(R.string.co_af_somalia_so)));
                flagsAfrica.add(new Quiz(R.string.co_af_south_africa_za, R.drawable.za, context.getString(R.string.flag_question) + context.getString(R.string.co_af_south_africa_za)));

                flagsAfrica.add(new Quiz(R.string.co_af_south_sudan_sdn, R.drawable.sd, context.getString(R.string.flag_question) + context.getString(R.string.co_af_south_sudan_sdn)));
                flagsAfrica.add(new Quiz(R.string.co_af_sudan_sd, R.drawable.sd, context.getString(R.string.flag_question) + context.getString(R.string.co_af_sudan_sd)));
                flagsAfrica.add(new Quiz(R.string.co_af_swaziland_sz, R.drawable.sz, context.getString(R.string.flag_question) + context.getString(R.string.co_af_swaziland_sz)));
                flagsAfrica.add(new Quiz(R.string.co_af_tanzania_tz, R.drawable.tz, context.getString(R.string.flag_question) + context.getString(R.string.co_af_tanzania_tz)));
                flagsAfrica.add(new Quiz(R.string.co_af_togo_tg, R.drawable.tg, context.getString(R.string.flag_question) + context.getString(R.string.co_af_togo_tg)));

                flagsAfrica.add(new Quiz(R.string.co_af_tunisia_tn, R.drawable.tn, context.getString(R.string.flag_question) + context.getString(R.string.co_af_tunisia_tn)));
                flagsAfrica.add(new Quiz(R.string.co_af_uganda_ug, R.drawable.ug, context.getString(R.string.flag_question) + context.getString(R.string.co_af_uganda_ug)));
                flagsAfrica.add(new Quiz(R.string.co_af_western_sahara_eh, R.drawable.eh, context.getString(R.string.flag_question) + context.getString(R.string.co_af_western_sahara_eh)));
                flagsAfrica.add(new Quiz(R.string.co_af_zambia_zm, R.drawable.zm, context.getString(R.string.flag_question) + context.getString(R.string.co_af_zambia_zm)));
                flagsAfrica.add(new Quiz(R.string.co_af_zimbabwe_zw, R.drawable.zw, context.getString(R.string.flag_question) + context.getString(R.string.co_af_zimbabwe_zw)));
                setValue(flagsAfrica);
                break;

            case F_ASIA:
                List<Quiz> flagsAsia = new ArrayList<>();
                flagsAsia.add(new Quiz(R.string.co_as_afghanistan_af, R.drawable.af, context.getString(R.string.flag_question) + context.getString(R.string.co_as_afghanistan_af)));
                flagsAsia.add(new Quiz(R.string.co_as_armenia_am, R.drawable.am, context.getString(R.string.flag_question) + context.getString(R.string.co_as_armenia_am)));
                flagsAsia.add(new Quiz(R.string.co_as_azerbaijan_az, R.drawable.az, context.getString(R.string.flag_question) + context.getString(R.string.co_as_azerbaijan_az)));
                flagsAsia.add(new Quiz(R.string.co_as_bahrain_bh, R.drawable.bh, context.getString(R.string.flag_question) + context.getString(R.string.co_as_bahrain_bh)));
                flagsAsia.add(new Quiz(R.string.co_as_bangladesh_bd, R.drawable.bd, context.getString(R.string.flag_question) + context.getString(R.string.co_as_bangladesh_bd)));

                flagsAsia.add(new Quiz(R.string.co_as_bhutan_bt, R.drawable.bt, context.getString(R.string.flag_question) + context.getString(R.string.co_as_bhutan_bt)));
                flagsAsia.add(new Quiz(R.string.co_as_brunei_bn, R.drawable.br, context.getString(R.string.flag_question) + context.getString(R.string.co_as_brunei_bn)));
                flagsAsia.add(new Quiz(R.string.co_as_cambodia_kh, R.drawable.kh, context.getString(R.string.flag_question) + context.getString(R.string.co_as_cambodia_kh)));
                flagsAsia.add(new Quiz(R.string.co_as_cyprus_cy, R.drawable.cy, context.getString(R.string.flag_question) + context.getString(R.string.co_as_cyprus_cy)));
                flagsAsia.add(new Quiz(R.string.co_as_east_timor_tl, R.drawable.tl, context.getString(R.string.flag_question) + context.getString(R.string.co_as_east_timor_tl)));

                flagsAsia.add(new Quiz(R.string.co_as_egypt_eg, R.drawable.eg, context.getString(R.string.flag_question) + context.getString(R.string.co_as_egypt_eg)));
                flagsAsia.add(new Quiz(R.string.co_as_georgia_ge, R.drawable.ge, context.getString(R.string.flag_question) + context.getString(R.string.co_as_georgia_ge)));
                flagsAsia.add(new Quiz(R.string.co_as_india_in, R.drawable.in, context.getString(R.string.flag_question) + context.getString(R.string.co_as_india_in)));
                flagsAsia.add(new Quiz(R.string.co_as_indonesia_id, R.drawable.id, context.getString(R.string.flag_question) + context.getString(R.string.co_as_indonesia_id)));
                flagsAsia.add(new Quiz(R.string.co_as_iran_ir, R.drawable.ir, context.getString(R.string.flag_question) + context.getString(R.string.co_as_iran_ir)));

                flagsAsia.add(new Quiz(R.string.co_as_iraq_iq, R.drawable.iq, context.getString(R.string.flag_question) + context.getString(R.string.co_as_iraq_iq)));
                flagsAsia.add(new Quiz(R.string.co_as_israel_il, R.drawable.il, context.getString(R.string.flag_question) + context.getString(R.string.co_as_israel_il)));
                flagsAsia.add(new Quiz(R.string.co_as_japan_jp, R.drawable.jp, context.getString(R.string.flag_question) + context.getString(R.string.co_as_japan_jp)));
                flagsAsia.add(new Quiz(R.string.co_as_jordan_jo, R.drawable.jo, context.getString(R.string.flag_question) + context.getString(R.string.co_as_jordan_jo)));
                flagsAsia.add(new Quiz(R.string.co_as_kazakhstan_kz, R.drawable.kz, context.getString(R.string.flag_question) + context.getString(R.string.co_as_kazakhstan_kz)));

                flagsAsia.add(new Quiz(R.string.co_as_kuwait_kw, R.drawable.kw, context.getString(R.string.flag_question) + context.getString(R.string.co_as_kuwait_kw)));
                flagsAsia.add(new Quiz(R.string.co_as_kyrgyzstan_kg, R.drawable.kg, context.getString(R.string.flag_question) + context.getString(R.string.co_as_kyrgyzstan_kg)));
                flagsAsia.add(new Quiz(R.string.co_as_laos_la, R.drawable.la, context.getString(R.string.flag_question) + context.getString(R.string.co_as_laos_la)));
                flagsAsia.add(new Quiz(R.string.co_as_lebanon_lb, R.drawable.lb, context.getString(R.string.flag_question) + context.getString(R.string.co_as_lebanon_lb)));
                flagsAsia.add(new Quiz(R.string.co_as_malaysia_my, R.drawable.my, context.getString(R.string.flag_question) + context.getString(R.string.co_as_malaysia_my)));

                flagsAsia.add(new Quiz(R.string.co_as_maldives_mv, R.drawable.mv, context.getString(R.string.flag_question) + context.getString(R.string.co_as_maldives_mv)));
                flagsAsia.add(new Quiz(R.string.co_as_mongolia_mn, R.drawable.mn, context.getString(R.string.flag_question) + context.getString(R.string.co_as_mongolia_mn)));
                flagsAsia.add(new Quiz(R.string.co_as_myanmar_mm, R.drawable.mm, context.getString(R.string.flag_question) + context.getString(R.string.co_as_myanmar_mm)));
                flagsAsia.add(new Quiz(R.string.co_as_nepal_np, R.drawable.np, context.getString(R.string.flag_question) + context.getString(R.string.co_as_nepal_np)));
                flagsAsia.add(new Quiz(R.string.co_as_north_korea_kp, R.drawable.kp, context.getString(R.string.flag_question) + context.getString(R.string.co_as_north_korea_kp)));

                flagsAsia.add(new Quiz(R.string.co_as_oman_om, R.drawable.om, context.getString(R.string.flag_question) + context.getString(R.string.co_as_oman_om)));
                flagsAsia.add(new Quiz(R.string.co_as_pakistan_pk, R.drawable.pk, context.getString(R.string.flag_question) + context.getString(R.string.co_as_pakistan_pk)));
                flagsAsia.add(new Quiz(R.string.co_as_the_peoples_republic_of_china_cn, R.drawable.cn, context.getString(R.string.flag_question) + context.getString(R.string.co_as_the_peoples_republic_of_china_cn)));
                flagsAsia.add(new Quiz(R.string.co_as_the_philippines_ph, R.drawable.ph, context.getString(R.string.flag_question) + context.getString(R.string.co_as_the_philippines_ph)));
                flagsAsia.add(new Quiz(R.string.co_as_qatar_qa, R.drawable.qa, context.getString(R.string.flag_question) + context.getString(R.string.co_as_qatar_qa)));

                flagsAsia.add(new Quiz(R.string.co_as_the_republic_of_china_tw, R.drawable.tw, context.getString(R.string.flag_question) + context.getString(R.string.co_as_the_republic_of_china_tw)));
                flagsAsia.add(new Quiz(R.string.co_as_russia_ru, R.drawable.ru, context.getString(R.string.flag_question) + context.getString(R.string.co_as_russia_ru)));
                flagsAsia.add(new Quiz(R.string.co_as_saudi_arabia_sa, R.drawable.sa, context.getString(R.string.flag_question) + context.getString(R.string.co_as_saudi_arabia_sa)));
                flagsAsia.add(new Quiz(R.string.co_as_singapore_sg, R.drawable.sg, context.getString(R.string.flag_question) + context.getString(R.string.co_as_singapore_sg)));
                flagsAsia.add(new Quiz(R.string.co_as_south_korea_kr, R.drawable.kr, context.getString(R.string.flag_question) + context.getString(R.string.co_as_south_korea_kr)));

                flagsAsia.add(new Quiz(R.string.co_as_sri_lanka_lk, R.drawable.lk, context.getString(R.string.flag_question) + context.getString(R.string.co_as_sri_lanka_lk)));
                flagsAsia.add(new Quiz(R.string.co_as_syria_sy, R.drawable.sy, context.getString(R.string.flag_question) + context.getString(R.string.co_as_syria_sy)));
                flagsAsia.add(new Quiz(R.string.co_as_tajikistan_tj, R.drawable.tj, context.getString(R.string.flag_question) + context.getString(R.string.co_as_tajikistan_tj)));
                flagsAsia.add(new Quiz(R.string.co_as_thailand_th, R.drawable.th, context.getString(R.string.flag_question) + context.getString(R.string.co_as_thailand_th)));
                flagsAsia.add(new Quiz(R.string.co_as_turkey_tr, R.drawable.tr, context.getString(R.string.flag_question) + context.getString(R.string.co_as_turkey_tr)));

                flagsAsia.add(new Quiz(R.string.co_as_turkmenistan_tm, R.drawable.tm, context.getString(R.string.flag_question) + context.getString(R.string.co_as_turkmenistan_tm)));
                flagsAsia.add(new Quiz(R.string.co_as_the_united_arab_emirates_ae, R.drawable.ae, context.getString(R.string.flag_question) + context.getString(R.string.co_as_the_united_arab_emirates_ae)));
                flagsAsia.add(new Quiz(R.string.co_as_uzbekistan_uz, R.drawable.uz, context.getString(R.string.flag_question) + context.getString(R.string.co_as_uzbekistan_uz)));
                flagsAsia.add(new Quiz(R.string.co_as_vietnam_vn, R.drawable.vn, context.getString(R.string.flag_question) + context.getString(R.string.co_as_vietnam_vn)));
                flagsAsia.add(new Quiz(R.string.co_as_yemen_ye, R.drawable.ye, context.getString(R.string.flag_question) + context.getString(R.string.co_as_yemen_ye)));
                setValue(flagsAsia);
                break;

            case F_EUROPE:
                List<Quiz> flagsEurope = new ArrayList<>();
                flagsEurope.add(new Quiz(R.string.co_eu_albania_al, R.drawable.al, context.getString(R.string.flag_question) + context.getString(R.string.co_eu_albania_al)));
                flagsEurope.add(new Quiz(R.string.co_eu_andorra_ad, R.drawable.ad, context.getString(R.string.flag_question) + context.getString(R.string.co_eu_andorra_ad)));
                flagsEurope.add(new Quiz(R.string.co_eu_austria_at, R.drawable.at, context.getString(R.string.flag_question) + context.getString(R.string.co_eu_austria_at)));
                flagsEurope.add(new Quiz(R.string.co_eu_belarus_by, R.drawable.by, context.getString(R.string.flag_question) + context.getString(R.string.co_eu_belarus_by)));
                flagsEurope.add(new Quiz(R.string.co_eu_belgium_be, R.drawable.be, context.getString(R.string.flag_question) + context.getString(R.string.co_eu_belgium_be)));

                flagsEurope.add(new Quiz(R.string.co_eu_bosnia_and_herzegovina_ba, R.drawable.ba, context.getString(R.string.flag_question) + context.getString(R.string.co_eu_bosnia_and_herzegovina_ba)));
                flagsEurope.add(new Quiz(R.string.co_eu_bulgaria_bg, R.drawable.bg, context.getString(R.string.flag_question) + context.getString(R.string.co_eu_bulgaria_bg)));
                flagsEurope.add(new Quiz(R.string.co_eu_croatia_hr, R.drawable.hr, context.getString(R.string.flag_question) + context.getString(R.string.co_eu_croatia_hr)));
                flagsEurope.add(new Quiz(R.string.co_eu_the_czech_republic_cz, R.drawable.cz, context.getString(R.string.flag_question) + context.getString(R.string.co_eu_the_czech_republic_cz)));
                flagsEurope.add(new Quiz(R.string.co_eu_denmark_dk, R.drawable.dk, context.getString(R.string.flag_question) + context.getString(R.string.co_eu_denmark_dk)));

                flagsEurope.add(new Quiz(R.string.co_eu_estonia_ee, R.drawable.ee, context.getString(R.string.flag_question) + context.getString(R.string.co_eu_estonia_ee)));
                flagsEurope.add(new Quiz(R.string.co_eu_finland_fi, R.drawable.fi, context.getString(R.string.flag_question) + context.getString(R.string.co_eu_finland_fi)));
                flagsEurope.add(new Quiz(R.string.co_eu_france_fr, R.drawable.fr, context.getString(R.string.flag_question) + context.getString(R.string.co_eu_france_fr)));
                flagsEurope.add(new Quiz(R.string.co_eu_germany_de, R.drawable.de, context.getString(R.string.flag_question) + context.getString(R.string.co_eu_germany_de)));
                flagsEurope.add(new Quiz(R.string.co_eu_greece_gr, R.drawable.gr, context.getString(R.string.flag_question) + context.getString(R.string.co_eu_greece_gr)));

                flagsEurope.add(new Quiz(R.string.co_eu_hungary_hu, R.drawable.hu, context.getString(R.string.flag_question) + context.getString(R.string.co_eu_hungary_hu)));
                flagsEurope.add(new Quiz(R.string.co_eu_iceland_is, R.drawable.is, context.getString(R.string.flag_question) + context.getString(R.string.co_eu_iceland_is)));
                flagsEurope.add(new Quiz(R.string.co_eu_ireland_ie, R.drawable.ie, context.getString(R.string.flag_question) + context.getString(R.string.co_eu_ireland_ie)));
                flagsEurope.add(new Quiz(R.string.co_eu_italy_it, R.drawable.it, context.getString(R.string.flag_question) + context.getString(R.string.co_eu_italy_it)));
                flagsEurope.add(new Quiz(R.string.co_eu_kosovo_xk, R.drawable.mk, context.getString(R.string.flag_question) + context.getString(R.string.co_eu_kosovo_xk)));

                flagsEurope.add(new Quiz(R.string.co_eu_latvia_lv, R.drawable.lv, context.getString(R.string.flag_question) + context.getString(R.string.co_eu_latvia_lv)));
                flagsEurope.add(new Quiz(R.string.co_eu_liechtenstein_li, R.drawable.li, context.getString(R.string.flag_question) + context.getString(R.string.co_eu_liechtenstein_li)));
                flagsEurope.add(new Quiz(R.string.co_eu_lithuania_lt, R.drawable.lt, context.getString(R.string.flag_question) + context.getString(R.string.co_eu_lithuania_lt)));
                flagsEurope.add(new Quiz(R.string.co_eu_luxembourg_lu, R.drawable.lu, context.getString(R.string.flag_question) + context.getString(R.string.co_eu_luxembourg_lu)));
                flagsEurope.add(new Quiz(R.string.co_eu_macedonia_mk, R.drawable.mk, context.getString(R.string.flag_question) + context.getString(R.string.co_eu_macedonia_mk)));

                flagsEurope.add(new Quiz(R.string.co_eu_malta_mt, R.drawable.mt, context.getString(R.string.flag_question) + context.getString(R.string.co_eu_malta_mt)));
                flagsEurope.add(new Quiz(R.string.co_eu_moldova_md, R.drawable.md, context.getString(R.string.flag_question) + context.getString(R.string.co_eu_moldova_md)));
                flagsEurope.add(new Quiz(R.string.co_eu_monaco_mc, R.drawable.mc, context.getString(R.string.flag_question) + context.getString(R.string.co_eu_monaco_mc)));
                flagsEurope.add(new Quiz(R.string.co_eu_montenegro_me, R.drawable.me, context.getString(R.string.flag_question) + context.getString(R.string.co_eu_montenegro_me)));
                flagsEurope.add(new Quiz(R.string.co_eu_the_netherlands_nl, R.drawable.nl, context.getString(R.string.flag_question) + context.getString(R.string.co_eu_the_netherlands_nl)));

                flagsEurope.add(new Quiz(R.string.co_eu_norway_no, R.drawable.no, context.getString(R.string.flag_question) + context.getString(R.string.co_eu_norway_no)));
                flagsEurope.add(new Quiz(R.string.co_eu_poland_pl, R.drawable.pl, context.getString(R.string.flag_question) + context.getString(R.string.co_eu_poland_pl)));
                flagsEurope.add(new Quiz(R.string.co_eu_portugal_pt, R.drawable.pt, context.getString(R.string.flag_question) + context.getString(R.string.co_eu_portugal_pt)));
                flagsEurope.add(new Quiz(R.string.co_eu_romania_ro, R.drawable.ro, context.getString(R.string.flag_question) + context.getString(R.string.co_eu_romania_ro)));
                flagsEurope.add(new Quiz(R.string.co_eu_russia_ru, R.drawable.ru, context.getString(R.string.flag_question) + context.getString(R.string.co_eu_russia_ru)));

                flagsEurope.add(new Quiz(R.string.co_eu_san_marino_sm, R.drawable.sm, context.getString(R.string.flag_question) + context.getString(R.string.co_eu_san_marino_sm)));
                flagsEurope.add(new Quiz(R.string.co_eu_serbia_rs, R.drawable.rs, context.getString(R.string.flag_question) + context.getString(R.string.co_eu_serbia_rs)));
                flagsEurope.add(new Quiz(R.string.co_eu_slovakia_sk, R.drawable.sk, context.getString(R.string.flag_question) + context.getString(R.string.co_eu_slovakia_sk)));
                flagsEurope.add(new Quiz(R.string.co_eu_slovenia_si, R.drawable.si, context.getString(R.string.flag_question) + context.getString(R.string.co_eu_slovenia_si)));
                flagsEurope.add(new Quiz(R.string.co_eu_spain_es, R.drawable.es, context.getString(R.string.flag_question) + context.getString(R.string.co_eu_spain_es)));

                flagsEurope.add(new Quiz(R.string.co_eu_sweden_se, R.drawable.se, context.getString(R.string.flag_question) + context.getString(R.string.co_eu_sweden_se)));
                flagsEurope.add(new Quiz(R.string.co_eu_switzerland_ch, R.drawable.ch, context.getString(R.string.flag_question) + context.getString(R.string.co_eu_switzerland_ch)));
                flagsEurope.add(new Quiz(R.string.co_eu_turkey_tr, R.drawable.tr, context.getString(R.string.flag_question) + context.getString(R.string.co_eu_turkey_tr)));
                flagsEurope.add(new Quiz(R.string.co_eu_ukraine_ua, R.drawable.ua, context.getString(R.string.flag_question) + context.getString(R.string.co_eu_ukraine_ua)));
                flagsEurope.add(new Quiz(R.string.co_eu_the_united_kingdom_gb, R.drawable.gb, context.getString(R.string.flag_question) + context.getString(R.string.co_eu_the_united_kingdom_gb)));
                flagsEurope.add(new Quiz(R.string.co_eu_the_vatican_city_state_va, R.drawable.va, context.getString(R.string.flag_question) + context.getString(R.string.co_eu_the_vatican_city_state_va)));
                setValue(flagsEurope);
                break;

            case F_NORTH_AMERICA:
                List<Quiz> flagsNAmerica = new ArrayList<>();
                flagsNAmerica.add(new Quiz(R.string.co_na_antigua_and_barbuda_ag, R.drawable.ag, context.getString(R.string.flag_question) + context.getString(R.string.co_na_antigua_and_barbuda_ag)));
                flagsNAmerica.add(new Quiz(R.string.co_na_the_bahamas_bs, R.drawable.bs, context.getString(R.string.flag_question) + context.getString(R.string.co_na_the_bahamas_bs)));
                flagsNAmerica.add(new Quiz(R.string.co_na_barbados_bb, R.drawable.bb, context.getString(R.string.flag_question) + context.getString(R.string.co_na_barbados_bb)));
                flagsNAmerica.add(new Quiz(R.string.co_na_belize_bz, R.drawable.bz, context.getString(R.string.flag_question) + context.getString(R.string.co_na_belize_bz)));
                flagsNAmerica.add(new Quiz(R.string.co_na_canada_ca, R.drawable.ca, context.getString(R.string.flag_question) + context.getString(R.string.co_na_canada_ca)));

                flagsNAmerica.add(new Quiz(R.string.co_na_costa_rica_cr, R.drawable.cr, context.getString(R.string.flag_question) + context.getString(R.string.co_na_costa_rica_cr)));
                flagsNAmerica.add(new Quiz(R.string.co_na_cuba_cu, R.drawable.cu, context.getString(R.string.flag_question) + context.getString(R.string.co_na_cuba_cu)));
                flagsNAmerica.add(new Quiz(R.string.co_na_dominica_dm, R.drawable.dm, context.getString(R.string.flag_question) + context.getString(R.string.co_na_dominica_dm)));
                flagsNAmerica.add(new Quiz(R.string.co_na_the_dominican_republic_do, R.drawable.dom, context.getString(R.string.flag_question) + context.getString(R.string.co_na_the_dominican_republic_do)));
                flagsNAmerica.add(new Quiz(R.string.co_na_el_salvador_sv, R.drawable.sv, context.getString(R.string.flag_question) + context.getString(R.string.co_na_el_salvador_sv)));

                flagsNAmerica.add(new Quiz(R.string.co_na_grenada_gd, R.drawable.gd, context.getString(R.string.flag_question) + context.getString(R.string.co_na_grenada_gd)));
                flagsNAmerica.add(new Quiz(R.string.co_na_guatemala_gt, R.drawable.gt, context.getString(R.string.flag_question) + context.getString(R.string.co_na_guatemala_gt)));
                flagsNAmerica.add(new Quiz(R.string.co_na_haiti_ht, R.drawable.ht, context.getString(R.string.flag_question) + context.getString(R.string.co_na_haiti_ht)));
                flagsNAmerica.add(new Quiz(R.string.co_na_honduras_hn, R.drawable.hn, context.getString(R.string.flag_question) + context.getString(R.string.co_na_honduras_hn)));
                flagsNAmerica.add(new Quiz(R.string.co_na_jamaica_jm, R.drawable.jm, context.getString(R.string.flag_question) + context.getString(R.string.co_na_jamaica_jm)));

                flagsNAmerica.add(new Quiz(R.string.co_na_mexico_mx, R.drawable.mx, context.getString(R.string.flag_question) + context.getString(R.string.co_na_mexico_mx)));
                flagsNAmerica.add(new Quiz(R.string.co_na_nicaragua_ni, R.drawable.ni, context.getString(R.string.flag_question) + context.getString(R.string.co_na_nicaragua_ni)));
                flagsNAmerica.add(new Quiz(R.string.co_na_panama_pa, R.drawable.pa, context.getString(R.string.flag_question) + context.getString(R.string.co_na_panama_pa)));
                flagsNAmerica.add(new Quiz(R.string.co_na_saint_kitts_and_nevis_kn, R.drawable.kn, context.getString(R.string.flag_question) + context.getString(R.string.co_na_saint_kitts_and_nevis_kn)));
                flagsNAmerica.add(new Quiz(R.string.co_na_saint_lucia_lc, R.drawable.lc, context.getString(R.string.flag_question) + context.getString(R.string.co_na_saint_lucia_lc)));

                flagsNAmerica.add(new Quiz(R.string.co_na_saint_vincent_and_the_grenadines_vc, R.drawable.vc, context.getString(R.string.flag_question) + context.getString(R.string.co_na_saint_vincent_and_the_grenadines_vc)));
                flagsNAmerica.add(new Quiz(R.string.co_na_trinidad_and_tobago_tt, R.drawable.tt, context.getString(R.string.flag_question) + context.getString(R.string.co_na_trinidad_and_tobago_tt)));
                flagsNAmerica.add(new Quiz(R.string.co_na_the_united_states_us, R.drawable.us, context.getString(R.string.flag_question) + context.getString(R.string.co_na_the_united_states_us)));
                setValue(flagsNAmerica);
                break;

            case F_SOUTH_AMERICA:
                List<Quiz> flagsSAmerica = new ArrayList<>();
                flagsSAmerica.add(new Quiz(R.string.co_sa_argentina_ar, R.drawable.ar, context.getString(R.string.flag_question) + context.getString(R.string.co_sa_argentina_ar)));
                flagsSAmerica.add(new Quiz(R.string.co_sa_bolivia_bo, R.drawable.bo, context.getString(R.string.flag_question) + context.getString(R.string.co_sa_bolivia_bo)));
                flagsSAmerica.add(new Quiz(R.string.co_sa_brazil_br, R.drawable.br, context.getString(R.string.flag_question) + context.getString(R.string.co_sa_brazil_br)));
                flagsSAmerica.add(new Quiz(R.string.co_sa_chile_cl, R.drawable.cl, context.getString(R.string.flag_question) + context.getString(R.string.co_sa_chile_cl)));
                flagsSAmerica.add(new Quiz(R.string.co_sa_colombia_co, R.drawable.co, context.getString(R.string.flag_question) + context.getString(R.string.co_sa_colombia_co)));

                flagsSAmerica.add(new Quiz(R.string.co_sa_ecuador_ec, R.drawable.ec, context.getString(R.string.flag_question) + context.getString(R.string.co_sa_ecuador_ec)));
                flagsSAmerica.add(new Quiz(R.string.co_sa_guyana_gy, R.drawable.gy, context.getString(R.string.flag_question) + context.getString(R.string.co_sa_guyana_gy)));
                flagsSAmerica.add(new Quiz(R.string.co_sa_paraguay_py, R.drawable.py, context.getString(R.string.flag_question) + context.getString(R.string.co_sa_paraguay_py)));
                flagsSAmerica.add(new Quiz(R.string.co_sa_peru_pe, R.drawable.pe, context.getString(R.string.flag_question) + context.getString(R.string.co_sa_peru_pe)));
                flagsSAmerica.add(new Quiz(R.string.co_sa_suriname_sr, R.drawable.sr, context.getString(R.string.flag_question) + context.getString(R.string.co_sa_suriname_sr)));

                flagsSAmerica.add(new Quiz(R.string.co_sa_trinidad_and_tobago_tt, R.drawable.tt, context.getString(R.string.flag_question) + context.getString(R.string.co_sa_trinidad_and_tobago_tt)));
                flagsSAmerica.add(new Quiz(R.string.co_sa_uruguay_uy, R.drawable.uy, context.getString(R.string.flag_question) + context.getString(R.string.co_sa_uruguay_uy)));
                flagsSAmerica.add(new Quiz(R.string.co_sa_venezuela_ve, R.drawable.ve, context.getString(R.string.flag_question) + context.getString(R.string.co_sa_venezuela_ve)));
                setValue(flagsSAmerica);
                break;

            case F_OCEANIA:
                List<Quiz> flagsOceania = new ArrayList<>();
                flagsOceania.add(new Quiz(R.string.co_oc_australia_au, R.drawable.au, context.getString(R.string.flag_question) + context.getString(R.string.co_oc_australia_au)));
                flagsOceania.add(new Quiz(R.string.co_oc_cook_islands_ck, R.drawable.co, context.getString(R.string.flag_question) + context.getString(R.string.co_oc_cook_islands_ck)));
                flagsOceania.add(new Quiz(R.string.co_oc_east_timor_tl, R.drawable.tl, context.getString(R.string.flag_question) + context.getString(R.string.co_oc_east_timor_tl)));
                flagsOceania.add(new Quiz(R.string.co_oc_fiji_fj, R.drawable.fj, context.getString(R.string.flag_question) + context.getString(R.string.co_oc_fiji_fj)));
                flagsOceania.add(new Quiz(R.string.co_oc_indonesia_id, R.drawable.id, context.getString(R.string.flag_question) + context.getString(R.string.co_oc_indonesia_id)));

                flagsOceania.add(new Quiz(R.string.co_oc_kiribati_ki, R.drawable.ki, context.getString(R.string.flag_question) + context.getString(R.string.co_oc_kiribati_ki)));
                flagsOceania.add(new Quiz(R.string.co_oc_the_marshall_islands_mh, R.drawable.mh, context.getString(R.string.flag_question) + context.getString(R.string.co_oc_the_marshall_islands_mh)));
                flagsOceania.add(new Quiz(R.string.co_oc_micronesia_fm, R.drawable.fm, context.getString(R.string.flag_question) + context.getString(R.string.co_oc_micronesia_fm)));
                flagsOceania.add(new Quiz(R.string.co_oc_nauru_nr, R.drawable.nr, context.getString(R.string.flag_question) + context.getString(R.string.co_oc_nauru_nr)));
                flagsOceania.add(new Quiz(R.string.co_oc_new_zealand_nz, R.drawable.nz, context.getString(R.string.flag_question) + context.getString(R.string.co_oc_new_zealand_nz)));

                flagsOceania.add(new Quiz(R.string.co_oc_niue_nu, R.drawable.fm, context.getString(R.string.flag_question) + context.getString(R.string.co_oc_niue_nu)));
                flagsOceania.add(new Quiz(R.string.co_oc_palau_pw, R.drawable.co, context.getString(R.string.flag_question) + context.getString(R.string.co_oc_palau_pw)));
                flagsOceania.add(new Quiz(R.string.co_oc_papua_new_guinea_pg, R.drawable.pg, context.getString(R.string.flag_question) + context.getString(R.string.co_oc_papua_new_guinea_pg)));
                flagsOceania.add(new Quiz(R.string.co_oc_samoa_ws, R.drawable.ws, context.getString(R.string.flag_question) + context.getString(R.string.co_oc_samoa_ws)));
                flagsOceania.add(new Quiz(R.string.co_oc_the_solomon_islands_sb, R.drawable.sb, context.getString(R.string.flag_question) + context.getString(R.string.co_oc_the_solomon_islands_sb)));

                flagsOceania.add(new Quiz(R.string.co_oc_tonga_to, R.drawable.to, context.getString(R.string.flag_question) + context.getString(R.string.co_oc_tonga_to)));
                flagsOceania.add(new Quiz(R.string.co_oc_tuvalu_tv, R.drawable.tv, context.getString(R.string.flag_question) + context.getString(R.string.co_oc_tuvalu_tv)));
                flagsOceania.add(new Quiz(R.string.co_oc_vanuatu_vu, R.drawable.vu, context.getString(R.string.flag_question) + context.getString(R.string.co_oc_vanuatu_vu)));
                setValue(flagsOceania);
                break;

            case C_AFRICA:
                List<Quiz> capitalsAfrica = new ArrayList<>();
                capitalsAfrica.add(new Quiz(R.string.co_af_algeria_dz, R.drawable.dz, context.getString(R.string.capital_question) + context.getString(R.string.co_af_algeria_dz)));
                capitalsAfrica.add(new Quiz(R.string.co_af_angola_ao, R.drawable.ao, context.getString(R.string.capital_question) + context.getString(R.string.co_af_angola_ao)));
                capitalsAfrica.add(new Quiz(R.string.co_af_benin_bj, R.drawable.bj, context.getString(R.string.capital_question) + context.getString(R.string.co_af_benin_bj)));
                capitalsAfrica.add(new Quiz(R.string.co_af_botswana_bw, R.drawable.bw, context.getString(R.string.capital_question) + context.getString(R.string.co_af_botswana_bw)));
                capitalsAfrica.add(new Quiz(R.string.co_af_burkina_faso_bf, R.drawable.bf, context.getString(R.string.capital_question) + context.getString(R.string.co_af_burkina_faso_bf)));

                capitalsAfrica.add(new Quiz(R.string.co_af_burundi_bi, R.drawable.bi, context.getString(R.string.capital_question) + context.getString(R.string.co_af_burundi_bi)));
                capitalsAfrica.add(new Quiz(R.string.co_af_cameroon_cm, R.drawable.cm, context.getString(R.string.capital_question) + context.getString(R.string.co_af_cameroon_cm)));
                capitalsAfrica.add(new Quiz(R.string.co_af_cape_verde_cv, R.drawable.cv, context.getString(R.string.capital_question) + context.getString(R.string.co_af_cape_verde_cv)));
                capitalsAfrica.add(new Quiz(R.string.co_af_the_central_african_republic_cf, R.drawable.cf, context.getString(R.string.capital_question) + context.getString(R.string.co_af_the_central_african_republic_cf)));
                capitalsAfrica.add(new Quiz(R.string.co_af_chad_td, R.drawable.td, context.getString(R.string.capital_question) + context.getString(R.string.co_af_chad_td)));

                capitalsAfrica.add(new Quiz(R.string.co_af_the_comoros_km, R.drawable.km, context.getString(R.string.capital_question) + context.getString(R.string.co_af_the_comoros_km)));
                capitalsAfrica.add(new Quiz(R.string.co_af_ivory_coast_ci, R.drawable.ci, context.getString(R.string.capital_question) + context.getString(R.string.co_af_ivory_coast_ci)));
                capitalsAfrica.add(new Quiz(R.string.co_af_the_democratic_republic_of_the_congo_cd, R.drawable.cd, context.getString(R.string.capital_question) + context.getString(R.string.co_af_the_democratic_republic_of_the_congo_cd)));
                capitalsAfrica.add(new Quiz(R.string.co_af_djibouti_dj, R.drawable.dj, context.getString(R.string.capital_question) + context.getString(R.string.co_af_djibouti_dj)));
                capitalsAfrica.add(new Quiz(R.string.co_af_egypt_eg, R.drawable.eg, context.getString(R.string.capital_question) + context.getString(R.string.co_af_egypt_eg)));

                capitalsAfrica.add(new Quiz(R.string.co_af_equatorial_guinea_gq, R.drawable.gq, context.getString(R.string.capital_question) + context.getString(R.string.co_af_equatorial_guinea_gq)));
                capitalsAfrica.add(new Quiz(R.string.co_af_eritrea_er, R.drawable.er, context.getString(R.string.capital_question) + context.getString(R.string.co_af_eritrea_er)));
                capitalsAfrica.add(new Quiz(R.string.co_af_ethiopia_et, R.drawable.et, context.getString(R.string.capital_question) + context.getString(R.string.co_af_ethiopia_et)));
                capitalsAfrica.add(new Quiz(R.string.co_af_gabon_ga, R.drawable.ga, context.getString(R.string.capital_question) + context.getString(R.string.co_af_gabon_ga)));
                capitalsAfrica.add(new Quiz(R.string.co_af_the_gambia_gm, R.drawable.gm, context.getString(R.string.capital_question) + context.getString(R.string.co_af_the_gambia_gm)));

                capitalsAfrica.add(new Quiz(R.string.co_af_ghana_gh, R.drawable.gh, context.getString(R.string.capital_question) + context.getString(R.string.co_af_ghana_gh)));
                capitalsAfrica.add(new Quiz(R.string.co_af_guinea_gn, R.drawable.gn, context.getString(R.string.capital_question) + context.getString(R.string.co_af_guinea_gn)));
                capitalsAfrica.add(new Quiz(R.string.co_af_guinea_bissau_gw, R.drawable.gw, context.getString(R.string.capital_question) + context.getString(R.string.co_af_guinea_bissau_gw)));
                capitalsAfrica.add(new Quiz(R.string.co_af_kenya_ke, R.drawable.ke, context.getString(R.string.capital_question) + context.getString(R.string.co_af_kenya_ke)));
                capitalsAfrica.add(new Quiz(R.string.co_af_lesotho_ls, R.drawable.ls, context.getString(R.string.capital_question) + context.getString(R.string.co_af_lesotho_ls)));

                capitalsAfrica.add(new Quiz(R.string.co_af_liberia_lr, R.drawable.lr, context.getString(R.string.capital_question) + context.getString(R.string.co_af_liberia_lr)));
                capitalsAfrica.add(new Quiz(R.string.co_af_libya_ly, R.drawable.ly, context.getString(R.string.capital_question) + context.getString(R.string.co_af_libya_ly)));
                capitalsAfrica.add(new Quiz(R.string.co_af_madagascar_mg, R.drawable.mg, context.getString(R.string.capital_question) + context.getString(R.string.co_af_madagascar_mg)));
                capitalsAfrica.add(new Quiz(R.string.co_af_malawi_mw, R.drawable.mw, context.getString(R.string.capital_question) + context.getString(R.string.co_af_malawi_mw)));
                capitalsAfrica.add(new Quiz(R.string.co_af_mali_ml, R.drawable.ml, context.getString(R.string.capital_question) + context.getString(R.string.co_af_mali_ml)));

                capitalsAfrica.add(new Quiz(R.string.co_af_mauritania_mr, R.drawable.mr, context.getString(R.string.capital_question) + context.getString(R.string.co_af_mauritania_mr)));
                capitalsAfrica.add(new Quiz(R.string.co_af_mauritius_mu, R.drawable.mu, context.getString(R.string.capital_question) + context.getString(R.string.co_af_mauritius_mu)));
                capitalsAfrica.add(new Quiz(R.string.co_af_morocco_ma, R.drawable.ma, context.getString(R.string.capital_question) + context.getString(R.string.co_af_morocco_ma)));
                capitalsAfrica.add(new Quiz(R.string.co_af_mozambique_mz, R.drawable.mz, context.getString(R.string.capital_question) + context.getString(R.string.co_af_mozambique_mz)));
                capitalsAfrica.add(new Quiz(R.string.co_af_namibia_na, R.drawable.na, context.getString(R.string.capital_question) + context.getString(R.string.co_af_namibia_na)));

                capitalsAfrica.add(new Quiz(R.string.co_af_niger_ne, R.drawable.ne, context.getString(R.string.capital_question) + context.getString(R.string.co_af_niger_ne)));
                capitalsAfrica.add(new Quiz(R.string.co_af_nigeria_ng, R.drawable.ng, context.getString(R.string.capital_question) + context.getString(R.string.co_af_nigeria_ng)));
                capitalsAfrica.add(new Quiz(R.string.co_af_the_republic_of_the_congo_cg, R.drawable.cg, context.getString(R.string.capital_question) + context.getString(R.string.co_af_the_republic_of_the_congo_cg)));
                capitalsAfrica.add(new Quiz(R.string.co_af_rwanda_rw, R.drawable.rw, context.getString(R.string.capital_question) + context.getString(R.string.co_af_rwanda_rw)));
                capitalsAfrica.add(new Quiz(R.string.co_af_sao_tome_and_principe_st, R.drawable.st, context.getString(R.string.capital_question) + context.getString(R.string.co_af_sao_tome_and_principe_st)));

                capitalsAfrica.add(new Quiz(R.string.co_af_senegal_sn, R.drawable.sn, context.getString(R.string.capital_question) + context.getString(R.string.co_af_senegal_sn)));
                capitalsAfrica.add(new Quiz(R.string.co_af_the_seychelles_sc, R.drawable.sc, context.getString(R.string.capital_question) + context.getString(R.string.co_af_the_seychelles_sc)));
                capitalsAfrica.add(new Quiz(R.string.co_af_sierra_leone_sl, R.drawable.sl, context.getString(R.string.capital_question) + context.getString(R.string.co_af_sierra_leone_sl)));
                capitalsAfrica.add(new Quiz(R.string.co_af_somalia_so, R.drawable.so, context.getString(R.string.capital_question) + context.getString(R.string.co_af_somalia_so)));
                capitalsAfrica.add(new Quiz(R.string.co_af_south_africa_za, R.drawable.za, context.getString(R.string.capital_question) + context.getString(R.string.co_af_south_africa_za)));

                capitalsAfrica.add(new Quiz(R.string.co_af_south_sudan_sdn, R.drawable.sd, context.getString(R.string.capital_question) + context.getString(R.string.co_af_south_sudan_sdn)));
                capitalsAfrica.add(new Quiz(R.string.co_af_sudan_sd, R.drawable.sd, context.getString(R.string.capital_question) + context.getString(R.string.co_af_sudan_sd)));
                capitalsAfrica.add(new Quiz(R.string.co_af_swaziland_sz, R.drawable.sz, context.getString(R.string.capital_question) + context.getString(R.string.co_af_swaziland_sz)));
                capitalsAfrica.add(new Quiz(R.string.co_af_tanzania_tz, R.drawable.tz, context.getString(R.string.capital_question) + context.getString(R.string.co_af_tanzania_tz)));
                capitalsAfrica.add(new Quiz(R.string.co_af_togo_tg, R.drawable.tg, context.getString(R.string.capital_question) + context.getString(R.string.co_af_togo_tg)));

                capitalsAfrica.add(new Quiz(R.string.co_af_tunisia_tn, R.drawable.tn, context.getString(R.string.capital_question) + context.getString(R.string.co_af_tunisia_tn)));
                capitalsAfrica.add(new Quiz(R.string.co_af_uganda_ug, R.drawable.ug, context.getString(R.string.capital_question) + context.getString(R.string.co_af_uganda_ug)));
                capitalsAfrica.add(new Quiz(R.string.co_af_western_sahara_eh, R.drawable.eh, context.getString(R.string.capital_question) + context.getString(R.string.co_af_western_sahara_eh)));
                capitalsAfrica.add(new Quiz(R.string.co_af_zambia_zm, R.drawable.zm, context.getString(R.string.capital_question) + context.getString(R.string.co_af_zambia_zm)));
                capitalsAfrica.add(new Quiz(R.string.co_af_zimbabwe_zw, R.drawable.zw, context.getString(R.string.capital_question) + context.getString(R.string.co_af_zimbabwe_zw)));
                setValue(capitalsAfrica);
                break;

            case C_ASIA:
                List<Quiz> capitalsAsia = new ArrayList<>();
                capitalsAsia.add(new Quiz(R.string.co_as_afghanistan_af, R.drawable.af, context.getString(R.string.capital_question) + context.getString(R.string.co_as_afghanistan_af)));
                capitalsAsia.add(new Quiz(R.string.co_as_armenia_am, R.drawable.am, context.getString(R.string.capital_question) + context.getString(R.string.co_as_armenia_am)));
                capitalsAsia.add(new Quiz(R.string.co_as_azerbaijan_az, R.drawable.az, context.getString(R.string.capital_question) + context.getString(R.string.co_as_azerbaijan_az)));
                capitalsAsia.add(new Quiz(R.string.co_as_bahrain_bh, R.drawable.bh, context.getString(R.string.capital_question) + context.getString(R.string.co_as_bahrain_bh)));
                capitalsAsia.add(new Quiz(R.string.co_as_bangladesh_bd, R.drawable.bd, context.getString(R.string.capital_question) + context.getString(R.string.co_as_bangladesh_bd)));

                capitalsAsia.add(new Quiz(R.string.co_as_bhutan_bt, R.drawable.bt, context.getString(R.string.capital_question) + context.getString(R.string.co_as_bhutan_bt)));
                capitalsAsia.add(new Quiz(R.string.co_as_brunei_bn, R.drawable.br, context.getString(R.string.capital_question) + context.getString(R.string.co_as_brunei_bn)));
                capitalsAsia.add(new Quiz(R.string.co_as_cambodia_kh, R.drawable.kh, context.getString(R.string.capital_question) + context.getString(R.string.co_as_cambodia_kh)));
                capitalsAsia.add(new Quiz(R.string.co_as_cyprus_cy, R.drawable.cy, context.getString(R.string.capital_question) + context.getString(R.string.co_as_cyprus_cy)));
                capitalsAsia.add(new Quiz(R.string.co_as_east_timor_tl, R.drawable.tl, context.getString(R.string.capital_question) + context.getString(R.string.co_as_east_timor_tl)));

                capitalsAsia.add(new Quiz(R.string.co_as_egypt_eg, R.drawable.eg, context.getString(R.string.capital_question) + context.getString(R.string.co_as_egypt_eg)));
                capitalsAsia.add(new Quiz(R.string.co_as_georgia_ge, R.drawable.ge, context.getString(R.string.capital_question) + context.getString(R.string.co_as_georgia_ge)));
                capitalsAsia.add(new Quiz(R.string.co_as_india_in, R.drawable.in, context.getString(R.string.capital_question) + context.getString(R.string.co_as_india_in)));
                capitalsAsia.add(new Quiz(R.string.co_as_indonesia_id, R.drawable.id, context.getString(R.string.capital_question) + context.getString(R.string.co_as_indonesia_id)));
                capitalsAsia.add(new Quiz(R.string.co_as_iran_ir, R.drawable.ir, context.getString(R.string.capital_question) + context.getString(R.string.co_as_iran_ir)));

                capitalsAsia.add(new Quiz(R.string.co_as_iraq_iq, R.drawable.iq, context.getString(R.string.capital_question) + context.getString(R.string.co_as_iraq_iq)));
                capitalsAsia.add(new Quiz(R.string.co_as_israel_il, R.drawable.il, context.getString(R.string.capital_question) + context.getString(R.string.co_as_israel_il)));
                capitalsAsia.add(new Quiz(R.string.co_as_japan_jp, R.drawable.jp, context.getString(R.string.capital_question) + context.getString(R.string.co_as_japan_jp)));
                capitalsAsia.add(new Quiz(R.string.co_as_jordan_jo, R.drawable.jo, context.getString(R.string.capital_question) + context.getString(R.string.co_as_jordan_jo)));
                capitalsAsia.add(new Quiz(R.string.co_as_kazakhstan_kz, R.drawable.kz, context.getString(R.string.capital_question) + context.getString(R.string.co_as_kazakhstan_kz)));

                capitalsAsia.add(new Quiz(R.string.co_as_kuwait_kw, R.drawable.kw, context.getString(R.string.capital_question) + context.getString(R.string.co_as_kuwait_kw)));
                capitalsAsia.add(new Quiz(R.string.co_as_kyrgyzstan_kg, R.drawable.kg, context.getString(R.string.capital_question) + context.getString(R.string.co_as_kyrgyzstan_kg)));
                capitalsAsia.add(new Quiz(R.string.co_as_laos_la, R.drawable.la, context.getString(R.string.capital_question) + context.getString(R.string.co_as_laos_la)));
                capitalsAsia.add(new Quiz(R.string.co_as_lebanon_lb, R.drawable.lb, context.getString(R.string.capital_question) + context.getString(R.string.co_as_lebanon_lb)));
                capitalsAsia.add(new Quiz(R.string.co_as_malaysia_my, R.drawable.my, context.getString(R.string.capital_question) + context.getString(R.string.co_as_malaysia_my)));

                capitalsAsia.add(new Quiz(R.string.co_as_maldives_mv, R.drawable.mv, context.getString(R.string.capital_question) + context.getString(R.string.co_as_maldives_mv)));
                capitalsAsia.add(new Quiz(R.string.co_as_mongolia_mn, R.drawable.mn, context.getString(R.string.capital_question) + context.getString(R.string.co_as_mongolia_mn)));
                capitalsAsia.add(new Quiz(R.string.co_as_myanmar_mm, R.drawable.mm, context.getString(R.string.capital_question) + context.getString(R.string.co_as_myanmar_mm)));
                capitalsAsia.add(new Quiz(R.string.co_as_nepal_np, R.drawable.np, context.getString(R.string.capital_question) + context.getString(R.string.co_as_nepal_np)));
                capitalsAsia.add(new Quiz(R.string.co_as_north_korea_kp, R.drawable.kp, context.getString(R.string.capital_question) + context.getString(R.string.co_as_north_korea_kp)));

                capitalsAsia.add(new Quiz(R.string.co_as_oman_om, R.drawable.om, context.getString(R.string.capital_question) + context.getString(R.string.co_as_oman_om)));
                capitalsAsia.add(new Quiz(R.string.co_as_pakistan_pk, R.drawable.pk, context.getString(R.string.capital_question) + context.getString(R.string.co_as_pakistan_pk)));
                capitalsAsia.add(new Quiz(R.string.co_as_the_peoples_republic_of_china_cn, R.drawable.cn, context.getString(R.string.capital_question) + context.getString(R.string.co_as_the_peoples_republic_of_china_cn)));
                capitalsAsia.add(new Quiz(R.string.co_as_the_philippines_ph, R.drawable.ph, context.getString(R.string.capital_question) + context.getString(R.string.co_as_the_philippines_ph)));
                capitalsAsia.add(new Quiz(R.string.co_as_qatar_qa, R.drawable.qa, context.getString(R.string.capital_question) + context.getString(R.string.co_as_qatar_qa)));

                capitalsAsia.add(new Quiz(R.string.co_as_the_republic_of_china_tw, R.drawable.tw, context.getString(R.string.capital_question) + context.getString(R.string.co_as_the_republic_of_china_tw)));
                capitalsAsia.add(new Quiz(R.string.co_as_russia_ru, R.drawable.ru, context.getString(R.string.capital_question) + context.getString(R.string.co_as_russia_ru)));
                capitalsAsia.add(new Quiz(R.string.co_as_saudi_arabia_sa, R.drawable.sa, context.getString(R.string.capital_question) + context.getString(R.string.co_as_saudi_arabia_sa)));
                capitalsAsia.add(new Quiz(R.string.co_as_singapore_sg, R.drawable.sg, context.getString(R.string.capital_question) + context.getString(R.string.co_as_singapore_sg)));
                capitalsAsia.add(new Quiz(R.string.co_as_south_korea_kr, R.drawable.kr, context.getString(R.string.capital_question) + context.getString(R.string.co_as_south_korea_kr)));

                capitalsAsia.add(new Quiz(R.string.co_as_sri_lanka_lk, R.drawable.lk, context.getString(R.string.capital_question) + context.getString(R.string.co_as_sri_lanka_lk)));
                capitalsAsia.add(new Quiz(R.string.co_as_syria_sy, R.drawable.sy, context.getString(R.string.capital_question) + context.getString(R.string.co_as_syria_sy)));
                capitalsAsia.add(new Quiz(R.string.co_as_tajikistan_tj, R.drawable.tj, context.getString(R.string.capital_question) + context.getString(R.string.co_as_tajikistan_tj)));
                capitalsAsia.add(new Quiz(R.string.co_as_thailand_th, R.drawable.th, context.getString(R.string.capital_question) + context.getString(R.string.co_as_thailand_th)));
                capitalsAsia.add(new Quiz(R.string.co_as_turkey_tr, R.drawable.tr, context.getString(R.string.capital_question) + context.getString(R.string.co_as_turkey_tr)));

                capitalsAsia.add(new Quiz(R.string.co_as_turkmenistan_tm, R.drawable.tm, context.getString(R.string.capital_question) + context.getString(R.string.co_as_turkmenistan_tm)));
                capitalsAsia.add(new Quiz(R.string.co_as_the_united_arab_emirates_ae, R.drawable.ae, context.getString(R.string.capital_question) + context.getString(R.string.co_as_the_united_arab_emirates_ae)));
                capitalsAsia.add(new Quiz(R.string.co_as_uzbekistan_uz, R.drawable.uz, context.getString(R.string.capital_question) + context.getString(R.string.co_as_uzbekistan_uz)));
                capitalsAsia.add(new Quiz(R.string.co_as_vietnam_vn, R.drawable.vn, context.getString(R.string.capital_question) + context.getString(R.string.co_as_vietnam_vn)));
                capitalsAsia.add(new Quiz(R.string.co_as_yemen_ye, R.drawable.ye, context.getString(R.string.capital_question) + context.getString(R.string.co_as_yemen_ye)));
                setValue(capitalsAsia);
                break;

            case C_EUROPE:
                List<Quiz> capitalsEurope = new ArrayList<>();
                capitalsEurope.add(new Quiz(R.string.co_eu_albania_al, R.drawable.al, context.getString(R.string.capital_question) + context.getString(R.string.co_eu_albania_al)));
                capitalsEurope.add(new Quiz(R.string.co_eu_andorra_ad, R.drawable.ad, context.getString(R.string.capital_question) + context.getString(R.string.co_eu_andorra_ad)));
                capitalsEurope.add(new Quiz(R.string.co_eu_austria_at, R.drawable.at, context.getString(R.string.capital_question) + context.getString(R.string.co_eu_austria_at)));
                capitalsEurope.add(new Quiz(R.string.co_eu_belarus_by, R.drawable.by, context.getString(R.string.capital_question) + context.getString(R.string.co_eu_belarus_by)));
                capitalsEurope.add(new Quiz(R.string.co_eu_belgium_be, R.drawable.be, context.getString(R.string.capital_question) + context.getString(R.string.co_eu_belgium_be)));

                capitalsEurope.add(new Quiz(R.string.co_eu_bosnia_and_herzegovina_ba, R.drawable.ba, context.getString(R.string.capital_question) + context.getString(R.string.co_eu_bosnia_and_herzegovina_ba)));
                capitalsEurope.add(new Quiz(R.string.co_eu_bulgaria_bg, R.drawable.bg, context.getString(R.string.capital_question) + context.getString(R.string.co_eu_bulgaria_bg)));
                capitalsEurope.add(new Quiz(R.string.co_eu_croatia_hr, R.drawable.hr, context.getString(R.string.capital_question) + context.getString(R.string.co_eu_croatia_hr)));
                capitalsEurope.add(new Quiz(R.string.co_eu_the_czech_republic_cz, R.drawable.cz, context.getString(R.string.capital_question) + context.getString(R.string.co_eu_the_czech_republic_cz)));
                capitalsEurope.add(new Quiz(R.string.co_eu_denmark_dk, R.drawable.dk, context.getString(R.string.capital_question) + context.getString(R.string.co_eu_denmark_dk)));

                capitalsEurope.add(new Quiz(R.string.co_eu_estonia_ee, R.drawable.ee, context.getString(R.string.capital_question) + context.getString(R.string.co_eu_estonia_ee)));
                capitalsEurope.add(new Quiz(R.string.co_eu_finland_fi, R.drawable.fi, context.getString(R.string.capital_question) + context.getString(R.string.co_eu_finland_fi)));
                capitalsEurope.add(new Quiz(R.string.co_eu_france_fr, R.drawable.fr, context.getString(R.string.capital_question) + context.getString(R.string.co_eu_france_fr)));
                capitalsEurope.add(new Quiz(R.string.co_eu_germany_de, R.drawable.de, context.getString(R.string.capital_question) + context.getString(R.string.co_eu_germany_de)));
                capitalsEurope.add(new Quiz(R.string.co_eu_greece_gr, R.drawable.gr, context.getString(R.string.capital_question) + context.getString(R.string.co_eu_greece_gr)));

                capitalsEurope.add(new Quiz(R.string.co_eu_hungary_hu, R.drawable.hu, context.getString(R.string.capital_question) + context.getString(R.string.co_eu_hungary_hu)));
                capitalsEurope.add(new Quiz(R.string.co_eu_iceland_is, R.drawable.is, context.getString(R.string.capital_question) + context.getString(R.string.co_eu_iceland_is)));
                capitalsEurope.add(new Quiz(R.string.co_eu_ireland_ie, R.drawable.ie, context.getString(R.string.capital_question) + context.getString(R.string.co_eu_ireland_ie)));
                capitalsEurope.add(new Quiz(R.string.co_eu_italy_it, R.drawable.it, context.getString(R.string.capital_question) + context.getString(R.string.co_eu_italy_it)));
                capitalsEurope.add(new Quiz(R.string.co_eu_kosovo_xk, R.drawable.mk, context.getString(R.string.capital_question) + context.getString(R.string.co_eu_kosovo_xk)));

                capitalsEurope.add(new Quiz(R.string.co_eu_latvia_lv, R.drawable.lv, context.getString(R.string.capital_question) + context.getString(R.string.co_eu_latvia_lv)));
                capitalsEurope.add(new Quiz(R.string.co_eu_liechtenstein_li, R.drawable.li, context.getString(R.string.capital_question) + context.getString(R.string.co_eu_liechtenstein_li)));
                capitalsEurope.add(new Quiz(R.string.co_eu_lithuania_lt, R.drawable.lt, context.getString(R.string.capital_question) + context.getString(R.string.co_eu_lithuania_lt)));
                capitalsEurope.add(new Quiz(R.string.co_eu_luxembourg_lu, R.drawable.lu, context.getString(R.string.capital_question) + context.getString(R.string.co_eu_luxembourg_lu)));
                capitalsEurope.add(new Quiz(R.string.co_eu_macedonia_mk, R.drawable.mk, context.getString(R.string.capital_question) + context.getString(R.string.co_eu_macedonia_mk)));

                capitalsEurope.add(new Quiz(R.string.co_eu_malta_mt, R.drawable.mt, context.getString(R.string.capital_question) + context.getString(R.string.co_eu_malta_mt)));
                capitalsEurope.add(new Quiz(R.string.co_eu_moldova_md, R.drawable.md, context.getString(R.string.capital_question) + context.getString(R.string.co_eu_moldova_md)));
                capitalsEurope.add(new Quiz(R.string.co_eu_monaco_mc, R.drawable.mc, context.getString(R.string.capital_question) + context.getString(R.string.co_eu_monaco_mc)));
                capitalsEurope.add(new Quiz(R.string.co_eu_montenegro_me, R.drawable.me, context.getString(R.string.capital_question) + context.getString(R.string.co_eu_montenegro_me)));
                capitalsEurope.add(new Quiz(R.string.co_eu_the_netherlands_nl, R.drawable.nl, context.getString(R.string.capital_question) + context.getString(R.string.co_eu_the_netherlands_nl)));

                capitalsEurope.add(new Quiz(R.string.co_eu_norway_no, R.drawable.no, context.getString(R.string.capital_question) + context.getString(R.string.co_eu_norway_no)));
                capitalsEurope.add(new Quiz(R.string.co_eu_poland_pl, R.drawable.pl, context.getString(R.string.capital_question) + context.getString(R.string.co_eu_poland_pl)));
                capitalsEurope.add(new Quiz(R.string.co_eu_portugal_pt, R.drawable.pt, context.getString(R.string.capital_question) + context.getString(R.string.co_eu_portugal_pt)));
                capitalsEurope.add(new Quiz(R.string.co_eu_romania_ro, R.drawable.ro, context.getString(R.string.capital_question) + context.getString(R.string.co_eu_romania_ro)));
                capitalsEurope.add(new Quiz(R.string.co_eu_russia_ru, R.drawable.ru, context.getString(R.string.capital_question) + context.getString(R.string.co_eu_russia_ru)));

                capitalsEurope.add(new Quiz(R.string.co_eu_san_marino_sm, R.drawable.sm, context.getString(R.string.capital_question) + context.getString(R.string.co_eu_san_marino_sm)));
                capitalsEurope.add(new Quiz(R.string.co_eu_serbia_rs, R.drawable.rs, context.getString(R.string.capital_question) + context.getString(R.string.co_eu_serbia_rs)));
                capitalsEurope.add(new Quiz(R.string.co_eu_slovakia_sk, R.drawable.sk, context.getString(R.string.capital_question) + context.getString(R.string.co_eu_slovakia_sk)));
                capitalsEurope.add(new Quiz(R.string.co_eu_slovenia_si, R.drawable.si, context.getString(R.string.capital_question) + context.getString(R.string.co_eu_slovenia_si)));
                capitalsEurope.add(new Quiz(R.string.co_eu_spain_es, R.drawable.es, context.getString(R.string.capital_question) + context.getString(R.string.co_eu_spain_es)));

                capitalsEurope.add(new Quiz(R.string.co_eu_sweden_se, R.drawable.se, context.getString(R.string.capital_question) + context.getString(R.string.co_eu_sweden_se)));
                capitalsEurope.add(new Quiz(R.string.co_eu_switzerland_ch, R.drawable.ch, context.getString(R.string.capital_question) + context.getString(R.string.co_eu_switzerland_ch)));
                capitalsEurope.add(new Quiz(R.string.co_eu_turkey_tr, R.drawable.tr, context.getString(R.string.capital_question) + context.getString(R.string.co_eu_turkey_tr)));
                capitalsEurope.add(new Quiz(R.string.co_eu_ukraine_ua, R.drawable.ua, context.getString(R.string.capital_question) + context.getString(R.string.co_eu_ukraine_ua)));
                capitalsEurope.add(new Quiz(R.string.co_eu_the_united_kingdom_gb, R.drawable.gb, context.getString(R.string.capital_question) + context.getString(R.string.co_eu_the_united_kingdom_gb)));
                capitalsEurope.add(new Quiz(R.string.co_eu_the_vatican_city_state_va, R.drawable.va, context.getString(R.string.capital_question) + context.getString(R.string.co_eu_the_vatican_city_state_va)));
                setValue(capitalsEurope);
                break;

            case C_NORTH_AMERICA:
                List<Quiz> capitalsNAmerica = new ArrayList<>();
                capitalsNAmerica.add(new Quiz(R.string.co_na_antigua_and_barbuda_ag, R.drawable.ag, context.getString(R.string.capital_question) + context.getString(R.string.co_na_antigua_and_barbuda_ag)));
                capitalsNAmerica.add(new Quiz(R.string.co_na_the_bahamas_bs, R.drawable.bs, context.getString(R.string.capital_question) + context.getString(R.string.co_na_the_bahamas_bs)));
                capitalsNAmerica.add(new Quiz(R.string.co_na_barbados_bb, R.drawable.bb, context.getString(R.string.capital_question) + context.getString(R.string.co_na_barbados_bb)));
                capitalsNAmerica.add(new Quiz(R.string.co_na_belize_bz, R.drawable.bz, context.getString(R.string.capital_question) + context.getString(R.string.co_na_belize_bz)));
                capitalsNAmerica.add(new Quiz(R.string.co_na_canada_ca, R.drawable.ca, context.getString(R.string.capital_question) + context.getString(R.string.co_na_canada_ca)));

                capitalsNAmerica.add(new Quiz(R.string.co_na_costa_rica_cr, R.drawable.cr, context.getString(R.string.capital_question) + context.getString(R.string.co_na_costa_rica_cr)));
                capitalsNAmerica.add(new Quiz(R.string.co_na_cuba_cu, R.drawable.cu, context.getString(R.string.capital_question) + context.getString(R.string.co_na_cuba_cu)));
                capitalsNAmerica.add(new Quiz(R.string.co_na_dominica_dm, R.drawable.dm, context.getString(R.string.capital_question) + context.getString(R.string.co_na_dominica_dm)));
                capitalsNAmerica.add(new Quiz(R.string.co_na_the_dominican_republic_do, R.drawable.dom, context.getString(R.string.capital_question) + context.getString(R.string.co_na_the_dominican_republic_do)));
                capitalsNAmerica.add(new Quiz(R.string.co_na_el_salvador_sv, R.drawable.sv, context.getString(R.string.capital_question) + context.getString(R.string.co_na_el_salvador_sv)));

                capitalsNAmerica.add(new Quiz(R.string.co_na_grenada_gd, R.drawable.gd, context.getString(R.string.capital_question) + context.getString(R.string.co_na_grenada_gd)));
                capitalsNAmerica.add(new Quiz(R.string.co_na_guatemala_gt, R.drawable.gt, context.getString(R.string.capital_question) + context.getString(R.string.co_na_guatemala_gt)));
                capitalsNAmerica.add(new Quiz(R.string.co_na_haiti_ht, R.drawable.ht, context.getString(R.string.capital_question) + context.getString(R.string.co_na_haiti_ht)));
                capitalsNAmerica.add(new Quiz(R.string.co_na_honduras_hn, R.drawable.hn, context.getString(R.string.capital_question) + context.getString(R.string.co_na_honduras_hn)));
                capitalsNAmerica.add(new Quiz(R.string.co_na_jamaica_jm, R.drawable.jm, context.getString(R.string.capital_question) + context.getString(R.string.co_na_jamaica_jm)));

                capitalsNAmerica.add(new Quiz(R.string.co_na_mexico_mx, R.drawable.mx, context.getString(R.string.capital_question) + context.getString(R.string.co_na_mexico_mx)));
                capitalsNAmerica.add(new Quiz(R.string.co_na_nicaragua_ni, R.drawable.ni, context.getString(R.string.capital_question) + context.getString(R.string.co_na_nicaragua_ni)));
                capitalsNAmerica.add(new Quiz(R.string.co_na_panama_pa, R.drawable.pa, context.getString(R.string.capital_question) + context.getString(R.string.co_na_panama_pa)));
                capitalsNAmerica.add(new Quiz(R.string.co_na_saint_kitts_and_nevis_kn, R.drawable.kn, context.getString(R.string.capital_question) + context.getString(R.string.co_na_saint_kitts_and_nevis_kn)));
                capitalsNAmerica.add(new Quiz(R.string.co_na_saint_lucia_lc, R.drawable.lc, context.getString(R.string.capital_question) + context.getString(R.string.co_na_saint_lucia_lc)));

                capitalsNAmerica.add(new Quiz(R.string.co_na_saint_vincent_and_the_grenadines_vc, R.drawable.vc, context.getString(R.string.capital_question) + context.getString(R.string.co_na_saint_vincent_and_the_grenadines_vc)));
                capitalsNAmerica.add(new Quiz(R.string.co_na_trinidad_and_tobago_tt, R.drawable.tt, context.getString(R.string.capital_question) + context.getString(R.string.co_na_trinidad_and_tobago_tt)));
                capitalsNAmerica.add(new Quiz(R.string.co_na_the_united_states_us, R.drawable.us, context.getString(R.string.capital_question) + context.getString(R.string.co_na_the_united_states_us)));
                setValue(capitalsNAmerica);
                break;

            case C_SOUTH_AMERICA:
                List<Quiz> capitalsSAmerica = new ArrayList<>();
                capitalsSAmerica.add(new Quiz(R.string.co_sa_argentina_ar, R.drawable.ar, context.getString(R.string.capital_question) + context.getString(R.string.co_sa_argentina_ar)));
                capitalsSAmerica.add(new Quiz(R.string.co_sa_bolivia_bo, R.drawable.bo, context.getString(R.string.capital_question) + context.getString(R.string.co_sa_bolivia_bo)));
                capitalsSAmerica.add(new Quiz(R.string.co_sa_brazil_br, R.drawable.br, context.getString(R.string.capital_question) + context.getString(R.string.co_sa_brazil_br)));
                capitalsSAmerica.add(new Quiz(R.string.co_sa_chile_cl, R.drawable.cl, context.getString(R.string.capital_question) + context.getString(R.string.co_sa_chile_cl)));
                capitalsSAmerica.add(new Quiz(R.string.co_sa_colombia_co, R.drawable.co, context.getString(R.string.capital_question) + context.getString(R.string.co_sa_colombia_co)));

                capitalsSAmerica.add(new Quiz(R.string.co_sa_ecuador_ec, R.drawable.ec, context.getString(R.string.capital_question) + context.getString(R.string.co_sa_ecuador_ec)));
                capitalsSAmerica.add(new Quiz(R.string.co_sa_guyana_gy, R.drawable.gy, context.getString(R.string.capital_question) + context.getString(R.string.co_sa_guyana_gy)));
                capitalsSAmerica.add(new Quiz(R.string.co_sa_paraguay_py, R.drawable.py, context.getString(R.string.capital_question) + context.getString(R.string.co_sa_paraguay_py)));
                capitalsSAmerica.add(new Quiz(R.string.co_sa_peru_pe, R.drawable.pe, context.getString(R.string.capital_question) + context.getString(R.string.co_sa_peru_pe)));
                capitalsSAmerica.add(new Quiz(R.string.co_sa_suriname_sr, R.drawable.sr, context.getString(R.string.capital_question) + context.getString(R.string.co_sa_suriname_sr)));

                capitalsSAmerica.add(new Quiz(R.string.co_sa_trinidad_and_tobago_tt, R.drawable.tt, context.getString(R.string.capital_question) + context.getString(R.string.co_sa_trinidad_and_tobago_tt)));
                capitalsSAmerica.add(new Quiz(R.string.co_sa_uruguay_uy, R.drawable.uy, context.getString(R.string.capital_question) + context.getString(R.string.co_sa_uruguay_uy)));
                capitalsSAmerica.add(new Quiz(R.string.co_sa_venezuela_ve, R.drawable.ve, context.getString(R.string.capital_question) + context.getString(R.string.co_sa_venezuela_ve)));
                setValue(capitalsSAmerica);
                break;

            case C_OCEANIA:
                List<Quiz> capitalsOceania = new ArrayList<>();
                capitalsOceania.add(new Quiz(R.string.co_oc_australia_au, R.drawable.au, context.getString(R.string.capital_question) + context.getString(R.string.co_oc_australia_au)));
                capitalsOceania.add(new Quiz(R.string.co_oc_cook_islands_ck, R.drawable.co, context.getString(R.string.capital_question) + context.getString(R.string.co_oc_cook_islands_ck)));
                capitalsOceania.add(new Quiz(R.string.co_oc_east_timor_tl, R.drawable.tl, context.getString(R.string.capital_question) + context.getString(R.string.co_oc_east_timor_tl)));
                capitalsOceania.add(new Quiz(R.string.co_oc_fiji_fj, R.drawable.fj, context.getString(R.string.capital_question) + context.getString(R.string.co_oc_fiji_fj)));
                capitalsOceania.add(new Quiz(R.string.co_oc_indonesia_id, R.drawable.id, context.getString(R.string.capital_question) + context.getString(R.string.co_oc_indonesia_id)));

                capitalsOceania.add(new Quiz(R.string.co_oc_kiribati_ki, R.drawable.ki, context.getString(R.string.capital_question) + context.getString(R.string.co_oc_kiribati_ki)));
                capitalsOceania.add(new Quiz(R.string.co_oc_the_marshall_islands_mh, R.drawable.mh, context.getString(R.string.capital_question) + context.getString(R.string.co_oc_the_marshall_islands_mh)));
                capitalsOceania.add(new Quiz(R.string.co_oc_micronesia_fm, R.drawable.fm, context.getString(R.string.capital_question) + context.getString(R.string.co_oc_micronesia_fm)));
                capitalsOceania.add(new Quiz(R.string.co_oc_nauru_nr, R.drawable.nr, context.getString(R.string.capital_question) + context.getString(R.string.co_oc_nauru_nr)));
                capitalsOceania.add(new Quiz(R.string.co_oc_new_zealand_nz, R.drawable.nz, context.getString(R.string.capital_question) + context.getString(R.string.co_oc_new_zealand_nz)));

                capitalsOceania.add(new Quiz(R.string.co_oc_niue_nu, R.drawable.fm, context.getString(R.string.capital_question) + context.getString(R.string.co_oc_niue_nu)));
                capitalsOceania.add(new Quiz(R.string.co_oc_palau_pw, R.drawable.co, context.getString(R.string.capital_question) + context.getString(R.string.co_oc_palau_pw)));
                capitalsOceania.add(new Quiz(R.string.co_oc_papua_new_guinea_pg, R.drawable.pg, context.getString(R.string.capital_question) + context.getString(R.string.co_oc_papua_new_guinea_pg)));
                capitalsOceania.add(new Quiz(R.string.co_oc_samoa_ws, R.drawable.ws, context.getString(R.string.capital_question) + context.getString(R.string.co_oc_samoa_ws)));
                capitalsOceania.add(new Quiz(R.string.co_oc_the_solomon_islands_sb, R.drawable.sb, context.getString(R.string.capital_question) + context.getString(R.string.co_oc_the_solomon_islands_sb)));

                capitalsOceania.add(new Quiz(R.string.co_oc_tonga_to, R.drawable.to, context.getString(R.string.capital_question) + context.getString(R.string.co_oc_tonga_to)));
                capitalsOceania.add(new Quiz(R.string.co_oc_tuvalu_tv, R.drawable.tv, context.getString(R.string.capital_question) + context.getString(R.string.co_oc_tuvalu_tv)));
                capitalsOceania.add(new Quiz(R.string.co_oc_vanuatu_vu, R.drawable.vu, context.getString(R.string.capital_question) + context.getString(R.string.co_oc_vanuatu_vu)));
                setValue(capitalsOceania);
                break;*/

            case PIC_TO_WORD:
                break;

            case WORD_TO_PIC:
                break;
        }
    }
}