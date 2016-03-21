package br.com.jeanpimentel.saveme;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText logView;
    Button open;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logView = (EditText) findViewById(R.id.log);
        open = (Button) findViewById(R.id.open);
        open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.this.launchActivity();
            }
        });
    }

    private void launchActivity() {
        try {
            Intent intent = new Intent();
            intent.setClassName("com.google.android.setupwizard", "com.google.android.setupwizard.SetupWizardTestActivity");
            startActivity(intent);
        } catch (Exception e) {
            logView.setText(e.getMessage());
        }
    }

}
