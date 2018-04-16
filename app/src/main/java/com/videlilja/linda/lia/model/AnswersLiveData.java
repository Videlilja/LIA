package com.videlilja.linda.lia.model;

import android.arch.lifecycle.LiveData;

import com.videlilja.linda.lia.R;

import java.util.List;

public class AnswersLiveData extends LiveData<List<Answer>> {

    public AnswersLiveData(Categories category) {

        switch (category) {
            case ADDITION:
                break;
            case SUBTRACTION:
                break;
            case MULTIPLICATION:
                break;
            case DIVISION:
                break;
            case GEOMETRY:
                break;
            case BIRDS:
                break;
            case MAMMALS:
                break;
            case FLOWERS:
                break;
            case HERBS:
                break;
            case AFRICA:
                int[] flagsAfrica = new int[]{
                R.drawable.dz, R.drawable.ao, R.drawable.bj, R.drawable.bw, R.drawable.bf, R.drawable.bi, R.drawable.cm, R.drawable.cv, R.drawable.cf,
                R.drawable.td, R.drawable.km, R.drawable.ci, R.drawable.cd, R.drawable.dj, R.drawable.eg, R.drawable.gq, R.drawable.er, R.drawable.et,
                R.drawable.ga, R.drawable.gm, R.drawable.gh, R.drawable.gn, R.drawable.gw, R.drawable.ke, R.drawable.ls, R.drawable.lr, R.drawable.ly,
                R.drawable.mg, R.drawable.mw, R.drawable.ml, R.drawable.mr, R.drawable.mu, R.drawable.ma, R.drawable.mz, R.drawable.na, R.drawable.ne,
                R.drawable.ng, R.drawable.cg, R.drawable.rw, R.drawable.st, R.drawable.sn, R.drawable.sc, R.drawable.sl, R.drawable.so, R.drawable.za,
                R.drawable.sd, R.drawable.sd, R.drawable.sz, R.drawable.tz, R.drawable.tg, R.drawable.tn, R.drawable.ug, R.drawable.eh, R.drawable.zm,
                R.drawable.zw};



                break;
            case ASIA:
                int[] flagsAsia = new int[]{
                    R.drawable.af, R.drawable.am, R.drawable.az, R.drawable.bh, R.drawable.bd, R.drawable.bt, R.drawable.bn, R.drawable.kh, R.drawable.cy,
                    R.drawable.tl, R.drawable.eg, R.drawable.ge, R.drawable.in, R.drawable.id, R.drawable.ir, R.drawable.iq, R.drawable.il, R.drawable.jp,
                    R.drawable.jo, R.drawable.kz, R.drawable.kw, R.drawable.kg, R.drawable.la, R.drawable.lb, R.drawable.my, R.drawable.mv, R.drawable.mn,
                    R.drawable.mm, R.drawable.np, R.drawable.kp, R.drawable.om, R.drawable.pk, R.drawable.cn, R.drawable.ph, R.drawable.qa, R.drawable.tw,
                    R.drawable.ru, R.drawable.sa, R.drawable.sg, R.drawable.kr, R.drawable.lk, R.drawable.sy, R.drawable.tj, R.drawable.th, R.drawable.tr,
                    R.drawable.tm, R.drawable.ae, R.drawable.uz, R.drawable.vn, R.drawable.ye};
                break;
            case EUROPE:
                int[] flagsEurope = new int[]{
                    R.drawable.al, R.drawable.ad, R.drawable.at, R.drawable.by, R.drawable.be, R.drawable.ba, R.drawable.bg, R.drawable.hr, R.drawable.cz,
                    R.drawable.dk, R.drawable.ee, R.drawable.fi, R.drawable.fr, R.drawable.de, R.drawable.gr, R.drawable.hu, R.drawable.is, R.drawable.ie,
                    R.drawable.it, R.drawable.al, R.drawable.lv, R.drawable.li, R.drawable.lt, R.drawable.lu, R.drawable.mk, R.drawable.mt, R.drawable.md,
                    R.drawable.mc, R.drawable.me, R.drawable.nl, R.drawable.no, R.drawable.pl, R.drawable.pt, R.drawable.ro, R.drawable.ru, R.drawable.sm,
                    R.drawable.rs, R.drawable.sk, R.drawable.si, R.drawable.es, R.drawable.se, R.drawable.ch, R.drawable.tr, R.drawable.ua, R.drawable.gb,
                    R.drawable.va};
                break;
            case OCEANIA:
                break;
            case NORTH_AMERICA:
                break;
            case SOUTH_AMERICA:
                break;
            case PIC_TO_WORD:
                break;
            case WORD_TO_PIC:
                break;
            case SPELLING:
                break;
        }
    }
}