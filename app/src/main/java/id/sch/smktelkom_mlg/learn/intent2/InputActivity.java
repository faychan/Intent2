package id.sch.smktelkom_mlg.learn.intent2;

import android.content.Intent;
import android.icu.util.Calendar;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class InputActivity extends AppCompatActivity {

    public static final String NAME = "Name";
    public static final String BIRTH_YEAR = "BirthYear";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        findViewById(R.id.buttonFinish).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText etNama = (EditText) findViewById(R.id.editTextNama);
                EditText etThnLhr = (EditText) findViewById(R.id.editTextThnLhr);
                String nama = etNama.getText().toString();
                String thnLhrStr = etThnLhr.getText().toString();

                int thnLhr = thnLhrStr.isEmpty() ? Calendar.getInstance().get(Calendar.YEAR) : Integer.parseInt(thnLhrStr);

                Intent intent = new Intent();
                intent.putExtra(NAME, nama);
                intent.putExtra(BIRTH_YEAR , thnLhr);

                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
}