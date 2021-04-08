package com.databoat.barcodescanner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.databoat.barcodescanner.data.User;
import com.databoat.barcodescanner.data.UserViewModel;

public class LoginActivity extends AppCompatActivity {
    private UserViewModel userViewModel;
    EditText username;
    EditText password;

    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
       // userViewModel=new ViewModelProvider(this).get(UserViewModel.class);
//
//        setupListeners();
//        UserViewModel umodel;
//        setupUI();
        User user1 = new User("sahar", "12345");
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);

        login = findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent send = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(send);
            }
        });
    }
}

//    private void setupUI() {


   // }

//    boolean isEmail(EditText text) {
//        CharSequence email = text.getText().toString();
//        return (!TextUtils.isEmpty(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches());
//    }
//
//    boolean isEmpty(EditText text) {
//        CharSequence str = text.getText().toString();
//        return TextUtils.isEmpty(str);
//    }
//    private void setupListeners() {
//        login.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                checkUsername();
//            }
//        });
//
//
//    }
//    void checkUsername() {
//        boolean isValid = true;
//        if (isEmpty(username)) {
//            username.setError("You must enter username to login!");
//            isValid = false;
//        } else {
//            if (!isEmail(username)) {
//                username.setError("Enter valid email!");
//                isValid = false;
//            }
//        }
//
//        if (isEmpty(password)) {
//            password.setError("You must enter password to login!");
//            isValid = false;
//        } else {
//            if (password.getText().toString().length() < 4) {
//                password.setError("Password must be at least 4 chars long!");
//                isValid = false;
//            }
//        }
//
//        //check email and password
//        //IMPORTANT: here should be call to backend or safer function for local check; For example simple check is cool
//        //For example simple check is cool
//        if (isValid) {
//            String usernameValue = username.getText().toString();
//            String passwordValue = password.getText().toString();
//            if (usernameValue.equals("test@test.com") && passwordValue.equals("password1234")) {
//                //everything checked we open new activity
//                Intent i = new Intent(LoginActivity.this, MainActivity.class);
//                startActivity(i);
//                //we close this activity
//                this.finish();
//            } else {
//                Toast t = Toast.makeText(this, "Wrong email or password!", Toast.LENGTH_SHORT);
//                t.show();
//            }
//        }
//    }
