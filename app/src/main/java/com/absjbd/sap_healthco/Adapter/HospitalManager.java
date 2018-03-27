package com.absjbd.sap_healthco.Adapter;


import com.absjbd.sap_healthco.Model.HospitaModel;

import java.util.ArrayList;

/**
 * Created by basha on 3/14/2018.
 */

public class HospitalManager {

        HospitaModel aHospital = new HospitaModel("চট্টগ্রাম মেডিকেল কলেজ"," ৫৭, কে.বি. ফজলুল কাদের রোড, পাঁচলাইশ থানা","ফোন: ০৩১-৬১৯৫৯৭");
        HospitaModel bHospital = new HospitaModel("চট্টগ্রাম জেনারেল হাসপাতাল","আন্দরকিল্লা রোড, চট্টগ্রাম","ফোন: ০৩১-২২৪৬৩৪");
        HospitaModel cHospital = new HospitaModel("মেমন মাতৃসদন হাসপাতাল","সদরঘাট রোড, চট্টগ্রাম","ফোন:  ০৩১-৬১৭১৬৯");
        HospitaModel dHospital = new HospitaModel("জেমসন রেড ক্রিসেন্ট মাতৃসদন হাসপাতাল","কাটা পাহাড় লাইন, আন্দরকিল্লা, চট্টগ্রাম","ফোন: ০৩১-৬৩৯৫৪০");
        HospitaModel eHospital = new HospitaModel("লায়ন্স জেনারেল হাসপাতাল","জাকির হোসেন রোড, নাসিরাবাদ,চট্টগ্রাম","ফোন: ০৩১-৬২২৪৪৩");
        HospitaModel fHospital = new HospitaModel("হালিশহর জেনারেল হাসপাতাল","আগ্রাবাদ এক্সেস রোড, চট্টগ্রাম ","ফোন: ০৩১-৭১৫১৬৬");
        HospitaModel gHospital = new HospitaModel("চট্টগ্রাম মেট্রোপলিটন হাসপাতাল লিমিটেড","ও. আর. নিজাম রোড, চট্টগ্রাম ","ফোন: ০৩১-৬৫১২৪২");
        HospitaModel hHospital = new HospitaModel("রয়েল হসপিটাল (প্রাঃ) লিমিটেড","ও. আর. নিজাম রোড, চট্টগ্রাম ","ফোন: ০৩১-৬৫৮৮৪২");
        HospitaModel iHospital = new HospitaModel("আল আমিন হাসপাতালে (প্রা।) লিমিটেড","জাকির হোসেন রোড, চট্টগ্রাম ","ফোন: 01819-৬৩৭২২৯");
        HospitaModel jHospital = new HospitaModel("একুশে হাসপাতাল প্রাঃ লিমিটেড","সুগন্ধা রোড নং ২, চট্টগ্রাম ","ফোন: ০৩১-৬৫৭৬২৯");
        HospitaModel kHospital = new HospitaModel("ন্যাশনাল হাসপাতাল প্রাঃ লিমিটেড","মেহেদীবাগ রোড, চট্টগ্রাম ","ফোন: ০৩১-৬২৩৭১৩");
        HospitaModel lHospital = new HospitaModel("ম্যাক্স হাসপাতাল ও ডায়াগনস্টিক সেন্টার লিমিটেড","মরহুম আলহাজ জহুর আহম্মেদ চৌধুরী সড়ক, চট্টগ্রাম ","ফোন: ০৩১-৬২২৫১৯");


    public ArrayList<HospitaModel> getAllHospitals() {
        ArrayList<HospitaModel> hospitals = new ArrayList<HospitaModel>();

        hospitals.add(aHospital);
        hospitals.add(bHospital);
        hospitals.add(cHospital);
        hospitals.add(dHospital);
        hospitals.add(eHospital);
        hospitals.add(fHospital);
        hospitals.add(gHospital);
        hospitals.add(hHospital);
        hospitals.add(iHospital);
        hospitals.add(jHospital);
        hospitals.add(kHospital);
        hospitals.add(lHospital);
        return hospitals;
    }
}

