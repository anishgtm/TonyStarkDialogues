package tonystark.xcalliber.tonystarkdialogues;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.FragmentManager;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;


public class Fragment38 extends Fragment {

    Button button1;
    Button button2;
    View view;
    MediaPlayer mediaPlayer;
    AdView madView;


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view= inflater.inflate(R.layout.fragment_fragment38, container, false);
        button1=view.findViewById(R.id.b1);
        button2=view.findViewById(R.id.b2);
        mediaPlayer=MediaPlayer.create(getActivity(),R.raw.iamironman);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.stop();
                android.support.v4.app.Fragment fragment;
                fragment=new BlankFragment();
                FragmentManager fm=getActivity().getSupportFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                ft.replace(R.id.fx,fragment);
                ft.commit();
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mediaPlayer.isPlaying())
                {
                    mediaPlayer.pause();
                    button1.setBackgroundResource(R.drawable.ic_play_circle_outline_black_24dp);
                }
                else
                {
                    mediaPlayer.start();
                    button1.setBackgroundResource(R.drawable.ic_pause_circle_outline_black_24dp);
                }

            }
        });
        madView=(AdView)view.findViewById(R.id.adView);
        AdRequest adRequest=new AdRequest.Builder().build();
        madView.loadAd(adRequest);
        return view;
    }


}
