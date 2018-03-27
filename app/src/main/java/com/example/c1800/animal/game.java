package com.example.c1800.animal;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.Random;

public class game extends AppCompatActivity {
    public void fun(){
    int[] ImageArray = new int[]{R.drawable.bear,R.drawable.elephant,R.drawable.giraffe,R.drawable.hypo};
    Random random = new Random();
    int randomImage = 0;
    ImageButton btn = (ImageButton)findViewById(R.id.imageButton);
    randomImage = random.nextInt(4);
    btn.setImageResource(ImageArray[randomImage]);
    if(randomImage==0){
        Toast.makeText(game.this, "这是一只小熊", Toast.LENGTH_SHORT).show();
    }else if(randomImage==1){
        Toast.makeText(game.this, "这是一只大象", Toast.LENGTH_SHORT).show();
    }else if(randomImage==2){
        Toast.makeText(game.this, "这是一只长颈鹿", Toast.LENGTH_SHORT).show();
    }else if(randomImage==3){
        Toast.makeText(game.this, "这是一只河马", Toast.LENGTH_SHORT).show();
    }
}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        ImageButton btn = (ImageButton) findViewById(R.id.imageButton);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fun();
            }
        });



    }
}
