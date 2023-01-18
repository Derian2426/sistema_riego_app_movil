package com.example.sistema_riego.Login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.sistema_riego.R;

public class RegistroUsuario extends AppCompatActivity {
    private EditText etName;
    private EditText etLastName;
    private EditText etEmail;
    private EditText etBirthday;
    private EditText etPassword;
    private Button btnRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_usuario);
        etName = findViewById(R.id.et_name);
        etLastName = findViewById(R.id.et_last_name);
        etEmail = findViewById(R.id.et_email);
        etBirthday = findViewById(R.id.et_birthday);
        etPassword = findViewById(R.id.et_password);
        btnRegister = findViewById(R.id.btn_register);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onRegisterClicked();
            }
        });
    }
    private void onRegisterClicked() {
        String name = etName.getText().toString();
        String lastName = etLastName.getText().toString();
        String email = etEmail.getText().toString();
        String birthday = etBirthday.getText().toString();
        String password = etPassword.getText().toString();

        // escribir la lógica para validar los datos ingresados
        // y crear un nuevo objeto de Usuario con ellos.
    }
}