package io.github.brassev.plant_id;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openSettings(View view) {
        Intent open_settings = new Intent(this, settings.class);
        startActivity(open_settings);
    }
}
