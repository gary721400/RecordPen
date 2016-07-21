package com.afaya.recordpen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class Choice_Ble extends AppCompatActivity {

    private Button bt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_choice__ble);

//        LinearLayout l1 = (LinearLayout) findViewById(R.layout.choice_title);
        bt1 = (Button) findViewById(R.id.bletitle).findViewById(R.id.title_button02);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Choice_Ble.this,ListPageActivity.class);
                startActivity(intent);
            }
        });




    }
}
