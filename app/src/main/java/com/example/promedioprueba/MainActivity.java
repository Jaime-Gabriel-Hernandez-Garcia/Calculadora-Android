package com.example.promedioprueba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText mat1_par1, mat2_par1, mat3_par1, mat4_par1, mat5_par1, mat6_par1, mat7_par1, mat8_par1, mat9_par1, mat10_par1,
                     mat1_par2, mat2_par2, mat3_par2, mat4_par2, mat5_par2, mat6_par2, mat7_par2, mat8_par2, mat9_par2, mat10_par2,
                     mat1_par3, mat2_par3, mat3_par3, mat4_par3, mat5_par3, mat6_par3, mat7_par3, mat8_par3, mat9_par3, mat10_par3;

    private TextView res1, res2, res3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "OnCreate", Toast.LENGTH_SHORT).show();

        mat1_par1 = (EditText)findViewById(R.id.txt_mat1_par1);
        mat2_par1 = (EditText)findViewById(R.id.txt_mat2_par1);
        mat3_par1 = (EditText)findViewById(R.id.txt_mat3_par1);
        mat4_par1 = (EditText)findViewById(R.id.txt_mat4_par1);
        mat5_par1 = (EditText)findViewById(R.id.txt_mat5_par1);
        mat6_par1 = (EditText)findViewById(R.id.txt_mat6_par1);
        mat7_par1 = (EditText)findViewById(R.id.txt_mat7_par1);
        mat8_par1 = (EditText)findViewById(R.id.txt_mat8_par1);
        mat9_par1 = (EditText)findViewById(R.id.txt_mat9_par1);
        mat10_par1 = (EditText)findViewById(R.id.txt_mat10_par1);
        mat1_par2 = (EditText)findViewById(R.id.txt_mat1_par2);
        mat2_par2 = (EditText)findViewById(R.id.txt_mat2_par2);
        mat3_par2 = (EditText)findViewById(R.id.txt_mat3_par2);
        mat4_par2 = (EditText)findViewById(R.id.txt_mat4_par2);
        mat5_par2 = (EditText)findViewById(R.id.txt_mat5_par2);
        mat6_par2 = (EditText)findViewById(R.id.txt_mat6_par2);
        mat7_par2 = (EditText)findViewById(R.id.txt_mat7_par2);
        mat8_par2 = (EditText)findViewById(R.id.txt_mat8_par2);
        mat9_par2 = (EditText)findViewById(R.id.txt_mat9_par2);
        mat10_par2 = (EditText)findViewById(R.id.txt_mat10_par2);
        mat1_par3 = (EditText)findViewById(R.id.txt_mat1_par3);
        mat2_par3 = (EditText)findViewById(R.id.txt_mat2_par3);
        mat3_par3 = (EditText)findViewById(R.id.txt_mat3_par3);
        mat4_par3 = (EditText)findViewById(R.id.txt_mat4_par3);
        mat5_par3 = (EditText)findViewById(R.id.txt_mat5_par3);
        mat6_par3 = (EditText)findViewById(R.id.txt_mat6_par3);
        mat7_par3 = (EditText)findViewById(R.id.txt_mat7_par3);
        mat8_par3 = (EditText)findViewById(R.id.txt_mat8_par3);
        mat9_par3 = (EditText)findViewById(R.id.txt_mat9_par3);
        mat10_par3 = (EditText)findViewById(R.id.txt_mat10_par3);


        res1 = (TextView) findViewById(R.id.textView14);
        res2 = (TextView) findViewById(R.id.textView15);
        res3 = (TextView) findViewById(R.id.textView16);

    }

    public void promedioParcial1(View view){

        String materia1 = mat1_par1.getText().toString();
        String materia2 = mat2_par1.getText().toString();
        String materia3 = mat3_par1.getText().toString();
        String materia4 = mat4_par1.getText().toString();
        String materia5 = mat5_par1.getText().toString();
        String materia6 = mat6_par1.getText().toString();
        String materia7 = mat7_par1.getText().toString();
        String materia8 = mat8_par1.getText().toString();
        String materia9 = mat9_par1.getText().toString();
        String materia10 = mat10_par1.getText().toString();

        double mate1 = Double.parseDouble(materia1);
        double mate2 = Double.parseDouble(materia2);
        double mate3 = Double.parseDouble(materia3);
        double mate4 = Double.parseDouble(materia4);
        double mate5 = Double.parseDouble(materia5);
        double mate6 = Double.parseDouble(materia6);
        double mate7 = Double.parseDouble(materia7);
        double mate8 = Double.parseDouble(materia8);
        double mate9 = Double.parseDouble(materia9);
        double mate10 = Double.parseDouble(materia10);

        double promedioParcial1 = (mate1 + mate2 + mate3 + mate4 + mate5 + mate6 +
                mate7 + mate8 + mate9 + mate10) / 10;

        String result1 = String.valueOf(promedioParcial1);

        res1.setText(result1);

    }

    public void promedioParcial2(View view){

        String materia11 = mat1_par2.getText().toString();
        String materia12 = mat2_par2.getText().toString();
        String materia13 = mat3_par2.getText().toString();
        String materia14 = mat4_par2.getText().toString();
        String materia15 = mat5_par2.getText().toString();
        String materia16 = mat6_par2.getText().toString();
        String materia17 = mat7_par2.getText().toString();
        String materia18 = mat8_par2.getText().toString();
        String materia19 = mat9_par2.getText().toString();
        String materia20 = mat10_par2.getText().toString();

        double mate11 = Double.parseDouble(materia11);
        double mate12 = Double.parseDouble(materia12);
        double mate13 = Double.parseDouble(materia13);
        double mate14 = Double.parseDouble(materia14);
        double mate15 = Double.parseDouble(materia15);
        double mate16 = Double.parseDouble(materia16);
        double mate17 = Double.parseDouble(materia17);
        double mate18 = Double.parseDouble(materia18);
        double mate19 = Double.parseDouble(materia19);
        double mate20 = Double.parseDouble(materia20);

        double promedioParcial2 = (mate11 + mate12 + mate13 + mate14 + mate15 + mate16 +
                mate17 + mate18 + mate19 + mate20) / 10;

        String result2 = String.valueOf(promedioParcial2);

        res2.setText(result2);

    }

    public void promedioParcial3(View view){

        String materia21 = mat1_par3.getText().toString();
        String materia22 = mat2_par3.getText().toString();
        String materia23 = mat3_par3.getText().toString();
        String materia24 = mat4_par3.getText().toString();
        String materia25 = mat5_par3.getText().toString();
        String materia26 = mat6_par3.getText().toString();
        String materia27 = mat7_par3.getText().toString();
        String materia28 = mat8_par3.getText().toString();
        String materia29 = mat9_par3.getText().toString();
        String materia30 = mat10_par3.getText().toString();

        double mate21 = Double.parseDouble(materia21);
        double mate22 = Double.parseDouble(materia22);
        double mate23 = Double.parseDouble(materia23);
        double mate24 = Double.parseDouble(materia24);
        double mate25 = Double.parseDouble(materia25);
        double mate26 = Double.parseDouble(materia26);
        double mate27 = Double.parseDouble(materia27);
        double mate28 = Double.parseDouble(materia28);
        double mate29 = Double.parseDouble(materia29);
        double mate30 = Double.parseDouble(materia30);

        double promedioParcial3 = (mate21 + mate22 + mate23 + mate24 + mate25 + mate26 +
                mate27 + mate28 + mate29 + mate30) / 10;

        String result3 = String.valueOf(promedioParcial3);

        res3.setText(result3);

    }

}
