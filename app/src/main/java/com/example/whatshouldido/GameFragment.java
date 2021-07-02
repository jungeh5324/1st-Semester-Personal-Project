package com.example.whatshouldido;

import android.content.Context;
import android.media.Image;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;


public class GameFragment extends Fragment {
    MainActivity activity;
    Context context;
    Random random = new Random();
    @Override
    public void onAttach(Context context){
        super.onAttach(context);
        activity = (MainActivity) getActivity();
    }

    @Override
    public void onDetach(){
        super.onDetach();
        activity = null;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View v = inflater.inflate(R.layout.fragment_game,container,false);
        Button change = (Button)v.findViewById(R.id.gameChangeButton);
        ImageView gameV = (ImageView)v.findViewById(R.id.gameView);
        TextView gameT = (TextView)v.findViewById(R.id.gameText);
        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gameT.setVisibility(View.VISIBLE);
                int count = random.nextInt(6)+1;
                switch (count){
                    case 1:
                        gameV.setImageResource(R.drawable.lol);
                        gameT.setText("리그 오브 레전드");
                        break;
                    case 2:
                        gameV.setImageResource(R.drawable.over);
                        gameT.setText("오버워치");
                        break;
                    case 3:
                        gameV.setImageResource(R.drawable.batg);
                        gameT.setText("배틀그라운드");
                        break;
                    case 4:
                        gameV.setImageResource(R.drawable.min);
                        gameT.setText("마인크래프트");
                        break;
                    case 5:
                        gameV.setImageResource(R.drawable.val);
                        gameT.setText("발로란트");
                        break;
                    case 6:
                        gameV.setImageResource(R.drawable.gta);
                        gameT.setText("GTA5");
                        break;
                }
            }
        });
        return v;
    }
}