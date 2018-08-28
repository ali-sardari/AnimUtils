package com.sardari.sample;

import android.animation.Animator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.sardari.anim_utils.AnimUtils;
import com.sardari.anim_utils.Techniques;

public class MainActivity extends AppCompatActivity {
    Button btn_Effect;
    TextView txt_Text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_Effect = findViewById(R.id.btn_Effect);
        txt_Text = findViewById(R.id.txt_Text);


        btn_Effect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AnimUtils.with(Techniques.Shake)
                        .delay(100)
                        .duration(500).onEnd(new AnimUtils.AnimatorCallback() {
                    @Override
                    public void call(Animator animator) {
                        Toast.makeText(MainActivity.this, "Finished!", Toast.LENGTH_LONG).show();
                    }
                }).playOn(txt_Text);
            }
        });
    }
}
