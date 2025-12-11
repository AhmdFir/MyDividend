package com.example.mydividend;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etAmount, etRate, etMonths;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize Views
        etAmount = findViewById(R.id.etAmount);
        etRate = findViewById(R.id.etRate);
        etMonths = findViewById(R.id.etMonths);
        tvResult = findViewById(R.id.tvResult);
        Button btnCalculate = findViewById(R.id.btnCalculate);

        // Initialize About Button
        Button btnAbout = findViewById(R.id.btnAbout);

        // Calculate Button Logic
        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateDividend();
            }
        });

        // About Button Logic
        btnAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(intent);
            }
        });
    }

    private void calculateDividend() {
        String amountStr = etAmount.getText().toString();
        String rateStr = etRate.getText().toString();
        String monthsStr = etMonths.getText().toString();

        // Check for empty fields
        if (amountStr.isEmpty() || rateStr.isEmpty() || monthsStr.isEmpty()) {
            Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show();
            return;
        }

        try {
            double amount = Double.parseDouble(amountStr);
            double rate = Double.parseDouble(rateStr);
            int months = Integer.parseInt(monthsStr);

            // Validation: Max 12 months
            if (months > 12 || months < 1) {
                Toast.makeText(this, "Months must be between 1 and 12", Toast.LENGTH_SHORT).show();
                return;
            }

            // Calculation Logic: (Rate / 12) * Invested Fund
            // Note: If user enters 5 for 5%, we must divide by 100 first.
            double monthlyDividend = (rate / 100 / 12) * amount;
            double totalDividend = monthlyDividend * months;

            // Display Result formatted to 2 decimal places
            tvResult.setText(String.format("Total Dividend: RM %.2f", totalDividend));

        } catch (NumberFormatException e) {
            Toast.makeText(this, "Invalid Input", Toast.LENGTH_SHORT).show();
        }
    }

    // --- Menu Setup ---
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.nav_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_about) {
            Intent intent = new Intent(MainActivity.this, AboutActivity.class);
            startActivity(intent);
            return true;
        } else if (id == R.id.action_home) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}