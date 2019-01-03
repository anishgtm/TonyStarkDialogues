package tonystark.xcalliber.tonystarkdialogues;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;


public class BlankFragment extends Fragment {

   View view;
   ListView listView;
   String dialogues[] = {"Da Vinci of out time", "Rehearse that much", "Fear or respected?","Day 11, Test 37, Conf 2.0","Yeah, I can fly.","Run before walk","Best Weapon","An hour of sleep","My turn!","Out of their caves","Maxim cover models","Peace?","Superhero allegation","You need a new name","Bathroom in that suit","You're a senator. Come on!","The suit and I are one","Iron patriot","I'll leave the door unlocked","Enormous green rage monster","Bringing the party","Playing galaga","We have a hulk","Finally english","Shakespeare in The Park","Spangly outfit","His secrets have secrets","Genius, billionaire, playboy...","Alright, good job guys","Gray area where you operate","Shocking and fantastic abilities","He's the boss","Professional courtesy","You just died pal","Earth is closed today","Embarassing infront of wizards","ENDGAME","I am Iron Man!","We're monsters buddy","He killed my mom","Throw another moon","You giving out tickets?","Together","We take the fight to him","Without this suit"};
   private InterstitialAd interstitialAd;
   AdView madView;
   AdView madView2;
   Fragment fragment;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //Inflate the layout for this fragment


        view=inflater.inflate(R.layout.fragment_blank, container, false);
        listView=view.findViewById(R.id.l1);
        CustomAdapter customAdapter=new CustomAdapter();
        listView.setAdapter(customAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0)
                {

                        Fragment fragment;
                        fragment = new Fragment1();
                        FragmentManager fm = getActivity().getSupportFragmentManager();
                        FragmentTransaction ft = fm.beginTransaction();
                        ft.replace(R.id.fx, fragment);
                        ft.commit();

                }

                else if(position==1)
                {
                    fragment= new Fragment2();
                    if (interstitialAd.isLoaded())
                    {
                        interstitialAd.show();
                    }
                    else {
                        FragmentManager fm = getActivity().getSupportFragmentManager();
                        FragmentTransaction ft = fm.beginTransaction();
                        ft.replace(R.id.fx, fragment);
                        ft.commit();
                    }
                }
                else if(position==2)
                {
                    Fragment fragment;
                    fragment=new Fragment3();
                    FragmentManager fm=getActivity().getSupportFragmentManager();
                    FragmentTransaction ft=fm.beginTransaction();
                    ft.replace(R.id.fx,fragment);
                    ft.commit();
                }

                else if(position==3)
                {
                    Fragment fragment;
                    fragment=new Fragment4();
                    FragmentManager fm=getActivity().getSupportFragmentManager();
                    FragmentTransaction ft=fm.beginTransaction();
                    ft.replace(R.id.fx,fragment);
                    ft.commit();
                }
                else if(position==4)
                {
                    fragment= new Fragment5();
                    if (interstitialAd.isLoaded())
                    {
                        interstitialAd.show();
                    }
                    else {
                        FragmentManager fm = getActivity().getSupportFragmentManager();
                        FragmentTransaction ft = fm.beginTransaction();
                        ft.replace(R.id.fx, fragment);
                        ft.commit();
                    }
                }
                else if(position==5)
                {
                    Fragment fragment;
                    fragment=new Fragment6();
                    FragmentManager fm=getActivity().getSupportFragmentManager();
                    FragmentTransaction ft=fm.beginTransaction();
                    ft.replace(R.id.fx,fragment);
                    ft.commit();
                }

                else if(position==6)
                {
                    fragment= new Fragment7();
                    if (interstitialAd.isLoaded())
                    {
                        interstitialAd.show();
                    }
                    else {
                        FragmentManager fm = getActivity().getSupportFragmentManager();
                        FragmentTransaction ft = fm.beginTransaction();
                        ft.replace(R.id.fx, fragment);
                        ft.commit();
                    }
                }

                else if(position==7)
                {
                    Fragment fragment;
                    fragment=new Fragment8();
                    FragmentManager fm=getActivity().getSupportFragmentManager();
                    FragmentTransaction ft=fm.beginTransaction();
                    ft.replace(R.id.fx,fragment);
                    ft.commit();
                }

                else if(position==8)
                {
                    fragment= new Fragment9();
                    if (interstitialAd.isLoaded())
                    {
                        interstitialAd.show();
                    }
                    else {
                        FragmentManager fm = getActivity().getSupportFragmentManager();
                        FragmentTransaction ft = fm.beginTransaction();
                        ft.replace(R.id.fx, fragment);
                        ft.commit();
                    }
                }
                else if(position==9)
                {
                    Fragment fragment;
                    fragment=new Fragment10();
                    FragmentManager fm=getActivity().getSupportFragmentManager();
                    FragmentTransaction ft=fm.beginTransaction();
                    ft.replace(R.id.fx,fragment);
                    ft.commit();
                }
                else if(position==10)
                {
                    fragment= new Fragment11();
                    if (interstitialAd.isLoaded())
                    {
                        interstitialAd.show();
                    }
                    else {
                        FragmentManager fm = getActivity().getSupportFragmentManager();
                        FragmentTransaction ft = fm.beginTransaction();
                        ft.replace(R.id.fx, fragment);
                        ft.commit();
                    }
                }
                else if(position==11)
                {
                    Fragment fragment;
                    fragment=new Fragment12();
                    FragmentManager fm=getActivity().getSupportFragmentManager();
                    FragmentTransaction ft=fm.beginTransaction();
                    ft.replace(R.id.fx,fragment);
                    ft.commit();
                }
                else if(position==12)
                {
                    Fragment fragment;
                    fragment=new Fragment13();
                    FragmentManager fm=getActivity().getSupportFragmentManager();
                    FragmentTransaction ft=fm.beginTransaction();
                    ft.replace(R.id.fx,fragment);
                    ft.commit();
                }
                else if(position==13)
                {
                    Fragment fragment;
                    fragment=new Fragment14();
                    FragmentManager fm=getActivity().getSupportFragmentManager();
                    FragmentTransaction ft=fm.beginTransaction();
                    ft.replace(R.id.fx,fragment);
                    ft.commit();
                }
                else if(position==14)
                {
                    fragment= new Fragment15();
                    if (interstitialAd.isLoaded())
                    {
                        interstitialAd.show();
                    }
                    else {
                        FragmentManager fm = getActivity().getSupportFragmentManager();
                        FragmentTransaction ft = fm.beginTransaction();
                        ft.replace(R.id.fx, fragment);
                        ft.commit();
                    }
                }

                else if(position==15)
                {
                    Fragment fragment;
                    fragment=new Fragment16();
                    FragmentManager fm=getActivity().getSupportFragmentManager();
                    FragmentTransaction ft=fm.beginTransaction();
                    ft.replace(R.id.fx,fragment);
                    ft.commit();
                }
                else if(position==16)
                {
                    fragment= new Fragment17();
                    if (interstitialAd.isLoaded())
                    {
                        interstitialAd.show();
                    }
                    else {
                        FragmentManager fm = getActivity().getSupportFragmentManager();
                        FragmentTransaction ft = fm.beginTransaction();
                        ft.replace(R.id.fx, fragment);
                        ft.commit();
                    }
                }
                else if(position==17)
                {
                    Fragment fragment;
                    fragment=new Fragment18();
                    FragmentManager fm=getActivity().getSupportFragmentManager();
                    FragmentTransaction ft=fm.beginTransaction();
                    ft.replace(R.id.fx,fragment);
                    ft.commit();
                }
                else if(position==18)
                {
                    Fragment fragment;
                    fragment=new Fragment19();
                    FragmentManager fm=getActivity().getSupportFragmentManager();
                    FragmentTransaction ft=fm.beginTransaction();
                    ft.replace(R.id.fx,fragment);
                    ft.commit();
                }
                else if(position==19)
                {
                    fragment= new Fragment20();
                    if (interstitialAd.isLoaded())
                    {
                        interstitialAd.show();
                    }
                    else {
                        FragmentManager fm = getActivity().getSupportFragmentManager();
                        FragmentTransaction ft = fm.beginTransaction();
                        ft.replace(R.id.fx, fragment);
                        ft.commit();
                    }
                }
                else if(position==20)
                {
                    Fragment fragment;
                    fragment=new Fragment21();
                    FragmentManager fm=getActivity().getSupportFragmentManager();
                    FragmentTransaction ft=fm.beginTransaction();
                    ft.replace(R.id.fx,fragment);
                    ft.commit();
                }

                else if(position==21)
                {
                    Fragment fragment;
                    fragment=new Fragment22();
                    FragmentManager fm=getActivity().getSupportFragmentManager();
                    FragmentTransaction ft=fm.beginTransaction();
                    ft.replace(R.id.fx,fragment);
                    ft.commit();
                }

                else if(position==22)
                {
                    Fragment fragment;
                    fragment=new Fragment23();
                    FragmentManager fm=getActivity().getSupportFragmentManager();
                    FragmentTransaction ft=fm.beginTransaction();
                    ft.replace(R.id.fx,fragment);
                    ft.commit();
                }

                else if(position==23)
                {
                    Fragment fragment;
                    fragment=new Fragment24();
                    FragmentManager fm=getActivity().getSupportFragmentManager();
                    FragmentTransaction ft=fm.beginTransaction();
                    ft.replace(R.id.fx,fragment);
                    ft.commit();
                }
                else if(position==24)
                {
                    fragment= new Fragment25();
                    if (interstitialAd.isLoaded())
                    {
                        interstitialAd.show();
                    }
                    else {
                        FragmentManager fm = getActivity().getSupportFragmentManager();
                        FragmentTransaction ft = fm.beginTransaction();
                        ft.replace(R.id.fx, fragment);
                        ft.commit();
                    }
                }
                else if(position==25)
                {
                    Fragment fragment;
                    fragment=new Fragment26();
                    FragmentManager fm=getActivity().getSupportFragmentManager();
                    FragmentTransaction ft=fm.beginTransaction();
                    ft.replace(R.id.fx,fragment);
                    ft.commit();
                }

                else if(position==26)
                {
                    Fragment fragment;
                    fragment=new Fragment27();
                    FragmentManager fm=getActivity().getSupportFragmentManager();
                    FragmentTransaction ft=fm.beginTransaction();
                    ft.replace(R.id.fx,fragment);
                    ft.commit();
                }
                else if(position==27)
                {
                    Fragment fragment;
                    fragment=new Fragment28();
                    FragmentManager fm=getActivity().getSupportFragmentManager();
                    FragmentTransaction ft=fm.beginTransaction();
                    ft.replace(R.id.fx,fragment);
                    ft.commit();
                }
                else if(position==28)
                {
                    Fragment fragment;
                    fragment=new Fragment29();
                    FragmentManager fm=getActivity().getSupportFragmentManager();
                    FragmentTransaction ft=fm.beginTransaction();
                    ft.replace(R.id.fx,fragment);
                    ft.commit();
                }
                else if(position==29)
                {
                    fragment= new Fragment30();
                    if (interstitialAd.isLoaded())
                    {
                        interstitialAd.show();
                    }
                    else {
                        FragmentManager fm = getActivity().getSupportFragmentManager();
                        FragmentTransaction ft = fm.beginTransaction();
                        ft.replace(R.id.fx, fragment);
                        ft.commit();
                    }
                }

                else if(position==30)
                {
                    Fragment fragment;
                    fragment=new Fragment31();
                    FragmentManager fm=getActivity().getSupportFragmentManager();
                    FragmentTransaction ft=fm.beginTransaction();
                    ft.replace(R.id.fx,fragment);
                    ft.commit();
                }

                else if(position==31)
                {
                    Fragment fragment;
                    fragment=new Fragment32();
                    FragmentManager fm=getActivity().getSupportFragmentManager();
                    FragmentTransaction ft=fm.beginTransaction();
                    ft.replace(R.id.fx,fragment);
                    ft.commit();
                }
                else if(position==32)
                {
                    fragment= new Fragment33();
                    if (interstitialAd.isLoaded())
                    {
                        interstitialAd.show();
                    }
                    else {
                        FragmentManager fm = getActivity().getSupportFragmentManager();
                        FragmentTransaction ft = fm.beginTransaction();
                        ft.replace(R.id.fx, fragment);
                        ft.commit();
                    }
                }

                else if(position==33)
                {
                    Fragment fragment;
                    fragment=new Fragment34();
                    FragmentManager fm=getActivity().getSupportFragmentManager();
                    FragmentTransaction ft=fm.beginTransaction();
                    ft.replace(R.id.fx,fragment);
                    ft.commit();
                }
                else if(position==34)
                {
                    Fragment fragment;
                    fragment=new Fragment35();
                    FragmentManager fm=getActivity().getSupportFragmentManager();
                    FragmentTransaction ft=fm.beginTransaction();
                    ft.replace(R.id.fx,fragment);
                    ft.commit();
                }
                else if(position==35)
                {
                    fragment= new Fragment36();
                    if (interstitialAd.isLoaded())
                    {
                        interstitialAd.show();
                    }
                    else {
                        FragmentManager fm = getActivity().getSupportFragmentManager();
                        FragmentTransaction ft = fm.beginTransaction();
                        ft.replace(R.id.fx, fragment);
                        ft.commit();
                    }
                }

                else if(position==36)
                {
                    Fragment fragment;
                    fragment=new Fragment37();
                    FragmentManager fm=getActivity().getSupportFragmentManager();
                    FragmentTransaction ft=fm.beginTransaction();
                    ft.replace(R.id.fx,fragment);
                    ft.commit();
                }

                else if(position==37)
                {
                    Fragment fragment;
                    fragment=new Fragment38();
                    FragmentManager fm=getActivity().getSupportFragmentManager();
                    FragmentTransaction ft=fm.beginTransaction();
                    ft.replace(R.id.fx,fragment);
                    ft.commit();
                }

                else if(position==38)
                {
                    Fragment fragment;
                    fragment=new Fragment39();
                    FragmentManager fm=getActivity().getSupportFragmentManager();
                    FragmentTransaction ft=fm.beginTransaction();
                    ft.replace(R.id.fx,fragment);
                    ft.commit();
                }
                else if(position==39)
                {
                    fragment= new Fragment40();
                    if (interstitialAd.isLoaded())
                    {
                        interstitialAd.show();
                    }
                    else {
                        FragmentManager fm = getActivity().getSupportFragmentManager();
                        FragmentTransaction ft = fm.beginTransaction();
                        ft.replace(R.id.fx, fragment);
                        ft.commit();
                    }
                }
                else if(position==40)
                {
                    Fragment fragment;
                    fragment=new Fragment41();
                    FragmentManager fm=getActivity().getSupportFragmentManager();
                    FragmentTransaction ft=fm.beginTransaction();
                    ft.replace(R.id.fx,fragment);
                    ft.commit();
                }
                else if(position==41)
                {
                    Fragment fragment;
                    fragment=new Fragment42();
                    FragmentManager fm=getActivity().getSupportFragmentManager();
                    FragmentTransaction ft=fm.beginTransaction();
                    ft.replace(R.id.fx,fragment);
                    ft.commit();
                }
                else if(position==42)
                {
                    Fragment fragment;
                    fragment=new Fragment43();
                    FragmentManager fm=getActivity().getSupportFragmentManager();
                    FragmentTransaction ft=fm.beginTransaction();
                    ft.replace(R.id.fx,fragment);
                    ft.commit();
                }
                else if(position==43)
                {
                    fragment= new Fragment44();
                    if (interstitialAd.isLoaded())
                    {
                        interstitialAd.show();
                    }
                    else {
                        FragmentManager fm = getActivity().getSupportFragmentManager();
                        FragmentTransaction ft = fm.beginTransaction();
                        ft.replace(R.id.fx, fragment);
                        ft.commit();
                    }
                }
                else if(position==44)
                {
                    Fragment fragment;
                    fragment=new Fragment45();
                    FragmentManager fm=getActivity().getSupportFragmentManager();
                    FragmentTransaction ft=fm.beginTransaction();
                    ft.replace(R.id.fx,fragment);
                    ft.commit();
                }
            }
        });

        MobileAds.initialize(getActivity(),"ca-app-pub-3940256099942544/1033173713");

        interstitialAd=new InterstitialAd(getActivity());
        interstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        interstitialAd.loadAd(new AdRequest.Builder().addTestDevice(AdRequest.DEVICE_ID_EMULATOR).build());

        interstitialAd.setAdListener(new AdListener()
        {
            @Override
            public void onAdClosed() {

                FragmentManager fm = getActivity().getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.fx, fragment);
                ft.commit();
                interstitialAd.loadAd(new AdRequest.Builder().addTestDevice(AdRequest.DEVICE_ID_EMULATOR).build());
            }
        });

        madView2=(AdView)view.findViewById(R.id.adView);
        AdRequest adRequest=new AdRequest.Builder().build();
        madView2.loadAd(adRequest);

        return view;
    }

    class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return dialogues.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView=getLayoutInflater().inflate(R.layout.customlayout,null);
            TextView tv=convertView.findViewById(R.id.layouttext);
            tv.setText(dialogues[position]);
            return convertView;
        }
    }




}
