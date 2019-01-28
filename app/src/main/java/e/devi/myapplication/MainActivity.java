package e.devi.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText name, ph, mail;
    private Button reg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.et1);
        ph = findViewById(R.id.et2);
        mail = findViewById(R.id.et3);
        reg = findViewById(R.id.btn);

        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sName, phone, email;
                sName = name.getText().toString();
                phone = ph.getText().toString();
                email = mail.getText().toString();

                if (sName.equals("") || phone.equals("") || email.equals("")) {
                    Toast.makeText(MainActivity.this, "Please fill all fields!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Your details submitted!", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
