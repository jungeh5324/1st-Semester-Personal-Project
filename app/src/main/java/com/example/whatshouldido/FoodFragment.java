package com.example.whatshouldido;

import android.content.Context;
import android.media.Image;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.provider.ContactsContract;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class FoodFragment extends Fragment {
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
        View v = inflater.inflate(R.layout.fragment_food,container,false);
        Button changeButton = (Button)v.findViewById(R.id.foodChangeButton);
        ImageView foodImage = (ImageView)v.findViewById(R.id.foodView);
        TextView foodText = (TextView)v.findViewById(R.id.foodText);
        changeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                foodText.setVisibility(View.VISIBLE);
                int count = random.nextInt(9)+1;
                switch (count){
                    case 1:
                        foodImage.setImageResource(R.drawable.dby);
                        foodText.setText("떡볶이");
                        break;
                    case 2:
                        foodImage.setImageResource(R.drawable.chicken);
                        foodText.setText("치킨");
                        break;
                    case 3:
                        foodImage.setImageResource(R.drawable.sr);
                        foodText.setText("국밥");
                        break;
                    case 4:
                        foodImage.setImageResource(R.drawable.gb);
                        foodText.setText("갈비");
                        break;
                    case 5:
                        foodImage.setImageResource(R.drawable.pz);
                        foodText.setText("피자");
                        break;
                    case 6:
                        foodImage.setImageResource(R.drawable.hamburger);
                        foodText.setText("햄버거");
                        break;
                    case 7:
                        foodImage.setImageResource(R.drawable.dakbal);
                        foodText.setText("닭발");
                        break;
                    case 8:
                        foodImage.setImageResource(R.drawable.ra);
                        foodText.setText("라면");
                        break;
                    case 9:
                        foodImage.setImageResource(R.drawable.toa);
                        foodText.setText("토스트");
                        break;
                }
            }
        });
        return v;
    }
}