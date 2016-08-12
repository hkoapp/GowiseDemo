package org.hko.gowise.gowisedemo.main;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import org.hko.gowise.gowisedemo.R;
import org.hko.gowise.gowisedemo.webview.GowiseWebview;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gowiseWebviewClick(View view) {
        Intent intent = new Intent(this, GowiseWebview.class);
        startActivity(intent);
    }
}

