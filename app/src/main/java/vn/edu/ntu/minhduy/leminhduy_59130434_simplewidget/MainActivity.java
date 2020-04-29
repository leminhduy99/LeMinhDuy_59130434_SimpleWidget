package vn.edu.ntu.minhduy.leminhduy_59130434_simplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText editten, editngaysinh, editst;
RadioGroup rdgioitinh;
RadioButton rdnam, rdnu;
Button xacnhan;
CheckBox check1, check2, check3, check4, check5;
String hienthi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addViews();
        addEvents();
    }
    private void addViews()
    {
        editten = findViewById(R.id.editten);
        editngaysinh = findViewById(R.id.editngaysinh);
        editst = findViewById(R.id.editst);
        rdgioitinh = findViewById(R.id.rdgioitinh);
        rdnam = findViewById(R.id.rdnam);
        rdnu = findViewById(R.id.rdnu);
        xacnhan = findViewById(R.id.xacnhan);
        check1 = findViewById(R.id.check1);
        check2 = findViewById(R.id.check2);
        check3 = findViewById(R.id.check3);
        check4 = findViewById(R.id.check4);
        check5 = findViewById(R.id.check5);

    }
    private void addEvents()
    {
        xacnhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XD();
            }
        });

    }
    private void XD()
    {
        hienthi = editten.getText().toString() + "\n" +
                "Ngày sinh: " + editngaysinh.getText() + "\n" +
                "Giới tính: ";
        if (rdgioitinh.getCheckedRadioButtonId() ==R.id.rdnam)
            hienthi +="Nam" + "\n" + "Sở thích: ";
        else
            hienthi +="Nữ" + "\n" + "Sở thích: ";

        if (check1.isChecked())
            hienthi += "Xem phim, ";
        if (check2.isChecked())
            hienthi += "Nghe nhạc, ";
        if (check3.isChecked())
            hienthi += "Đi cafe với bạn bè, ";
        if (check4.isChecked())
            hienthi += "Ở nhà một mình, ";
        if (check5.isChecked())
            hienthi += "Vào bếp nấu ăn, ";
        hienthi += editst.getText().toString();
        Toast.makeText(getApplicationContext(), hienthi, Toast.LENGTH_SHORT).show();


    }
}
