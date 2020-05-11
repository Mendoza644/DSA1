package com.example.dsa1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class GraficActivity extends AppCompatActivity {
PieChart pieChart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grafic);
    pieChart = findViewById(R.id.graficpastel);
    createGrafic();
    }

    private void createGrafic() {
        Description description = new Description();
        description.setText("Grafic");
        pieChart.setDescription(description);
        ArrayList<PieEntry>pieEntries = new ArrayList<>();
        pieEntries.add(new PieEntry(9,5));
        pieEntries.add(new PieEntry(6,5));
        pieEntries.add(new PieEntry(2,5));
        pieEntries.add(new PieEntry(3,5));
        pieEntries.add(new PieEntry(4,5));
        PieDataSet pieDataSet = new PieDataSet(pieEntries, "Description");
        pieDataSet.setColors(ColorTemplate.COLORFUL_COLORS);

        PieData pieData = new PieData(pieDataSet);
        pieChart.setData(pieData);
    }

}
