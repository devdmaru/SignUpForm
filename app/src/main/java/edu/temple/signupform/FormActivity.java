package edu.temple.signupform;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        Button button;

        button = (Button) findViewById(R.id.SaveButton);

        View.OnClickListener ocl = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText name = (EditText) findViewById(R.id.name);
                EditText e_mail = (EditText)findViewById(R.id.e_Mail);
                EditText password = (EditText)findViewById(R.id.password);
                EditText conf_pass = (EditText)findViewById(R.id.confirm_password);

                    if("".equals(name.getText().toString())|| "".equals(e_mail.getText().toString())||"".equals(name.getText().toString())||"".equals(password.getText().toString())||"".equals(conf_pass.getText().toString())){
                        String toast = "Please enter all the fields";
                        Toast.makeText(FormActivity.this,toast,Toast.LENGTH_SHORT).show();
                    }
                    else{
                        if(password.getText().toString().equals(conf_pass.getText().toString())){
                            Toast.makeText(FormActivity.this,"Your changes are being saved",Toast.LENGTH_SHORT).show();
                        }
                        else{
                            Toast.makeText(FormActivity.this,"Passwords do not match",Toast.LENGTH_SHORT).show();
                        }
                    }

            }
        };
            button.setOnClickListener(ocl);
    }
}
