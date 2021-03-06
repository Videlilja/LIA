package com.videlilja.linda.lia.model;

import android.arch.lifecycle.LiveData;
import android.content.Context;

import com.videlilja.linda.lia.R;


import java.util.ArrayList;
import java.util.List;

public class QuizLiveData extends LiveData<List<Quiz>> {

    public QuizLiveData(Categories category, Context context) {

        switch (category) {


            case BIRDS:
                List<Quiz> animalsBirds = new ArrayList<>();
                animalsBirds.add(new Quiz(context.getString(R.string.an_bi_blackbird), " ", R.drawable.blackbird, context.getString(R.string.animal_question)));
                animalsBirds.add(new Quiz(context.getString(R.string.an_bi_bluetit), " ", R.drawable.bluetit, context.getString(R.string.animal_question)));
                animalsBirds.add(new Quiz(context.getString(R.string.an_bi_bullfinch), " ", R.drawable.bullfinch, context.getString(R.string.animal_question)));
                animalsBirds.add(new Quiz(context.getString(R.string.an_bi_chaffinch), " ", R.drawable.chaffinch, context.getString(R.string.animal_question)));
                animalsBirds.add(new Quiz(context.getString(R.string.an_bi_dove), " ", R.drawable.dove, context.getString(R.string.animal_question)));

                animalsBirds.add(new Quiz(context.getString(R.string.an_bi_greenfinch), " ", R.drawable.greenfinch, context.getString(R.string.animal_question)));
                animalsBirds.add(new Quiz(context.getString(R.string.an_bi_housesparrow), " ", R.drawable.housesparrow, context.getString(R.string.animal_question)));
                animalsBirds.add(new Quiz(context.getString(R.string.an_bi_kestrel), " ", R.drawable.kestrel, context.getString(R.string.animal_question)));
                animalsBirds.add(new Quiz(context.getString(R.string.an_bi_longtailedtit), " ", R.drawable.longtailedtit, context.getString(R.string.animal_question)));
                animalsBirds.add(new Quiz(context.getString(R.string.an_bi_nuthatch), " ", R.drawable.nuthatch, context.getString(R.string.animal_question)));

                animalsBirds.add(new Quiz(context.getString(R.string.an_bi_robins), " ", R.drawable.robins, context.getString(R.string.animal_question)));
                animalsBirds.add(new Quiz(context.getString(R.string.an_bi_wagtail), " ", R.drawable.wagtail, context.getString(R.string.animal_question)));
                animalsBirds.add(new Quiz(context.getString(R.string.an_bi_waxwing), " ", R.drawable.waxwing, context.getString(R.string.animal_question)));
                animalsBirds.add(new Quiz(context.getString(R.string.an_bi_willowwarbler), " ", R.drawable.willowwarbler, context.getString(R.string.animal_question)));
                animalsBirds.add(new Quiz(context.getString(R.string.an_bi_woodpecker), " ", R.drawable.woodpecker, context.getString(R.string.animal_question)));
                setValue(animalsBirds);
                break;

            case MAMMALS:
                List<Quiz> animalsMammals = new ArrayList<>();
                animalsMammals.add(new Quiz(context.getString(R.string.an_ma_african_wild_dog), " ", R.drawable.africanwilddog, context.getString(R.string.animal_question)));
                animalsMammals.add(new Quiz(context.getString(R.string.an_ma_armadillo), " ", R.drawable.armadillo, context.getString(R.string.animal_question)));
                animalsMammals.add(new Quiz(context.getString(R.string.an_ma_baboon), " ", R.drawable.baboon, context.getString(R.string.animal_question)));
                animalsMammals.add(new Quiz(context.getString(R.string.an_ma_bear), " ", R.drawable.bear, context.getString(R.string.animal_question)));
                animalsMammals.add(new Quiz(context.getString(R.string.an_ma_bengal_tiger), " ", R.drawable.bengaltiger, context.getString(R.string.animal_question)));

                animalsMammals.add(new Quiz(context.getString(R.string.an_ma_bighorn_sheep), " ", R.drawable.bighornsheep, context.getString(R.string.animal_question)));
                animalsMammals.add(new Quiz(context.getString(R.string.an_ma_bobcat), " ", R.drawable.bobcat, context.getString(R.string.animal_question)));
                animalsMammals.add(new Quiz(context.getString(R.string.an_ma_buffalo), " ", R.drawable.buffalo, context.getString(R.string.animal_question)));
                animalsMammals.add(new Quiz(context.getString(R.string.an_ma_camel), " ", R.drawable.camel, context.getString(R.string.animal_question)));
                animalsMammals.add(new Quiz(context.getString(R.string.an_ma_cheetah), " ", R.drawable.cheeta, context.getString(R.string.animal_question)));

                animalsMammals.add(new Quiz(context.getString(R.string.an_ma_chimpanzee), " ", R.drawable.chimpanzee, context.getString(R.string.animal_question)));
                animalsMammals.add(new Quiz(context.getString(R.string.an_ma_dolphin), " ", R.drawable.dolphin, context.getString(R.string.animal_question)));
                animalsMammals.add(new Quiz(context.getString(R.string.an_ma_donkey), " ", R.drawable.donkey, context.getString(R.string.animal_question)));
                animalsMammals.add(new Quiz(context.getString(R.string.an_ma_elephant), " ", R.drawable.elephant, context.getString(R.string.animal_question)));
                animalsMammals.add(new Quiz(context.getString(R.string.an_ma_ferret), " ", R.drawable.ferret, context.getString(R.string.animal_question)));

                animalsMammals.add(new Quiz(context.getString(R.string.an_ma_fox), " ", R.drawable.fox, context.getString(R.string.animal_question)));
                animalsMammals.add(new Quiz(context.getString(R.string.an_ma_giraffe), " ", R.drawable.giraffe, context.getString(R.string.animal_question)));
                animalsMammals.add(new Quiz(context.getString(R.string.an_ma_guinea_pig), " ", R.drawable.guineapig, context.getString(R.string.animal_question)));
                animalsMammals.add(new Quiz(context.getString(R.string.an_ma_hippopotamus), " ", R.drawable.hippopotamus, context.getString(R.string.animal_question)));
                animalsMammals.add(new Quiz(context.getString(R.string.an_ma_koala), " ", R.drawable.koala, context.getString(R.string.animal_question)));

                animalsMammals.add(new Quiz(context.getString(R.string.an_ma_lemur), " ", R.drawable.lemur, context.getString(R.string.animal_question)));
                animalsMammals.add(new Quiz(context.getString(R.string.an_ma_lion), " ", R.drawable.lion, context.getString(R.string.animal_question)));
                animalsMammals.add(new Quiz(context.getString(R.string.an_ma_moose), " ", R.drawable.moose, context.getString(R.string.animal_question)));
                animalsMammals.add(new Quiz(context.getString(R.string.an_ma_mouse), " ", R.drawable.mouse, context.getString(R.string.animal_question)));
                animalsMammals.add(new Quiz(context.getString(R.string.an_ma_orca), " ", R.drawable.orca, context.getString(R.string.animal_question)));

                animalsMammals.add(new Quiz(context.getString(R.string.an_ma_panda), " ", R.drawable.panda, context.getString(R.string.animal_question)));
                animalsMammals.add(new Quiz(context.getString(R.string.an_ma_rabbit), " ", R.drawable.rabbit, context.getString(R.string.animal_question)));
                animalsMammals.add(new Quiz(context.getString(R.string.an_ma_raccoon), " ", R.drawable.raccoon, context.getString(R.string.animal_question)));
                animalsMammals.add(new Quiz(context.getString(R.string.an_ma_red_panda), " ", R.drawable.redpanda, context.getString(R.string.animal_question)));
                animalsMammals.add(new Quiz(context.getString(R.string.an_ma_riesen), " ", R.drawable.riesen, context.getString(R.string.animal_question)));

                animalsMammals.add(new Quiz(context.getString(R.string.an_ma_seal), " ", R.drawable.seal,context.getString(R.string.animal_question)));
                animalsMammals.add(new Quiz(context.getString(R.string.an_ma_sheep), " ", R.drawable.sheep, context.getString(R.string.animal_question)));
                animalsMammals.add(new Quiz(context.getString(R.string.an_ma_squirrel), " ", R.drawable.squirrel, context.getString(R.string.animal_question)));
                animalsMammals.add(new Quiz(context.getString(R.string.an_ma_surikat), " ", R.drawable.surikat, context.getString(R.string.animal_question)));
                animalsMammals.add(new Quiz(context.getString(R.string.an_ma_wallaby), " ", R.drawable.wallaby, context.getString(R.string.animal_question)));

                animalsMammals.add(new Quiz(context.getString(R.string.an_ma_walrus), " ", R.drawable.walrus, context.getString(R.string.animal_question)));
                animalsMammals.add(new Quiz(context.getString(R.string.an_ma_wolf), " ", R.drawable.wolf, context.getString(R.string.animal_question)));
                animalsMammals.add(new Quiz(context.getString(R.string.an_ma_zebra), " ", R.drawable.zebra, context.getString(R.string.animal_question)));
                setValue(animalsMammals);
                break;

            case FLOWERS:
                List<Quiz> natureFlowers = new ArrayList<>();
                natureFlowers.add(new Quiz(context.getString(R.string.na_fl_chrysanthemum), " ", R.drawable.chrysanthemum, context.getString(R.string.nature_question)));
                natureFlowers.add(new Quiz(context.getString(R.string.na_fl_coltsfoot), " ", R.drawable.coltsfoot, context.getString(R.string.nature_question)));
                natureFlowers.add(new Quiz(context.getString(R.string.na_fl_cornflower), " ", R.drawable.cornflower, context.getString(R.string.nature_question)));
                natureFlowers.add(new Quiz(context.getString(R.string.na_fl_crocus), " ", R.drawable.crocus, context.getString(R.string.nature_question)));
                natureFlowers.add(new Quiz(context.getString(R.string.na_fl_daffodil), " ", R.drawable.daffodil, context.getString(R.string.nature_question)));

                natureFlowers.add(new Quiz(context.getString(R.string.na_fl_dahlia), " ", R.drawable.dahlia, context.getString(R.string.nature_question)));
                natureFlowers.add(new Quiz(context.getString(R.string.na_fl_daisy), " ", R.drawable.daisy, context.getString(R.string.nature_question)));
                natureFlowers.add(new Quiz(context.getString(R.string.na_fl_dandelion), " ", R.drawable.dandelion, context.getString(R.string.nature_question)));
                natureFlowers.add(new Quiz(context.getString(R.string.na_fl_gerbera), " ", R.drawable.gerbera, context.getString(R.string.nature_question)));
                natureFlowers.add(new Quiz(context.getString(R.string.na_fl_hydrangea), " ", R.drawable.hydrangea, context.getString(R.string.nature_question)));

                natureFlowers.add(new Quiz(context.getString(R.string.na_fl_iris), " ", R.drawable.iris, context.getString(R.string.nature_question)));
                natureFlowers.add(new Quiz(context.getString(R.string.na_fl_lilac), " ", R.drawable.lilac, context.getString(R.string.nature_question)));
                natureFlowers.add(new Quiz(context.getString(R.string.na_fl_lily), " ", R.drawable.lily, context.getString(R.string.nature_question)));
                natureFlowers.add(new Quiz(context.getString(R.string.na_fl_lily_of_the_valley), " ", R.drawable.lilyofthevalley, context.getString(R.string.nature_question)));
                natureFlowers.add(new Quiz(context.getString(R.string.na_fl_pelargonium), " ", R.drawable.pelargonium, context.getString(R.string.nature_question)));

                natureFlowers.add(new Quiz(context.getString(R.string.na_fl_petunia), " ", R.drawable.petunia, context.getString(R.string.nature_question)));
                natureFlowers.add(new Quiz(context.getString(R.string.na_fl_poppy), " ", R.drawable.poppy, context.getString(R.string.nature_question)));
                natureFlowers.add(new Quiz(context.getString(R.string.na_fl_snowdrop), " ", R.drawable.snowdrop, context.getString(R.string.nature_question)));
                natureFlowers.add(new Quiz(context.getString(R.string.na_fl_sunflower), " ", R.drawable.sunflower, context.getString(R.string.nature_question)));
                natureFlowers.add(new Quiz(context.getString(R.string.na_fl_tulip), " ", R.drawable.tulip, context.getString(R.string.nature_question)));
                setValue(natureFlowers);
                break;

            case HERBS:
                List<Quiz> natureHerbs = new ArrayList<>();
                natureHerbs.add(new Quiz(context.getString(R.string.na_he_basil), " ", R.drawable.basil, context.getString(R.string.nature_question)));
                natureHerbs.add(new Quiz(context.getString(R.string.na_he_chervil), " ", R.drawable.chervil, context.getString(R.string.nature_question)));
                natureHerbs.add(new Quiz(context.getString(R.string.na_he_chive), " ", R.drawable.chive, context.getString(R.string.nature_question)));
                natureHerbs.add(new Quiz(context.getString(R.string.na_he_lemonbalm), " ", R.drawable.lemonbalm, context.getString(R.string.nature_question)));
                natureHerbs.add(new Quiz(context.getString(R.string.na_he_lovage), " ", R.drawable.lovage, context.getString(R.string.nature_question)));

                natureHerbs.add(new Quiz(context.getString(R.string.na_he_marjoram), " ", R.drawable.marjoram, context.getString(R.string.nature_question)));
                natureHerbs.add(new Quiz(context.getString(R.string.na_he_mint), " ", R.drawable.mint, context.getString(R.string.nature_question)));
                natureHerbs.add(new Quiz(context.getString(R.string.na_he_oregano), " ", R.drawable.oregano, context.getString(R.string.nature_question)));
                natureHerbs.add(new Quiz(context.getString(R.string.na_he_parsley), " ", R.drawable.parsley, context.getString(R.string.nature_question)));
                natureHerbs.add(new Quiz(context.getString(R.string.na_he_rosemary), " ", R.drawable.rosemary, context.getString(R.string.nature_question)));

                natureHerbs.add(new Quiz(context.getString(R.string.na_he_sage), " ", R.drawable.sage, context.getString(R.string.nature_question)));
                natureHerbs.add(new Quiz(context.getString(R.string.na_he_tarragon), " ", R.drawable.tarragon, context.getString(R.string.nature_question)));
                natureHerbs.add(new Quiz(context.getString(R.string.na_he_thyme), " ", R.drawable.thyme, context.getString(R.string.nature_question)));
                setValue(natureHerbs);
                break;

/*            case ADDITION:
                List<Quiz> mathAdd = new ArrayList<>();
                mathAdd.add(new Quiz(context.getString(R.string.fl_af_algeria_dz), " ", R.drawable.dz, context.getString(R.string.math_question)));
                mathAdd.add(new Quiz(context.getString(R.string.fl_af_angola_ao), " ", R.drawable.ao, context.getString(R.string.math_question)));
                mathAdd.add(new Quiz(context.getString(R.string.fl_af_benin_bj), " ", R.drawable.bj, context.getString(R.string.math_question)));
                mathAdd.add(new Quiz(context.getString(R.string.fl_af_botswana_bw), " ", R.drawable.bw, context.getString(R.string.math_question)));
                mathAdd.add(new Quiz(context.getString(R.string.fl_af_burkina_faso_bf), " ", R.drawable.bf, context.getString(R.string.math_question)));
                setValue(mathAdd);
                break;

            case SUBTRACTION:
                break;

            case MULTIPLICATION:
                break;

            case DIVISION:
                break;*/

            case F_AFRICA:
                List<Quiz> flagsAfrica = new ArrayList<>();
                flagsAfrica.add(new Quiz(context.getString(R.string.fl_af_algeria_dz), " ", R.drawable.dz, context.getString(R.string.flag_question)));
                flagsAfrica.add(new Quiz(context.getString(R.string.fl_af_angola_ao), " ", R.drawable.ao, context.getString(R.string.flag_question)));
                flagsAfrica.add(new Quiz(context.getString(R.string.fl_af_benin_bj), " ", R.drawable.bj, context.getString(R.string.flag_question)));
                flagsAfrica.add(new Quiz(context.getString(R.string.fl_af_botswana_bw), " ", R.drawable.bw, context.getString(R.string.flag_question)));
                flagsAfrica.add(new Quiz(context.getString(R.string.fl_af_burkina_faso_bf), " ", R.drawable.bf, context.getString(R.string.flag_question)));

                flagsAfrica.add(new Quiz(context.getString(R.string.fl_af_burundi_bi), " ", R.drawable.bi, context.getString(R.string.flag_question)));
                flagsAfrica.add(new Quiz(context.getString(R.string.fl_af_cameroon_cm), " ", R.drawable.cm, context.getString(R.string.flag_question)));
                flagsAfrica.add(new Quiz(context.getString(R.string.fl_af_cape_verde_cv), " ", R.drawable.cv, context.getString(R.string.flag_question)));
                flagsAfrica.add(new Quiz(context.getString(R.string.fl_af_the_central_african_republic_cf), " ", R.drawable.cf, context.getString(R.string.flag_question)));
                flagsAfrica.add(new Quiz(context.getString(R.string.fl_af_chad_td), " ", R.drawable.td, context.getString(R.string.flag_question)));

                flagsAfrica.add(new Quiz(context.getString(R.string.fl_af_the_comoros_km), " ", R.drawable.km, context.getString(R.string.flag_question)));
                flagsAfrica.add(new Quiz(context.getString(R.string.fl_af_ivory_coast_ci), " ", R.drawable.ci, context.getString(R.string.flag_question)));
                flagsAfrica.add(new Quiz(context.getString(R.string.fl_af_the_democratic_republic_of_the_congo_cd), " ", R.drawable.cd, context.getString(R.string.flag_question)));
                flagsAfrica.add(new Quiz(context.getString(R.string.fl_af_djibouti_dj), " ", R.drawable.dj, context.getString(R.string.flag_question)));
                flagsAfrica.add(new Quiz(context.getString(R.string.fl_af_egypt_eg), " ", R.drawable.eg, context.getString(R.string.flag_question)));

                flagsAfrica.add(new Quiz(context.getString(R.string.fl_af_equatorial_guinea_gq), " ", R.drawable.gq, context.getString(R.string.flag_question)));
                flagsAfrica.add(new Quiz(context.getString(R.string.fl_af_eritrea_er), " ", R.drawable.er, context.getString(R.string.flag_question)));
                flagsAfrica.add(new Quiz(context.getString(R.string.fl_af_ethiopia_et), " ", R.drawable.et, context.getString(R.string.flag_question)));
                flagsAfrica.add(new Quiz(context.getString(R.string.fl_af_gabon_ga), " ", R.drawable.ga, context.getString(R.string.flag_question)));
                flagsAfrica.add(new Quiz(context.getString(R.string.fl_af_the_gambia_gm), " ", R.drawable.gm, context.getString(R.string.flag_question)));

                flagsAfrica.add(new Quiz(context.getString(R.string.fl_af_ghana_gh), " ", R.drawable.gh, context.getString(R.string.flag_question)));
                flagsAfrica.add(new Quiz(context.getString(R.string.fl_af_guinea_gn), " ", R.drawable.gn, context.getString(R.string.flag_question)));
                flagsAfrica.add(new Quiz(context.getString(R.string.fl_af_guinea_bissau_gw), " ", R.drawable.gw, context.getString(R.string.flag_question)));
                flagsAfrica.add(new Quiz(context.getString(R.string.fl_af_kenya_ke), " ", R.drawable.ke, context.getString(R.string.flag_question)));
                flagsAfrica.add(new Quiz(context.getString(R.string.fl_af_lesotho_ls), " ", R.drawable.ls, context.getString(R.string.flag_question)));

                flagsAfrica.add(new Quiz(context.getString(R.string.fl_af_liberia_lr), " ", R.drawable.lr, context.getString(R.string.flag_question)));
                flagsAfrica.add(new Quiz(context.getString(R.string.fl_af_libya_ly), " ", R.drawable.ly, context.getString(R.string.flag_question)));
                flagsAfrica.add(new Quiz(context.getString(R.string.fl_af_madagascar_mg), " ", R.drawable.mg, context.getString(R.string.flag_question)));
                flagsAfrica.add(new Quiz(context.getString(R.string.fl_af_malawi_mw), " ", R.drawable.mw, context.getString(R.string.flag_question)));
                flagsAfrica.add(new Quiz(context.getString(R.string.fl_af_mali_ml), " ", R.drawable.ml, context.getString(R.string.flag_question)));

                flagsAfrica.add(new Quiz(context.getString(R.string.fl_af_mauritania_mr), " ", R.drawable.mr, context.getString(R.string.flag_question)));
                flagsAfrica.add(new Quiz(context.getString(R.string.fl_af_mauritius_mu), " ", R.drawable.mu, context.getString(R.string.flag_question)));
                flagsAfrica.add(new Quiz(context.getString(R.string.fl_af_morocco_ma), " ", R.drawable.ma, context.getString(R.string.flag_question)));
                flagsAfrica.add(new Quiz(context.getString(R.string.fl_af_mozambique_mz), " ", R.drawable.mz, context.getString(R.string.flag_question)));
                flagsAfrica.add(new Quiz(context.getString(R.string.fl_af_namibia_na), " ", R.drawable.na, context.getString(R.string.flag_question)));

                flagsAfrica.add(new Quiz(context.getString(R.string.fl_af_niger_ne), " ", R.drawable.ne, context.getString(R.string.flag_question)));
                flagsAfrica.add(new Quiz(context.getString(R.string.fl_af_nigeria_ng), " ", R.drawable.ng, context.getString(R.string.flag_question)));
                flagsAfrica.add(new Quiz(context.getString(R.string.fl_af_the_republic_of_the_congo_cg), " ", R.drawable.cg, context.getString(R.string.flag_question)));
                flagsAfrica.add(new Quiz(context.getString(R.string.fl_af_rwanda_rw), " ", R.drawable.rw, context.getString(R.string.flag_question)));
                flagsAfrica.add(new Quiz(context.getString(R.string.fl_af_sao_tome_and_principe_st), " ", R.drawable.st, context.getString(R.string.flag_question)));

                flagsAfrica.add(new Quiz(context.getString(R.string.fl_af_senegal_sn), " ", R.drawable.sn, context.getString(R.string.flag_question)));
                flagsAfrica.add(new Quiz(context.getString(R.string.fl_af_the_seychelles_sc), " ", R.drawable.sc, context.getString(R.string.flag_question)));
                flagsAfrica.add(new Quiz(context.getString(R.string.fl_af_sierra_leone_sl), " ", R.drawable.sl, context.getString(R.string.flag_question)));
                flagsAfrica.add(new Quiz(context.getString(R.string.fl_af_somalia_so), " ", R.drawable.so, context.getString(R.string.flag_question)));
                flagsAfrica.add(new Quiz(context.getString(R.string.fl_af_south_africa_za), " ", R.drawable.za, context.getString(R.string.flag_question)));

                flagsAfrica.add(new Quiz(context.getString(R.string.fl_af_south_sudan_sdn), " ", R.drawable.sd, context.getString(R.string.flag_question)));
                flagsAfrica.add(new Quiz(context.getString(R.string.fl_af_sudan_sd), " ", R.drawable.sd, context.getString(R.string.flag_question)));
                flagsAfrica.add(new Quiz(context.getString(R.string.fl_af_swaziland_sz), " ", R.drawable.sz, context.getString(R.string.flag_question)));
                flagsAfrica.add(new Quiz(context.getString(R.string.fl_af_tanzania_tz), " ", R.drawable.tz, context.getString(R.string.flag_question)));
                flagsAfrica.add(new Quiz(context.getString(R.string.fl_af_togo_tg), " ", R.drawable.tg, context.getString(R.string.flag_question)));

                flagsAfrica.add(new Quiz(context.getString(R.string.fl_af_tunisia_tn), " ", R.drawable.tn, context.getString(R.string.flag_question)));
                flagsAfrica.add(new Quiz(context.getString(R.string.fl_af_uganda_ug), " ", R.drawable.ug, context.getString(R.string.flag_question)));
                flagsAfrica.add(new Quiz(context.getString(R.string.fl_af_western_sahara_eh), " ", R.drawable.eh, context.getString(R.string.flag_question)));
                flagsAfrica.add(new Quiz(context.getString(R.string.fl_af_zambia_zm), " ", R.drawable.zm, context.getString(R.string.flag_question)));
                flagsAfrica.add(new Quiz(context.getString(R.string.fl_af_zimbabwe_zw), " ", R.drawable.zw, context.getString(R.string.flag_question)));
                setValue(flagsAfrica);
                break;

            case F_ASIA:
                List<Quiz> flagsAsia = new ArrayList<>();
                flagsAsia.add(new Quiz(context.getString(R.string.fl_as_afghanistan_af), " ", R.drawable.af, context.getString(R.string.flag_question)));
                flagsAsia.add(new Quiz(context.getString(R.string.fl_as_armenia_am), " ", R.drawable.am, context.getString(R.string.flag_question)));
                flagsAsia.add(new Quiz(context.getString(R.string.fl_as_azerbaijan_az), " ", R.drawable.az, context.getString(R.string.flag_question)));
                flagsAsia.add(new Quiz(context.getString(R.string.fl_as_bahrain_bh), " ", R.drawable.bh, context.getString(R.string.flag_question)));
                flagsAsia.add(new Quiz(context.getString(R.string.fl_as_bangladesh_bd), " ", R.drawable.bd, context.getString(R.string.flag_question)));

                flagsAsia.add(new Quiz(context.getString(R.string.fl_as_bhutan_bt), " ", R.drawable.bt, context.getString(R.string.flag_question)));
                flagsAsia.add(new Quiz(context.getString(R.string.fl_as_brunei_bn), " ", R.drawable.br, context.getString(R.string.flag_question)));
                flagsAsia.add(new Quiz(context.getString(R.string.fl_as_cambodia_kh), " ", R.drawable.kh, context.getString(R.string.flag_question)));
                flagsAsia.add(new Quiz(context.getString(R.string.fl_as_cyprus_cy), " ", R.drawable.cy, context.getString(R.string.flag_question)));
                flagsAsia.add(new Quiz(context.getString(R.string.fl_as_east_timor_tl), " ", R.drawable.tl, context.getString(R.string.flag_question)));

                flagsAsia.add(new Quiz(context.getString(R.string.fl_as_egypt_eg), " ", R.drawable.eg, context.getString(R.string.flag_question)));
                flagsAsia.add(new Quiz(context.getString(R.string.fl_as_georgia_ge), " ", R.drawable.ge, context.getString(R.string.flag_question)));
                flagsAsia.add(new Quiz(context.getString(R.string.fl_as_india_in), " ", R.drawable.in, context.getString(R.string.flag_question)));
                flagsAsia.add(new Quiz(context.getString(R.string.fl_as_indonesia_id), " ", R.drawable.id, context.getString(R.string.flag_question)));
                flagsAsia.add(new Quiz(context.getString(R.string.fl_as_iran_ir), " ", R.drawable.ir, context.getString(R.string.flag_question)));

                flagsAsia.add(new Quiz(context.getString(R.string.fl_as_iraq_iq), " ", R.drawable.iq, context.getString(R.string.flag_question)));
                flagsAsia.add(new Quiz(context.getString(R.string.fl_as_israel_il), " ", R.drawable.il, context.getString(R.string.flag_question)));
                flagsAsia.add(new Quiz(context.getString(R.string.fl_as_japan_jp), " ", R.drawable.jp, context.getString(R.string.flag_question)));
                flagsAsia.add(new Quiz(context.getString(R.string.fl_as_jordan_jo), " ", R.drawable.jo, context.getString(R.string.flag_question)));
                flagsAsia.add(new Quiz(context.getString(R.string.fl_as_kazakhstan_kz), " ", R.drawable.kz, context.getString(R.string.flag_question)));

                flagsAsia.add(new Quiz(context.getString(R.string.fl_as_kuwait_kw), " ", R.drawable.kw, context.getString(R.string.flag_question)));
                flagsAsia.add(new Quiz(context.getString(R.string.fl_as_kyrgyzstan_kg), " ", R.drawable.kg, context.getString(R.string.flag_question)));
                flagsAsia.add(new Quiz(context.getString(R.string.fl_as_laos_la), " ", R.drawable.la, context.getString(R.string.flag_question)));
                flagsAsia.add(new Quiz(context.getString(R.string.fl_as_lebanon_lb), " ", R.drawable.lb, context.getString(R.string.flag_question)));
                flagsAsia.add(new Quiz(context.getString(R.string.fl_as_malaysia_my), " ", R.drawable.my, context.getString(R.string.flag_question)));

                flagsAsia.add(new Quiz(context.getString(R.string.fl_as_maldives_mv), " ", R.drawable.mv, context.getString(R.string.flag_question)));
                flagsAsia.add(new Quiz(context.getString(R.string.fl_as_mongolia_mn), " ", R.drawable.mn, context.getString(R.string.flag_question)));
                flagsAsia.add(new Quiz(context.getString(R.string.fl_as_myanmar_mm), " ", R.drawable.mm, context.getString(R.string.flag_question)));
                flagsAsia.add(new Quiz(context.getString(R.string.fl_as_nepal_np), " ", R.drawable.np, context.getString(R.string.flag_question)));
                flagsAsia.add(new Quiz(context.getString(R.string.fl_as_north_korea_kp), " ", R.drawable.kp, context.getString(R.string.flag_question)));

                flagsAsia.add(new Quiz(context.getString(R.string.fl_as_oman_om), " ", R.drawable.om, context.getString(R.string.flag_question)));
                flagsAsia.add(new Quiz(context.getString(R.string.fl_as_pakistan_pk), " ", R.drawable.pk, context.getString(R.string.flag_question)));
                flagsAsia.add(new Quiz(context.getString(R.string.fl_as_the_peoples_republic_of_china_cn), " ", R.drawable.cn, context.getString(R.string.flag_question)));
                flagsAsia.add(new Quiz(context.getString(R.string.fl_as_the_philippines_ph), " ", R.drawable.ph, context.getString(R.string.flag_question)));
                flagsAsia.add(new Quiz(context.getString(R.string.fl_as_qatar_qa), " ", R.drawable.qa, context.getString(R.string.flag_question)));

                flagsAsia.add(new Quiz(context.getString(R.string.fl_as_the_republic_of_china_tw), " ", R.drawable.tw, context.getString(R.string.flag_question)));
                flagsAsia.add(new Quiz(context.getString(R.string.fl_as_russia_ru), " ", R.drawable.ru, context.getString(R.string.flag_question)));
                flagsAsia.add(new Quiz(context.getString(R.string.fl_as_saudi_arabia_sa), " ", R.drawable.sa, context.getString(R.string.flag_question)));
                flagsAsia.add(new Quiz(context.getString(R.string.fl_as_singapore_sg), " ", R.drawable.sg, context.getString(R.string.flag_question)));
                flagsAsia.add(new Quiz(context.getString(R.string.fl_as_south_korea_kr), " ", R.drawable.kr, context.getString(R.string.flag_question)));

                flagsAsia.add(new Quiz(context.getString(R.string.fl_as_sri_lanka_lk), " ", R.drawable.lk, context.getString(R.string.flag_question)));
                flagsAsia.add(new Quiz(context.getString(R.string.fl_as_syria_sy), " ", R.drawable.sy, context.getString(R.string.flag_question)));
                flagsAsia.add(new Quiz(context.getString(R.string.fl_as_tajikistan_tj), " ", R.drawable.tj, context.getString(R.string.flag_question)));
                flagsAsia.add(new Quiz(context.getString(R.string.fl_as_thailand_th), " ", R.drawable.th, context.getString(R.string.flag_question)));
                flagsAsia.add(new Quiz(context.getString(R.string.fl_as_turkey_tr), " ", R.drawable.tr, context.getString(R.string.flag_question)));

                flagsAsia.add(new Quiz(context.getString(R.string.fl_as_turkmenistan_tm), " ", R.drawable.tm, context.getString(R.string.flag_question)));
                flagsAsia.add(new Quiz(context.getString(R.string.fl_as_the_united_arab_emirates_ae), " ", R.drawable.ae, context.getString(R.string.flag_question)));
                flagsAsia.add(new Quiz(context.getString(R.string.fl_as_uzbekistan_uz), " ", R.drawable.uz, context.getString(R.string.flag_question)));
                flagsAsia.add(new Quiz(context.getString(R.string.fl_as_vietnam_vn), " ", R.drawable.vn, context.getString(R.string.flag_question)));
                flagsAsia.add(new Quiz(context.getString(R.string.fl_as_yemen_ye), " ", R.drawable.ye, context.getString(R.string.flag_question)));
                setValue(flagsAsia);
                break;

            case F_EUROPE:
                List<Quiz> flagsEurope = new ArrayList<>();
                flagsEurope.add(new Quiz(context.getString(R.string.fl_eu_albania_al), " ", R.drawable.al, context.getString(R.string.flag_question)));
                flagsEurope.add(new Quiz(context.getString(R.string.fl_eu_andorra_ad), " ", R.drawable.ad, context.getString(R.string.flag_question)));
                flagsEurope.add(new Quiz(context.getString(R.string.fl_eu_austria_at), " ", R.drawable.at, context.getString(R.string.flag_question)));
                flagsEurope.add(new Quiz(context.getString(R.string.fl_eu_belarus_by), " ", R.drawable.by, context.getString(R.string.flag_question)));
                flagsEurope.add(new Quiz(context.getString(R.string.fl_eu_belgium_be), " ", R.drawable.be, context.getString(R.string.flag_question)));

                flagsEurope.add(new Quiz(context.getString(R.string.fl_eu_bosnia_and_herzegovina_ba), " ", R.drawable.ba, context.getString(R.string.flag_question)));
                flagsEurope.add(new Quiz(context.getString(R.string.fl_eu_bulgaria_bg), " ", R.drawable.bg, context.getString(R.string.flag_question)));
                flagsEurope.add(new Quiz(context.getString(R.string.fl_eu_croatia_hr), " ", R.drawable.hr, context.getString(R.string.flag_question)));
                flagsEurope.add(new Quiz(context.getString(R.string.fl_eu_the_czech_republic_cz), " ", R.drawable.cz, context.getString(R.string.flag_question)));
                flagsEurope.add(new Quiz(context.getString(R.string.fl_eu_denmark_dk), " ", R.drawable.dk, context.getString(R.string.flag_question)));

                flagsEurope.add(new Quiz(context.getString(R.string.fl_eu_estonia_ee), " ", R.drawable.ee, context.getString(R.string.flag_question)));
                flagsEurope.add(new Quiz(context.getString(R.string.fl_eu_finland_fi), " ", R.drawable.fi, context.getString(R.string.flag_question)));
                flagsEurope.add(new Quiz(context.getString(R.string.fl_eu_france_fr), " ", R.drawable.fr, context.getString(R.string.flag_question)));
                flagsEurope.add(new Quiz(context.getString(R.string.fl_eu_germany_de), " ", R.drawable.de, context.getString(R.string.flag_question)));
                flagsEurope.add(new Quiz(context.getString(R.string.fl_eu_greece_gr), " ", R.drawable.gr, context.getString(R.string.flag_question)));

                flagsEurope.add(new Quiz(context.getString(R.string.fl_eu_hungary_hu), " ", R.drawable.hu, context.getString(R.string.flag_question)));
                flagsEurope.add(new Quiz(context.getString(R.string.fl_eu_iceland_is), " ", R.drawable.is, context.getString(R.string.flag_question)));
                flagsEurope.add(new Quiz(context.getString(R.string.fl_eu_ireland_ie), " ", R.drawable.ie, context.getString(R.string.flag_question)));
                flagsEurope.add(new Quiz(context.getString(R.string.fl_eu_italy_it), " ", R.drawable.it, context.getString(R.string.flag_question)));
                flagsEurope.add(new Quiz(context.getString(R.string.fl_eu_kosovo_xk), " ", R.drawable.mk, context.getString(R.string.flag_question)));

                flagsEurope.add(new Quiz(context.getString(R.string.fl_eu_latvia_lv), " ", R.drawable.lv, context.getString(R.string.flag_question)));
                flagsEurope.add(new Quiz(context.getString(R.string.fl_eu_liechtenstein_li), " ", R.drawable.li, context.getString(R.string.flag_question)));
                flagsEurope.add(new Quiz(context.getString(R.string.fl_eu_lithuania_lt), " ", R.drawable.lt, context.getString(R.string.flag_question)));
                flagsEurope.add(new Quiz(context.getString(R.string.fl_eu_luxembourg_lu), " ", R.drawable.lu, context.getString(R.string.flag_question)));
                flagsEurope.add(new Quiz(context.getString(R.string.fl_eu_macedonia_mk), " ", R.drawable.mk, context.getString(R.string.flag_question)));

                flagsEurope.add(new Quiz(context.getString(R.string.fl_eu_malta_mt), " ", R.drawable.mt, context.getString(R.string.flag_question)));
                flagsEurope.add(new Quiz(context.getString(R.string.fl_eu_moldova_md), " ", R.drawable.md, context.getString(R.string.flag_question)));
                flagsEurope.add(new Quiz(context.getString(R.string.fl_eu_monaco_mc), " ", R.drawable.mc, context.getString(R.string.flag_question)));
                flagsEurope.add(new Quiz(context.getString(R.string.fl_eu_montenegro_me), " ", R.drawable.me, context.getString(R.string.flag_question)));
                flagsEurope.add(new Quiz(context.getString(R.string.fl_eu_the_netherlands_nl), " ", R.drawable.nl, context.getString(R.string.flag_question)));

                flagsEurope.add(new Quiz(context.getString(R.string.fl_eu_norway_no), " ", R.drawable.no, context.getString(R.string.flag_question)));
                flagsEurope.add(new Quiz(context.getString(R.string.fl_eu_poland_pl), " ", R.drawable.pl, context.getString(R.string.flag_question)));
                flagsEurope.add(new Quiz(context.getString(R.string.fl_eu_portugal_pt), " ", R.drawable.pt, context.getString(R.string.flag_question)));
                flagsEurope.add(new Quiz(context.getString(R.string.fl_eu_romania_ro), " ", R.drawable.ro, context.getString(R.string.flag_question)));
                flagsEurope.add(new Quiz(context.getString(R.string.fl_eu_russia_ru), " ", R.drawable.ru, context.getString(R.string.flag_question)));

                flagsEurope.add(new Quiz(context.getString(R.string.fl_eu_san_marino_sm), " ", R.drawable.sm, context.getString(R.string.flag_question)));
                flagsEurope.add(new Quiz(context.getString(R.string.fl_eu_serbia_rs), " ", R.drawable.rs, context.getString(R.string.flag_question)));
                flagsEurope.add(new Quiz(context.getString(R.string.fl_eu_slovakia_sk), " ", R.drawable.sk, context.getString(R.string.flag_question)));
                flagsEurope.add(new Quiz(context.getString(R.string.fl_eu_slovenia_si), " ", R.drawable.si, context.getString(R.string.flag_question)));
                flagsEurope.add(new Quiz(context.getString(R.string.fl_eu_spain_es), " ", R.drawable.es, context.getString(R.string.flag_question)));

                flagsEurope.add(new Quiz(context.getString(R.string.fl_eu_sweden_se), " ", R.drawable.se, context.getString(R.string.flag_question)));
                flagsEurope.add(new Quiz(context.getString(R.string.fl_eu_switzerland_ch), " ", R.drawable.ch, context.getString(R.string.flag_question)));
                flagsEurope.add(new Quiz(context.getString(R.string.fl_eu_turkey_tr), " ", R.drawable.tr, context.getString(R.string.flag_question)));
                flagsEurope.add(new Quiz(context.getString(R.string.fl_eu_ukraine_ua), " ", R.drawable.ua, context.getString(R.string.flag_question)));
                flagsEurope.add(new Quiz(context.getString(R.string.fl_eu_the_united_kingdom_gb), " ", R.drawable.gb, context.getString(R.string.flag_question)));
                flagsEurope.add(new Quiz(context.getString(R.string.fl_eu_the_vatican_city_state_va), " ", R.drawable.va, context.getString(R.string.flag_question)));
                setValue(flagsEurope);
                break;

            case F_NORTH_AMERICA:
                List<Quiz> flagsNAmerica = new ArrayList<>();
                flagsNAmerica.add(new Quiz(context.getString(R.string.fl_na_antigua_and_barbuda_ag), " ", R.drawable.ag, context.getString(R.string.flag_question)));
                flagsNAmerica.add(new Quiz(context.getString(R.string.fl_na_the_bahamas_bs), " ", R.drawable.bs, context.getString(R.string.flag_question)));
                flagsNAmerica.add(new Quiz(context.getString(R.string.fl_na_barbados_bb), " ", R.drawable.bb, context.getString(R.string.flag_question)));
                flagsNAmerica.add(new Quiz(context.getString(R.string.fl_na_belize_bz), " ", R.drawable.bz, context.getString(R.string.flag_question)));
                flagsNAmerica.add(new Quiz(context.getString(R.string.fl_na_canada_ca), " ", R.drawable.ca, context.getString(R.string.flag_question)));

                flagsNAmerica.add(new Quiz(context.getString(R.string.fl_na_costa_rica_cr), " ", R.drawable.cr, context.getString(R.string.flag_question)));
                flagsNAmerica.add(new Quiz(context.getString(R.string.fl_na_cuba_cu), " ", R.drawable.cu, context.getString(R.string.flag_question)));
                flagsNAmerica.add(new Quiz(context.getString(R.string.fl_na_dominica_dm), " ", R.drawable.dm, context.getString(R.string.flag_question)));
                flagsNAmerica.add(new Quiz(context.getString(R.string.fl_na_the_dominican_republic_do), " ", R.drawable.dom, context.getString(R.string.flag_question)));
                flagsNAmerica.add(new Quiz(context.getString(R.string.fl_na_el_salvador_sv), " ", R.drawable.sv, context.getString(R.string.flag_question)));

                flagsNAmerica.add(new Quiz(context.getString(R.string.fl_na_grenada_gd), " ", R.drawable.gd, context.getString(R.string.flag_question)));
                flagsNAmerica.add(new Quiz(context.getString(R.string.fl_na_guatemala_gt), " ", R.drawable.gt, context.getString(R.string.flag_question)));
                flagsNAmerica.add(new Quiz(context.getString(R.string.fl_na_haiti_ht), " ", R.drawable.ht, context.getString(R.string.flag_question)));
                flagsNAmerica.add(new Quiz(context.getString(R.string.fl_na_honduras_hn), " ", R.drawable.hn, context.getString(R.string.flag_question)));
                flagsNAmerica.add(new Quiz(context.getString(R.string.fl_na_jamaica_jm), " ", R.drawable.jm, context.getString(R.string.flag_question)));

                flagsNAmerica.add(new Quiz(context.getString(R.string.fl_na_mexico_mx), " ", R.drawable.mx, context.getString(R.string.flag_question)));
                flagsNAmerica.add(new Quiz(context.getString(R.string.fl_na_nicaragua_ni), " ", R.drawable.ni, context.getString(R.string.flag_question)));
                flagsNAmerica.add(new Quiz(context.getString(R.string.fl_na_panama_pa), " ", R.drawable.pa, context.getString(R.string.flag_question)));
                flagsNAmerica.add(new Quiz(context.getString(R.string.fl_na_saint_kitts_and_nevis_kn), " ", R.drawable.kn, context.getString(R.string.flag_question)));
                flagsNAmerica.add(new Quiz(context.getString(R.string.fl_na_saint_lucia_lc), " ", R.drawable.lc, context.getString(R.string.flag_question)));

                flagsNAmerica.add(new Quiz(context.getString(R.string.fl_na_saint_vincent_and_the_grenadines_vc), " ", R.drawable.vc, context.getString(R.string.flag_question)));
                flagsNAmerica.add(new Quiz(context.getString(R.string.fl_na_trinidad_and_tobago_tt), " ", R.drawable.tt, context.getString(R.string.flag_question)));
                flagsNAmerica.add(new Quiz(context.getString(R.string.fl_na_the_united_states_us), " ", R.drawable.us, context.getString(R.string.flag_question)));
                setValue(flagsNAmerica);
                break;

            case F_SOUTH_AMERICA:
                List<Quiz> flagsSAmerica = new ArrayList<>();
                flagsSAmerica.add(new Quiz(context.getString(R.string.fl_sa_argentina_ar), " ", R.drawable.ar, context.getString(R.string.flag_question)));
                flagsSAmerica.add(new Quiz(context.getString(R.string.fl_sa_bolivia_bo), " ", R.drawable.bo, context.getString(R.string.flag_question)));
                flagsSAmerica.add(new Quiz(context.getString(R.string.fl_sa_brazil_br), " ", R.drawable.br, context.getString(R.string.flag_question)));
                flagsSAmerica.add(new Quiz(context.getString(R.string.fl_sa_chile_cl), " ", R.drawable.cl, context.getString(R.string.flag_question)));
                flagsSAmerica.add(new Quiz(context.getString(R.string.fl_sa_colombia_co), " ", R.drawable.co, context.getString(R.string.flag_question)));

                flagsSAmerica.add(new Quiz(context.getString(R.string.fl_sa_ecuador_ec), " ", R.drawable.ec, context.getString(R.string.flag_question)));
                flagsSAmerica.add(new Quiz(context.getString(R.string.fl_sa_guyana_gy), " ", R.drawable.gy, context.getString(R.string.flag_question)));
                flagsSAmerica.add(new Quiz(context.getString(R.string.fl_sa_paraguay_py), " ", R.drawable.py, context.getString(R.string.flag_question)));
                flagsSAmerica.add(new Quiz(context.getString(R.string.fl_sa_peru_pe), " ", R.drawable.pe, context.getString(R.string.flag_question)));
                flagsSAmerica.add(new Quiz(context.getString(R.string.fl_sa_suriname_sr), " ", R.drawable.sr, context.getString(R.string.flag_question)));

                flagsSAmerica.add(new Quiz(context.getString(R.string.fl_sa_trinidad_and_tobago_tt), " ", R.drawable.tt, context.getString(R.string.flag_question)));
                flagsSAmerica.add(new Quiz(context.getString(R.string.fl_sa_uruguay_uy), " ", R.drawable.uy, context.getString(R.string.flag_question)));
                flagsSAmerica.add(new Quiz(context.getString(R.string.fl_sa_venezuela_ve), " ", R.drawable.ve, context.getString(R.string.flag_question)));
                setValue(flagsSAmerica);
                break;

            case F_OCEANIA:
                List<Quiz> flagsOceania = new ArrayList<>();
                flagsOceania.add(new Quiz(context.getString(R.string.fl_oc_australia_au), " ", R.drawable.au, context.getString(R.string.flag_question)));
                flagsOceania.add(new Quiz(context.getString(R.string.fl_oc_cook_islands_ck), " ", R.drawable.co, context.getString(R.string.flag_question)));
                flagsOceania.add(new Quiz(context.getString(R.string.fl_oc_east_timor_tl), " ", R.drawable.tl, context.getString(R.string.flag_question)));
                flagsOceania.add(new Quiz(context.getString(R.string.fl_oc_fiji_fj), " ", R.drawable.fj, context.getString(R.string.flag_question)));
                flagsOceania.add(new Quiz(context.getString(R.string.fl_oc_indonesia_id), " ", R.drawable.id, context.getString(R.string.flag_question)));

                flagsOceania.add(new Quiz(context.getString(R.string.fl_oc_kiribati_ki), " ", R.drawable.ki, context.getString(R.string.flag_question)));
                flagsOceania.add(new Quiz(context.getString(R.string.fl_oc_the_marshall_islands_mh), " ", R.drawable.mh, context.getString(R.string.flag_question)));
                flagsOceania.add(new Quiz(context.getString(R.string.fl_oc_micronesia_fm), " ", R.drawable.fm, context.getString(R.string.flag_question)));
                flagsOceania.add(new Quiz(context.getString(R.string.fl_oc_nauru_nr), " ", R.drawable.nr, context.getString(R.string.flag_question)));
                flagsOceania.add(new Quiz(context.getString(R.string.fl_oc_new_zealand_nz), " ", R.drawable.nz, context.getString(R.string.flag_question)));

                flagsOceania.add(new Quiz(context.getString(R.string.fl_oc_niue_nu), " ", R.drawable.fm, context.getString(R.string.flag_question)));
                flagsOceania.add(new Quiz(context.getString(R.string.fl_oc_palau_pw), " ", R.drawable.co, context.getString(R.string.flag_question)));
                flagsOceania.add(new Quiz(context.getString(R.string.fl_oc_papua_new_guinea_pg), " ", R.drawable.pg, context.getString(R.string.flag_question)));
                flagsOceania.add(new Quiz(context.getString(R.string.fl_oc_samoa_ws), " ", R.drawable.ws, context.getString(R.string.flag_question)));
                flagsOceania.add(new Quiz(context.getString(R.string.fl_oc_the_solomon_islands_sb), " ", R.drawable.sb, context.getString(R.string.flag_question)));

                flagsOceania.add(new Quiz(context.getString(R.string.fl_oc_tonga_to), " ", R.drawable.to, context.getString(R.string.flag_question)));
                flagsOceania.add(new Quiz(context.getString(R.string.fl_oc_tuvalu_tv), " ", R.drawable.tv, context.getString(R.string.flag_question)));
                flagsOceania.add(new Quiz(context.getString(R.string.fl_oc_vanuatu_vu), " ", R.drawable.vu, context.getString(R.string.flag_question)));
                setValue(flagsOceania);
                break;

            case C_AFRICA:
                List<Quiz> capitalsAfrica = new ArrayList<>();
                capitalsAfrica.add(new Quiz(context.getString(R.string.fl_af_algeria_dz), context.getString(R.string.ca_af_algeria_dz), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAfrica.add(new Quiz(context.getString(R.string.fl_af_angola_ao), context.getString(R.string.ca_af_angola_ao), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAfrica.add(new Quiz(context.getString(R.string.fl_af_benin_bj), context.getString(R.string.ca_af_benin_bj), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAfrica.add(new Quiz(context.getString(R.string.fl_af_botswana_bw), context.getString(R.string.ca_af_botswana_bw), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAfrica.add(new Quiz(context.getString(R.string.fl_af_burkina_faso_bf), context.getString(R.string.ca_af_burkina_faso_bf), R.drawable.capitalsicon, context.getString(R.string.capital_question)));

                capitalsAfrica.add(new Quiz(context.getString(R.string.fl_af_burundi_bi), context.getString(R.string.ca_af_burundi_bi), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAfrica.add(new Quiz(context.getString(R.string.fl_af_cameroon_cm), context.getString(R.string.ca_af_cameroon_cm), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAfrica.add(new Quiz(context.getString(R.string.fl_af_cape_verde_cv), context.getString(R.string.ca_af_cape_verde_cv), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAfrica.add(new Quiz(context.getString(R.string.fl_af_the_central_african_republic_cf), context.getString(R.string.ca_af_the_central_african_republic_cf), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAfrica.add(new Quiz(context.getString(R.string.fl_af_chad_td), context.getString(R.string.ca_af_chad_td), R.drawable.capitalsicon, context.getString(R.string.capital_question)));

                capitalsAfrica.add(new Quiz(context.getString(R.string.fl_af_the_comoros_km), context.getString(R.string.ca_af_the_comoros_km), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAfrica.add(new Quiz(context.getString(R.string.fl_af_ivory_coast_ci), context.getString(R.string.ca_af_ivory_coast_ci), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAfrica.add(new Quiz(context.getString(R.string.fl_af_the_democratic_republic_of_the_congo_cd), context.getString(R.string.ca_af_the_democratic_republic_of_the_congo_cd), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAfrica.add(new Quiz(context.getString(R.string.fl_af_djibouti_dj), context.getString(R.string.ca_af_djibouti_dj), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAfrica.add(new Quiz(context.getString(R.string.fl_af_egypt_eg), context.getString(R.string.ca_af_egypt_eg), R.drawable.capitalsicon, context.getString(R.string.capital_question)));

                capitalsAfrica.add(new Quiz(context.getString(R.string.fl_af_equatorial_guinea_gq), context.getString(R.string.ca_af_equatorial_guinea_gq), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAfrica.add(new Quiz(context.getString(R.string.fl_af_eritrea_er), context.getString(R.string.ca_af_eritrea_er), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAfrica.add(new Quiz(context.getString(R.string.fl_af_ethiopia_et), context.getString(R.string.ca_af_ethiopia_et), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAfrica.add(new Quiz(context.getString(R.string.fl_af_gabon_ga), context.getString(R.string.ca_af_gabon_ga), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAfrica.add(new Quiz(context.getString(R.string.fl_af_the_gambia_gm), context.getString(R.string.ca_af_the_gambia_gm), R.drawable.capitalsicon, context.getString(R.string.capital_question)));

                capitalsAfrica.add(new Quiz(context.getString(R.string.fl_af_ghana_gh), context.getString(R.string.ca_af_ghana_gh), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAfrica.add(new Quiz(context.getString(R.string.fl_af_guinea_gn), context.getString(R.string.ca_af_guinea_gn), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAfrica.add(new Quiz(context.getString(R.string.fl_af_guinea_bissau_gw), context.getString(R.string.ca_af_guinea_bissau_gw), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAfrica.add(new Quiz(context.getString(R.string.fl_af_kenya_ke), context.getString(R.string.ca_af_kenya_ke), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAfrica.add(new Quiz(context.getString(R.string.fl_af_lesotho_ls), context.getString(R.string.ca_af_lesotho_ls), R.drawable.capitalsicon, context.getString(R.string.capital_question)));

                capitalsAfrica.add(new Quiz(context.getString(R.string.fl_af_liberia_lr), context.getString(R.string.ca_af_liberia_lr), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAfrica.add(new Quiz(context.getString(R.string.fl_af_libya_ly), context.getString(R.string.ca_af_libya_ly), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAfrica.add(new Quiz(context.getString(R.string.fl_af_madagascar_mg), context.getString(R.string.ca_af_madagascar_mg), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAfrica.add(new Quiz(context.getString(R.string.fl_af_malawi_mw), context.getString(R.string.ca_af_malawi_mw), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAfrica.add(new Quiz(context.getString(R.string.fl_af_mali_ml), context.getString(R.string.ca_af_mali_ml), R.drawable.capitalsicon, context.getString(R.string.capital_question)));

                capitalsAfrica.add(new Quiz(context.getString(R.string.fl_af_mauritania_mr), context.getString(R.string.ca_af_mauritania_mr), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAfrica.add(new Quiz(context.getString(R.string.fl_af_mauritius_mu), context.getString(R.string.ca_af_mauritius_mu), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAfrica.add(new Quiz(context.getString(R.string.fl_af_morocco_ma), context.getString(R.string.ca_af_morocco_ma), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAfrica.add(new Quiz(context.getString(R.string.fl_af_mozambique_mz), context.getString(R.string.ca_af_mozambique_mz), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAfrica.add(new Quiz(context.getString(R.string.fl_af_namibia_na), context.getString(R.string.ca_af_namibia_na), R.drawable.capitalsicon, context.getString(R.string.capital_question)));

                capitalsAfrica.add(new Quiz(context.getString(R.string.fl_af_niger_ne), context.getString(R.string.ca_af_niger_ne), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAfrica.add(new Quiz(context.getString(R.string.fl_af_nigeria_ng), context.getString(R.string.ca_af_nigeria_ng), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAfrica.add(new Quiz(context.getString(R.string.fl_af_the_republic_of_the_congo_cg), context.getString(R.string.ca_af_the_republic_of_the_congo_cg), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAfrica.add(new Quiz(context.getString(R.string.fl_af_rwanda_rw), context.getString(R.string.ca_af_rwanda_rw), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAfrica.add(new Quiz(context.getString(R.string.fl_af_sao_tome_and_principe_st), context.getString(R.string.ca_af_sao_tome_and_principe_st), R.drawable.capitalsicon, context.getString(R.string.capital_question)));

                capitalsAfrica.add(new Quiz(context.getString(R.string.fl_af_senegal_sn), context.getString(R.string.ca_af_senegal_sn), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAfrica.add(new Quiz(context.getString(R.string.fl_af_the_seychelles_sc), context.getString(R.string.ca_af_the_seychelles_sc), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAfrica.add(new Quiz(context.getString(R.string.fl_af_sierra_leone_sl), context.getString(R.string.ca_af_sierra_leone_sl), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAfrica.add(new Quiz(context.getString(R.string.fl_af_somalia_so), context.getString(R.string.ca_af_somalia_so), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAfrica.add(new Quiz(context.getString(R.string.fl_af_south_africa_za), context.getString(R.string.ca_af_south_africa_za), R.drawable.capitalsicon, context.getString(R.string.capital_question)));

                capitalsAfrica.add(new Quiz(context.getString(R.string.fl_af_south_sudan_sdn), context.getString(R.string.ca_af_south_sudan_sdn), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAfrica.add(new Quiz(context.getString(R.string.fl_af_sudan_sd), context.getString(R.string.ca_af_sudan_sd), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAfrica.add(new Quiz(context.getString(R.string.fl_af_swaziland_sz), context.getString(R.string.ca_af_swaziland_sz), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAfrica.add(new Quiz(context.getString(R.string.fl_af_tanzania_tz), context.getString(R.string.ca_af_tanzania_tz), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAfrica.add(new Quiz(context.getString(R.string.fl_af_togo_tg), context.getString(R.string.ca_af_togo_tg), R.drawable.capitalsicon, context.getString(R.string.capital_question)));

                capitalsAfrica.add(new Quiz(context.getString(R.string.fl_af_tunisia_tn), context.getString(R.string.ca_af_tunisia_tn), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAfrica.add(new Quiz(context.getString(R.string.fl_af_uganda_ug), context.getString(R.string.ca_af_uganda_ug), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAfrica.add(new Quiz(context.getString(R.string.fl_af_western_sahara_eh), context.getString(R.string.ca_af_western_sahara_eh), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAfrica.add(new Quiz(context.getString(R.string.fl_af_zambia_zm), context.getString(R.string.ca_af_zambia_zm), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAfrica.add(new Quiz(context.getString(R.string.fl_af_zimbabwe_zw), context.getString(R.string.ca_af_zimbabwe_zw), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                setValue(capitalsAfrica);
                break;

            case C_ASIA:
                List<Quiz> capitalsAsia = new ArrayList<>();
                capitalsAsia.add(new Quiz(context.getString(R.string.fl_as_afghanistan_af), context.getString(R.string.ca_as_afghanistan_af),  R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAsia.add(new Quiz(context.getString(R.string.fl_as_armenia_am), context.getString(R.string.ca_as_armenia_am), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAsia.add(new Quiz(context.getString(R.string.fl_as_azerbaijan_az), context.getString(R.string.ca_as_azerbaijan_az), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAsia.add(new Quiz(context.getString(R.string.fl_as_bahrain_bh), context.getString(R.string.ca_as_bahrain_bh), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAsia.add(new Quiz(context.getString(R.string.fl_as_bangladesh_bd), context.getString(R.string.ca_as_bangladesh_bd), R.drawable.capitalsicon, context.getString(R.string.capital_question)));

                capitalsAsia.add(new Quiz(context.getString(R.string.fl_as_bhutan_bt), context.getString(R.string.ca_as_bhutan_bt), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAsia.add(new Quiz(context.getString(R.string.fl_as_brunei_bn), context.getString(R.string.ca_as_brunei_bn),R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAsia.add(new Quiz(context.getString(R.string.fl_as_cambodia_kh), context.getString(R.string.ca_as_cambodia_kh),  R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAsia.add(new Quiz(context.getString(R.string.fl_as_cyprus_cy), context.getString(R.string.ca_as_cyprus_cy), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAsia.add(new Quiz(context.getString(R.string.fl_as_east_timor_tl), context.getString(R.string.ca_as_east_timor_tl), R.drawable.capitalsicon, context.getString(R.string.capital_question)));

                capitalsAsia.add(new Quiz(context.getString(R.string.fl_as_egypt_eg), context.getString(R.string.ca_as_egypt_eg), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAsia.add(new Quiz(context.getString(R.string.fl_as_georgia_ge), context.getString(R.string.ca_as_georgia_ge), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAsia.add(new Quiz(context.getString(R.string.fl_as_india_in), context.getString(R.string.ca_as_india_in), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAsia.add(new Quiz(context.getString(R.string.fl_as_indonesia_id), context.getString(R.string.ca_as_indonesia_id), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAsia.add(new Quiz(context.getString(R.string.fl_as_iran_ir), context.getString(R.string.ca_as_iran_ir), R.drawable.capitalsicon, context.getString(R.string.capital_question)));

                capitalsAsia.add(new Quiz(context.getString(R.string.fl_as_iraq_iq), context.getString(R.string.ca_as_iraq_iq), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAsia.add(new Quiz(context.getString(R.string.fl_as_israel_il), context.getString(R.string.ca_as_israel_il), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAsia.add(new Quiz(context.getString(R.string.fl_as_japan_jp), context.getString(R.string.ca_as_japan_jp), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAsia.add(new Quiz(context.getString(R.string.fl_as_jordan_jo), context.getString(R.string.ca_as_jordan_jo), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAsia.add(new Quiz(context.getString(R.string.fl_as_kazakhstan_kz), context.getString(R.string.ca_as_kazakhstan_kz), R.drawable.capitalsicon, context.getString(R.string.capital_question)));

                capitalsAsia.add(new Quiz(context.getString(R.string.fl_as_kuwait_kw), context.getString(R.string.ca_as_kuwait_kw), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAsia.add(new Quiz(context.getString(R.string.fl_as_kyrgyzstan_kg), context.getString(R.string.ca_as_kyrgyzstan_kg), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAsia.add(new Quiz(context.getString(R.string.fl_as_laos_la), context.getString(R.string.ca_as_laos_la), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAsia.add(new Quiz(context.getString(R.string.fl_as_lebanon_lb), context.getString(R.string.ca_as_lebanon_lb), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAsia.add(new Quiz(context.getString(R.string.fl_as_malaysia_my), context.getString(R.string.ca_as_malaysia_my), R.drawable.capitalsicon, context.getString(R.string.capital_question)));

                capitalsAsia.add(new Quiz(context.getString(R.string.fl_as_maldives_mv), context.getString(R.string.ca_as_maldives_mv), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAsia.add(new Quiz(context.getString(R.string.fl_as_mongolia_mn), context.getString(R.string.ca_as_mongolia_mn), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAsia.add(new Quiz(context.getString(R.string.fl_as_myanmar_mm), context.getString(R.string.ca_as_myanmar_mm), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAsia.add(new Quiz(context.getString(R.string.fl_as_nepal_np), context.getString(R.string.ca_as_nepal_np), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAsia.add(new Quiz(context.getString(R.string.fl_as_north_korea_kp), context.getString(R.string.ca_as_north_korea_kp), R.drawable.capitalsicon, context.getString(R.string.capital_question)));

                capitalsAsia.add(new Quiz(context.getString(R.string.fl_as_oman_om), context.getString(R.string.ca_as_oman_om), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAsia.add(new Quiz(context.getString(R.string.fl_as_pakistan_pk), context.getString(R.string.ca_as_pakistan_pk), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAsia.add(new Quiz(context.getString(R.string.fl_as_the_peoples_republic_of_china_cn), context.getString(R.string.ca_as_the_peoples_republic_of_china_cn), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAsia.add(new Quiz(context.getString(R.string.fl_as_the_philippines_ph), context.getString(R.string.ca_as_the_philippines_ph), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAsia.add(new Quiz(context.getString(R.string.fl_as_qatar_qa), context.getString(R.string.ca_as_qatar_qa), R.drawable.capitalsicon, context.getString(R.string.capital_question)));

                capitalsAsia.add(new Quiz(context.getString(R.string.fl_as_the_republic_of_china_tw), context.getString(R.string.ca_as_the_republic_of_china_tw), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAsia.add(new Quiz(context.getString(R.string.fl_as_russia_ru), context.getString(R.string.ca_as_russia_ru), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAsia.add(new Quiz(context.getString(R.string.fl_as_saudi_arabia_sa), context.getString(R.string.ca_as_saudi_arabia_sa), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAsia.add(new Quiz(context.getString(R.string.fl_as_singapore_sg), context.getString(R.string.ca_as_singapore_sg), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAsia.add(new Quiz(context.getString(R.string.fl_as_south_korea_kr), context.getString(R.string.ca_as_south_korea_kr), R.drawable.capitalsicon, context.getString(R.string.capital_question)));

                capitalsAsia.add(new Quiz(context.getString(R.string.fl_as_sri_lanka_lk), context.getString(R.string.ca_as_sri_lanka_lk), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAsia.add(new Quiz(context.getString(R.string.fl_as_syria_sy), context.getString(R.string.ca_as_syria_sy), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAsia.add(new Quiz(context.getString(R.string.fl_as_tajikistan_tj), context.getString(R.string.ca_as_tajikistan_tj), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAsia.add(new Quiz(context.getString(R.string.fl_as_thailand_th), context.getString(R.string.ca_as_thailand_th), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAsia.add(new Quiz(context.getString(R.string.fl_as_turkey_tr), context.getString(R.string.ca_as_turkey_tr), R.drawable.capitalsicon, context.getString(R.string.capital_question)));

                capitalsAsia.add(new Quiz(context.getString(R.string.fl_as_turkmenistan_tm), context.getString(R.string.ca_as_turkmenistan_tm), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAsia.add(new Quiz(context.getString(R.string.fl_as_the_united_arab_emirates_ae), context.getString(R.string.ca_as_the_united_arab_emirates_ae), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAsia.add(new Quiz(context.getString(R.string.fl_as_uzbekistan_uz), context.getString(R.string.ca_as_uzbekistan_uz), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAsia.add(new Quiz(context.getString(R.string.fl_as_vietnam_vn), context.getString(R.string.ca_as_vietnam_vn), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsAsia.add(new Quiz(context.getString(R.string.fl_as_yemen_ye), context.getString(R.string.ca_as_yemen_ye), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                setValue(capitalsAsia);
                break;

            case C_EUROPE:
                List<Quiz> capitalsEurope = new ArrayList<>();
                capitalsEurope.add(new Quiz(context.getString(R.string.fl_eu_albania_al), context.getString(R.string.ca_eu_albania_al), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsEurope.add(new Quiz(context.getString(R.string.fl_eu_andorra_ad), context.getString(R.string.ca_eu_andorra_ad), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsEurope.add(new Quiz(context.getString(R.string.fl_eu_austria_at), context.getString(R.string.ca_eu_austria_at), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsEurope.add(new Quiz(context.getString(R.string.fl_eu_belarus_by), context.getString(R.string.ca_eu_belarus_by), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsEurope.add(new Quiz(context.getString(R.string.fl_eu_belgium_be), context.getString(R.string.ca_eu_belgium_be),  R.drawable.capitalsicon, context.getString(R.string.capital_question)));

                capitalsEurope.add(new Quiz(context.getString(R.string.fl_eu_bosnia_and_herzegovina_ba), context.getString(R.string.ca_eu_bosnia_and_herzegovina_ba),  R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsEurope.add(new Quiz(context.getString(R.string.fl_eu_bulgaria_bg), context.getString(R.string.ca_eu_bulgaria_bg), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsEurope.add(new Quiz(context.getString(R.string.fl_eu_croatia_hr), context.getString(R.string.ca_eu_croatia_hr), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsEurope.add(new Quiz(context.getString(R.string.fl_eu_the_czech_republic_cz), context.getString(R.string.ca_eu_the_czech_republic_cz), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsEurope.add(new Quiz(context.getString(R.string.fl_eu_denmark_dk), context.getString(R.string.ca_eu_denmark_dk), R.drawable.capitalsicon, context.getString(R.string.capital_question)));

                capitalsEurope.add(new Quiz(context.getString(R.string.fl_eu_estonia_ee), context.getString(R.string.ca_eu_estonia_ee), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsEurope.add(new Quiz(context.getString(R.string.fl_eu_finland_fi), context.getString(R.string.ca_eu_finland_fi), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsEurope.add(new Quiz(context.getString(R.string.fl_eu_france_fr), context.getString(R.string.ca_eu_france_fr), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsEurope.add(new Quiz(context.getString(R.string.fl_eu_germany_de), context.getString(R.string.ca_eu_germany_de), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsEurope.add(new Quiz(context.getString(R.string.fl_eu_greece_gr), context.getString(R.string.ca_eu_greece_gr),  R.drawable.capitalsicon, context.getString(R.string.capital_question)));

                capitalsEurope.add(new Quiz(context.getString(R.string.fl_eu_hungary_hu), context.getString(R.string.ca_eu_hungary_hu), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsEurope.add(new Quiz(context.getString(R.string.fl_eu_iceland_is), context.getString(R.string.ca_eu_iceland_is),R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsEurope.add(new Quiz(context.getString(R.string.fl_eu_ireland_ie), context.getString(R.string.ca_eu_ireland_ie),  R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsEurope.add(new Quiz(context.getString(R.string.fl_eu_italy_it), context.getString(R.string.ca_eu_italy_it),  R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsEurope.add(new Quiz(context.getString(R.string.fl_eu_kosovo_xk), context.getString(R.string.ca_eu_kosovo_xk),  R.drawable.capitalsicon, context.getString(R.string.capital_question)));

                capitalsEurope.add(new Quiz(context.getString(R.string.fl_eu_latvia_lv), context.getString(R.string.ca_eu_latvia_lv), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsEurope.add(new Quiz(context.getString(R.string.fl_eu_liechtenstein_li), context.getString(R.string.ca_eu_liechtenstein_li), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsEurope.add(new Quiz(context.getString(R.string.fl_eu_lithuania_lt), context.getString(R.string.ca_eu_lithuania_lt), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsEurope.add(new Quiz(context.getString(R.string.fl_eu_luxembourg_lu), context.getString(R.string.ca_eu_luxembourg_lu),  R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsEurope.add(new Quiz(context.getString(R.string.fl_eu_macedonia_mk), context.getString(R.string.ca_eu_macedonia_mk), R.drawable.capitalsicon, context.getString(R.string.capital_question)));

                capitalsEurope.add(new Quiz(context.getString(R.string.fl_eu_malta_mt), context.getString(R.string.ca_eu_malta_mt),  R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsEurope.add(new Quiz(context.getString(R.string.fl_eu_moldova_md), context.getString(R.string.ca_eu_moldova_md), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsEurope.add(new Quiz(context.getString(R.string.fl_eu_monaco_mc), context.getString(R.string.ca_eu_monaco_mc),  R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsEurope.add(new Quiz(context.getString(R.string.fl_eu_montenegro_me), context.getString(R.string.ca_eu_montenegro_me),  R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsEurope.add(new Quiz(context.getString(R.string.fl_eu_the_netherlands_nl), context.getString(R.string.ca_eu_the_netherlands_nl), R.drawable.capitalsicon, context.getString(R.string.capital_question)));

                capitalsEurope.add(new Quiz(context.getString(R.string.fl_eu_norway_no), context.getString(R.string.ca_eu_norway_no), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsEurope.add(new Quiz(context.getString(R.string.fl_eu_poland_pl), context.getString(R.string.ca_eu_poland_pl),R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsEurope.add(new Quiz(context.getString(R.string.fl_eu_portugal_pt), context.getString(R.string.ca_eu_portugal_pt), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsEurope.add(new Quiz(context.getString(R.string.fl_eu_romania_ro), context.getString(R.string.ca_eu_romania_ro), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsEurope.add(new Quiz(context.getString(R.string.fl_eu_russia_ru), context.getString(R.string.ca_eu_russia_ru), R.drawable.capitalsicon, context.getString(R.string.capital_question)));

                capitalsEurope.add(new Quiz(context.getString(R.string.fl_eu_san_marino_sm), context.getString(R.string.ca_eu_san_marino_sm), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsEurope.add(new Quiz(context.getString(R.string.fl_eu_serbia_rs), context.getString(R.string.ca_eu_serbia_rs), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsEurope.add(new Quiz(context.getString(R.string.fl_eu_slovakia_sk), context.getString(R.string.ca_eu_slovakia_sk), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsEurope.add(new Quiz(context.getString(R.string.fl_eu_slovenia_si), context.getString(R.string.ca_eu_slovenia_si), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsEurope.add(new Quiz(context.getString(R.string.fl_eu_spain_es), context.getString(R.string.ca_eu_spain_es), R.drawable.capitalsicon, context.getString(R.string.capital_question)));

                capitalsEurope.add(new Quiz(context.getString(R.string.fl_eu_sweden_se), context.getString(R.string.ca_eu_sweden_se), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsEurope.add(new Quiz(context.getString(R.string.fl_eu_switzerland_ch), context.getString(R.string.ca_eu_switzerland_ch),  R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsEurope.add(new Quiz(context.getString(R.string.fl_eu_turkey_tr), context.getString(R.string.ca_eu_turkey_tr), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsEurope.add(new Quiz(context.getString(R.string.fl_eu_ukraine_ua), context.getString(R.string.ca_eu_ukraine_ua), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsEurope.add(new Quiz(context.getString(R.string.fl_eu_the_united_kingdom_gb), context.getString(R.string.ca_eu_the_united_kingdom_gb),  R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsEurope.add(new Quiz(context.getString(R.string.fl_eu_the_vatican_city_state_va), context.getString(R.string.ca_eu_the_vatican_city_state_va), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                setValue(capitalsEurope);
                break;

            case C_NORTH_AMERICA:
                List<Quiz> capitalsNAmerica = new ArrayList<>();
                capitalsNAmerica.add(new Quiz(context.getString(R.string.fl_na_antigua_and_barbuda_ag), context.getString(R.string.ca_na_antigua_and_barbuda_ag), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsNAmerica.add(new Quiz(context.getString(R.string.fl_na_the_bahamas_bs), context.getString(R.string.ca_na_the_bahamas_bs), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsNAmerica.add(new Quiz(context.getString(R.string.fl_na_barbados_bb), context.getString(R.string.ca_na_barbados_bb), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsNAmerica.add(new Quiz(context.getString(R.string.fl_na_belize_bz), context.getString(R.string.ca_na_belize_bz), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsNAmerica.add(new Quiz(context.getString(R.string.fl_na_canada_ca), context.getString(R.string.ca_na_canada_ca), R.drawable.capitalsicon, context.getString(R.string.capital_question)));

                capitalsNAmerica.add(new Quiz(context.getString(R.string.fl_na_costa_rica_cr), context.getString(R.string.ca_na_costa_rica_cr), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsNAmerica.add(new Quiz(context.getString(R.string.fl_na_cuba_cu), context.getString(R.string.ca_na_cuba_cu), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsNAmerica.add(new Quiz(context.getString(R.string.fl_na_dominica_dm), context.getString(R.string.ca_na_dominica_dm), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsNAmerica.add(new Quiz(context.getString(R.string.fl_na_the_dominican_republic_do), context.getString(R.string.ca_na_the_dominican_republic_do), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsNAmerica.add(new Quiz(context.getString(R.string.fl_na_el_salvador_sv), context.getString(R.string.ca_na_el_salvador_sv), R.drawable.capitalsicon, context.getString(R.string.capital_question)));

                capitalsNAmerica.add(new Quiz(context.getString(R.string.fl_na_grenada_gd), context.getString(R.string.ca_na_grenada_gd), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsNAmerica.add(new Quiz(context.getString(R.string.fl_na_guatemala_gt), context.getString(R.string.ca_na_guatemala_gt), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsNAmerica.add(new Quiz(context.getString(R.string.fl_na_haiti_ht),context.getString(R.string.ca_na_haiti_ht), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsNAmerica.add(new Quiz(context.getString(R.string.fl_na_honduras_hn),context.getString(R.string.ca_na_honduras_hn), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsNAmerica.add(new Quiz(context.getString(R.string.fl_na_jamaica_jm),context.getString(R.string.ca_na_jamaica_jm), R.drawable.capitalsicon, context.getString(R.string.capital_question)));

                capitalsNAmerica.add(new Quiz(context.getString(R.string.fl_na_mexico_mx),context.getString(R.string.ca_na_mexico_mx), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsNAmerica.add(new Quiz(context.getString(R.string.fl_na_nicaragua_ni),context.getString(R.string.ca_na_nicaragua_ni), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsNAmerica.add(new Quiz(context.getString(R.string.fl_na_panama_pa),context.getString(R.string.ca_na_panama_pa), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsNAmerica.add(new Quiz(context.getString(R.string.fl_na_saint_kitts_and_nevis_kn),context.getString(R.string.ca_na_saint_kitts_and_nevis_kn), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsNAmerica.add(new Quiz(context.getString(R.string.fl_na_saint_lucia_lc), context.getString(R.string.ca_na_saint_lucia_lc), R.drawable.capitalsicon, context.getString(R.string.capital_question)));

                capitalsNAmerica.add(new Quiz(context.getString(R.string.fl_na_saint_vincent_and_the_grenadines_vc),context.getString(R.string.ca_na_saint_vincent_and_the_grenadines_vc), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsNAmerica.add(new Quiz(context.getString(R.string.fl_na_trinidad_and_tobago_tt),context.getString(R.string.ca_na_trinidad_and_tobago_tt), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsNAmerica.add(new Quiz(context.getString(R.string.fl_na_the_united_states_us),context.getString(R.string.ca_na_the_united_states_us), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                setValue(capitalsNAmerica);
                break;

            case C_SOUTH_AMERICA:
                List<Quiz> capitalsSAmerica = new ArrayList<>();
                capitalsSAmerica.add(new Quiz(context.getString(R.string.fl_sa_argentina_ar), context.getString(R.string.ca_sa_argentina_ar), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsSAmerica.add(new Quiz(context.getString(R.string.fl_sa_bolivia_bo), context.getString(R.string.ca_sa_bolivia_bo), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsSAmerica.add(new Quiz(context.getString(R.string.fl_sa_brazil_br), context.getString(R.string.ca_sa_brazil_br), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsSAmerica.add(new Quiz(context.getString(R.string.fl_sa_chile_cl), context.getString(R.string.ca_sa_chile_cl), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsSAmerica.add(new Quiz(context.getString(R.string.fl_sa_colombia_co), context.getString(R.string.ca_sa_colombia_co), R.drawable.capitalsicon, context.getString(R.string.capital_question)));

                capitalsSAmerica.add(new Quiz(context.getString(R.string.fl_sa_ecuador_ec), context.getString(R.string.ca_sa_ecuador_ec), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsSAmerica.add(new Quiz(context.getString(R.string.fl_sa_guyana_gy), context.getString(R.string.ca_sa_guyana_gy), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsSAmerica.add(new Quiz(context.getString(R.string.fl_sa_paraguay_py), context.getString(R.string.ca_sa_paraguay_py), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsSAmerica.add(new Quiz(context.getString(R.string.fl_sa_peru_pe), context.getString(R.string.ca_sa_peru_pe), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsSAmerica.add(new Quiz(context.getString(R.string.fl_sa_suriname_sr), context.getString(R.string.ca_sa_suriname_sr), R.drawable.capitalsicon, context.getString(R.string.capital_question)));

                capitalsSAmerica.add(new Quiz(context.getString(R.string.fl_sa_trinidad_and_tobago_tt), context.getString(R.string.ca_sa_trinidad_and_tobago_tt), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsSAmerica.add(new Quiz(context.getString(R.string.fl_sa_uruguay_uy), context.getString(R.string.ca_sa_uruguay_uy), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsSAmerica.add(new Quiz(context.getString(R.string.fl_sa_venezuela_ve), context.getString(R.string.ca_sa_venezuela_ve), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                setValue(capitalsSAmerica);
                break;

            case C_OCEANIA:
                List<Quiz> capitalsOceania = new ArrayList<>();
                capitalsOceania.add(new Quiz(context.getString(R.string.fl_oc_australia_au), context.getString(R.string.ca_oc_australia_au), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsOceania.add(new Quiz(context.getString(R.string.fl_oc_cook_islands_ck), context.getString(R.string.ca_oc_cook_islands_ck), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsOceania.add(new Quiz(context.getString(R.string.fl_oc_east_timor_tl), context.getString(R.string.ca_oc_east_timor_tl), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsOceania.add(new Quiz(context.getString(R.string.fl_oc_fiji_fj), context.getString(R.string.ca_oc_fiji_fj), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsOceania.add(new Quiz(context.getString(R.string.fl_oc_indonesia_id), context.getString(R.string.ca_oc_indonesia_id), R.drawable.capitalsicon, context.getString(R.string.capital_question)));

                capitalsOceania.add(new Quiz(context.getString(R.string.fl_oc_kiribati_ki), context.getString(R.string.ca_oc_kiribati_ki), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsOceania.add(new Quiz(context.getString(R.string.fl_oc_the_marshall_islands_mh), context.getString(R.string.ca_oc_the_marshall_islands_mh), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsOceania.add(new Quiz(context.getString(R.string.fl_oc_micronesia_fm), context.getString(R.string.ca_oc_micronesia_fm), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsOceania.add(new Quiz(context.getString(R.string.fl_oc_nauru_nr), context.getString(R.string.ca_oc_nauru_nr), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsOceania.add(new Quiz(context.getString(R.string.fl_oc_new_zealand_nz), context.getString(R.string.ca_oc_new_zealand_nz), R.drawable.capitalsicon, context.getString(R.string.capital_question)));

                capitalsOceania.add(new Quiz(context.getString(R.string.fl_oc_niue_nu), context.getString(R.string.ca_oc_niue_nu), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsOceania.add(new Quiz(context.getString(R.string.fl_oc_palau_pw), context.getString(R.string.ca_oc_palau_pw), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsOceania.add(new Quiz(context.getString(R.string.fl_oc_papua_new_guinea_pg), context.getString(R.string.ca_oc_papua_new_guinea_pg), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsOceania.add(new Quiz(context.getString(R.string.fl_oc_samoa_ws), context.getString(R.string.ca_oc_samoa_ws), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsOceania.add(new Quiz(context.getString(R.string.fl_oc_the_solomon_islands_sb), context.getString(R.string.ca_oc_the_solomon_islands_sb), R.drawable.capitalsicon, context.getString(R.string.capital_question)));

                capitalsOceania.add(new Quiz(context.getString(R.string.fl_oc_tonga_to), context.getString(R.string.ca_oc_tonga_to), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsOceania.add(new Quiz(context.getString(R.string.fl_oc_tuvalu_tv), context.getString(R.string.ca_oc_tuvalu_tv), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                capitalsOceania.add(new Quiz(context.getString(R.string.fl_oc_vanuatu_vu), context.getString(R.string.ca_oc_vanuatu_vu), R.drawable.capitalsicon, context.getString(R.string.capital_question)));
                setValue(capitalsOceania);
                break;

            //case PIC_TO_WORD:
                //break;

            case WORD_TO_PIC:
            List<Quiz> wordtopic = new ArrayList<>();
                wordtopic.add(new Quiz(context.getString(R.string.wo_astronaut), " ", R.drawable.astronaut, context.getString(R.string.words_question)));
                wordtopic.add(new Quiz(context.getString(R.string.wo_foldingrule), " ", R.drawable.foldingrule, context.getString(R.string.words_question)));
                wordtopic.add(new Quiz(context.getString(R.string.wo_microscope), " ", R.drawable.microscope, context.getString(R.string.words_question)));
                wordtopic.add(new Quiz(context.getString(R.string.wo_secateurs), " ", R.drawable.secateurs, context.getString(R.string.words_question)));
                wordtopic.add(new Quiz(context.getString(R.string.wo_steamlocomotive), " ", R.drawable.steamlocomotive, context.getString(R.string.words_question)));

                wordtopic.add(new Quiz(context.getString(R.string.wo_stethoscope), " ", R.drawable.stethoscope, context.getString(R.string.words_question)));
                wordtopic.add(new Quiz(context.getString(R.string.wo_thimble), " ", R.drawable.thimble, context.getString(R.string.words_question)));
                wordtopic.add(new Quiz(context.getString(R.string.wo_wheelbarrow), " ", R.drawable.wheelbarrow, context.getString(R.string.words_question)));
                wordtopic.add(new Quiz(context.getString(R.string.wo_wrench), " ", R.drawable.wrench, context.getString(R.string.words_question)));
                wordtopic.add(new Quiz(context.getString(R.string.wo_xylophone), " ", R.drawable.xylophone, context.getString(R.string.words_question)));
                setValue(wordtopic);
                break;
        }
    }
}