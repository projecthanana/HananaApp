package org.hanana.hananaapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }

    public void onButtonClick(View v)
    {
        if(v.getId()==R.id.bsignIn)

            EditText a = (EditText)findViewById(R.id.lusername);

        Intent i = new Intent(MainActivity.this, EventsActivity.class);
        i.putExtra(i)
        startActivity(i);

    }
}
