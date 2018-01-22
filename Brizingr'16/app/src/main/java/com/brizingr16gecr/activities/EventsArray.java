package com.brizingr16gecr.activities;

import android.content.Context;

import com.brizingr16gecr.bean.Detail;
import com.brizingr16gecr.R;

import java.util.ArrayList;

/**
 * Created by Naimish Rajput on 20-02-2016.
 */

public class EventsArray {

    static ArrayList<Detail> comp_array;
    static ArrayList<Detail> mech_array;
    static ArrayList<Detail> civil_array;
    static ArrayList<Detail> auto_array;
    static ArrayList<Detail> ic_array;
    static ArrayList<Detail> ec_array;
    static ArrayList<Detail> non_tech_array;

    static public void setArrays(Context context) {
        comp_array = new ArrayList<Detail>();
        mech_array = new ArrayList<Detail>();
        civil_array = new ArrayList<Detail>();
        auto_array = new ArrayList<Detail>();
        ic_array = new ArrayList<Detail>();
        ec_array = new ArrayList<Detail>();
        non_tech_array = new ArrayList<Detail>();


        addArray(comp_array, R.array.debuggers, context);
        addArray(comp_array, R.array.photoshop_mania, context);
        addArray(comp_array, R.array.cquiz, context);
        addArray(comp_array, R.array.code_ninja, context);

        addArray(mech_array, R.array.robowar, context);
        addArray(mech_array, R.array.JUNKYARD_SALVATION, context);
        addArray(mech_array, R.array.ROBO_RUPTUR, context);

        addArray(ic_array, R.array.WIRELESS_ROBORACE, context);
        addArray(ic_array, R.array.ROBO_SOCCER, context);
        addArray(ic_array, R.array.INSTANT_CIRCUIT_MAKING, context);
        addArray(ic_array, R.array.EMBEDED_CODING_EVENT, context);

        addArray(civil_array, R.array.MODEL_O_MAKER, context);
        addArray(civil_array, R.array.KNOWLEDGE_KNAGARIYA, context);
        addArray(civil_array, R.array.MAKE_D_CITY, context);
        addArray(civil_array, R.array.BOB_D_BUILDER, context);

        addArray(auto_array, R.array.DEATH_RACE, context);
        addArray(auto_array, R.array.F1_RACE, context);
        addArray(auto_array, R.array.DESIGN_MAESTRO, context);

        addArray(ec_array, R.array.marine_drive, context);
        addArray(ec_array, R.array.dirt_race, context);
        addArray(ec_array, R.array.catch_me_if_u_can, context);


        addArray(non_tech_array, R.array.ser_piratas, context);
        addArray(non_tech_array, R.array.lan_gaming, context);
        addArray(non_tech_array, R.array.live_cs, context);
        addArray(non_tech_array, R.array.hogwarts_mayanagri, context);
        addArray(non_tech_array, R.array.BRIZZRUN, context);
        addArray(non_tech_array, R.array.VOLLEY_BALL, context);
        addArray(non_tech_array, R.array.BZ_CLICKS_ADD_MAKING, context);
        addArray(non_tech_array, R.array.FB_HITS, context);
        addArray(non_tech_array, R.array.BREVITY_BUZZ, context);
        addArray(non_tech_array, R.array.special, context);
        addArray(non_tech_array, R.array.BEST_OUT_OF_WASTE, context);
       /* addArray(non_tech_array,R.array.BRIZINGR_STOCK_EXCHANGE,context);*/
        addArray(non_tech_array, R.array.GULLY_CRICKET, context);
        addArray(non_tech_array, R.array.MAKE_MONEY, context);
        addArray(non_tech_array, R.array.BZ_TALENT_HUNT, context);
        addArray(non_tech_array, R.array.on_the_spot_painting, context);
        addArray(non_tech_array, R.array.rj_hunt, context);

    }

    private static void addArray(ArrayList<Detail> arrayList, int id, Context context) {
        String[] array = context.getResources().getStringArray(id);
        arrayList.add(new Detail(array[0], array[1], array[2], array[3], array[4], array[5], array[6], array[7], array[8]));
    }

}
