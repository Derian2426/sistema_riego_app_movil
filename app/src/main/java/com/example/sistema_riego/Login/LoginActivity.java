package com.example.sistema_riego.Login;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sistema_riego.R;

public class LoginActivity extends AppCompatActivity {
    private EditText etUsername;
    private EditText etPassword;
    private Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUsername = findViewById(R.id.et_username);
        etPassword = findViewById(R.id.et_password);
        btnLogin = findViewById(R.id.btn_login);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onLoginClicked();
            }
        });
    }
    public void onLoginClicked() {
        String username = etUsername.getText().toString();
        String password = etPassword.getText().toString();

        // Aquí debes escribir la lógica para verificar las credenciales del usuario
        // y, si son válidas, iniciar la sesión y navegar a la actividad principal
        // de la aplicación.
    }

}
