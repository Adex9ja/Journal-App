package com.journal.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.journal.app.utils.JournalEntry;

public class JournalDetailsActivity extends AppCompatActivity {

    private JournalEntry entry;
    private TextView  txtDetail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_journal_details);
        entry = (JournalEntry)getIntent().getSerializableExtra(getString(R.string.data));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(entry.getTitle());
        txtDetail = findViewById(R.id.txtDetail);
        txtDetail.setText(entry.getDetail());
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        finish();
        return super.onOptionsItemSelected(item);
    }
}
