package my.moskovets.instructur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class JobProf extends AppCompatActivity {
    private Button button_dng;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jobprof);

        button_dng = (Button) findViewById(R.id.button_dng);
        button_dng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOperatorDNG();
            }
        });
    }
    public void openOperatorDNG() {
        Intent intent = new Intent(this, OperetorDNG.class);
        startActivity(intent);
    }

}