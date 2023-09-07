package com.example.food1phut.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.food1phut.R;

public class DangNhapActivity extends AppCompatActivity {

    TextView dang_ki_ngay;
    com.google.android.material.textfield.TextInputEditText edt_tai_khoan, edt_mat_khau;
    Button btn_dang_nhap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_danh_nhap);
        loadView();

        dang_ki_ngay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DangNhapActivity.this, DangKiActivity.class);
                startActivity(intent);
            }
        });

        btn_dang_nhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(DangNhapActivity.this, "Chức năng sẽ sớm được hoàn thiên", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void loadView(){
        dang_ki_ngay = findViewById(R.id.dang_ki_ngay);
        edt_tai_khoan = findViewById(R.id.edt_tai_khoan);
        edt_mat_khau = findViewById(R.id.edt_mat_khau);
        btn_dang_nhap = findViewById(R.id.btn_dang_nhap);
    }
}