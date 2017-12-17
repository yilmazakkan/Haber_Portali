package com.yilmazakkan.haber_portali;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.add_news,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId() == R.id.add_sport){

            startActivity(new Intent(MainActivity.this,SaveActivity.class));
        }

        if (item.getItemId() == R.id.add_economy){
            startActivity(new Intent(MainActivity.this,SaveActivity.class));
        }

        return super.onOptionsItemSelected(item);
    }
}

