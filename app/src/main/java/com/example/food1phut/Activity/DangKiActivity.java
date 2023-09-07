package com.example.food1phut.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.food1phut.R;
import com.google.android.material.button.MaterialButtonToggleGroup;

public class DangKiActivity extends AppCompatActivity {

    com.google.android.material.textfield.TextInputEditText edt_tai_khoan, edt_mat_khau,
    edt_ten_nhan_vien, edt_ngay_sinh, edt_dia_chi, edt_cccd;
    RadioButton click_nam, click_nu;
    Button btn_dang_ki;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_ki);
        Loadview();
    }


    private void Loadview(){
        edt_tai_khoan = findViewById(R.id.edt_tai_khoan);
        edt_mat_khau = findViewById(R.id.edt_mat_khau);
        edt_ten_nhan_vien = findViewById(R.id.edt_ten_nhan_vien);
        edt_ngay_sinh = findViewById(R.id.edt_ngay_sinh);
        edt_dia_chi = findViewById(R.id.edt_dia_chi);
        edt_cccd = findViewById(R.id.edt_cccd);

        btn_dang_ki = findViewById(R.id.btn_dang_ki);

        click_nam = findViewById(R.id.click_nam);
        click_nu = findViewById(R.id.click_nu);

    }
}