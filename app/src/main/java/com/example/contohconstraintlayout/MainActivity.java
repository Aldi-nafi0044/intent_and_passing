package com.example.contohconstraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {

    Button edsignin;
    EditText edemail, edpassword;
    String nama,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edsignin=findViewById(R.id.edit_signin);
        edemail=findViewById(R.id.ed_e_mail);
        edpassword=findViewById(R.id.edit_password);


        edsignin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                nama = edemail.getText().toString();
                password = edpassword.getText().toString();
                String email = "admin@mail.com";
                String pass = "123";
                Toast login_sukses = Toast.makeText(getApplicationContext(),"Suksesssssssssssssss",Toast.LENGTH_LONG);
                Toast pass_salah = Toast.makeText(getApplicationContext(),"Password Salah",Toast.LENGTH_LONG);
                Toast emai_salah = Toast.makeText(getApplicationContext(),"Email salah",Toast.LENGTH_LONG);
                Toast salah_semua = Toast.makeText(getApplicationContext(),"Email dan Password salah",Toast.LENGTH_LONG);

                if(nama.equals("admin@mail.com") && password.equals("123")){
                    login_sukses.show();
                    if(nama.equals(email) && password.equals(pass)){

                        Toast t = Toast.makeText(getApplicationContext(),"login Sukses", Toast.LENGTH_LONG);

                        t.show();

                        Bundle b = new Bundle();

                        b.putString("a",nama.trim());
                        b.putString("b",password.trim());

                        Intent i = new Intent(getApplicationContext(),Activitykedua.class);

                        i.putExtras(b);
                        startActivity(i);
                    }else{
                        Toast t = Toast.makeText(getApplicationContext(),
                        "login gagal",Toast.LENGTH_LONG);
                    }

                }
                else if(nama.equals("admin@mail.com") && !password.equals("123")){
                    pass_salah.show();
                }
                else if(!nama.equals("admin@mail.com") && password.equals("123")){
                    emai_salah.show();
                }
                else{
                    salah_semua.show();
                }
            }
        });

    }
}