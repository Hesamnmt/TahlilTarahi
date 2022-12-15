package ir.hesam.tlstest.login;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

import ir.hesam.tlstest.R;
import ir.hesam.tlstest.home.HomeActivity;

public class LoginActivity extends AppCompatActivity {
    TextInputEditText userName_et;
    TextInputEditText passWord_et;
    MaterialButton submit_btn;
    TextView version_tv;

    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        userName_et = findViewById(R.id.userName_et);
        passWord_et = findViewById(R.id.passWord_et);
        submit_btn = findViewById(R.id.submitBtn);
        version_tv = findViewById(R.id.version_tv);


        version_tv.setText("version "+ "1.0");

        submit_btn.setOnClickListener(view -> {
            if (userName_et.getText().toString().equals("1234")&& passWord_et.getText().toString().equals("1234")){
                Toast.makeText(this , "Its LOGIN!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this, HomeActivity.class);
                this.startActivity(intent);
            }
            else
                Toast.makeText(this, "Dont Login!", Toast.LENGTH_SHORT).show();
        });


    }
}